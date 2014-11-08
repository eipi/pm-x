package name.eipi.pacemaker.x.models

/**
 * Created by naysayer on 03/11/2014.
 */
object Location{
  private var count = 0
  private def inc : Integer = { count+= 1; return count }
}
class Location(latitude: Double, longitude: Double) {
  var id = Location.inc

}
