package Exercicio1

class JogadorDeFutebol(var nome: String,
                       var energia: Int,
                       var alegria: Int,
                       var gols: Int,
                       var experiencia: Int) {


    public fun fazerGol(){
        this.energia -= 5
        this.alegria += 10
        this.gols += 1

        println("GOOOOL")
    }

    public fun correr(){
        this.energia -= 10
        println("CANSEI!")
    }

    public fun addExperiencia(experiencia: Int){
        this.experiencia += experiencia
    }


}