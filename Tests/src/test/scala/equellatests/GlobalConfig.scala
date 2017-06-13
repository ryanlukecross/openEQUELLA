package equellatests

import java.io.File
import java.net.URI

import com.tle.webtests.framework.TestConfig
import equellatests.domain.TestInst

object GlobalConfig {

  val testConfig = new TestConfig(TestConfig.getBaseFolder, true)

  def createTestInst(shortName: String) = TestInst(URI.create(testConfig.getInstitutionUrl(shortName)),
    testConfig.getAdminPassword, new File(TestConfig.getBaseFolder, shortName))
}
