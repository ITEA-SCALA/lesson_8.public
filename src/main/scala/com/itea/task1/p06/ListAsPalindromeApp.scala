package com.itea.task1.p06

object ListAsPalindromeApp extends App {

//  println(
//    ListAsPalindrome().usingBuiltInCommands(List(1, 2, 3, 2, 1)))
//
//  val list: List[Int] = List(1, 2, 3, 2, 1)
//
//  println( list )
//  println( list.reverse )

  /**
   * 99 Scala Problems 05 - Reverse a list
   * ***
   *
   * @see https://www.thedigitalcatonline.com/blog/2015/04/07/99-scala-problems-05-reverse/
   */
  def reverse[A](ls: List[A]) = ls.reverse

  val value: List[Int] = reverse(List(1, 2, 3, 2, 1))

}
