package com.itea.task1.p06

import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

class ListIsPalindromeSpec extends AnyFlatSpec with should.Matchers {

  def isPalindrome[A](list: List[A]): Boolean = list == list.reverse

  "Palindrome" should "should be true" in {
    isPalindrome(List(1, 2, 3, 2, 1)) shouldBe true
  }

  "Palindrome" should "should be false" in {
    isPalindrome(List(1, 2, 3, 4, 5)) shouldBe false
  }
}
