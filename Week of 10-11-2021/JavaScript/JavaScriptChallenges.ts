function IngWords(wordList: string[])
{
    let ingWords: string[] = [];
    for (const word of wordList) 
    {
        if(word.endsWith("ing"))
        {
            let firstSyllables: string = word.substring(0, word.length-4);
            if(firstSyllables.includes("a") 
                || firstSyllables.includes("e") 
                || firstSyllables.includes("i") 
                || firstSyllables.includes("o") 
                || firstSyllables.includes("u") 
                || firstSyllables.includes("y"))
            {
                ingWords.push(word);
            }
        }
    }
    return ingWords;
}

console.log(IngWords(["bring", "carrying", "bed", "Ace", "mooring", "apple"]));