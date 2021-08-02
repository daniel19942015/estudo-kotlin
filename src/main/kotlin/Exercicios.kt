class Excercise: Print(){

    private var aux: Int = 0
    private var validate: Boolean = false
    private var par: Boolean = false

    //Exercicio 1
    fun max(list: List<Int>): Int{
        start(1)
        for(i: Int in list){
            if(i > this.aux){
                this.aux = i
            }
        }
        comment("Higher number is " +  this.aux)

        end(1)
        return this.aux
    }

    fun min(list: List<Int>): Int{
        start(2)
        this.aux = list.get(0)
        for(i: Int in list){
            if(i < this.aux){
                this.aux = i
            }
        }
        comment("Less number is " +  this.aux)

        end(2)
        return this.aux
    }


    //Exercicios 2
    fun validateString(firstText: String, secondText: String): Boolean{
        start(3)
        this.validate = firstText == secondText
        comment("This text equals? " + this.validate)
        end(3)
        return this.validate
    }

    //Exercicio 3
    fun analiseNumberPar(number: Int): Boolean{
        start(4)
        this.par  = number % 2 == 0
        comment("Is number par? " + this.par)
        end(4)
        return this.par
    }

    //Exercicio 4
    fun firstInteger(to: Int, from: Int){
        start(5)
        for(i: Int in to until from){
            if(i % 2 != 0) {
                comment(i.toString())
            }
        }
        end(5)
    }

    //Exercicio 5
    fun validateCondition(list: List<Int>): Boolean{
        start(6)
        if((list.get(0) > list.get(2) && list.get(0) > list.get(3))
            || (list.get(1) > list.get(2) && list.get(1) > list.get(3))){
                comment("Is condition true")
            end(6)
            return true
        }
        comment("Is condition false")
        end(6)
        return false
    }

    //Excercicio 6
    fun printInteger(to: Int, from: Int) {
        start(7)
        for(i: Int in to until from){
                println(i)
                if(i.toString()[2] == '9'){
                    addLine()
                }
            }
        end(7)
        }

}
