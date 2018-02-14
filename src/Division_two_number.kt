fun main(args:Array<String>){

   //=============== first way to do that ==============

    var fi:Double=10.0
    var si:Double=20.0

    var ti:Double?
     ti=fi /si
    println("Multiplication of two number $ti")


   //============ Second way to do that ============

    // type cast the int to double

    var newf=10
    var news=200;

    var newti:Double?=null

    newti = newf.toDouble() /news.toDouble()

    println("Multiplication of two number $newti")


}