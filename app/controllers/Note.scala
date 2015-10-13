package controllers

/**
 * Created by kouki on 10/11/15.
 */

import play.api._
import play.api.mvc._
import play.api.libs.json.Json
import models.Note

class NoteController extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def me = Action {

    val notes = (1 to 10).map(_ => Note("test title", "test body"))

    val result = Map("status" -> "success")
    val json = Json.toJson(notes)
    Ok(json)
  }

}
