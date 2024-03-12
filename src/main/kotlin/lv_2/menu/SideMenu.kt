package lv_2.menu

class SideMenu {
    val nameList = listOf("감자튀김", "오징어링", "애플파이")
    val priceList = listOf(1500, 2000, 2300)

    fun displayInfo() {
        println("[사이드 메뉴를 골라주세요]")
        //menuList 띄우기
        for (i in nameList.indices) {
            print("${i}.${nameList[i]}:${priceList[i]}원 ")
        }
        println()
    }

    //고른메뉴 저장용
    fun selectName(n: Int): String {
        return nameList[n]
    }

    fun selectPrice(n: Int): Int {
        return priceList[n]
    }
}