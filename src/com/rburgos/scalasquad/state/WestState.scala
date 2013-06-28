package com.rburgos.scalasquad.state

import com.rburgos.scalasquad.robot.Robot
import com.rburgos.scalasquad.plateau.Plateau

/**
 * Date: 6/27/13
 * Time: 1:36 PM
 */
class WestState(robot: Robot, plateau: Plateau) extends CardinalState {
  def turnLeft() { robot.state = robot.south }
  def turnRight() { robot.state = robot.north }
  def move() {
    if(plateau.minX < robot.x)
      robot.x = robot.x - 1
  }
  override def toString: String = { "W" }
}
