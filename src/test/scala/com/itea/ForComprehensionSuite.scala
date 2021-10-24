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

//    val option: Option[String] = opt1.flatMap(i => opt2.flatMap(j => opt3.map(k => i + j + k))) //TODO  операции выполняются до тех пор пока есть flatMap
    val option = for {
      i <- opt1       // здесь выполняется 1-я операция
      j <- opt2       // если 1-я операция прошла успешно, тогда выполняется 2-я операция
      k <- opt3       // а если 2-я операция прошла успешно, тогда выполняется 3-я операция
    } yield i + j + k // и если 3-я операция прошла успешно, тогда уже выполняется 4-я операция
    // если где-то свалиться None, тогда метод flatMap у Option ничего не делает и просто вернет None

//    assert(None == option)
    assert(option.isEmpty)
  }

}
