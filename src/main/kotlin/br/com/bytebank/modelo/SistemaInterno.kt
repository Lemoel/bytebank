package br.com.bytebank.modelo

import br.com.bytebank.modelo.Autenticavel

class SistemaInterno {

    fun entra(autenticavel: Autenticavel, senha: Int) {
        if(autenticavel.autentica(senha)){
            println("Autenticado")
        } else {
            println("Falha na autenticação")
        }
    }

}