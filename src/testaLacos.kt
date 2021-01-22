fun testaLacos() {
    for (i in 5 downTo 3 step 2) { //for with range  (..) -  ctrl alt l identa
        //downTo no lugar do .. se quiser fazer decrescente e step pra fazer pulinhos
        val titular = "Arthur $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 0.0
        //    saldo == 200.0
        println("Titular: $titular")
        println("number da conta $numeroConta")
        println("saldo da conta $saldo")
        testaCondicoes(saldo)
    }

    var i = 0
    while (i < 5) {
        val titular = "Arthur $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 0.0
        //    saldo == 200.0
        println("Titular: $titular")
        println("number da conta $numeroConta")
        println("saldo da conta $saldo")
        testaCondicoes(saldo)
        i++
    }
}
