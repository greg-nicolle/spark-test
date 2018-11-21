package job

import org.scalatest.FunSuite

class ClassificationTrainerJobTest extends FunSuite {

  test("nominal case") {

    val job = new ClassificationTrainerJob()

    job.run()


  }
}
