package com.rburgos.scalasquad

import com.rburgos.scalasquad.data.Data
import com.rburgos.scalasquad.plateau.Plateau
import com.rburgos.scalasquad.robot.Robot

object Driver {
  def main(args: Array[String]) {
    val data = Data(0, 0, "N", "MMMMMRSMM")
    val plateau = Plateau(0, 0, 5, 5)
    val robot = new Robot(data, plateau)
    println(robot)
    robot.moveOnCommand
    println(robot)
  }
}
