package com.paragon.btprinter.util

interface Printable {

    fun getVariables(): MutableMap<Int, String>

    fun getTemplate(): String
}