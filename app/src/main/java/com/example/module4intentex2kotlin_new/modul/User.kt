package com.example.module4intentex2kotlin_new.modul

import java.io.Serializable

class User(var age: Int, var name: String): Serializable {
    override fun toString(): String {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}'
    }
}