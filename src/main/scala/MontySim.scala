package net.railscoder.montysim

object MontySim {

  def main(args: Array[String]) {
    var doors = new DoorAggregator
    println(doors.losing_doors.map(_.id))
  }

}
