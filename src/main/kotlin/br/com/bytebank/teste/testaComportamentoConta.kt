import br.com.bytebank.modelo.Cliente
import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca

fun testaComportamentoConta() {
    val contaLemoel = ContaCorrente(numero = 1000, titular = Cliente("Josi","123", 123))
    contaLemoel.deposit(11.2)
    println(contaLemoel.titular)
    println(contaLemoel.numero)

    val contaFran = ContaPoupanca(Cliente("Fran","123", 123), 1001);
    contaFran.deposit(10.2)

    val contaJoao = ContaCorrente( Cliente("João","123", 123), 1002);
    contaFran.deposit(10.2)

    println("Titular conta Joaoa: ${contaJoao.titular}")
}