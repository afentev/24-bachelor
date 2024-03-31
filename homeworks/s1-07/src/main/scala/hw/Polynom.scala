package hw

/**
Релизовать структуру, представляющую собой многочлен:
    a_n * x ^ n + a_(n-1) * x ^ (n - 1) + .... + a_1 * x + a_0
  где a_n, a_(n-1), ..., a_1, a_0 - элементы (коэффициенты многочлена) из множества A
  */
case class Polynom[A]( /** ... */ ) {

  /**
  Реализовать красивый toString, строка на выходе должна быть похожа на многочлен
    */
  override def toString: String = ???

  /**
  Реализовать разность многочленов над полем F

    Например:
    Для поля вещественных чисел:
      (x^3 + 5x + 1) - (2x^5 + x^3 - 3x^2 - 1) === -2x^5 + 3x^2 + 5x + 2
    Для поля остатков по модулю 5:
      (x^3 + 4x + 1) - (2x^5 + x^3 - 3x^2 - x - 1) === 3x^5 + 3x^2 + 2
    */
  def minus(other: Polynom[A])(implicit F: Field[A]): Polynom[A] = ???

  /**
    * Реализовать евклидово деление двух многочленов над полем F. Метод должен возвращать пару из частного и остатка от деления.
    * Можно реализовать например делением в столбик.
    */
  def div(other: Polynom[A])(implicit field: Field[A]): (Polynom[A], Polynom[A]) = ???

  /**
  Реализовать вычисление наибольшего общего делителя многочленов над полем F
    Результат нормализовать (старший коэффициэнт должен быть 1)

    Например:
    Для поля вещественных чисел:
    gcd(
      x^4 - x^3 + 2x^2 + 8x - 10,
      x^5 + 3x^3 + 10x^2 + 2x + 10
    ) === x^3 + 2x + 10

   Для поля остатков по модулю 7:
    gcd(
      x^4 + 6x^3 + 2x^2 + x + 4,
      x^5 + 3x^3 + 3x^2 + 2x + 3
    ) === x^3 + 2x + 3

   При реализации используйте рекурсивный алгоритм Евклида для поиска наибольшего общего делителя
    */
  def gcd(other: Polynom[A])(implicit F: Field[A]): Polynom[A] = ???
}

object Polynom {

  /**
  Реализовать конструктор Polynom из коэффициэнтов многочлена:
     from(3, 0, 2) === 3x^2 + 2
     from(5, 1, 2, 7, 1) === 5x^4 + x^3 + 2x^2 + 7x + 1
    */
  def from[A](xs: A*): Polynom[A] = ???
}
