
fun testaCopiaReferencia() {
    val contaJoao = Conta("João", 1003)
    contaJoao.titular = "João"

    val contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("Titular: ${contaJoao.titular}")
}
