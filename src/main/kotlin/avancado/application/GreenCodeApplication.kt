package avancado.application

import avancado.Config

class GreenCodeApplication {
    companion object {
        fun build() {
            val config = Config()
            println("Bem vindo!")
            config.menu()
        }
    }
}