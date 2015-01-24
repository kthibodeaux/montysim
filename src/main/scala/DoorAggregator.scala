package net.railscoder.montysim

class DoorAggregator {

  private var winning_id: Int = scala.util.Random.nextInt(3) + 1

  var doors: List[Door] = {
    List(1, 2, 3).map { door_id =>
      if(door_id == winning_id) {
        DoorFactory.winning_door(door_id)
      } else {
        DoorFactory.losing_door(door_id)
      }
    }
  }

  var losing_doors: List[Door] = {
    doors.filter(_.is_loser)
  }

}
