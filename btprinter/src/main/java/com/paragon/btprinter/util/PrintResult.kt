package com.paragon.btprinter.util

sealed class PrintResult {
    data object Success : PrintResult()
    class Error(val errorMessage: String?) : PrintResult()
}