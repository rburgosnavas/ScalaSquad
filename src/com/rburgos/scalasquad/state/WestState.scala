package com.rburgos.scalasquad.state

import com.rburgos.scalasquad.robot.Robot
import com.rburgos.scalasquad.plateau.Plateau

class WestState(robot: Robot, plateau: Plateau) extends CardinalState {
  def turnLeft = robot.state = new SouthState(robot, plateau)
  def turnRight = robot.state = new NorthState(robot, plateau)
  def move = if (plateau.minX < robot.x) robot.x = robot.x - 1
  override def toString: String = "W"
}
