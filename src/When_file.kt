fun main(args:Array<String>){

    //when work same like switch statement

    var value:Int= 8

    when(value)
    {
        8 -> println("8")
        9 -> println("9")
        10 -> println("10")
        else ->{
            println("Non of the above")
        }
    }

    // enter number between 1-10

    var getresponse= readLine()!!.toInt()
    when(getresponse){
        1 -> println("bakwas")
        2 -> println("just friend")
        3 -> println("best friend")
        4 -> println("bro")
        5 -> println("besti")
        6 -> println("wrong person")
        7 -> println("bad person on earth")
        8 -> println("faltu")
        9 -> println("Great")
        10 -> println("Chapperi")
        else ->{
            println("No friend")
        }
    }
}