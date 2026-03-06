fun main() {

    var saldo = 0.0
    var sair = false

    while (!sair) {

        println("===================================")
        println("1 -> Depositar")
        println("2 -> Sacar")
        println("3 -> Consultar")
        println("999 -> Sair")
        println("===================================")

        print("Escolha uma opção: ")
        val opcao = readLine()!!.toInt()

        when (opcao) {

            1 -> {
                print("Digite o valor a ser depositado: ")
                val valor = readLine()!!.toDouble()

                saldo += valor

                println("Seu novo saldo é: R$ $saldo")
            }

            2 -> {
                print("Digite o valor a ser sacado: ")
                val valor = readLine()!!.toDouble()

                if (saldo >= valor) {
                    saldo -= valor
                    println("Seu novo saldo é: R$ $saldo")
                } else {
                    println("Saldo insuficiente. Tente novamente.")
                }
            }

            3 -> {
                println("Seu saldo é: R$ $saldo")
            }

            999 -> {
                println("Até a próxima!")
                sair = true
            }

            else -> {
                println("Opção inválida, tente novamente.")
            }
        }
    }
}