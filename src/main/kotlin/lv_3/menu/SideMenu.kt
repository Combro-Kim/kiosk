package lv_3.menu

import lv_3.Menu

class SideMenu: Menu() {

    override fun displayInfo(idx: Int) {
        println("[사이드 메뉴를 골라주세요]")
        super.displayInfo(idx)
    }
}