package es.eriktorr.katas

object FizzBuzz {
  def fizzBuzz(number: Int): String = {
    number match {
      case _ if number % 15 == 0 => "FizzBuzz"
      case _ if number % 3 == 0 => "Fizz"
      case _ if number % 5 == 0 => "Buzz"
      case _ => number.toString
    }
  }
}
