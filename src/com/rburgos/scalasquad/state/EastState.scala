package com.rburgos.scalasquad.state

import com.rburgos.scalasquad.robot.Robot
import com.rburgos.scalasquad.plateau.Plateau

class EastState(robot: Robot, plateau: Plateau) extends CardinalState {
  def turnLeft = robot.state = new NorthState(robot, plateau)
  def turnRight = robot.state = new SouthState(robot, plateau)
  def move = if(plateau.maxX > robot.x) robot.x = robot.x + 1
  override def toString: String = "E"
}
