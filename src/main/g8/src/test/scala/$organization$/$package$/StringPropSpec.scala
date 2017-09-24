package $organization$.$package$

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object StringPropSpec extends Properties("String") {

  property("concatenate") = forAll { (a: String, b: String) =>
    (a+b).length > a.length && (a+b).length > b.length
  }

}
