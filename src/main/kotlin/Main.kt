fun main() {
    val amount = 2500
    val commissionPercentage = 0.75
    val commissionInKopecks = (amount * commissionPercentage)/100
    val minimumCommission = 3500
    val result = if (commissionInKopecks < 3500) minimumCommission else commissionInKopecks
    println(result)
}