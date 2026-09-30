public class Soup {
    //these are instance variables
    private String letters;
    private String company;


    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }




    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }


    //returns the company name
    public String getCompany(){
        return company;
    }


    //returns letters
    public String getLetters(){
        return letters;
    }


//below are the functions you'll be writing.

//adds a word to the pool of letters known as "letters"
//precondition- The word parameter is a real String and should not be null.
//postcondition- The word has been added to the end of the letters string.
    public void add(String word){
     letters = letters + word;
    }




 //Use Math.random() to get a random character from the letters string and return it.
//precondition- The letters string must contain at least one character.
//postcondition- Returns one random character from the letters string.
    public char randomLetter(){
        return letters.charAt((int)(Math.random()*letters.length()));
    }




//returns the letters currently stored with the company name placed directly in the center of all the letters
//precondition- The letters string is not null and the company string is not null.
//postcondition- Returns the letters string with the company name inserted in the center.

    public String companyCentered(){
        int letterLength = (letters.length())/2;
        String firstHalf = letters.substring(0, letterLength);
        String secondHalf = letters.substring(letterLength, letters.length());
       
       
       
       
       
       
        return firstHalf + company + secondHalf;
    }




  //should remove the first available vowel from letters. If there are no vowels this method has no effect.
//precondition- The letters string may be empty or may contain vowels, but it should not be null.
//postcondition- Removes the first vowel from the letters string if one exists otherwise the letters string stays wont change.
    public void removeFirstVowel(){
        String alpha = "[aeiouAEIOU]";


        System.out.println(letters.replaceFirst (alpha," "));
        letters = letters.replaceFirst (alpha," ");
    }


//should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
//precondition- The value num is a non-negative integer and does not exceed the length of the letters string.
//postcondition- Removes num letters from a random position in the letters string.
    public void removeSome(int num){
    int random = 0;
    random = (int)(Math.random()*(letters.length()-num));
   String subOne = letters.substring(0, random);
   String subTwo = letters.substring(random + num);
    System.out.println(subOne + subTwo);
    letters = (subOne + subTwo);
    }


   //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
//precondition- The word parameter is a valid String and should not be null.
//postcondition- Removes every appearence of the given word from the letters string if the word is not found the letters string remains unchanged.
    public void removeWord(String word){
        letters = letters.replaceAll(word, "");
      System.out.println("new letters is " + letters.replaceAll(word, "" ));  
    }
}



