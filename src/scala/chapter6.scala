/**
 * Created by shaldem on 02.06.2016.
 */

object Conversions {
  def inchesToCentimeters {}
  def galonsToLiters {}
  def milesToKilometers {}
}

abstract class UnitConversionMy {
  def toCu(engSys:Double) :Double
  def fromCu(cuSys:Double):Double
}

object InchesToCentimetersMy extends UnitConversionMy {
  val rate:Double = 2.51
  def toCu(engSys:Double) = engSys / rate
  def fromCu(cuSys:Double) = cuSys * rate
}

object GallonsToLitersMy extends UnitConversionMy {
  val rate:Double = 3.78541
  def toCu(engSys:Double) = engSys / rate
  def fromCu(cuSys:Double) = cuSys * rate
}

object MilesToKilometersMy extends UnitConversionMy {
  val rate:Double = 1.61
  def toCu(engSys:Double) = engSys / rate
  def fromCu(cuSys:Double) = cuSys * rate
}

class UnitConversion(val conversionFactor: Double) {
  private def convert(value: Double) = value * conversionFactor

  def apply(value: Double) = convert(value)
}

object InchesToCentimeters extends UnitConversion(2.54) {}
object GallonsToLiters extends UnitConversion(3.78541) {}
object MilesToKilometers extends UnitConversion(1.60934) {}


InchesToCentimeters(40)

object Origin extends java.awt.Point {

}

val frase = "Hello World"
val aWord = frase.split(" ").reverse
for(w <- aWord) print(w + " ")
val rfrase = aWord.mkString(" ")

object CardSuite extends Enumeration {
  type CardSuite = Value
  val Club = Value("?")
  val Diamond = Value("?")
  val Heart = Value("?")
  val Spade = Value("?")
}

import CardSuite._
def isRed(card: CardSuite) = card == Diamond || card == Heart

isRed(Heart)

object RGBCube extends Enumeration {
  val Black = Value(0x000000, "Black")
  val Red = Value(0xff0000, "Red")
  val Green = Value(0x00ff00, "Green")
  val Yellow = Value(0xffff00, "Yellow")
  val Blue = Value(0x0000ff, "Blue")
  val Cyan = Value(0x00ffff, "Cyan")
  val Magenta = Value(0xff00ff, "Magenta")
  val White = Value(0xffffff, "White")
}

