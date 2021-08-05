package Exercicio1

fun main() {
    val jogador1 = JogadorDeFutebol("Romário", 80, 80, 1, 105)
    val jogador2 = JogadorDeFutebol("Messi", 100, 60, 0, 120)

    val treinamento = SessaoDeTreinamento(5)

    treinamento.treinarA(jogador1)
    treinamento.treinarA(jogador2)

}
