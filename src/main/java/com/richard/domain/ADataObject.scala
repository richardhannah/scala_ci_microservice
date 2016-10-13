package com.richard.domain

/**
  * Created by highl on 13/10/2016.
  */
class ADataObject {

  private var _someText: String = "here is some text"
  private var _aNumber: Int = 1

  def getSomeText : String = _someText;
  def setSomeText_ (someText:String):Unit = _someText = someText
  def ANumber : Int = _aNumber;
}
