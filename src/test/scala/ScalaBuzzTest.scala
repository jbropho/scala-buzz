import org.scalatest.FunSuite

class ScalaBuzzTest extends FunSuite {
  test("ScalaBuzz.gameLogic") {
    assert(ScalaBuzz.gameLogic(15) === "ScalaBuzz")
    assert(ScalaBuzz.gameLogic(5) === "Buzz")
    assert(ScalaBuzz.gameLogic(3) === "Scala")
    assert(ScalaBuzz.gameLogic(1) === "1")
  }
}

