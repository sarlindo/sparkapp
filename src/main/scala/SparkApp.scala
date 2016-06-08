package pl.sarlindo.spark

import org.apache.spark.{SparkContext, SparkConf}

object SparkApp {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("SparkApp Application")
    val sc = new SparkContext(conf)

    val fileName = args(0)
    val lines = sc.textFile(fileName).cache

    val c = lines.count
    println(s"There are $c lines in $fileName")
  }
}
