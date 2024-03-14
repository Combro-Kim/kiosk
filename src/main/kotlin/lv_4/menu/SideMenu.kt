package lv_4.menu

class SideMenu: Menu() {

    override fun displayInfo(idx: Int) {
        println("{사이드 메뉴를 골라주세요}")
        super.displayInfo(idx)
    }
}