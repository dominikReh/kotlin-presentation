import java.util.Scanner

    fun main() {
        val scanner = Scanner(System.`in`)

        print("Enter the first number: ")
        val num1 = scanner.nextDouble()

        print("Enter the second number: ")
        val num2 = scanner.nextDouble()

        print("Enter the operator (+, -, *, /): ")
        val operator = scanner.next()[0]

        val result: Double = when (operator) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> num1 / num2
            else -> {
                println("Invalid operator!")
                return
            }
        }

        println("Result: $result")

        scanner.close()
    }

