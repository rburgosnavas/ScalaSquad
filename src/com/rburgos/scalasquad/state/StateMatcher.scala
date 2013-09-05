package com.rburgos.scalasquad.state

import com.rburgos.scalasquad.robot.Robot
import com.rburgos.scalasquad.plateau.Plateau

object StateMatcher {
  def initState(position: String, robot: Robot,
                plateau: Plateau): CardinalState = position match {
    case "N" => new NorthState(robot, plateau)
    case "S" => new SouthState(robot, plateau)
    case "E" => new EastState(robot, plateau)
    case "W" => new WestState(robot, plateau)
  }
}
