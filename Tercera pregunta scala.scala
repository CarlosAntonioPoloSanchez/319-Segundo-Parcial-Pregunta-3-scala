object HelloWorld {
   def main(args: Array[String]) {
      println("Insertar numero")
    	val a = 7
    	fsuperior(suma)
       }
      
  def fsuperior(funciontipo:(Int,Int)=>Int):Unit={
        var x = 0
        var y = 1
        println(0)
        println(1)
        for ( i <- 0 to 5){
            println(funciontipo(x,y))
            var c=x+y
            x=y
            y=c
        }
  }
  def suma(a:Int, b:Int):Int={
        a+b
  }
}