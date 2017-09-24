package $organization$.$package$

import org.scalatest.prop.PropertyChecks
import org.scalatest.{FlatSpec, Matchers}

final class StringSpec extends FlatSpec with Matchers with PropertyChecks {

  behavior of "String"

  it should "concatenate" in {
    forAll { (a: String, b: String) => 
      (a + b).length should be > a.length
      (a + b).length should be >= b.length 
    }
  }
}
