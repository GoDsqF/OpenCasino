import java.util.random.RandomGenerator
import kotlin.random.Random

/**
 * Class for 52 usual card deck
 * TODO: all methods, default deck, shuffle
 */
class CardDeck(packs: Int) {

	var cards = generateDeck(packs)

	private fun generateDeck(packs: Int): MutableList<Card> {
		val result = mutableListOf<Card>()
		repeat(packs) {
			for (rank in Card.Rank.entries) {
				for (suit in Card.Suit.entries) {
					result.add(Card(suit, rank))
				}
			}
		}
		return result
	}

	fun shuffleDeck() = cards.shuffle()

	fun getCard(deck: List<Card>) {

	}

	/**
	 * Generic card class for type safety
	 */
	data class Card(
		val suit: Suit,
		val rank: Rank,
		val visible: Boolean = true
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