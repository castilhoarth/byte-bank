class Conta(
    var titular: String, val numero: Int // se colocar = 0 torna opcional a atribuição do valor

) { //Se criarmos class // construtor primário

    var saldo = 0.0
        private set //modificando a visibilidade do set nativo do kotlin
//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//
//    } //construtor secundário para atribuir regras de negócio

    fun deposita(valor: Double) {
        println("depositando na conta dx ${this.titular}")
        this.saldo += valor
        println(this.saldo)
    }

    fun saca(valor: Double) {
        if (this.saldo - valor >= 0) {
            println("Sacando na conta do ${this.titular}")
            saldo -= valor
        }
    }

    fun transfere(valor: Double, contDestino: Conta): Boolean {
        if (this.saldo - valor >= 0) {
            saldo -= valor
            contDestino.deposita(valor)
            return true
        }
        return false
    }
//    fun getSaldo(): Double { properties(atributos) já possuem getter e setter automaticos
//        return this.saldo
//
//    }
//
//    fun setSaldo(saldo: Double) {
//        this.saldo = saldo
//    }
}