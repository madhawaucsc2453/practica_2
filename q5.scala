object q5 extends App {
  def easy(x:Int):Int = {
    var ans = x*8;
    return ans;
  }
  def tempo(x:Int):Int = {
    var ans = x*7;
    return ans;
  }
var tot = easy(2)+tempo(3)+easy(2);
  println("Total running time is "+tot);
}
