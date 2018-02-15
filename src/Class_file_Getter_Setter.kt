fun main(args:Array<String>)
{
  var sobj=Student("Aniket","A",311)

    sobj.setname("Mahesh")
    sobj.setdiv("D")
    sobj.setrollnumber(90)

    println("Name : "+sobj.getname() +"\n" +" Div :  " + sobj.getsdiv()+"\n" +" Roll Number :  " +sobj.getsrollnumber())
}
class Student(sname:String,sdiv:String,srollnumber:Int){

    var sname:String?=null
    var sdiv:String?=null
    var srollnumber:Int?=null
    init {
        this.sname=sname
        this.sdiv=sdiv
        this.srollnumber=srollnumber
    }
    //==========================================
    fun getname():String?{
        return sname
    }
    fun setname(sname:String){
        this.sname=sname
    }
    //==========================================
    fun getsdiv():String?{
        return  sdiv
    }
    fun setdiv(sdiv: String){
        this.sdiv=sdiv;
    }
    //==========================================
    fun getsrollnumber():Int?{
        return srollnumber
    }
    fun setrollnumber(srollnumber:Int){
        this.srollnumber=srollnumber
    }
}