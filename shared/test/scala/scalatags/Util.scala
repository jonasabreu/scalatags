package scalatags

object Util {
  def clean(s: String) = "\\n\\s*".r.replaceAllIn(s, "").trim()
  def strCheck(x: Any*) = {
    for (Seq(a, b) <- x.grouped(2)) {
//      println(clean(a.toString()))
//      println(clean(b.toString()))
      assert(
        clean(a.toString()) == clean(b.toString())
      )
    }
  }
}
