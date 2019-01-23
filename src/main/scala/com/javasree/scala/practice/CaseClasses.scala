package com.javasree.scala.practice

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  //1. Class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.name)

  //2. sensible toString
  //println(instance) = println(instance.toString) //syntactic sugar

  //3. equals and hashcode are implemented out of the box
  val jim2 = new Person("Jim", 34)
  println(jim==jim2)

  //4.Case classes have handy copy method
  val jim3 = jim2.copy(age=35)
  println(jim3)

  //5. case classes have companion objects
  val thePersion=Person
  val mary=Person("mary",24) //the apply method of Companion object gets called and acts as constructor

  //6. case classes are serializable
  //mainly used in Akka

  //7. case classes are extractor patterns

  //8. case classes can be used for case objects
  case object India{
    def name: String = "The grate India!"
  }


  /*
  * Expand MyList - use case classes and case objects
  * */

}
