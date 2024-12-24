interface Dealer {
	fun prepareDeck(): MutableList<CardDeck.Card>
	fun initialDeal()
	fun dealCard(
		deck: MutableList<CardDeck.Card>,
		hand: MutableList<CardDeck.Card>,
		visibility: Boolean
	): CardDeck.Card {
		val result = CardDeck.Card(deck[0].suit, deck[0].rank, visibility)
		deck.removeAt(0)
		return result
	}
}

interface Player {
	fun start()
	fun dealCard(
		deck: MutableList<CardDeck.Card>,
		hand: MutableList<CardDeck.Card>
	): CardDeck.Card {
		val result = deck[0]
		deck.removeAt(0)
		return result
	}
	fun hit()
	fun stand()
	fun doubleDown()
	fun split()
	fun stop()
}

class Blackjack: Dealer, Player{

	private val deck = prepareDeck()
	private val playerHand = mutableListOf<CardDeck.Card>()
	private val dealerHand = mutableListOf<CardDeck.Card>()

	override fun prepareDeck(): MutableList<CardDeck.Card> {
		return CardDeck(8).also {
			it.shuffleDeck()
		}.cards
	}

	override fun initialDeal() {
		repeat(2) {
			dealCard(deck, playerHand)
		}
		dealCard(deck, dealerHand)
		dealCard(deck, dealerHand, false)
	}

	override fun start() {
		TODO("Not yet implemented")
	}

	override fun hit() {
		TODO("Not yet implemented")
	}

	override fun stand() {
		TODO("Not yet implemented")
	}

	override fun doubleDown() {
		TODO("Not yet implemented")
	}

	override fun split() {
		TODO("Not yet implemented")
	}

	override fun stop() {
		TODO("Not yet implemented")
	}
}