import scala.io.Source

/**
 * Created by shaldem on 07.06.2016.
 */

val source = Source.fromFile("C:/sphinx/sphinx-min.conf.in")
val tocken = source.mkString.split("\\s+")

for(w <- tocken) {if(w.length > 12) println(w)}

source.close()