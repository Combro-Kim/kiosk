package lv_4.menu

import kotlin.math.exp


// Menu를 부모 class로 만들기
// 하나의 리시트 객체로 모든 메뉴들을 관리
//todo 실행 시 메인에서 init 메소드를 실행하여 메뉴들을 객체화하고 리스트에 담아둔다
open class Menu {
    val menuName = MenuData().menuAll
    val menuPrice = MenuData().priceAll
    val explainMenu = MenuData().explainMenu

    open fun displayInfo(idx: Int) { //안내문(메뉴를 골라주세요), 메뉴 항목 보여주기
        //menuList 띄우기
        val showMenu = menuName[idx]
        val showPrice = menuPrice[idx]
        val showInfo = explainMenu[idx]

        for (i in showMenu.indices) {
            var name:String = showMenu[i]
            if(name.length != 20) repeat(20-name.length){name += " "}
            //println("${i}. ${showMenu[i]}(${showPrice[i]}원) | ${showInfo[i]}")
            println("%d. %s| %dW | %s".format(i,name,showPrice[i],showInfo[i]))
        }
    }

    open fun select(n1:Int,n2: Int): Pair<String, Int> {
        return menuName[n1-1][n2] to menuPrice[n1-1][n2]
    }


}
