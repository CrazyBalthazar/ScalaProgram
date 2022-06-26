package com.xuezhao.ch06

class Rational(n: Int, d: Int) {
  //前置条件
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n/g
  val denom:Int = d/g
  //辅助构造方法
  def this(n: Int) = this(n, 1)
  override def toString = s"$numer/$denom"
  //加法
  def +(that: Rational): Rational = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  }
  def +(i: Int): Rational = new Rational(numer + i*denom, denom)
  //乘法
  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)
  def * (i:Int): Rational = new Rational(numer*i, denom)
  def -(that: Rational): Rational = {
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )
  }
  def -(i: Int): Rational = new Rational(numer - i*denom, denom)
  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)
  def / (i:Int): Rational = new Rational(numer, denom * i)
  //比较大小
  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom
  //求较大值
  def max(that: Rational) =
    if (this.lessThan(that)) that else this
  //公约数
  private def gcd(a: Int, b:Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
object Rational{
  def main(args: Array[String]): Unit = {
    val onehalf = new Rational(1,2)
    val twoThird = new Rational(2,3)
    println(onehalf * 2)
  }
}
