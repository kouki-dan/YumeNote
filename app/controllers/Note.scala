package controllers

/**
 * Created by kouki on 10/11/15.
 */

import play.api._
import play.api.mvc._
import play.api.libs.json.Json

class Note extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def me = Action {
    val result = Map("status" -> "success")
    val json = Json.toJson(result)
    Ok(json)
  }

}
