package name.eipi.pacemaker.x.models

import java.util


/**
 * Created by naysayer on 03/11/2014.
 */
object User{
  private var current = 0
  private def inc : Integer = { current += 1; return current }
}
class User(firstName: String, lastName: String, email: String, password: String) {
  var id = User.inc
  var activities : List[Activity] = List[Activity]()

}
