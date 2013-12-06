package $organization$

import org.slf4j.LoggerFactory

object $name;format="Camel"$ {
  val logger = LoggerFactory.getLogger(this.getClass)

  def main(args:Array[String]) {
    logger.info("Start")
    // scalastyle: off
    println("I am a sample App")
    // scalastyle: on
    logger.info("End")
  }
}
