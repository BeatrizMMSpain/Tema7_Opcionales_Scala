object Ejercicio3 extends App {
  def MayoresPares(n: Int, m: Int):  List[Int] = {
    val listaN : List[Int] = Nil
    var listaM : List[Int] = Nil
    for (x <- (m-n) to m){
      if (x %2 == 0){listaM = listaM :+ x} else x+1
    }
    listaM
  }

  println(MayoresPares(3,6))
  println(MayoresPares(4,3))
  println(MayoresPares(0,8))
}
