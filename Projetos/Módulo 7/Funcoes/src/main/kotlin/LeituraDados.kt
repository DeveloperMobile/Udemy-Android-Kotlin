fun main() {
    // readLine fará a leitura das informações
    print("Digite um número: ")
    val dado  = readln()

    // Conversão para tipos
    // *** ATENÇÃO *** Não é a melhor maneira de fazer.
    // POREM, como não queremos usar conceitos desconheciidos, seguiremos da maneira abaixo
    println(dado.toString().toShort())
    println(dado.toString().toByte())
    println(dado.toString().toInt())
    println(dado.toString().toLong())
    println(dado.toString().toFloat())
    println(dado.toString().toDouble())
    println(dado.toString().toBoolean())
}