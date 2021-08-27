package controller

import model.Card
import model.Deck
import org.json.JSONArray
import org.json.JSONObject
import service.HttpService
import shared.DeckOfCardsApiConstants

class DeckController{
    val deck: Deck
    constructor(){
        val resposta = HttpService.getJson(DeckOfCardsApiConstants.newDeckUrl)
        this.deck = Deck(resposta["deck_id"] as String)
    }

    public fun drawCard() : Card{
        val respostaCarta = HttpService.getJson(DeckOfCardsApiConstants.getOneCardUrl(this.deck.deckId))
        val cartas = respostaCarta  ["cards"] as JSONArray
        val valor_cartas = cartas[0] as JSONObject
        return Card(valor_cartas["suit"] as String, valor_cartas["value"] as String,valor_cartas["image"] as String)


    }
}