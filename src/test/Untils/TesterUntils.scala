package Untils

object TesterUntils {


  def StringWithWidth(str: String, width: Int, fill: String = "0", left: Boolean = true): String = {
    if (str.length < width) {
      if (left) {
        fill * (width - str.length) + str
      } else {
        str + fill * (width - str.length)
      }
    } else {
      str
    }
  }

  def StringSplitShow(str: String, num: Int) = {
    for (idx <- 0 until str.length) {
      print(str(idx))
      if ((idx + 1) % num == 0) {
        print("\t")
      }
    }
    print("\n")
  }
}