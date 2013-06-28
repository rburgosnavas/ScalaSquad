package com.rburgos.scalasquad.state

import com.rburgos.scalasquad.robot.Robot
import com.rburgos.scalasquad.plateau.Plateau

class SouthState(robot: Robot, plateau: Plateau) extends CardinalState {
  def turnLeft() { robot.state = robot.east }
  def turnRight() { robot.state = robot.west}
  def move() {
    if(plateau.minY < robot.y)
      robot.y = robot.y - 1
  }
  override def toString: String = { "S" }
}
