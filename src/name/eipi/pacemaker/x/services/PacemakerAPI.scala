package name.eipi.pacemaker.x.services

/**
 * Created by naysayer on 03/11/2014.
 */
class PacemakerAPI {
  def createUser(): ApiResponseTO = {
    val response = new ApiResponseTO
    response.success = true
    response
  }


}
