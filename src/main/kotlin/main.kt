import classes.`Exercicio-aula02`.Cliente
import classes.`Exercicio-aula02`.Multiplos

fun main(args: Array<String>) {
    //First program
   /* val excercise = classes.`Exercicio-aula01`.Excercise()

    //Exercicio 1
    excercise.max(listOf(1, 2, 16, 3, 0, 8))

    //Exercicio 1.1
    excercise.min(listOf(16, 3, 2, 8))

    //Exercicio 2
    excercise.validateString("a", "b")

    //Exercicio 3
    excercise.analiseNumberPar(4)

    //Exercicio 4
    excercise.firstInteger(10,100)

    //Exercicio 5
    excercise.validateCondition(listOf(4,4,1,1))

    //Exercicio 6
    excercise.printInteger(100, 200)*/

    val multiplo = Multiplos(listOf(1,2,3,4,8))
    val cliente = Cliente(24, 'f', 30)

    println(cliente.validateYearsContribution())

    println(multiplo.multiplicaValor())

}