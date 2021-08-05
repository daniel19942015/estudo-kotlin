package Exercicio2

fun main() {

    val cliente1 = Cliente("Daniel", "Silva")
    val cliente2 = Cliente("Raquel", "Ferreira")

    val conta1 = Conta(101233, 300.00, cliente1)
    val conta2 = Conta(124586, 850.63, cliente2)

    conta1.deposito(100.00)
    println(conta1.saldo)
    conta1.saque(250.63)
    println(conta1.saldo)

}