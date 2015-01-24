package net.railscoder.montysim

class Door(val id: Int, val is_winner: Boolean) {

  var is_loser: Boolean = {
    ! is_winner
  }

}
