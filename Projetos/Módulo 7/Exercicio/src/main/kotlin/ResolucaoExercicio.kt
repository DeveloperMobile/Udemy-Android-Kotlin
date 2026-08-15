fun main() {
    exercicio1(2)
    println()
    println("${exercicio2("abcde")} caractere(s).") // 5
    println()
    println("3 ao cubo é: ${exercicio3(3.0)}") // 27
    println()
    println("100 milha(s) é igual a ${exercicio4(100.0)} Km/h") // 160
    println()
    println("32 graus célcius é igua a: ${exercicio5(32.0)} Fahrenheit.") // 89.6
}

fun exercicio1(anos: Int) {
    val meses = anos * 12
    val dias = anos * 365
    val horas = dias * 24
    val minutos = horas * 60
    val segundos = minutos * 60

    println("$anos ano(s) corresponde(m) a:")
    println("$meses meses.")
    println("$dias dias.")
    println("$horas horas.")
    println("$minutos minutos.")
    println("$segundos segundos.")
}

fun exercicio2(input: String): Int {
    return input.length
}

fun exercicio3(numero: Double): Double {
    return numero * numero * numero
}

fun exercicio4(milhas: Double): Double {
    return milhas * 1.6
}

fun exercicio5(celcius: Double): Double {
    return (celcius * 9 / 5) + 32
}

fun exercicio2UnicaLinha(input: String) = input.length

fun exercicio3UnicaLinha(numero: Double) = numero * numero * numero

fun exercicio4UnicaLinha(milhas: Double) = milhas * 1.6

fun exercicio5UnicaLinha(celcius: Double) = (celcius * 9 / 5) + 32