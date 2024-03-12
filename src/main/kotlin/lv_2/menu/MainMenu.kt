package lv_2.menu


import lv_1.exception
import lv_2.Exception


class MainMenu {
    /*
        val name:String =""
        val price:Int = 0
    val menuList = mapOf<String, Int>("불고기버거" to 3000, "새우버거" to 3500, "데리버거" to 2000)
    val menuList = listOf(listOf("불고기버거",3000), listOf("새우버거",3500))
    */
    val nameList = listOf("불고기버거", "새우버거", "데리버거")
    val priceList = listOf(3000, 3500, 2000)


    fun displayInfo(): Unit {
        println("[메인메뉴를 골라주세요]")
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
