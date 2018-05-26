object ScalaBuzz extends App {

  def gameLogic( a: Int ): String = {
    if (a % 15 == 0) {
      "ScalaBuzz"
    } else if (a % 5 == 0) {
      "Buzz"
    } else if (a % 3 == 0) {
      "Scala"
    } else  {
      a.toString
    }
  }
}
