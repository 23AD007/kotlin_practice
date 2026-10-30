object Bob {
    fun hey(input: String): String {
        return when {
            input.isBlank() -> "Fine. Be that way!"

            input.trim().endsWith('?') &&
                    input.trim().any { it.isLetter() } &&
                    input.trim() == input.trim().uppercase() ->
                "Calm down, I know what I'm doing!"

            input.trim().any { it.isLetter() } &&
                    input.trim() == input.trim().uppercase() ->
                "Whoa, chill out!"

            input.trim().endsWith('?') -> "Sure."

            else -> "Whatever."
        }
    }
}