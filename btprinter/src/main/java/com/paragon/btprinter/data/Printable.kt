package com.paragon.btprinter.data

interface Printable {

    fun getVariables(): MutableMap<Int, String>

    fun getTemplate(): String
}