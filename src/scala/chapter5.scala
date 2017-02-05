/**
 * Created by shaldem on 30.05.2016.
 */
import scala.beans.BeanProperty

class Time(val Hour:Int, val Minutes:Int) {
  private val dminutes = Hour * 60 + Minutes

  def befor (other:Time) = this.dminutes < other.dminutes
}

val otime:Time = new Time(15, 55)
otime.befor(new Time(16, 33))

abstract class Student {
  @BeanProperty var name:String =_
  @BeanProperty var id:Long =_
}

class Car(val producer:String, val model:String, val prod_year:Int = -1) {
  var number: String = ""

  def this(producer: String, model: String, number:String){
    this(producer, model)
    this.number = number
  }

  def this(producer: String, model: String, number:String, prod_year: Int){
    this(producer, model, prod_year)
    this.number = number
  }
}

var mer = new Car("Mers", "C")
mer.number = "1234"
println(mer.number)

println(mer.producer)




