name := "structured-streaming"

version := "1.0"

scalaVersion := "2.11.8"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql_2.11
libraryDependencies += "org.apache.spark".%("spark-sql_2.11")% "2.1.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming_2.11
//libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.1.0"


// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming-kafka-0-8_2.11
//libraryDependencies += "org.apache.spark".%("spark-streaming-kafka-0-8_2.11")% "2.1.0"


// https://mvnrepository.com/artifact/org.apache.spark/spark-sql-kafka-0-10_2.11
libraryDependencies += "org.apache.spark".%("spark-sql-kafka-0-10_2.11")% "2.1.0"
    