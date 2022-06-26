package com.xuezhao.ch10

class LineElement(s:String) extends  Element{
  val contents: Array[String] = Array(s)

  override def height: Int = 1

  override def width: Int = s.length

}
