object Ejercicio2 extends App {
  def isSorted[A](as: Array[A], ordering: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean =
      if (n >= as.length - 1) {
        println("if")
        println(as.deep.mkString("\n"))
        true
      } else if (ordering(as(n), as(n + 1))) {
        println("else if")
        println(as.deep.mkString("\n"))
        false
      }
      else go(n + 1)
    go(0)
  }
  isSorted(Array(1, 3, 5, 7), (x: Int, y: Int) => x > y) // La llamada es true por lo que se cumple que: n >= as.length - 1
  isSorted(Array(7, 5, 1, 3), (x: Int, y: Int) => x < y) //La llamada es false por lo que se cumple que: (ordering(as(n), as(n + 1)))
  isSorted(Array("Scala", "Exercises"), (x: String, y: String) => x.length > y.length) // La llamada es true por lo que se cumple que: n >= as.length - 1
}
