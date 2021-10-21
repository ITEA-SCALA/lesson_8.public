package com.itea.task1.p06

import org.scalatest._
import flatspec._
import matchers._

class ListIsPalindromeSpec extends AnyFlatSpec with should.Matchers {

  "Palindrome" should "should be true" in {
    ListAsPalindrome().isPalindrome(List(1, 2, 3, 2, 1)) shouldBe true
  }

  "Palindrome" should "should be false" in {
    ListAsPalindrome().isPalindrome(List(1, 2, 3, 4, 5)) shouldBe false
  }
}
