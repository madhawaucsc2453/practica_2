import scala.math.Pi
object q3 extends App{
def vol(r:Int):Double = {
  var v = 4/3*Pi*r*r;
  return v;

}
  var volu = vol(5);
  println("Volume of sphere is "+ volu);
}