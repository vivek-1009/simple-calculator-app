package com.example.vivek5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vivek5.calculatoroperation.add.symbol

@Composable
fun calculator(
    state:calstate,
    modifier:Modifier=Modifier,
    onAction:(calculatoraction)->Unit

){
    Box(modifier=modifier){

        Column(modifier=Modifier.fillMaxWidth().align(Alignment.BottomCenter)){
           Text(text=state.num1+(state.op?.symbol?:"")+state.num2,textAlign= TextAlign.End,modifier=Modifier.fillMaxWidth().padding(vertical=32.dp),
               fontWeight= FontWeight.Light,
               fontSize=80.sp,
               color= Color.Black,
               maxLines=2)
            Row(modifier=Modifier.fillMaxWidth()){
                calculatorbutton(symbol="AC",modifier=Modifier.background(LightGray).aspectRatio(2f).weight(2f),
                    onClick={
                            onAction(calculatoraction.clear)
                    })
                calculatorbutton(symbol="Del",modifier=Modifier.background(LightGray).aspectRatio(1f).weight(1f),
                    onClick={
                        onAction(calculatoraction.delete)
                    })
                calculatorbutton(symbol="/",modifier=Modifier.background(Black).aspectRatio(1f).weight(1f),
                    onClick={
                        onAction(calculatoraction.operation(calculatoroperation.divide))
                    })
                }
            Row(modifier=Modifier.fillMaxWidth()){
                calculatorbutton(symbol="7",modifier=Modifier.background(Color.DarkGray).aspectRatio(2f).weight(2f),
                    onClick={
                        onAction(calculatoraction.Number(7))
                    })
                calculatorbutton(symbol="8",modifier=Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick={
                        onAction(calculatoraction.Number(8))
                    })
                calculatorbutton(symbol="9",modifier=Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick={
                        onAction(calculatoraction.Number(9))
                    })
                calculatorbutton(symbol="*",modifier=Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick={
                        onAction(calculatoraction.operation(calculatoroperation.multiply))
                    })
            }
            Row(modifier=Modifier.fillMaxWidth()){
                calculatorbutton(symbol="4",modifier=Modifier.background(Color.DarkGray).aspectRatio(2f).weight(2f),
                    onClick={
                        onAction(calculatoraction.Number(4))
                    })
                calculatorbutton(symbol="5",modifier=Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick={
                        onAction(calculatoraction.Number(5))
                    })
                calculatorbutton(symbol="6",modifier=Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick={
                        onAction(calculatoraction.Number(6))
                    })
                calculatorbutton(symbol="-",modifier=Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick={
                        onAction(calculatoraction.operation(calculatoroperation.sub))
                    })
            }
            Row(modifier=Modifier.fillMaxWidth()){
                calculatorbutton(symbol="1",modifier=Modifier.background(Color.DarkGray).aspectRatio(2f).weight(2f),
                    onClick={
                        onAction(calculatoraction.Number(1))
                    })
                calculatorbutton(symbol="2",modifier=Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick={
                        onAction(calculatoraction.Number(2))
                    })
                calculatorbutton(symbol="3",modifier=Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick={
                        onAction(calculatoraction.Number(3))
                    })
                calculatorbutton(symbol="+",modifier=Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick={
                        onAction(calculatoraction.operation(calculatoroperation.add))
                    })
            }
            Row(modifier=Modifier.fillMaxWidth()){
                calculatorbutton(symbol="0",modifier=Modifier.background(Color.DarkGray).aspectRatio(2f).weight(2f),
                    onClick={
                        onAction(calculatoraction.Number(0))
                    })
                calculatorbutton(symbol=".",modifier=Modifier.background(Color.DarkGray).aspectRatio(2f).weight(2f),
                    onClick={
                        onAction(calculatoraction.decimal)
                    })
                calculatorbutton(symbol="=",modifier=Modifier.background(Color.DarkGray).aspectRatio(1f).weight(1f),
                    onClick={
                        onAction(calculatoraction.calculate)
                    })
            }
            }
        }

    }

