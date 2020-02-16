package ManualTest

import Data.DocumentTimeNode
import java.util.*

fun main(args: Array<String>) {
    var tree = DataFiller().tree
    var currentNode: DocumentTimeNode = tree.mHead
    var nextNode: DocumentTimeNode?
    val input = Scanner(System.`in`)
    var stack: Stack<DocumentTimeNode> = Stack()

    println(currentNode?.mTitle)
    println(currentNode?.getNodesToString())
    stack.push(currentNode)
    var inline: String = ""

    while (!inline.equals("exit")) {
        inline = input.nextLine()
        nextNode = currentNode.getChildByName(inline)
        if (inline == ".." && currentNode!=(tree.mHead)) {

            currentNode = stack.pop()
            println(currentNode?.mTitle)
            println(currentNode?.getNodesToString())
        } else if (nextNode != null) {
            stack.push(currentNode)
            currentNode = nextNode
            println(currentNode?.mTitle)
            println(currentNode?.getNodesToString())
        }
    }
}

class Tester {


}