object q2 extends App{
 def temp(c:Int):Double={
   var F = c*1.8000+32.00;
   return F;
 }
  var ans = temp(35);
  println("tempreature is "+ans+"F");
}

