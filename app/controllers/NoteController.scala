package controllers

/**
 * Created by kouki on 10/11/15.
 */

import org.joda.time.DateTime
import play.api._
import play.api.mvc._
import play.api.libs.json.Json
import models._


class NoteController extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def me = Action {


    val user = User("kouki_dan")
    val comments = (1 to 10).map(_ => Comment(
      "This is a comment.", user
    )).toList
    val goods = (1 to 20).map(_ => Good(user)).toList

    val notes = (1 to 10).map(_ => Note("test title",
      "test body and it should be a long text\n \n\n but I don't have a long text so it is short text.\n",
      user,
      comments,
      goods,
      DateTime.now()
    ))

    val result = Map("status" -> "success")
    val json = Json.toJson(notes)
    Ok(json)
  }

}
