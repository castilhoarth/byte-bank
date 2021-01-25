open class Funcionario( //open eh o que permite realizar uma heranca
    val nome: String,
    val cpf: String,
    val salario: Double,
){
    //transformado em property
    open fun bonificacao(): Double = salario * 0.1

//    open fun bonificacao(): Double {
//        return salario * 0.1
//    }
}