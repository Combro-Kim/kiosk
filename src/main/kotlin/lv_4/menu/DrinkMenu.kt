package lv_4.menu

class DrinkMenu:Menu() {
    override fun displayInfo(idx:Int) {
        println("{음료를 골라주세요}")
        super.displayInfo(idx)
    }
}