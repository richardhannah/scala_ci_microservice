package com.richard

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
  * Created by highl on 24/08/2016.
  */
@SpringBootApplication
class Application {

}

object Hello {
  def main(args: Array[String]):Unit={
    SpringApplication run classOf[Application]
  }
}

