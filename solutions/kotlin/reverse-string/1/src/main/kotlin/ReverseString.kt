fun reverse(input: String): String {
    // TODO("Implement this function to complete the task")
    var reversedString = ""
    for(i in input.length-1 downTo 0)
    {
        reversedString += input[i]
    }
    return reversedString
}
