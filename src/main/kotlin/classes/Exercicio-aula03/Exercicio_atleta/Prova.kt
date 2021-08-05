package Exercicio3

class Prova(var dificuldade: Int, var energiaNecessaria: Int) {

    public fun podeRealizar(atleta: Atleta): Boolean{
        if(atleta.energia >= energiaNecessaria
            && atleta.nivel >= dificuldade){
            return true
        }

        return false
    }

}