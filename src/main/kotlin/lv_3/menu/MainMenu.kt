package lv_3.menu

import lv_3.Menu

class MainMenu:Menu() {
    override fun displayInfo(idx: Int) {
        println("[메인 메뉴를 골라주세요]")
        super.displayInfo(idx)
    }
}