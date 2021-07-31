class Exercicios {

    //Exercicio 1
    fun validaNumeros(list: List<Int>): Int{
        var aux: Int = list.get(0)
        for(i: Int in list){
            if(i > aux){
                aux = i
            }
        }
        return aux
    }
    //Exercicios 2
    fun cadeiaTexto(primeiroTexto: String,
                    segundoText: String): Boolean{

        return primeiroTexto == segundoText
    }

    //Exercicio 3
    fun analisaNumeroPar(numero: Int): Boolean{
        return numero % 2 == 0
    }

    //Exercicio 4
    fun primeirosCemInteiros(){
        for(i: Int in 0 until 100){
            if(i % 2 != 0) {
                println(i)
            }
        }
    }

    //Exercicio 5
    fun validaCondicao(list: List<Int>): Boolean{
        if((list.get(0) > list.get(2) && list.get(0) > list.get(3))
            || (list.get(1) > list.get(2) && list.get(1) > list.get(3))){

            return true
        }
        return false
    }

    //Excercicio 6
    fun imprimeInteiro(){
        for(i: Int in 100 until 1000){
            println(i)
        }
    }
}