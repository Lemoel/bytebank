import br.com.bytebank.modelo.Cliente
import br.com.bytebank.modelo.ContaCorrente
import br.com.bytebank.modelo.ContaPoupanca
import br.com.bytebank.modelo.Endereco

fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(
        titular =  Cliente("Lemoel","123", 123, Endereco("Vergueiro")),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente("Josi","123", 123),
        numero = 1001
    )

    contaCorrente.deposit(1000.0)
    contaPoupanca.deposit(1000.0)
    contaCorrente.titular.endereco

    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("saldo poupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.transferir(100.0, contaPoupanca)
    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber da conta corrente: ${contaPoupanca.saldo}")

    contaPoupanca.transferir(100.0, contaCorrente)
    println("saldo pupanca após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber da poupança: ${contaCorrente.saldo}")
}