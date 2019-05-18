import scala.annotation.tailrec

object Ejercicio1 extends App {
  def fibonacci(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if (n <= 0) prev
      else loop(n - 1, cur, prev + cur)
    loop(n, 0, 1)
  }
  //Comprobación
  for (x <-0 until 6) {println(fibonacci(x))}
}
