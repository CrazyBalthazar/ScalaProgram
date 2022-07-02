package com.xuezhao.ch15

abstract class Expr {
  def simplifyTop(expr: Expr) : Expr = expr match {
    case UnOp("-", UnOp("-", e)) => e //双重取负
    case BinOp("+", e, Number(0)) => e //加0
    case BinOp("*", e, Number(1)) => e //乘1
    case _ => expr
  }
}
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

