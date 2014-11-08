package name.eipi.pacemaker.x.services

/**
 * Created by naysayer on 03/11/2014.
 */
object TestPacemakerApi {

  def main(args: Array[String]): Unit = {
    val api: PacemakerAPI = new PacemakerAPI
    var response = api.createUser("", "", "", "")
    print(response)

  }

}
