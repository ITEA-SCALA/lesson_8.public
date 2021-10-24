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

}
