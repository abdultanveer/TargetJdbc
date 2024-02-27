package org.example.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.time.delay

class CoroutinesDemo {
}

fun main() {

    println("hello")
   GlobalScope.launch {
       sayHello()
   }
}

suspend fun sayHello(){
    println("world")
}