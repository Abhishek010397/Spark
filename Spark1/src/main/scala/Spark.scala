import org.apache.spark.{SparkConf, SparkContext}

object Spark {


  def main(args: Array[String]): Unit ={
    //Create SparkConfig object and SparkContext to initialise Spark
    val conf = new SparkConf()
    //set the master machine
    conf.setMaster("local")
    //set application name
    conf.setAppName("Spark Application")
    //create sparkContext Object and pass conf object as arg
    val sc = new SparkContext(conf)

    //create rdd and pass an array of values
    val rdd1 = sc.makeRDD(Array(1,2,3,4,5,6,7))
    //display the rdd
    rdd1.collect().foreach({println})
  }

}
