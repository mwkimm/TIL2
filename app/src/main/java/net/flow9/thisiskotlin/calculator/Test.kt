//package net.flow9.thisiskotlin.calculator
//
//fun main(){
//
//    println("첫번쨰숫자 입력해주세요")
//    var num1 = readLine()!!.toDouble() // 숫자1 입력
//
//    println("두번쨰숫자 입력해주세요")
//    var num2= readLine()!!.toDouble() // 숫자2 입력
//
//    println("연산자 입력해주세요 : + - * / %")
//    var op = readLine()!!.toString() // 연산자 입력
//
//    val cal = Calculator(num1, num2, op) // 변수에 클래스 인스턴스
//
//    cal.calculate(op) //클래스에 있는 함수 불러오기?
//}
//
//class Calculator(private val num1: Double, private val num2: Double, op: String) {
//
//        fun calculate(op: String) {
//            if (op == "+") {
//                println("$num1 + $num2 = ${num1 + num2}")
//            }
//            if (op == "-") {
//                println("$num1 - $num2 = ${num1 - num2}")
//            }
//            if (op == "*") {
//                println("$num1 * $num2 = ${num1 * num2}")
//            }
//            if (op == "/") {
//                println("$num1 / $num2 = ${num1 / num2}")
//            }
//            if (op == "%") {
//                println("$num1 % $num2 = ${num1 % num2}")
//            }
//
//        }
//
// }
