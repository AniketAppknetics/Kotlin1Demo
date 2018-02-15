fun main(args:Array<String>){

    var obj=House("2BHK",24000,2015,"Aniket")
    println(obj.type)
}

class House(type:String,price:Int,yearBuild:Int,owner:String){

    var type:String?=null
    var price:Int?=null
    var yearBuild:Int?=null
    var owner:String?=null

    init {
        this.type=type
        this.price=price
        this.yearBuild=yearBuild
        this.owner=owner
    }
}