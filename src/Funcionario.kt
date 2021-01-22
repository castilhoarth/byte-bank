class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val tipo: Int // = 0 -> funcionario, 1-> gerente, 2-> diretor
){
    fun bonificacao(): Double {
        return 0.1 * salario
    }
}