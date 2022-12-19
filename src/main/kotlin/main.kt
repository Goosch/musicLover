package ru.netology

fun main() {
    val totalCost = 11000                   //общая стоимость всех покупок
    val signRegularClient = false            //признак постоянного клиента
    val discountLevel1 = 1000               //уровень 1 для скидки
    val discountLevel2 = 10_000             //уровень 2 для скидки
    val discount1 = 100                      //скидка при достижении 1ур
    val discount2 = 0.95                     //скидка при достижении 2 ур
    val discountRegularClient = 0.99        //скидка для постоянного клиента

    var totalPrice: Double = totalCost.toDouble()

    println("Итоговая стоимость:")

    if (totalCost <= discountLevel1) {
        if (signRegularClient) {
            totalPrice = totalCost * discountRegularClient
            println(totalPrice.toInt())
        } else println(totalPrice)
    } else if (totalCost <= discountLevel2) {
        if (signRegularClient) {
            totalPrice = totalCost - discount1.toDouble()
            totalPrice *= discountRegularClient
            println(totalPrice.toInt())
        } else println((totalPrice - discount1).toInt())
    } else if (signRegularClient) {
        totalPrice = totalCost * discount2
        totalPrice *= discountRegularClient
        println(totalPrice.toInt())
    } else {
        totalPrice = totalCost * discount2
        println(totalPrice.toInt())
    }
}