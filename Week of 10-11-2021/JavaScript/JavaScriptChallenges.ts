function IngWords(wordList: string[])
{
    let ingWords: string[];
    for (const word of wordList) 
    {
        if(word.endsWith("ing"))
        {
            ingWords.push(word);
        }
    }
    return ingWords;
}
