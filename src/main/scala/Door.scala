package net.railscoder.montysim

class Door(val id: Int, val is_winner: Boolean) {

  def is_loser: Boolean = {
    ! is_winner
  }

}
