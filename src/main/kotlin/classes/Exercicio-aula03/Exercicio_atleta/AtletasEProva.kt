package Exercicio3

fun main() {

    val atleta1 = Atleta("Daniel", 20, 30)
    val atleta2 = Atleta("Roberta", 40, 10)

    val prova1 = Prova(20, 30)

    prova1.podeRealizar(atleta1)
    prova1.podeRealizar(atleta2)


    val prova2 = Prova(10, 5)

    prova2.podeRealizar(atleta1)
    prova2.podeRealizar(atleta2)

    val prova3 = Prova(50, 10)

    prova3.podeRealizar(atleta1)
    prova3.podeRealizar(atleta2)

}