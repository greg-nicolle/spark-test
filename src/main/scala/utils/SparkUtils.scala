package utils

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

class SparkUtils {

  val conf: SparkConf = new SparkConf()
  conf.setMaster("local[*]")

  @transient lazy val spark: SparkSession = SparkSession
    .builder()
    .config(conf)
    .config("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
    .getOrCreate()

}
