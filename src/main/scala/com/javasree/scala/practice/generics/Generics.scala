package com.javasree.scala.practice.generics

object Generics extends App{

  class MyList[+A] {
    //use type A
    def add[B >: A](element: B): MyList[B] = ???

  }

  class MyMap[key, value]

  val listOfIntegers = new MyList[Int]
  val listOfString = new MyList[String]

  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfInteger = MyList.empty[Int]

  //variance problem

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //1.Yes, List[Cat] extends List[Animals] =COVARIANT
  class CovariantList[+A]
  val animals: Animal = new Cat
  val animalsList: CovariantList[Animal] = new CovariantList[Cat]

  //animalsList.add(new Dog) ???

  //No ==invariance
  class Invariance[A]
  val invariantAnimalsList: Invariance[Animal] = new Invariance[Animal]

  //Hell No = Contravariance
  class ContravariantList[-A]
  val contravaintList: ContravariantList[Cat] = new ContravariantList[Animal]


  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // bounded types
  class Cage[A <: Animal](animal: A) // accepts only sub types of Animals
  val cage = new Cage(new Dog)

  //class Car
  //val newCage = new Cage(new Car)//error
}
