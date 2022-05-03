fun testaComportamentoConta() {
    val contaLemoel = Account(number = 1000, holder = "Josi")
    contaLemoel.deposit(11.2)
    println(contaLemoel.holder)
    println(contaLemoel.number)

    val contaFran = Account("Fran", 1001);
    contaFran.deposit(10.2)

    val contaJoao = Account("Joao", 1002);
    contaFran.deposit(10.2)

    println("Titular conta Joaoa: ${contaJoao.holder}")
}