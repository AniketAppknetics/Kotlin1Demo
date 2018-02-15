fun main(args:Array<String>){

    /*
       The user prompted with the question
       the user enter and answer
       if the answer is incorrect,then the user is prompted with the answer
       else application terminate
     */

    // The user prompted with the question

    println("Please Enter your friend name")

    var isTrue:Boolean =false

    do{
        println("How many sibling Aniket you have ")
        var value:Int?= readLine()!!.toInt()
        when(value){
            1 -> {
                println("You are correct")
                isTrue = true
            }else -> println("Please try again!")
        }
    }while (isTrue==false)

}