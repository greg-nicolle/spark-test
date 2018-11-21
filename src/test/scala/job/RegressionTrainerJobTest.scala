package job

import org.scalatest.FunSuite

class RegressionTrainerJobTest extends FunSuite {

  test("test run") {
    val job = new RegressionTrainerJob()

    job.run()
  }
}
