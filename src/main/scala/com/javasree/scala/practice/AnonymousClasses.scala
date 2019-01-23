package com.javasree.scala.practice

object AnonymousClasses extends App {

  abstract class Animal{
    def eat: Unit
  }

  val anonymousObject: Animal = new Animal{
    override def eat: Unit = println("anonymouse eating")
  }

  anonymousObject.eat

}
