import scala.reflect.runtime.universe._
import scala.tools.reflect.Eval

object Test extends App {
  reify {
    class C {
      lazy val x = 2
    }

    println(new C().x)
  }.eval
}