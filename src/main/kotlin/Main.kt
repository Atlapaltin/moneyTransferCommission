fun main(args: Array<String>) {
    val amount = 3500
    val commissionPercentage = 0.75
    val commissionInKopecks = (amount * commissionPercentage)/100
    println(commissionInKopecks)
}