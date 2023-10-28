fun main(args: Array<String>) {
    fun zadacha5(string: String): Any {
        var xS = ""
        var nS = ""
        for (char in string) {
            if (char != ' ' && nS == "") {
                xS += char
            } else {
                nS += char
            }
        }
        val n = nS.replace(" ", "").toInt()
        val x = xS.toInt()

        if (x <= 0 || n <= 0) {
            return "Основание степени и число должны быть положительными."
        }

        var y = 0
        var power = 1
        while (power <= n) {
            if (power == n) {
                return y
            }
            y++
            power *= x
        }
        return "Целочисленного показателя не существует"
    }
    print("Введите два числа через пробел: ")
    println("Показатель степени: " + zadacha5(readln()))
}