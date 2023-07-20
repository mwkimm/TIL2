package net.flow9.thisiskotlin.calculator


class Calculator {
    fun addOperation(operation:AddOperation, num1:Int, num2: Int): Int {
        return operation.operate(num1, num2)
    }
}