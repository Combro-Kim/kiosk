package lv_4.menu

open class MenuData {
    open val menuAll = listOf(
        listOf("Bulgogi Burger", "Shrimp Burger", "Terri Burger"),
        listOf("French Fries", "Fried Squid Rings", "apple pie"),
        listOf("Cola", "zero Cola", "Sprite", "Fanta")
    )
    open val explainMenu = listOf(
        listOf("불고기패티의 버거", "새우 패티의 버거", "데리소스의 버거"),
        listOf("감자를 튀긴거", "오징어를 튀긴거", "파이가 애플"),
        listOf("얼음 동동 콜라", "이건 살안찜", "얼음 동동 사이다", "미린다보다 환타가 원조인거 아셨나요")
    )

    open val priceAll = listOf(
        listOf(3000, 3500, 2000),
        listOf(1500, 2000, 2300),
        listOf(1100, 1300, 1100, 100)
    )
}


/* todo 한번에 저장하는 방법은 없을까 ?
val menuList = mapOf<String, Int>("불고기버거" to 3000, "새우버거" to 3500, "데리버거" to 2000...)
val menuList = listOf(listOf("불고기버거",3000), listOf("새우버거",3500)...)
*/
