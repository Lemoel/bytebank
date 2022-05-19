import br.com.bytebank.modelo.Cliente
import br.com.bytebank.modelo.Diretor
import br.com.bytebank.modelo.Gerente
import br.com.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {

    val gerente = Gerente(
        nome = "Lemoel",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 123,
    )

    val diretora = Diretor(
        nome = "modelo.Diretor",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 123,
        plr = 500.0
    )

    val cliente = Cliente(
        nome = "Lemoel",
        cpf = "222.222.222-22",
        senha = 123
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 123)
    sistema.entra(diretora, 1212)
    sistema.entra(cliente, 1234)

}
