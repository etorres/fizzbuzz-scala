package es.eriktorr.katas

import es.eriktorr.katas.FizzBuzz.fizzBuzz
import org.scalacheck.Gen.const
import org.scalacheck.Prop.forAll
import org.scalacheck.{Gen, Properties}

object FizzBuzzSpec extends Properties("FizzBuzzSpec") {
  property("fizzBuzz") = forAll(FizzBuzzGenerator.from1Through100) { testCase =>
    fizzBuzz(testCase.number) == testCase.response
  }
}

object FizzBuzzGenerator {
  val from1Through100: Gen[FizzBuzzTestCase] = for {
    number <- Gen.choose(1, 100)
    response <- generateResponse(number)
  } yield FizzBuzzTestCase(number, response)

  case class FizzBuzzTestCase(number: Int, response: String)

  def generateResponse(number: Int): Gen[String] = Gen.map {
    case _ if number % 15 == 0 => "FizzBuzz"
    case _ if number % 3 == 0 => "Fizz"
    case _ if number % 5 == 0 => "Buzz"
    case _ => number.toString
  }
}
