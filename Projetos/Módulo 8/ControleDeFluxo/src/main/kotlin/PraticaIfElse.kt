/**
 * Resolução usando funciionalidade de if/eelse if
 */
fun ex1(cargo: String): Float {
    var bonus = 0F
    if (cargo == "Gerente") {
        bonus = 2000F
    } else if (cargo == "Coordenador") {
        bonus = 1500F
    } else if (cargo == "Engenheiro de Software") {
        bonus = 1000F
    } else if (cargo == "Estagiário") {
        bonus = 500F
    }
    return bonus
}

fun ex2(cargo: String, anos: Int = 0): Float {
    var bonus = 0F
    if (cargo == "Gerente") {
       if (anos < 2) {
           bonus = 2000F
       } else {
           bonus = 3000F
       }
    } else if (cargo == "Coordenador") {
       if (anos < 1) {
           bonus = 1500F
       } else {
           bonus = 1800F
       }
    } else if (cargo == "Engenheiro de Software") {
        bonus = 1000F
    } else if (cargo == "Estagiário") {
        bonus = 500F
    }
    return bonus
}

/**
 * Usando a propriedade do if else de ser uma expressão.
 * Sem necessidade de variável auxiliar para armazenar valor.
 */
fun ex2Variacao2(cargo: String, anos: Int): Float {
    return if (cargo == "Gerente") {
        if (anos < 2) 2000f else 3000f
    } else if (cargo == "Coordenador") {
        if (anos < 1) 1500f else 1800f
    } else if (cargo == "Engenheiro de software") {
        1000f
    } else if (cargo == "Estagiário") {
        500f
    } else {
        0f
    }
}

fun ex3() {
    val a = false
    val b = false
    val c =  true
    val d = true

    println(a && b && c && d)
    println(!a && !b && (c && d))
    println(a && ((b || c) || d))
    println(a || ((!b && c) || !d))
}

fun main() {
    println(String.format("Gerente: R$%.2f", ex1("Gerente")))
    println(String.format("Coordenador: R$%.2f", ex1("Coordenador")))
    println(String.format("Engenheiro de Software: R$%.2f", ex1("Engenheiro de Software")))
    println(String.format("Estagiário: R$%.2f", ex1("Estagiário")))

    println()

    println(String.format("Gerente: R$%.2f, %d ano(s) de experiência", ex2("Gerente", 1), 1))
    println(String.format("Gerente: R$%.2f, %d ano(s) de experiência", ex2("Gerente",2),2))
    println(String.format("Coordenador: R$%.2f, %d ano(s) de experiência", ex2("Coordenador"), 0))
    println(String.format("Coordenador: R$%.2f, %d ano(s) de experiência", ex2("Coordenador", 1), 1))
    println(String.format("Engenheiro de Software: R$%.2f", ex2("Engenheiro de Software"), 0))
    println(String.format("Estagiário: R$%.2f", ex2("Estagiário"), 0))

    println()

    ex3()
}