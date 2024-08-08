package site.v2space.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//import com.influxdb.annotations.Column
//import com.influxdb.annotations.Measurement
//import com.influxdb.client.domain.WritePrecision
import com.influxdb.client.kotlin.InfluxDBClientKotlinFactory
//import com.influxdb.client.write.Point
//import kotlinx.coroutines.flow.collect
//import kotlinx.coroutines.flow.consumeAsFlow
//import kotlinx.coroutines.runBlocking
//import java.time.Instant

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
//    runInflux()
}


//fun runInflux() {
//    // You can generate an API token from the "API Tokens Tab" in the UI
//    val token = System.getenv()["INFLUX_TOKEN"]
//    val org = "v2space-team"
//    val bucket = "v2space-bucket"
//    val client = InfluxDBClientKotlinFactory.create("http://localhost:8086", token.toCharArray(), org, bucket)
//    client.use {
//
//    }
//}
