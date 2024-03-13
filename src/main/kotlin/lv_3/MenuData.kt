package lv_3

open class MenuData {
    open val menuAll = listOf(
        listOf("불고기버거", "새우버거", "데리버거"),
        listOf("감자튀김", "오징어링", "애플파이"),
        listOf("콜라", "제로콜라", "사이다", "환타")
    )
    open val priceAll = listOf(
        listOf(3000, 3500, 2000),
        listOf(1500, 2000, 2300),
        listOf(1000, 1100, 1000, 900)
    )
}


/* todo 한번에 저장하는 방법은 없을까 ?
val menuList = mapOf<String, Int>("불고기버거" to 3000, "새우버거" to 3500, "데리버거" to 2000...)
val menuList = listOf(listOf("불고기버거",3000), listOf("새우버거",3500)...)
*/
