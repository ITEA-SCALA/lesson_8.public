package com.itea

import org.scalatest.OptionValues
import org.scalatest.funsuite.AnyFunSuite

class ForComprehensionSuite extends AnyFunSuite with OptionValues{

  test("Option example - happy path") {
    val opt1 = Some(1)
    val opt2 = Some("str")
    val opt3 = Some(true)

    val option: Option[String] = opt1.flatMap(i => opt2.flatMap(j => opt3.map(k => i + j + k)))

    assert("1strtrue" == option.value)
  }

  test("Option example - unhappy path") {
    val opt1: Option[Int] = None
    val opt2 = Some("str")
    val opt3 = Some(true)

//                              Option
//   None extends Option[Nothing]    Some(value)

//    val option: Option[String] = opt1.flatMap(i => opt2.flatMap(j => opt3.map(k => i + j + k)))
    val option = for {
      i <- opt1
      j <- opt2
      k <- opt3
    } yield i + j + k

//    assert(None == option)
    assert(option.isEmpty)
  }

}
