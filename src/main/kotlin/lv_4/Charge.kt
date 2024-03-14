package lv_4

class Charge {
    fun start(): Int { //보유 금액 받기
        println("보유하신 돈의 숫자만 입력해주세요.")
        return Exception().exceptionInput("wallet").toString().toInt()
    }

    fun calculate(sum: Int, money: Int) { //주문 할 때 계산 부분
        if (money >= sum) {
            val result = money - sum
            println("현재잔액 %d - 총 금액 %d 해서 %d 입니다. 주문이 완료되었습니다.".format(money, sum, result))
        } else {
            val result = sum - money
            println("총 금액은 %d인데 현재잔액은 %d이므로 %d만큼 부족하여 주문에 실패하였습니다.".format(sum, money, result))
        }
        println("재주문하시겠습니까?")
        println("[1]네 [2]아니요")
    }
}