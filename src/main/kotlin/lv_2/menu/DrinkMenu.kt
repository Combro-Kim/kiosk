package lv_2.menu

class DrinkMenu {
    val nameList = listOf("콜라", "제로콜라", "사이다", "환타")
    val priceList = listOf(1000, 1100, 1000, 1000)

    fun displayInfo() {
        println("[음료를 골라주세요]")
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