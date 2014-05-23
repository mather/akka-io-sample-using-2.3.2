package com.github.mather

import scala.concurrent.duration._
import akka.actor._
import akka.pattern.ask
import akka.util.Timeout

case object Tick
case object Get

class Counter extends Actor {
  var count = 0

  def receive = {
    case Tick => count += 1
    case Get  => sender ! count
  }
}

object AkkaIoSampleUsing232 extends App {
  val system = ActorSystem("AkkaIoSampleUsing232")

  import system._

  val counter = system.actorOf(Props[Counter])

  counter ! Tick
  counter ! Tick
  counter ! Tick

  implicit val timeout = Timeout(5 seconds)

  (counter ? Get) onSuccess {
    case count => println("Count is " + count)
  }

  system.shutdown()
}
