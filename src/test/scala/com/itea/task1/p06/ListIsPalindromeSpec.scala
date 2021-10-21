package com.itea.task1.p06

import org.scalatest._
import flatspec._
import matchers._

class ListIsPalindromeSpec extends AnyFlatSpec with should.Matchers {

  "Palindrome" should "using built-in commands, should be true" in {
    ListAsPalindrome().usingBuiltInCommands(List(1, 2, 3, 2, 1)) shouldBe true
  }

  "Palindrome" should "using built-in commands, should be false" in {
    ListAsPalindrome().usingBuiltInCommands(List(1, 2, 3, 4, 5)) shouldBe false
  }
}
