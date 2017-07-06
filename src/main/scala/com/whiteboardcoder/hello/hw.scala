package com.whiteboardcoder.hello

/**
  * Created by Administrator on 06/07/2017.
  */
object hw {
  def maketriangle() : Unit = {
    (1 to 20).foreach {
      i => println("X" * i)
    }
  }

  def main(args: Array[String]): Unit = {
    maketriangle()
  }
}
