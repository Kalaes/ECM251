import org.json.JSONArray
import org.json.JSONObject

fun main(args: Array<String>) {
    val resposta = khttp.get("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=6")
    val baralho_id = resposta.jsonObject["deck_id"]
    val respostaCarta = khttp.get("https://deckofcardsapi.com/api/deck/$baralho_id/draw/?count=1")
    val cartas = respostaCarta.jsonObject["cards"] as JSONArray
    val valor_cartas : JSONObject = cartas[0] as JSONObject

    print(valor_cartas["value"])
}