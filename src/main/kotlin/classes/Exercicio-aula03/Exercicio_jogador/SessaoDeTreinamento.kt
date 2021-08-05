package Exercicio1

class SessaoDeTreinamento(var experiencia: Int) {

    public fun treinarA(jogador: JogadorDeFutebol){
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        experiencia += 1
    }

}