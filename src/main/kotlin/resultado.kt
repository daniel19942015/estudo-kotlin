import classes.`Exercicio-aula02`.Cliente
import classes.`Exercicio-aula02`.Multiplos
import classes.`Exercicio-aula05`.Exercicio_02.Fatura
import classes.`Exercicio-aula05`.Exercicio_02.Item

fun main() {

    val listIntem = listOf<Item>(
        Item(1254889665, "produto 1", 10, 25.9),
        Item(4588526958, "Produto 2", 10, 10.0),
        Item(5966663214, "Produto 3", 10, 10.0)
    )

    val fatura = Fatura(listIntem)
    val resultado = fatura.totalFatura()


    print(resultado)


}