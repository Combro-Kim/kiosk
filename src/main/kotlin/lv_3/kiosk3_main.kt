package lv_3

import lv_3.menu.DrinkMenu
import lv_3.menu.MainMenu
import lv_3.menu.SideMenu


fun main() {
    init()
}


fun init() {
    val exception = Exception()
    var myBag = mutableListOf<String>()
    var sum = 0

    while (true) {
        println("0.주문종료 1.메인 메뉴 2.사이드 메뉴 3.음료")
        val firstMenu = exception.exceptionRL("firstMenu").toString().toInt()
        when (firstMenu) {
            0 -> {
                println("주문내용은 ${myBag}이고 결제하실 금액은 ${sum}입니다. 감사합니다.")
                break
            }

            1 -> {
                MainMenu().displayInfo(firstMenu - 1)
                val mainMenu = exception.exceptionRL("mainMenu").toString().toInt() //메뉴 선택
                //장바구니, 금액에 선택항목 추가
                myBag += Menu().select(firstMenu, mainMenu).first
                sum += Menu().select(firstMenu, mainMenu).second
                println("장바구니:$myBag 총 금액:$sum")
            }

            2 -> {
                SideMenu().displayInfo(firstMenu - 1)
                val sideMenu = exception.exceptionRL("sideMenu").toString().toInt()
                //장바구니, 금액에 선택항목 추가
                myBag += Menu().select(firstMenu, sideMenu).first
                sum += Menu().select(firstMenu, sideMenu).second
                println("장바구니:$myBag 총 금액:$sum")
            }

            3 -> {
                DrinkMenu().displayInfo(firstMenu - 1)
                val drinkMenu = exception.exceptionRL("drinkMenu").toString().toInt()
                //장바구니, 금액에 선택항목 추가
                myBag += Menu().select(firstMenu, drinkMenu).first
                sum += Menu().select(firstMenu, drinkMenu).second
                println("장바구니:$myBag 총 금액:$sum")
            }
        }
    }
}
