package com.example.vivek5

 sealed class calculatoraction {
     data class Number(val number:Int): calculatoraction()
     object clear:calculatoraction()
     object delete:calculatoraction()
     object decimal:calculatoraction()
     object calculate:calculatoraction()
     data class operation(val operation :calculatoroperation):calculatoraction()

}