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