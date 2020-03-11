package es.eriktorr.katas

object FizzBuzz {
  def fizzBuzz(number: Int): String = (number % 3, number % 5) match {
    case (a, b) if a == 0 && b == 0 => "FizzBuzz"
    case (a, _) if a == 0 => "Fizz"
    case (_, b) if b == 0 => "Buzz"
    case _ => number.toString
  }
}
