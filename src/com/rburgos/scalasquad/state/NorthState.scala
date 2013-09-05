package com.rburgos.scalasquad.state

import com.rburgos.scalasquad.robot.Robot
import com.rburgos.scalasquad.plateau.Plateau

class NorthState(robot: Robot, plateau: Plateau) extends CardinalState {
  def turnLeft = robot.state = new WestState(robot, plateau)
  def turnRight = robot.state = new EastState(robot, plateau)
  def move = if(plateau.maxY > robot.y) robot.y = robot.y + 1
  override def toString: String = "N"
}
