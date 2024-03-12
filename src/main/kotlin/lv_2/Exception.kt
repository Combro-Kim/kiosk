package lv_2

import java.lang.NumberFormatException

class Exception {
    fun exceptionRL(type: String): Any {
        return when (type) {
            "firstMenu" -> while (true) {
                try {
                    val first = readln().toInt()
                    if (first in (0..3)) {
                        return first
                    } else {
                        println("0.종료 1.메인 메뉴 2.사이드 메뉴 3.음료\n보기 중 입력해주세요.")
                    }
                } catch (e: NumberFormatException) {
                    println("잘못된 입력입니다.")
                }
            }

            "mainMenu" -> while (true) {
                try {
                    val main = readln().toInt()
                    if (main in (0..2)) {
                        return main
                    } else {
                        println("메뉴 중에 선택해주세요.")
                    }
                } catch (e: NumberFormatException) {
                    println("잘못된 입력입니다.")
                }
            }

            "sideMenu" -> while (true) {
                try {
                    val side = readln().toInt()
                    if (side in (0..2)) {
                        return side
                    } else {
                        println("메뉴 중에 선택해주세요.")
                    }
                } catch (e: NumberFormatException) {
                    println("잘못된 입력입니다.")
                }
            }

            else -> while (true) { //drinkMenu
                try {
                    val drink = readln().toInt()
                    if (drink in (0..3)) {
                        return drink
                    } else {
                        println("메뉴 중에 선택해주세요.")
                    }
                } catch (e: NumberFormatException) {
                    println("잘못된 입력입니다.")
                }
            }

/*            else -> while (true) { //question
                try {
                    val question = readln().toInt()
                    if (question == 1 || question == 2) {
                        return question
                    } else {
                        println("잘못된 입력입니다.")
                    }
                } catch (e: NumberFormatException) {
                    println("잘못된 입력입니다.")
                }
            }*/
        }
    }
}