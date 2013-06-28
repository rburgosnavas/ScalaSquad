package com.rburgos.scalasquad.state

import com.rburgos.scalasquad.robot.Robot
import com.rburgos.scalasquad.plateau.Plateau

/**
 * Date: 6/27/13
 * Time: 1:35 PM
 */
class EastState(robot: Robot, plateau: Plateau) extends CardinalState {
  def turnLeft() { robot.state = robot.north }
  def turnRight() { robot.state = robot.south }
  def move() {
    if(plateau.maxX > robot.x)
      robot.x = robot.x + 1
  }
  override def toString: String = { "E" }
}
