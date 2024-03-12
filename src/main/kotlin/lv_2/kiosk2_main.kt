package lv_2


import lv_2.menu.DrinkMenu
import lv_2.menu.MainMenu
import lv_2.menu.SideMenu

fun main() {
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
                MainMenu().displayInfo()
                val mainMenu = exception.exceptionRL("mainMenu").toString().toInt()
                //장바구니, 금액에 선택항목 추가
                myBag += MainMenu().selectName(mainMenu)
                sum += MainMenu().selectPrice(mainMenu)
                println("장바구니:$myBag 총 금액:$sum")
            }

            2 -> {
                SideMenu().displayInfo()
                val sideMenu = exception.exceptionRL("sideMenu").toString().toInt()
                //장바구니, 금액에 선택항목 추가
                myBag += SideMenu().selectName(sideMenu)
                sum += SideMenu().selectPrice(sideMenu)
                println("장바구니:$myBag 총 금액:$sum")
            }
            3->{
                DrinkMenu().displayInfo()
                val drinkMenu = exception.exceptionRL("drinkMenu").toString().toInt()
                //장바구니, 금액에 선택항목 추가
                myBag += DrinkMenu().selectName(drinkMenu)
                sum += DrinkMenu().selectPrice(drinkMenu)
                println("장바구니:$myBag 총 금액:$sum")
            }
        }
    }
    //메인메뉴


    //사이드메뉴

    //음료메뉴


}