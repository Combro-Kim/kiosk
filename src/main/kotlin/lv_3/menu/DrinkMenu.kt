package lv_3.menu

import lv_3.Menu

class DrinkMenu:Menu() {
    override fun displayInfo(idx:Int) {
        println("[음료를 골라주세요]")
        super.displayInfo(idx)
    }
}