package ManualTest

import Data.DocumentTimeNode
import Data.TimeTreeStructure
import java.util.*

class DataFiller {

    var stringList = listOf("Anruf", "Anzug", "Apfel", "April", "Arm", "Arzt", "August", "Ausweis", "Bahnhof", "Balkon", "Baum", "Berg", "Beruf", "Bildschirm", "Bus", "Computer", "Dezember", "Dienstag", "Durst", "Drucker", "Eintrittskarte", "Einwohner", "Fahrschein", "Februar", "Fernseher", "Finger", "Flughafen", "Flur", "Frühling", "Füller", "Fuß", "Fußboden", "Garten", "Gast", "Geburtstag", "Hafen", "Hamburger", "Herbst", "Herr", "Himmel", "Hut", "Hunger", "Januar", "Juli", "Juni", "Kaffee", "Kakao", "Keller", "Kellner", "Kleiderhaken", "Koch", "Kognak", "Kuchen", "Kugelschreiber", "Kuchen", "Kunde", "Laden", "Lehrer", "Locher", "Löffel", "Mai", "März", "Mann", "Markt", "Marktplatz", "Monitor", "Name", "November", "Oktober", "Opa", "Park", "Pass", "Passant", "Platz", "Projektor", "Pullover", "Radiergummi", "Regen", "Rock", "Schinken", "Schlüssel", "Schnaps", "Schnee", "Schrank", "September", "Sessel", "Sommer", "Star", "Strumpf", "Stuhl", "Supermarkt", "Tag", "Tee", "Teppich", "Test", "Tisch", "Tourist", "Urlaub", "Vater", "Wagen", "Wein", "Wind", "Winter", "Wunsch", "Zeiger", "Zucker", "Zug", "Zuschauer")
    private var headNode = DocumentTimeNode("headNode", createNodeList(3), LinkedList())
    var tree = TimeTreeStructure(headNode)

    private fun createNodeList(amount: Int): LinkedList<DocumentTimeNode> {
        val goal = (0..5).random()
        val newNodeList = LinkedList<DocumentTimeNode>()
        for (i in 0..goal) {
            if(amount != 0){
                newNodeList.add(DocumentTimeNode(stringList[(0 until stringList.size-1).random()], createNodeList(amount - 1), LinkedList()))
            } else {
                newNodeList.add(DocumentTimeNode(stringList[(0 until stringList.size-1).random()], LinkedList(), LinkedList()))
            }
        }
        return newNodeList
    }
}