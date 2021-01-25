fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        nome = "Alex",
        cpf = "255.554.018.09",
        salario = 1000.0,
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificacao ${alex.bonificacao()}")
    val fran = Gerente(
        nome = "Fran",
        cpf = "123.233.123-22",
        salario = 3000.00,
        senha = "123456"
    )
    println("___________________________________")
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificacao ${fran.bonificacao()}")

    if(fran.autentica(senha = "13456"))
        println("Usuário autorizado!")
    else
        println("Usuário não autorizado")

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.00,
        senha = "123456",
        plr = 200.00
    )

    println("___________________________________")

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificacao ${gui.bonificacao()}")
    println("salario ${gui.plr}")

    if(gui.autentica(senha = "13456"))
        println("Usuário autorizado!")
    else
        println("Usuário não autorizado")
}





