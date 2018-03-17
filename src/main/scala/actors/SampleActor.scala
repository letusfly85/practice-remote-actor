package actors

import akka.actor.Actor

class SampleActor extends Actor {

  def receive = {
    case message: String =>
      println(message)
  }

}
