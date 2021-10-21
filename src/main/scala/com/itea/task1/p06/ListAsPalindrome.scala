package com.itea.task1.p06

/**
 * Является ли список палиндромом.
 * @see http://aperiodic.net/phil/scala/s-99/p06.scala
 */

class ListAsPalindrome {
  /*
   * позволяет обрабатывать списки любого типа
   * используем встроенные команды
   * проходит по списку дважды: один раз чтобы перевернуть его, и один раз чтобы проверить равенство
   */
  def usingBuiltInCommands[A](list: List[A]): Boolean = list == list.reverse
}

object ListAsPalindrome {
  def apply(): ListAsPalindrome = new ListAsPalindrome()
}
