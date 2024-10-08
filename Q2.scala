object multiple_checker{
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
}