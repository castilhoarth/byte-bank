class Diretor(
    nome: String, //Agora sao parametros que serao enviados pra classe funcionario
    cpf: String,
    salario: Double,
    val senha: String,
    val plr : Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override fun bonificacao(): Double {
        return super.bonificacao() + salario + plr //serve para chamar uma funcao da classe mae
    }

    fun autentica(senha: String): Boolean {
        if(this.senha == senha)
            return true

        return false
    }
}