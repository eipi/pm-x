package name.eipi.pacemaker.x.services

/**
 * Created by naysayer on 03/11/2014.
 */
class ApiResponseTO extends java.util.ArrayList {

  var success = false

  override def toString(): String = (
    return "Success : " + success
    )

}
