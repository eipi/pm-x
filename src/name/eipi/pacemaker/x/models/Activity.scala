package name.eipi.pacemaker.x.models

import java.util
import java.util.Date

/**
 * Created by naysayer on 03/11/2014.
 */
object Activity{
  private var count = 0
  private def inc : Integer = { count+= 1; return count }
}
class Activity(actvType: String, location: String, distance: Double, duration: Double, startTime: Date) {
  var id = Activity.inc
  var locations : util.Collection[Location] = new util.ArrayList[Location]

}
