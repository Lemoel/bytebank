fun main() {
    println("Bem vindo ao Bytebank")
    val lemoel = Funcionario(
        nome = "lemoel",
        cpf = "84593890144",
        salario = 1000.0,
    )

    println("Nome ${lemoel.nome}")
    println("Cpf ${lemoel.cpf}")
    println("Salario ${lemoel.salario}")
    println("bonificacao ${lemoel.bonificacao} ")

    val gerente = Gerente(
        nome = "Josiane",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 123,
    )

    println("Nome ${gerente.nome}")
    println("Cpf ${gerente.cpf}")
    println("Salario ${gerente.salario}")
    println("bonificacao ${gerente.bonificacao} ")

    if (gerente.autentica(123)) {
        println("Autenticou com sucesso")
    } else {
        println("Não autenticou")
    }

    val diretor = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0,
    )

    println("Nome ${diretor.nome}")
    println("Cpf ${diretor.cpf}")
    println("Salario ${diretor.salario}")
    println("bonificacao ${diretor.bonificacao} ")
    println("PLR ${diretor.plr}")

    if (diretor.autentica(3000)) {
        println("Autenticou com sucesso")
    } else {
        println("Não autenticou")
    }


}