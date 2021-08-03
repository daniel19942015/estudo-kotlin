package classes.exercicios

class Multiplos(var list: List<Int>) {

    fun multiplicaValor(): Int{
        var resultado: Int = 0
        for(i in this.list){
            resultado += i
        }

        return resultado
    }

}