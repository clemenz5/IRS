package Data

class DocumentComparator : Comparator<DocumentNode> {
    override fun compare(o1: DocumentNode?, o2: DocumentNode?): Int {
        if(o1 != null && o2 != null){
            return o1.compareTo(o2)
        }
        return Integer.MAX_VALUE;
    }
}