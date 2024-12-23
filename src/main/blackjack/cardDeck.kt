
class CardDeck(
	val cards: Map<Int, Card>
) {
	data class Card(
		val suit: Suit,
		val rank: Rank
	) {
		enum class Suit(

		)

		enum class Rank(

		)
	}
}




