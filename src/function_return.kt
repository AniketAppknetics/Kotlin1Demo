/*
    return the value from functions
 
 */


fun main(args:Array<String>)
{
    var sub=Substraction(2,3)
    println("Substraction of two number : $sub")
    println("Return  name is ${getName("Aniket")}")
}

fun Substraction(num1:Int,num2:Int): Int {
    var num3=num1*num2
    return num3;
}
fun getName(name:String):String{
    return name
}