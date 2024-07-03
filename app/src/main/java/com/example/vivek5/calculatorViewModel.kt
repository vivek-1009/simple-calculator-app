package com.example.vivek5

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.times
import androidx.lifecycle.ViewModel
import kotlin.time.times

@Suppress("IMPLICIT_CAST_TO_ANY")
class calculatorViewModel: ViewModel() {
    var state by mutableStateOf(calstate())
        private set

    fun onAction(action: calculatoraction) {
        when (action) {
            is calculatoraction.Number -> enterNumber(action.number)
            is calculatoraction.decimal -> enterdecimal()
            is calculatoraction.clear -> state = calstate()
            is calculatoraction.operation -> enteroperation(action.operation)
            is calculatoraction.calculate ->performCalculation()
            is calculatoraction.delete -> performDeletion()
        }
    }

    private fun performDeletion() {
        when {
            state.num2.isNotBlank() -> state = state.copy(num2 = state.num2.dropLast(1))
            state.op != null -> state = state.copy(op = null)
            state.num1.isNotBlank() -> state = state.copy(num1 = state.num1.dropLast(1))

        }
    }
    private fun performCalculation(){
        val number1=state.num1.toDoubleOrNull()
        val number2=state.num2.toDoubleOrNull()
        if(number1 !=null && number2!=null){
            val result= when(state.op){
                is calculatoroperation.add -> number1 + number2
                is calculatoroperation.sub-> number1 - number2
                is calculatoroperation.multiply->  number1*number2
                is calculatoroperation.divide->  number1/number2
                null ->return
            }
            state = state.copy(num1=result.toString().take(15),num2="",op=null)
        }
    }

    private fun enteroperation(operation: calculatoroperation) {
        if (state.num1.isNotBlank()) {
            state = state.copy(op = operation)
        }
    }

    private fun enterdecimal() {
        if (state.op == null && !state.num1.contains(".") && state.num1.isNotBlank()) {
            state = state.copy(num1 = state.num1 + ".")
            return
        }
        if (!state.num2.contains(".") && state.num2.isNotBlank()) {
            state = state.copy(num1 = state.num2 + ".")
            return
        }
    }

    private fun enterNumber(number: Int) {
        if (state.op == null) {
            if (state.num1.length >= maxnumlength) {
                return
            }
            state = state.copy(num1 = state.num1 + number)
            return
        }
        if (state.num2.length >= maxnumlength) {
            return
        }
        state = state.copy(num2 = state.num2 + number)
        return
    }
    companion object {
        private const val maxnumlength = 8
    }
}





