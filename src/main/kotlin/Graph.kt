import java.util.*

class Graph<T_NODO : Comparable<T_NODO>> constructor(private val content: Map<T_NODO, List<T_NODO>>)
{
    fun dfs(firstElement: T_NODO, operation: (T_NODO) -> Unit)
    {
        val stack: Stack<T_NODO> = Stack()
        stack.push(firstElement)
        while(stack.isNotEmpty())
        {
            val current = stack.pop()
            operation(current)
            content[current]?.forEach { stack.push(it) }
        }
    }

    fun bfs(firstElement: T_NODO, operation: (T_NODO) -> Unit)
    {
        val queue: Queue<T_NODO> = LinkedList()
        queue.add(firstElement)
        while(queue.isNotEmpty())
        {
            val current = queue.remove()
            operation(current)
            content[current]?.forEach { queue.add(it) }
        }
    }

    override fun toString(): String
    {
        var str = ""
        content.forEach { (k, v) -> str += "$k --> ${v.joinToString(", ", "[", "]")}\n" }
        return str
    }
}