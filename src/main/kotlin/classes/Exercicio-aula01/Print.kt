package classes.`Exercicio-aula01`

open class Print {

    fun start(exec: Int){
        println("Exercise ----------------------- " + exec)
    }

    fun end(exec: Int){
        println("Finish exercise ----------------------- " + exec + "\n")
    }

    fun comment(commit: String){
        println(commit)
    }

    fun addLine(){
        println("---------------------------")
    }

}