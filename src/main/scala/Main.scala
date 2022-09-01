@main def main(): Unit =
  println(cap_index("HeLlO"))
  println(mid("abcde"))
  println(
    online_count(
      Map(
        "Alice" -> "online",
        "Bob" -> "offline",
        "Eve" -> "online"
      )
    )
  )
  println(add_dots("test"))
  println(convert(List(1, 2, 3, 4)))
  println(format_number(532600000))

def cap_index(str: String) =
  str
    .map(_.toInt)
    .zipWithIndex
    .filter(pair => pair._1 < 'Z'.toInt && pair._1 > 'A'.toInt)
    .map(pair => pair._2)

def mid(str: String): String =
  if str.length() % 2 != 0 then str.charAt(str.length() / 2).toString()
  else ""

def online_count(online: Map[String, String]) =
  online.count(_._2 == "online")

def add_dots(str: String) = str.toList.mkString(".")

def convert(numbers: List[Int]): List[String] = numbers.map(_.toString)

def format_number(number: Int) =
  number.toString.reverse.grouped(3).mkString(",").reverse
