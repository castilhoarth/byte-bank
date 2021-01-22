fun testaPrograma() {
    val contaAlex = Conta(titular = "Alex", numero = 1001) //apontando apenas para o endereço do objeto
//    contaAlex.titular = "Alex"
//    contaAlex.numero = 1

    val contaFran =
        Conta(titular = "Fran", numero = 1000) //utilizando labels para tornar a leitura do código mais simples
//    contaFran.titular = "Fran" não é necessário fazer desse jeito
//    contaFran.numero = 2


    println("Titular: ${contaFran.titular}")
    println("Número: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo}")

    println("_________________________________")

    println("Titular: ${contaAlex.titular}")
    println("Número: ${contaAlex.numero}")
    println("Saldo: ${contaAlex.saldo}")

    println("_________________________________")

    contaFran.deposita(500.00)
    contaFran.saca(100.00)

    println("Conta Fran pós operações")
    println("Titular: ${contaFran.titular}")
    println("Número: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo}")

    println("_________________________________")

    if (contaFran.transfere(valor = 100.00, contDestino = contaAlex))
        println("Transferência bem sucedida")
    else
        println("Transferência mal sucedida")
}