package name.eipi.pacemaker.x.models

/**
 * Created by naysayer on 03/11/2014.
 */
class User(firstName: String, lastName: String, email: String) {
  var id = User.current
  User.inc
}
object User{
  private var current = 0
  private def inc = {current += 1; current}
}