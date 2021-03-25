import org.apache.spark.{SparkConf,SparkContext}

object Spark1 {

  def main(args: Array[String]){
    //Define sparkConf
    val conf = new SparkConf().setMaster("local").setAppName("Spark Application1")
    val sc = new SparkContext(conf)
    val rdd = sc.parallelize(Array(1,2,3,4,5,6,7,8,9))

    //Add the numbers of array using reduce function
    val res =rdd.reduce(_ + _)
    println(s"Array Addition Values is : $res")
  }



}
