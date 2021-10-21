package com.itea

object TestApp extends App {
  val opt1 = Some(1)
  val opt2 = Some("str")
  val opt3 = Some(true)


  val res = for {
    i <- opt1
    j <- opt2
    k <- opt3
  } yield i + j + k
}
