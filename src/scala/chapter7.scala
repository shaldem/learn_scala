/**
 * Created by shaldem on 06.06.2016.
 */

class Person(val name: String) {
  override  def toString = getClass.getName + "[name = " + name + "]"
}

class SecretAgent(codename: String) extends Person(codename) {
  override val name = "secret"
  override val toString = "secret"
}

