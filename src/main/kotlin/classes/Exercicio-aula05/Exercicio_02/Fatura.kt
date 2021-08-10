package classes.`Exercicio-aula05`.Exercicio_02

class Fatura(var item: List<Item>) {

    fun totalFatura(): Double{

        var total:Double = 0.0
        if(item.size > 0){
            for(i in item) {
                total += i.quantidade * i.preco
            }
        }
        return total
    }

}