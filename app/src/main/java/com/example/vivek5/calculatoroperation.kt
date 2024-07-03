package com.example.vivek5

sealed class calculatoroperation(val symbol:String) {
    object add:calculatoroperation("+")
    object sub:calculatoroperation("-")
    object multiply:calculatoroperation("*")
    object divide:calculatoroperation("/")
}