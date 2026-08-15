/**
 * Funções, também chamadas de métodos são trechos específicos de códigos que podem ser
 * chamados diversas vezes. Geralmente possuem uma responsabilidade específica.
 *
 * Funções podem ou não ter retorno.
 * Funções podem ou não ter parâmetros.
 *
 * Fuções que não pussuem retorno podem ser explicitamente marcadas com retorno Unit.
 * Isso significa que a função ainda não retoorna nada, porém pode facilitar a leitura.
 */
fun main() {
    helloWorld()
    meuNome("Gabriel")
    meuNome("Gabriel", 27)

    println("Médias dos valores 7.1 e 4.6 é ${media(7.1f, 4.6f)}")
}

fun helloWorld(): Unit {
    println("Olá Mundo")
}

fun meuNome(nome: String) {
    println("Olá, $nome")
}

fun meuNome(nome: String, idade: Short) {
    println("Olá $nome! Tenho $idade anos.")
}

fun media(n1: Float, n2: Float): Float {
    return (n1 + n2) / 2
}
