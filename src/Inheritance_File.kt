fun main(args:Array<String>){
 var lion=Lion(2,6,"Lion")

    println("Number of Legs: "+ lion.numbereye)
    lion.showname()

}

open class Animal(){

    var name:String?=null
    var numberlegs:Int?=null
    var color:String?=null

    constructor(name:String,numberlegs:Int,color:String) : this() {
        this.name=name
        this.numberlegs=numberlegs
        this.color=color

        println("Object: "+ this.name)
        println("Object: "+ this.numberlegs)
        println("Object: "+ this.color)
    }
    fun showname(){
        println("Name is:"+ this.name)
    }
}
class Lion: Animal{

  var numbereye:Int?=null
  var age:Int?=null
  constructor(numbereye: Int,age:Int,name:String): super(){
      super.name=name
      this.numbereye=numbereye
      this.age=age
  }

}