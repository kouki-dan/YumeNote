package models

/**
 * Created by kouki on 10/13/15.
 */

import play.api.libs.json.Json

case class Note(title: String, body: String)
object Note {
  implicit def jsonWrites = Json.writes[Note]
  implicit def jsonReads = Json.reads[Note]
}
