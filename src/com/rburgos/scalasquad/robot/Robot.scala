package com.rburgos.scalasquad.robot

import com.rburgos.scalasquad.state._
import com.rburgos.scalasquad.plateau.Plateau
import com.rburgos.scalasquad.data.Data
import com.rburgos.scalasquad.exception.IllegalCommandException

class Robot(data: Data, plateau: Plateau) {
  private var _x = data.x
  private var _y = data.y
  private var _state = StateMatcher.initState(data.position, this, plateau)

  def turnLeft() { _state.turnLeft() }
  def turnRight() { _state.turnRight() }
  def move() { _state.move() }
  def moveOnCommand() {
    if(data.commands != null) {
      for(char <- data.commands) char match {
        case 'L' => this.turnLeft()
        case 'R' => this.turnRight()
        case 'M' => this.move()
        case _ => throw new IllegalCommandException(char +
          " is not a valid command.")
      }
    }
  }
  def x: Int = { _x }
  def x_=(x: Int) { this._x = x }
  def y: Int = { _y }
  def y_=(y: Int) { this._y = y }
  def state: CardinalState = { this._state }
  def state_=(state: CardinalState) { this._state = state }
  override def toString: String = { _x + ", " + _y + ", " + state }
}
