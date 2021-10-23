/**
 * 99 Scala Problems 05 - Reverse a list
 * @see https://www.thedigitalcatonline.com/blog/2015/04/07/99-scala-problems-05-reverse/
 *
 * 99 Scala Problems 06 - Find out whether a list is a palindrome
 * @see https://www.thedigitalcatonline.com/blog/2015/04/07/99-scala-problems-06-palindome/
 */

// The procedural solution
def reverse0[A](ls: List[A]) = ls.reverse

reverse0(List(1, 1, 2, 3, 5, 8))

// The recursive solution
def reverse1[A](l: List[A]): List[A] = l match {
  case h :: tail => reverse1(tail) ::: List(h)
  case Nil => Nil
}

reverse1(List(1, 1, 2, 3, 5, 8))

//
val l = List(2, 3, 4, 5, 6)

1::l

5 match {
  case a => a + 1
}

List(1,2,3,4) match {
  case h::tail => h
  case _ => Nil
}

List(1,2,3,4) match {
  case ::(h,tail) => h
  case _ => Nil
}

List(11,12,13) ::: List(14,15,16)
val ll = List(11,12,13) ::: List(14,15,16)

List(4,5,6).:::(List(1,2,3))

// A good way to make it tail recursive is to use another list
def reverse2[A](l: List[A]): List[A] = {
  def _reverse(res: List[A], rem: List[A]): List[A] = rem match {
    case Nil => res
    case h :: tail => _reverse(h :: res, tail)
  }
  _reverse(Nil, l)
}

reverse2( List(0,1,2,3,4,5,6,7,8,9) )

// Folding
def reverse3[A](ls: List[A]): List[A] =
  ls.foldLeft(List[A]()) { (r, h) => h :: r }

reverse3( List(0,1,2,3,4,5,6,7,8,9) )

// Last nth element
def lastNth[A](n: Int, l:List[A]): A = {
  def reverse[A](l:List[A]):List[A] = {
    def _reverse[A](r:List[A], l:List[A]):List[A] = l match {
      case Nil => r
      case head::tail => _reverse(head::r, tail)
    }
    _reverse(List(), l)
  }

  def findKth[A](k:Int, l:List[A]):A = (k,l) match {
    case (0, h::_) => h
    case (k, _::tail) if k > 0 => findKth(k - 1, tail)
    case _ => throw new NoSuchElementException
  }

  val r = reverse(l)
  findKth(n - 1, r)
}

val getLastNth = lastNth(1, List(0,1,2,3,4,5,6,7,8,9))

// The procedural solution
def isPalindrome1[A](l: List[A]): Boolean = {
  l == l.reverse
}

isPalindrome1( List(0,1,2,3,4,5,6,7,8,9) )
isPalindrome1( List(0,1,2,3,4,3,2,1,0) )

// The recursive solution
def isPalindrome2[A](l: List[A]):Boolean = l match {
  case Nil => true
  case List(a) => true
  case list => (list.head == list.last && isPalindrome2(list.tail.init))
}

isPalindrome2( List(0,1,2,3,4,5,6,7,8,9) )
isPalindrome2( List(0,1,2,3,4,3,2,1,0) )

// The corresponding tail recursive function is
def isPalindrome3[A](l: List[A]):Boolean = {
  def _palindrome(res: Boolean, rem: List[A]): Boolean = rem match {
    case Nil => res
    case List(a) => res
    case list => _palindrome(res && rem.head == rem.last, rem.tail.init)
  }
  _palindrome(true, l)
}

isPalindrome3( List(0,1,2,3,4,5,6,7,8,9) )
isPalindrome3( List(0,1,2,3,4,3,2,1,0) )

// This allows to use the :+ pattern matching operator to do something like
object :+ {
  def unapply[A] (l: List[A]) = l match {
    case Nil => None
    case _ => Some( (l.init, l.last) )
  }
}

val init :+ tail = List(1,2,3)

// Following the above example I come up with a first-last extractor fl()
object fl {
  def unapply[A] (l: List[A]) = l match {
    case Nil => None
    case l => Some(l.head, l.last)
  }
}

val head fl last = List(1,2,3)

val head fl last = List(1)

// To use it in the isPalindrome() recursive function, however, I need something that also returns the list without the first and the last element.
object frl {
  def unapply[A] (l: List[A]) = l match {
    case Nil => None
    case l if (l.length == 1) => Some(l.head, l.last, List())
    case l => Some(l.head, l.last, l.init.tail)
  }
}

val frl(first, last, rem) = List(1,2,3,4,5)

// With this extractor my recursive function is greatly simplified
def isPalindrome4[A](l: List[A]): Boolean = l match {
  case Nil => true
  case frl(first, last, rem) => (first == last) && isPalindrome4(rem)
}

isPalindrome4( List(1,2,3,4,5,6,7) )
isPalindrome4( List(1,2,3,4,3,2,1) )

// and its corresponding tail recursive form is
def isPalindrome5[A](l: List[A]):Boolean = {
  def _palindrome(res: Boolean, rem: List[A]): Boolean = rem match {
    case Nil => res
    case frl(first, last, rem) => _palindrome(res && first == last, rem)
  }
  _palindrome(true, l)
}

isPalindrome4( List(1,2,3,4,5,6,7) )
isPalindrome4( List(1,2,3,4,3,2,1) )
