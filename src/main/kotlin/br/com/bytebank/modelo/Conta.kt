package br.com.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {

    var saldo = 0.0
        protected set

    fun deposit(amount: Double) {
        if (amount > 0) {
            this.saldo += amount
        }
    }

    abstract fun saca(amount: Double)

    fun transferir(amount: Double, destination: Conta): Boolean {
        if (saldo >= amount) {
            saldo -= amount
            destination.deposit(amount)
            return true
        }
        return false
    }

}