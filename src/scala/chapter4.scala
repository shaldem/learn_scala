/**
 * Created by shaldem on 27.05.2016.
 */
class chapter4_2 {
  val in = new java.util.Scanner(new java.io.File("C:/sphinx/sphinx-min.conf.in"))
  val mstat = new scala.collection.mutable.HashMap[String, Int]
  while(in.hasNext()) { val s:String = in.next(); if(mstat.contains(s)) mstat(s) += 1 else mstat(s) = 1}
  for((k,v) <- mstat) println(k + "=" + v)
}

class chapter4_3 {
  val in = new java.util.Scanner(new java.io.File("C:/sphinx/sphinx-min.conf.in"))
  var mstat = new scala.collection.immutable.HashMap[String, Int]
  while(in.hasNext()) {
    val s:String = in.next();
    if(mstat.contains(s))
      mstat = mstat + (s -> (mstat(s) + 1))
    else
      mstat = mstat + (s -> 1)}
  for((k,v) <- mstat) println(k + "=" + v)

}

class chapter4_4 {
  val in = new java.util.Scanner(new java.io.File("C:/sphinx/sphinx-min.conf.in"))
  var mstat = scala.collection.immutable.SortedMap[String, Int]()
  while(in.hasNext()) {
    val s:String = in.next();
    if(mstat.contains(s))
      mstat = mstat + (s -> (mstat(s) + 1))
    else
      mstat = mstat + (s -> 1)}
  for((k,v) <- mstat) println(k + "=" + v)

}

class chapter4_5 {
  import scala.collection.JavaConversions.mapAsScalaMap
  val mstat: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
  val in = new java.util.Scanner(new java.io.File("C:/sphinx/sphinx-min.conf.in"))
  while(in.hasNext()) { val s:String = in.next(); if(mstat.contains(s)) mstat(s) += 1 else mstat(s) = 1}
  for((k,v) <- mstat) println(k + "=" + v)
}

class chapter4_10 {
  "Hello".zip("World")
}