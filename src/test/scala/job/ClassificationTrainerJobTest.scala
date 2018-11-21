package job

import org.scalatest.FunSuite

class ClassificationTrainerJobTest extends FunSuite {

  test("test run") {

    val job = new ClassificationTrainerJob()

    job.run()
  }
}
