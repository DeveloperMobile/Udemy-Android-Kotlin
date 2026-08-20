fun portaria(): String {
    print("Informe a idade: ")
    val idade = readln().toInt()

    if (idade < 18) {
        return "Negado. Menores de idade não são permitidos."
    } else {
        print("Informe o tipo de convite: ")
        val tipo = readln()

        if (tipo != "comum" && tipo != "premium" && tipo != "luxo") {
            return "Negado. Convite Inválido."
        }

        print("Inform o código do convite: ")
        val codigo = readln().lowercase()

        return if (tipo == "comum" && codigo.startsWith("xt")) {
            "Welcome :)"
        } else if ((tipo == "premium" || tipo == "luxo") && codigo.startsWith("xl")) {
            "Welcome :)"
        } else {
            "Negado. Convite Inválido."
        }
    }
}

fun main() {
    println(portaria())
}