function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    let words = sentence.split(' ');

    // Reverse each word and store in a new array
    let reversedWords = words.map(word => reverseWord(word));

    // Join the reversed words to form the reversed sentence
    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    // Split the word into characters, reverse them, and join them back
    return word.split('').reverse().join('');
}

// Example usage
const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log("Reversed Sentence: " + reversedSentence);
