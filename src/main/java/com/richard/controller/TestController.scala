package com.richard.controller

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

/**
  * Created by highl on 24/08/2016.
  */
@RestController
class TestController {
  @RequestMapping(Array("/")) def index: String = {
    return "Greetings from Spring boot!"
  }

}
