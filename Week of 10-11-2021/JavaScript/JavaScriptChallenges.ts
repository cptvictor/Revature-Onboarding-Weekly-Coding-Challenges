function javaScript1(wordList: string[])
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

class Product
{
    name: string;
    cost: number;
}

function vendingMachine(products: Product[], cents: number, productNumber: number)
{
    if(productNumber < 1 || productNumber > products.length)
        return "Enter a valid product number";
    else
    {
        let product = products[productNumber-1];
        if(product.cost > cents)
            return "Not enough money for this product";
        else
        {
            let totalChange = cents - product.cost;
            let changeInCoins: number[] = [];
            while(totalChange - 500 >= 0)
            {
                changeInCoins.push(500);
                totalChange -= 500;
            }
            while(totalChange - 200 >= 0)
            {
                changeInCoins.push(200);
                totalChange -= 200;
            }
            while(totalChange - 100 >= 0)
            {
                changeInCoins.push(100);
                totalChange -= 100;
            }
            while(totalChange - 50 >= 0)
            {
                changeInCoins.push(50);
                totalChange -= 50;
            }
            while(totalChange - 20 >= 0)
            {
                changeInCoins.push(20);
                totalChange -= 20;
            }
            while(totalChange - 10 >= 0)
            {
                changeInCoins.push(10);
                totalChange -= 10;
            }
            return {
                product: product.name,
                change: changeInCoins
            }
        }
    }
}

console.log(javaScript1(["bring", "carrying", "bed", "Ace", "mooring", "apple"]));