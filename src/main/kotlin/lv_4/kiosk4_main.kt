package lv_4

import lv_4.menu.*

// 현재 잔액과 가격을 비교해서 구매 가능한 상태를 클래스에 추가적으로 구현한다.
// ex) 구매할만큼 충분한 돈이 있는지도 상태에 포함시킨다.
// 예외처리 정리
fun main() {
    init()
}

fun init() {
    val exception = Exception()
    var myBag = mutableListOf<String>()
    var sum = 0
    var money = Charge().start() //보유 금액 받기 및 저장

    while (true) {
        println("[0]종료 [1]메인 메뉴 [2]사이드 메뉴 [3]음료 [4]주문하기 [5]장바구니 리셋")
        val firstMenu = exception.exceptionInput("firstMenu").toString().toInt()
        when (firstMenu) {
            0 -> {
                println("감사합니다. 또 오세요.")
                break
            }

            1 -> {
                MainMenu().displayInfo(firstMenu - 1)
                val mainMenu = exception.exceptionInput("mainMenu").toString().toInt() //메뉴 선택
                //장바구니, 금액에 선택항목 추가
                myBag += Menu().select(firstMenu, mainMenu).first
                sum += Menu().select(firstMenu, mainMenu).second
                println("장바구니:$myBag 총 금액:$sum")
            }

            2 -> {
                SideMenu().displayInfo(firstMenu - 1)
                val sideMenu = exception.exceptionInput("sideMenu").toString().toInt()
                //장바구니, 금액에 선택항목 추가
                myBag += Menu().select(firstMenu, sideMenu).first
                sum += Menu().select(firstMenu, sideMenu).second
                println("장바구니:$myBag 총 금액:$sum")
            }

            3 -> {
                DrinkMenu().displayInfo(firstMenu - 1)
                val drinkMenu = exception.exceptionInput("drinkMenu").toString().toInt()
                //장바구니, 금액에 선택항목 추가
                myBag += Menu().select(firstMenu, drinkMenu).first
                sum += Menu().select(firstMenu, drinkMenu).second
                println("장바구니:$myBag 총 금액:$sum")
            }

            4 -> {
                println("네 주문도와드리겠습니다.\n${myBag} 주문이 맞으신가요?")
                var charge = Charge()
                println("[1]네 [2]아니요")
                val orderMenu = Exception().exceptionInput("correct").toString().toInt()
                if (orderMenu == 2) {
                    println("메뉴로 돌아옵니다.")
                    continue
                } else {
                    charge.calculate(sum, money)
                    val reOrder = Exception().exceptionInput("correct").toString().toInt()
                    if (reOrder == 1) {
                        myBag.clear()
                        sum = 0
                    } else {
                        break
                    }
                }
            }

            5 -> {
                myBag.clear()
                sum = 0
                println("장바구니를 비웠습니다.")
            }
        }
    }
}


