fun main() {
    imprimeImpares()
    println()

    var i = 0
    while (true) {
        print("$i ")
        if (i == 10) {
            // Quebra o laço de repetição meso que a condição de execução seja verdadeira
            break
        }
        i++
    }

    println()
    println()

    while (i <= 100) {
        if (i < 95) {
            i++
            // Continue faz com que oo laço de repetição passe para a próxima iteração
            continue
            println("Eu nunca serei executado.")
        }
        print("$i ")
        i++
    }
}

fun imprimeImpares() {
    for (i in 1..10) {
        if (i % 2 == 0) {
            // Pula a impressão se o número for par
            continue
        }
        println(i) // Só iprime ímpares
    }
}