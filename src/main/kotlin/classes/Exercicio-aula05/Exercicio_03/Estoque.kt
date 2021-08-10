package classes.`Exercicio-aula05`.Exercicio_03

class Estoque(var nome: String,
              var qtdAtual: Int,
              var qtdMinima: Int) {
    init {
        if(qtdMinima < 0) qtdMinima = 0 else qtdMinima
    }

    fun mudarNome(nome: String): Unit{}
    fun mudarQtdMinima(qtdMinima: Int): Unit{}
    fun repor(qtd: Int): Unit{
        qtdAtual += qtd
    }
    fun darBaixa(qtd: Int): Unit{
        if(qtdAtual < qtdMinima) {
            qtdAtual -= qtd
        }
    }

    fun mostra(): String{
        return "O produto ${nome} " +
                "sua quantidade atual " +
                "é ${qtdAtual} " +
                "e a quatidade minima " +
                "é ${qtdMinima}"
    }

    fun precisaRepor(): Boolean {
        if(qtdAtual <= qtdMinima){
            return true
        }
        return false
    }

}