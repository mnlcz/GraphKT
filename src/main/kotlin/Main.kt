fun main()
{
    val content = test()
    val graph = Graph(content)
    println(graph.toString())
    print("DFS: ")
    graph.dfs('a') { node -> print("$node ") }
    print("\nBFS: ")
    graph.bfs('a') { nodo -> print("$nodo ") }

}


fun test(): Map<Char, List<Char>>
{
    return mapOf(
        'a' to listOf('c', 'b'),
        'b' to listOf('d'),
        'c' to listOf('e'),
        'd' to listOf('f'),
        'e' to emptyList(),
        'f' to emptyList()
    )
}