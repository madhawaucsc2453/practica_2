object  q4 extends App {
def cop(c:Int):Double={
  if(c<50){
    var ans= (c*24.95)+3;
    return ans;
  }else{
    var ans = c*24.95+0.75*(c-50)+3;
    return ans;
  }
}
  var cost = cop(60);
  println("WholeSale cost is Rs."+cost);
}
