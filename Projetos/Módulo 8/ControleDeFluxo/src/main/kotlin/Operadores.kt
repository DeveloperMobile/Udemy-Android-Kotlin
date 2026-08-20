/**
 * Abaixo, ideia proposta para resolução
 * Calculo de bonus de funcionário baseado em tempo de empresa
 * Menos de um ano -> 500
 * 1 a 3 anos      -> 2000
 * 4 anos ou mais  -> 5000
 *
 * Posteriormente, mudança efetuada para coonsiderar  o bonus de Diretor no valor de 10000.
 */

/**
 * Exemplo com muitos níveis de controle de fluxo.
 * Quanto mais niveis, mais complex um código se torna e pode ficar difícil
 * entender qual a sua funcionalidade.
 * Exemplo abaixo demonstra algo que NÃO deve ser feito.
 */
fun calculaBonus(tempo: Int): Float {
    if (tempo == 0) {
        return 500F
    } else {
        if (tempo == 1) {
            return 2000F
        }  else {
            if (tempo ==  2) {
                return 2000F
            } else {
                if (tempo == 3) {
                    return 2000F
                } else if (tempo >= 4) {
                    return 5000F
                } else {
                    // ....
                }
            }
        }

    }
    return 0F
}

/**
 * Quando o conceito de que if/else é uma instrução.
 * Ou seja é capaz de retornar valor.
 */
fun calculaBonus2(tempo: Int): Float {
    return if (tempo == 0) {
        500F
    } else if (tempo in 1..3) {
        2000F
    } else if (tempo >= 4) {
        5000F
    } else {
        0F
    }
}

/**
 * Tipo de solução armazenando o valor em uma variável para retornar ao final.
 */
fun calculaBonus3(tempo: Int): Float {
    var bonus = 0F
    if (tempo == 0) {
        bonus = 500F
    } else if (tempo in 1..3) {
        bonus = 2000F
    } else if (tempo >= 4) {
        bonus = 5000F
    }
    return bonus
}

/**
 * Sem controle de fluxo aninhado.
 * Uso do conceito de EARLY RETURN. Retornar assim que possível
 */
fun calculaBonus4(tempo: Int, cargo: String = ""): Float {
    if (cargo == "Diretor") {
        return 10000F
    }

    if (tempo == 0) {
        return 500F
    }

    if (tempo in 1..3) {
        return 2000F
    }
    if (tempo >= 4) {
        return 5000F
    }
    return 0F
}

fun main() {
    println("Bônus por tempo de empresa:")
    println("Cargo Diretor: ${calculaBonus4(0, "Diretor")}")
    println("Menos de 1 ano: ${calculaBonus4(0)}")
    println("1 ano: ${calculaBonus4(1)}")
    println("2 anos: ${calculaBonus4(2)}")
    println("3 anos: ${calculaBonus4(3)}")
    println("Mais de 4 anos: ${calculaBonus4(5)}")
}