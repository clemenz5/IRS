package Data

import java.util.*

class DocumentTimeNode(title: String, nodeList: LinkedList<DocumentTimeNode>, documentList: LinkedList<DocumentNode>) {
    var mTitle = String()
    var mDocumentList = LinkedList<DocumentNode>()
    var mNodeList = LinkedList<DocumentTimeNode>()

    init {
        mDocumentList = documentList
        mNodeList = nodeList
        mTitle = title
    }

    fun getChildByName(name: String): DocumentTimeNode? {
        for (node in mNodeList) {
            if (node.mTitle.equals(name)) {
                return node
            }
        }
        return null
    }

    fun getDocumentById(id: String): DocumentNode? {
        for (documentNode in mDocumentList) {
            if (documentNode.mDocumentUid.equals(id)) {
                return documentNode
            }
        }
        return null
    }

    fun getLatestDocument(): DocumentNode {
        return mDocumentList[mDocumentList.size - 1]
    }

    fun addDocument(documentNode: DocumentNode) {
        mDocumentList.add(documentNode)
    }

    fun addNode(node: DocumentTimeNode) {
        mNodeList.add(node)
    }

    fun addNode(node: DocumentTimeNode, index: Int) {
        mNodeList.add(index, node)
    }

    fun sort() {
        mDocumentList.sortWith(DocumentComparator())
    }

    fun getNodesToString(): String{
        var s = String()
        for (documentTimeNode in mNodeList) {
            s += documentTimeNode.mTitle + " | "
        }
        return s
    }

}