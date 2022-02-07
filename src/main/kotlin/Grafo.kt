import java.util.*

class Grafo<T_NODO : Comparable<T_NODO>> constructor(private val elementos: Map<T_NODO, List<T_NODO>>)
{
    fun dfs(primerElemento: T_NODO, operacion: (T_NODO) -> Unit)
    {
        val stack: Stack<T_NODO> = Stack()
        stack.push(primerElemento)
        while(stack.isNotEmpty())
        {
            val current = stack.pop()
            operacion(current)
            elementos[current]?.forEach { stack.push(it) }
        }
    }

    fun bfs(primerElemento: T_NODO, operacion: (T_NODO) -> Unit)
    {
        val queue: Queue<T_NODO> = LinkedList()
        queue.add(primerElemento)
        while(queue.isNotEmpty())
        {
            val current = queue.remove()
            operacion(current)
            elementos[current]?.forEach { queue.add(it) }
        }
    }

    override fun toString(): String
    {
        var str = ""
        elementos.forEach { (k, v) -> str += "$k --> ${v.joinToString(", ", "[", "]")}\n" }
        return str
    }
}