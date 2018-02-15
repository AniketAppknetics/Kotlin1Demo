fun main(args:Array<String>)
{
    add(2,3)

}

/*
    Unit is just like void in java its optional in kotlin
 */

fun add(num1:Int,num2:Int):Unit{
    var sum=num1+num2
    println("Addition of two number is $sum")
}