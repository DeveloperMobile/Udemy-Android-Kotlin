fun main() {
    val salario = 10000
    var patAna = 0f
    var patPaula = 0f
    var mes = 1

    do {
        patAna += (salario * 0.05f + salario * 0.05f + patAna * 0.002f)
        patPaula += (salario * 0.05f + patPaula * 0.008f)
        mes++
    } while (patAna > patPaula)

    println(String.format("Ana: R$%.2f", patAna))
    println(String.format("Paula: R$%.2f", patPaula))
    println("Paula vai ultrapassar o patrimônio de Ana no mês $mes")
}