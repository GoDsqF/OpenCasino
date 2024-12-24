/**
 * Class for 52 usual card deck
 * TODO: all methods, default deck, shuffle
 */
class CardDeck() {

	private val deck = generateDeck()

	private fun generateDeck(): List<Card> {
		val result = mutableListOf<Card>()
		for (rank in Card.Rank.entries) {
			for (suit in Card.Suit.entries) {
				result.add(Card(suit, rank))
			}
		}
		return result
	}

	fun printDeck() {
		println(deck)
	}
	/**
	 * Generic card class for type safety
	 */
	data class Card(
		val suit: Suit,
		val rank: Rank
	) {
		/**
		 * Card suit enum
		 */
		enum class Suit {
			Clubs,
			Diamonds,
			Hearts,
			Spades
		}
		/**
		 * Card rank enum
		 */
		enum class Rank {
			C2,
			C3,
			C4,
			C5,
			C6,
			C7,
			C8,
			C9,
			C10,
			Jack,
			Queen,
			King,
			Ace
		}

	}


}

fun main() {
	val cards = CardDeck()
	cards.printDeck()
}
