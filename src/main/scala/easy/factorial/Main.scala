package easy.factorial

object Main {
  def main(args: Array[String]) {
    val testCount = readInt()
    for (i <- 0 until testCount) {
      println(countTrailingZeros(readInt()))
    }
  }

  def countTrailingZeros(n: Int): Int = {
    var count = 0
    var m = n
    while (m != 0) {
      // Firstly, count all the factors of 5.
      // Next, count all the 5x5.
      // Then, go on counting all the 5x5x5. And so on.
      // TODO: Why could we do so? What's the relationship?
      m /= 5
      count += m
    }

    count
  }
}