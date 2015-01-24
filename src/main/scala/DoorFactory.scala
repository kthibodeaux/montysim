package net.railscoder.montysim

object DoorFactory {

  def winning_door(id: Int): Door = {
    new Door(id, true)
  }

  def losing_door(id: Int): Door = {
    new Door(id, false)
  }

}
