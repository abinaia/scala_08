error id: file:///C:/Users/abina/OneDrive/Desktop/scala_08/Q2.scala:[7..8) in Input.VirtualFile("file:///C:/Users/abina/OneDrive/Desktop/scala_08/Q2.scala", "object {
    def main(args: Array[String]): Unit = {
        val multipleOf_three: Int => Boolean = (x: Int) => x % 3 == 0
        val multipleOf_five: Int => Boolean = (x: Int) => x % 5 == 0

        print("Enter a Number: ")
        val number = scala.io.StdIn.readInt()

        val result = (multipleOf_three(number) , multipleOf_five(number)) match{
            case (true , true) => "Multiple of Both Three and Five"
            case (true , false) => "Multiple of Three only"
            case (false , true) => "Multiple of Five only"
            case (false , false) => "Neither multiple of Three nor Five"
        }

        println(result)
        
    }
}")
file:///C:/Users/abina/OneDrive/Desktop/scala_08/Q2.scala
file:///C:/Users/abina/OneDrive/Desktop/scala_08/Q2.scala:1: error: expected identifier; obtained lbrace
object {
       ^
#### Short summary: 

expected identifier; obtained lbrace