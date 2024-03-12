package lv_1

import java.lang.NumberFormatException

/*
[대분류 메뉴] firstMenu
0.종료 1.메인 메뉴 2.사이드 메뉴 3.음료 4.주문하기 5.장바구니

//[메인 메뉴] mainMenu
//1.불고기버거 2.새우버거 3.데리버거
//
//[사이드 메뉴] sideMenu
//1.감자튀김 2.오징어링 3.애플파이
//
//[음료 메뉴] drinkMenu
//1.콜라 2.제로콜라 3.사이다 4.환타

주문을 완료하셨나요?
1.추가주문 2.주문완료

 */

fun main() {
    val mainArr = arrayOf("불고기버거", "새우버거", "데리버거")
    val sideArr = arrayOf("감자튀김", "오징어링", "애플파이")
    val drinkArr = arrayOf("콜라", "제로콜라", "사이다", "환타")
    var myBag = mutableListOf<String>()


    while (true) {
        //대분류 메뉴
        println("0.종료 1.메인 메뉴 2.사이드 메뉴 3.음료")
        val firstMenu = exception("firstMenu").toString().toInt()


        when (firstMenu) {
            0 -> break
            1 -> { //메인메뉴
                println("[메인메뉴를 골라주세요]")
                println("1.불고기버거 2.새우버거 3.데리버거")
                val mainMenu = exception("mainMenu").toString().toInt()
                println("${mainArr[mainMenu - 1]}를 선택하셨습니다.")
                myBag.add(mainArr[mainMenu - 1])
            }

            2 -> { //사이드 메뉴
                println("[사이드 메뉴를 골라주세요.]")
                println("1.감자튀김 2.오징어링 3.애플파이")
                val sideMenu = exception("sideMenu").toString().toInt()
                println("${sideArr[sideMenu - 1]}를 선택하셨습니다.")
                myBag.add(sideArr[sideMenu - 1])
            }

            else -> {
                //음료 메뉴
                println("[음료를 골라주세요.]")
                println("1.콜라 2.제로콜라 3.사이다 4.환타")
                val drinkMenu = exception("drinkMenu").toString().toInt()
                println("${drinkArr[drinkMenu - 1]}를 선택하셨습니다.")
                myBag.add(drinkArr[drinkMenu - 1])
            }
        }
        println("----------------------------")
//        println("내 장바구니 : $myBag")
        println("주문을 완료하셨나요?")
        println("1.추가주문 2.주문완료")
        val question = exception("question").toString().toInt()
        if (question == 2) {
            println("${myBag}\n주문이 완료되었습니다.")
            break
        }
        else continue
    }
}


fun exception(type: String): Any {
    return when (type) {
        "firstMenu" -> while (true) {
            try {
                val first = readln().toInt()
                if (first in (0..3)) {
                    return first
                } else {
                    println("0.종료 1.메인 메뉴 2.사이드 메뉴 3.음료 4.주문하기\n보기 중 입력해주세요.")
                }
            } catch (e: NumberFormatException) {
                println("잘못된 입력입니다.")
            }
        }

        "mainMenu" -> while (true) {
            try {
                val main = readln().toInt()
                if (main in (1..3)) {
                    return main
                } else {
                    println("잘못된 입력입니다.")
                }
            } catch (e: NumberFormatException) {
                println("잘못된 입력입니다.")
            }
        }

        "sideMenu" -> while (true) {
            try {
                val side = readln().toInt()
                if (side in (1..3)) {
                    return side
                } else {
                    println("잘못된 입력입니다.")
                }
            } catch (e: NumberFormatException) {
                println("잘못된 입력입니다.")
            }
        }

        "drinkMenu" -> while (true) { //drinkMenu
            try {
                val drink = readln().toInt()
                if (drink in (1..4)) {
                    return drink
                } else {
                    println("잘못된 입력입니다.")
                }
            } catch (e: NumberFormatException) {
                println("잘못된 입력입니다.")
            }
        }

        else -> while (true) { //question
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
        }
    }
}


/*fun order(num: Int): String {
    val mainArr = arrayOf("불고기버거", "새우버거", "데리버거")
    val sideArr = arrayOf("감자튀김", "오징어링", "애플파이")
    val drinkArr = arrayOf("콜라", "제로콜라", "사이다", "환타")


    return when (num) {
        1 -> { //메인메뉴
            println("[메인메뉴를 골라주세요]")
            println("1.불고기버거 2.새우버거 3.데리버거")
            val mainMenu = exception("mainMenu").toString().toInt()
            println("${mainArr[mainMenu - 1]}를 선택하셨습니다.")
            return mainArr[mainMenu - 1]
        }

        2 -> { //사이드 메뉴
            println("[사이드 메뉴를 골라주세요.]")
            println("1.감자튀김 2.오징어링 3.애플파이")
            val sideMenu = exception("sideMenu").toString().toInt()
            println("${sideArr[sideMenu - 1]}를 선택하셨습니다.")
            return sideArr[sideMenu - 1]
        }

        else -> {
            //음료 메뉴
            println("[음료를 골라주세요.]")
            println("1.콜라 2.제로콜라 3.사이다 4.환타")
            val drinkMenu = exception("drinkMenu").toString().toInt()
            println("${drinkArr[drinkMenu - 1]}를 선택하셨습니다.")
            return drinkArr[drinkMenu - 1]
        }
    }
}*/
