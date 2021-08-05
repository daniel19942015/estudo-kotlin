package Exercicio2

class Conta(var numero: Long, var saldo: Double, var titular: Cliente) {


    public fun deposito(quantia: Double){
        this.saldo += quantia
        println("A nova quantia é ${this.saldo}")
    }

    public fun saque(quantia: Double){
        if(quantia > this.saldo){
            println("Saldo insuficiente")
        }else{
            this.saldo -= quantia
            println("Transação realizada. Novo Saldo: ${this.saldo}")
        }
    }

}