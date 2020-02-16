package Data


class DocumentNode (title:String, intro:String, time:Long, documentUid:String) : Comparable<DocumentNode>{
    var mIntro = intro
    var mTime = time
    var mDocumentUid = documentUid
    override fun compareTo(other: DocumentNode): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}