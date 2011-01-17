package fakesdb

import org.junit._

class CreateDomainTest extends AbstractFakeSdbTest {

  @Test
  def invalidDomainName(): Unit = {
    assertFails("InvalidParameterValue", "Value (\"foo!\") for parameter DomainName is invalid.", {
      sdb.createDomain("foo!")
    })
  }

}