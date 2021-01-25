class Gerente(
    nome: String, //Agora sao parametros que serao enviados pra classe funcionario
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override fun bonificacao(): Double {//override é para sobrescrever
        return super.bonificacao() + salario
    }

    fun autentica(senha: String): Boolean {
        if(this.senha == senha)
            return true

        return false
    }
}