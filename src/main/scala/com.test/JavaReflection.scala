package com.test


object JavaReflection extends App{

  override def main(args: Array[String]): Unit = {

    val TimeoutFiledName = "TIMEOUT_DEFAULT"

    val shutDownHookInstance = ShutDownHookMock.get()

    val classs = shutDownHookInstance.getClass
    val timeOutField  = classs.getDeclaredField(TimeoutFiledName)
    timeOutField.setAccessible(true)

    println("timeOutField=" + timeOutField.getLong())

    timeOutField.setLong(shutDownHookInstance, 30)

    println("timeOutField=" + timeOutField.getLong())


  }


}
