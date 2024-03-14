package lv_4

import java.lang.NumberFormatException


class Exception {
    fun exceptionInput(type: String): Int {
        when (type) {
            "firstMenu" -> while (true) {
                try {
                    val first = readln().toInt()
                    if (first in (0..5)) {
                        return first ?: -1
                    } else {
                        println("[경고] 메뉴에서 골라주세요!")
                    }
                } catch (e: NumberFormatException) {
                    println("메뉴의 숫자를 입력해주세요.")
                }
            }

            "mainMenu" -> while (true) {
                try {
                    val main = readln().toInt()
                    if (main in (0..2)) {
                        return main ?: -1
                    } else {
                        println("[경고] 메뉴에서 골라주세요!")
                    }
                } catch (e: NumberFormatException) {
                    println("메뉴의 숫자를 입력해주세요.")
                }
            }

            "sideMenu" -> while (true) {
                try {
                    val side = readln().toInt()
                    if (side in (0..2)) {
                        return side ?: -1
                    } else {
                        println("[경고] 메뉴에서 골라주세요!")
                    }
                } catch (e: NumberFormatException) {
                    println("메뉴의 숫자를 입력해주세요.")
                }
            }

            "wallet" -> while (true) {
                try {
                    val money = readln().toInt()
                    if (money in (1000..2147483647)) {
                        println("{{{어서오세요.햄벅어 집입니다.}}}")
                        return money ?: -1
                    } else {
                        println("죄송하지만 저희 메뉴 최소금액이 안됩니다. 1000원 이상입력해주세요.")
                    }
                } catch (e: NumberFormatException) {
                    println("정확한 숫자를 입력해주세요.")
                }
            }


            "drinkMenu" -> while (true) {
                try {
                    val drink = readln().toInt()
                    if (drink in (0..3)) {
                        return drink ?: -1
                    } else {
                        println("[경고] 메뉴에서 골라주세요!")
                    }
                } catch (e: NumberFormatException) {
                    println("메뉴의 숫자를 입력해주세요.")
                }
            }

            else -> while (true) { //correct
                try {
                    val question = readln().toInt()
                    if (question == 1 || question == 2) {
                        return question ?: -1
                    } else {
                        println("잘못된 입력입니다.")
                    }
                } catch (e: NumberFormatException) {
                    println("잘못된 입력입니다.")
                }
            }
        }
    }


    fun errorMessage(n: Int) { //todo
        val notInMenu = "[경고] 메뉴에서 골라주세요!"
        println(notInMenu)
    }
}