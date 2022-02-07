fun main()
{
    val contenido = contenidoPrueba()
    val grafo = Grafo(contenido)
    println(grafo.toString())
    print("DFS: ")
    grafo.dfs('a') { nodo -> print("$nodo ") }
    print("\nBFS: ")
    grafo.bfs('a') { nodo -> print("$nodo ") }

}

fun contenidoPrueba(): Map<Char, List<Char>> {
    return mapOf(
        'a' to listOf('c', 'b'),
        'b' to listOf('d'),
        'c' to listOf('e'),
        'd' to listOf('f'),
        'e' to emptyList(),
        'f' to emptyList()
    )
}