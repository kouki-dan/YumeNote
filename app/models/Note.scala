package models

/**
 * Created by kouki on 10/13/15.
 */

import org.joda.time.DateTime
import play.api.libs.json.Json

case class Note(title: String, body: String, author: User, comments: List[Comment], goods: List[Good], created: DateTime)
object Note {
  implicit def jsonWrites = Json.writes[Note]
  implicit def jsonReads = Json.reads[Note]
}


case class User(name: String)
object User {
  implicit def jsonWrites = Json.writes[User]
  implicit def jsonReads = Json.reads[User]
}

case class Comment(text: String, author: User)
object Comment {
  implicit def jsonWrites = Json.writes[Comment]
  implicit def jsonReads = Json.reads[Comment]
}

case class Good(user: User)
object Good {
  implicit def jsonWrites = Json.writes[Good]
  implicit def jsonReads = Json.reads[Good]
}

