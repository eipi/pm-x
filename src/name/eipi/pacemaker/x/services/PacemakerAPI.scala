package name.eipi.pacemaker.x.services

import java.util.Date

import name.eipi.pacemaker.x.models.{Location, Activity, User}

/**
 * Created by naysayer on 03/11/2014.
 */
class PacemakerAPI {

  var users : List[User] = List[User]()

  def createUser(firstName: String, lastName: String, email: String, password: String): User = {
    var user : User = new User(firstName, lastName, email, password)
    users ::= user
    return user
  }

  def getUser(userId: Long): User = {

    for (user <- users if (userId.equals(user.id))) {
        return user
    }
    return null
  }

  def addActivity(userId: Long, actvType: String, location: String, distance: Double, duration: Double, startTime: Date): Activity = {
    var user = getUser(userId)
    var activity : Activity = new Activity(actvType, location, distance, duration, startTime)
    user.activities ::= activity
    return activity
  }

  def getActivity(actvId: Long): Activity = {
    for (u : User <- users) {
      for (a : Activity <- u.activities if (actvId.equals(a.id))) {
        return a
      }
    }
    return null
  }

  def addLocation(actvId: Long, lat: Double, long: Double) : Location = {
    var a :Activity = getActivity(actvId)
    var location: Location = new Location(lat, long)
    a.locations.add(location)
    return location
  }





}
