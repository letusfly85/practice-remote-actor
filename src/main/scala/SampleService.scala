import actors.SampleActor
import akka.actor.{ActorSystem, Props}

object SampleService {

  def main(args: Array[String]) {
    val system: ActorSystem  = ActorSystem("practiceActor")

    val actor = system.actorOf(Props[SampleActor], name = "sampleActor")

    actor ! "say hello"
  }

}
