package com.paragon.btprinter.data

sealed class PrintResult {
    data object Success : PrintResult()
    class Error(val errorMessage: String?) : PrintResult()
}