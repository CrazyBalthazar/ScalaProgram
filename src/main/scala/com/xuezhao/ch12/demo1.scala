package com.xuezhao.ch12

trait Philosophical {
  def philosophize() = {
    println("I consume memory, therefore I am!")
  }
}

trait HasLegs
//class Frog extends Philosophical{
//  override def toString = "green"
//}

class Animal

class Frog extends Animal with Philosophical {
  override def toString = "green"

  override def philosophize(): Unit = {
    println("It ain't easy being " + toString + "!")
  }
}

