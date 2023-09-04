// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("\nUsuário ${usuario.nome} matriculado/a na formação $nome.")
    }
    
    fun listarInscritos() {
        println("\nUsuários matriculados na formação $nome: ")
        for (usuario in inscritos) {
            println("* ${usuario.nome}")
        }
    }
    
    fun listarConteudosEducacionais() {
        println("\nGrade Curricular de $nome: ")
        for (conteudo in conteudos) {
            println("* ${conteudo.nome}")
        }
    }
}

fun main() {
    val ana = Usuario("ana", "ana@gmail.com")
    val pedro = Usuario("pedro", "pedro@gmail.com")
    
    val kotlin1 = ConteudoEducacional("Conhecendo o Kotlin e Sua Documentação Oficial", 60)
    val kotlin2 = ConteudoEducacional("Introdução Prática à Linguagem de Programação Kotlin",120)
    val kotlin3 = ConteudoEducacional("Estruturas de Controle de Fluxo e Coleções em Kotlin",120)
    val kotlin4 = ConteudoEducacional("Orientação a Objetos e Tipos de Classes na Prática com Kotlin",120)
    val kotlin5 = ConteudoEducacional("O Poder das Funções em Kotlin",120)
    
    val formacaoAndroid = Formacao("Formação Android Developer", listOf(kotlin1, kotlin2, kotlin3, kotlin4, kotlin5), Nivel.INTERMEDIARIO)
    
    formacaoAndroid.matricular(ana)
    formacaoAndroid.matricular(pedro)
    formacaoAndroid.listarInscritos()
    formacaoAndroid.listarConteudosEducacionais()
}
