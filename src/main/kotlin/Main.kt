fun main() {


    evenNumbers()

    isPalindrome("civic")
    isPalindrome("ragaca")


    println(findDollar("test '$'sityva"))
    println(findDollar("test sityva"))


    findUSJ(8, 10)
    findUSG(32, 64)


}


private fun evenNumbers(): Unit {
    var sum = 0
    for (number in 1..100) {
        if (number % 2 == 0) {
            sum += number
        }
    }
    println("ლუწი რიცხვების ჯამია: $sum")
}

private fun findUSG(numberOne: Int, numberTwo: Int) {
    var n1 = if (numberOne > 0) numberOne else -numberOne
    var n2 = if (numberTwo > 0) numberTwo else -numberTwo

    while (n1 != n2) {
        if (n1 > n2)
            n1 -= n2
        else
            n2 -= n1
    }
    println("უდიდესი საერთო ჯერადი = $n1")

}

private fun findUSJ(numberOne: Int, numberTwo: Int) {
    var usj: Int = if (numberOne > numberTwo) numberOne else numberTwo

    while (true) {
        if (usj % numberOne == 0 && usj % numberTwo == 0) {
            println("$numberOne-ის და $numberTwo-ს უმცირესი საერთო ჯერადია: $usj")
            break
        }
        ++usj
    }
}

private fun findDollar(word: String): Boolean {
    return word.contains("$")
}

private fun reversedNumber(number: Int): String {
    return number.toString().reversed()
}

private fun isPalindrome(word: String) {
    if (word.reversed() == word) {
        println("თქვენს მიერ შეყვანილი სიტყვა პალინდრომია")
    } else {
        println("თქვენს მიერ შეყვანილი სიტყვა არ არის პალინდრომი")
    }
}