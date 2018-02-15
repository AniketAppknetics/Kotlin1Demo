/*

   Constructor Overloading

   Access Modifier
      public     : Access anywhere
      protected  : Within the package
      private    :  Withinb the Class

 */


fun main(args:Array<String>){

    var animalobj=Animalclass("Lion",4,"Yellow")
    animalobj.getValue()

}

open class Animalclass(){

    var name:String?=null
    var legs:Int?=null
    var color:String?=null

    constructor(name:String,legs:Int,color:String): this(){
        this.name=name
        this.legs=legs
        this.color=color
    }
    constructor(name: String,legs: Int):this(){
        this.name=name
        this.legs=legs
    }
    fun getValue(){
        println("Name: "+ this.name)
        println("Legs: "+ this.legs)
        println("Color: "+ this.color)
    }
}





