import scala.math.Pi

object q1 extends App{
  def funcArea(a:Int):Double = {
    var ans =Pi*a*a;
    return ans;
  }
  var b = funcArea(5);
  println(s"Area = ${b}");
}
