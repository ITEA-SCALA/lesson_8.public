package com.itea.task1.p06

object ListAsPalindromeApp extends App {

  println(
    ListAsPalindrome().usingBuiltInCommands(List(1, 2, 3, 2, 1)))

  val list: List[Int] = List(1, 2, 3, 2, 1)

  println( list )
  println( list.reverse )
}
