package classes.`Exercicio-aula02`

class Cliente(private var idade: Int,
              private var sexo: Char,
              private var anosContribuicao: Int) {

    fun validateYearsContribution(): Boolean{
        when(this.sexo.toUpperCase()){
            'F' -> return this.idade >= 60
                    || this.anosContribuicao >= 30
            'M' -> return this.idade >= 65
                    || this.anosContribuicao >= 30
        }
        return false
    }

}