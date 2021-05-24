fun main() {

    println("Bem vindo ao Bytebank")
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

class Account(
    var holder: String,
    val number: Int
) {

    var balance = 0.0
        private set

    fun deposit(amount: Double) {
        if (amount > 0) {
            this.balance += amount
        }
    }

    fun withdrawal(amount: Double) {
        if (balance >= amount) {
            this.balance -= amount
        }
    }

    fun transfer(amount: Double, destination: Account): Boolean {
        if (balance >= amount) {
            balance -= amount
            destination.deposit(amount)
            return true
        }
        return false
    }

}