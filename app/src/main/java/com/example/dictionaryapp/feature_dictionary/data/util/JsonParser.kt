package com.example.dictionaryapp.feature_dictionary.data.util

import java.lang.reflect.Type

interface JsonParser {
    fun <T> fromJson(json: String, type: Type): T? //from json to object
    
    fun <T> toJson(obj: T, type: Type): String? // from object to json string
}