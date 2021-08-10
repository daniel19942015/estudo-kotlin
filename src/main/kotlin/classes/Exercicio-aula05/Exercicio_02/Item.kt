package classes.`Exercicio-aula05`.Exercicio_02

class Item(var numeroitem: Long,
           var descricaoItem: String,
           var quantidade: Int = 0,
           var preco: Double = 0.0) {

    init {
        if(this.quantidade < 0) this.quantidade = 0 else this.quantidade
        if(this.preco < 0) this.preco = 0.0 else this.preco
    }
}