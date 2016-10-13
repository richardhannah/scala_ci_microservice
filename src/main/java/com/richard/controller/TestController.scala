package com.richard.controller

import com.richard.domain.ADataObject
import org.springframework.http.{HttpStatus, MediaType, ResponseEntity}
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

/**
  * Created by highl on 24/08/2016.
  */
@RestController
class TestController {
  @RequestMapping(Array("/")) def index: String = {
    return "Greetings from Spring boot!"
  }


  @RequestMapping(
    value = Array("getsomejson"),
    method = Array(RequestMethod.GET),
    produces = Array(MediaType.APPLICATION_JSON_VALUE))
  def getSomeJson: ResponseEntity[ADataObject] = {
    val aDataObject = new ADataObject()
    aDataObject.setSomeText_("some new text")
    return new ResponseEntity[ADataObject](aDataObject,HttpStatus.OK)
  }

}
