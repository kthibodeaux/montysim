package net.railscoder.montysim

object MontySim {

  def main(args: Array[String]) {
    var doors = new DoorAggregator
    println(doors.winning_id)
    println(doors.losing_doors.map(_.id))
  }

}
