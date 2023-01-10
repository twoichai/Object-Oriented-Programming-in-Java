public class Main {

    public static void main(String[] args) {


        String stringToCompare = "MMMMMmmmmmy lucky nUmbeRs are 7, 8, and 19.";  /* be used */
        String elementsToRemove = "mr A.7";  /* be used */
        String elementsToRemoveLower = elementsToRemove.toLowerCase();
        String elementsToRemoveUpper = elementsToRemove.toUpperCase();
        System.out.println(elementsToRemoveUpper);
    
        char[] charsToRemove = elementsToRemove.toCharArray();
        char[] charsToCompare = stringToCompare.toCharArray();
        char[] charsToRemoveUpper = elementsToRemoveUpper.toCharArray();    
        char[] charsToRemoveLower = elementsToRemoveLower.toCharArray();
        //Vergleiche für jeden Buchstaben, der entfernt werden soll
        for(var i = 0; i < charsToRemove.length; i++) {
            
            //Erstelle ein neues Char-Array, um die nicht zu löschenden Werte zu speichern
            //Initialisiere auf maximale Lönge des zu vergleichenden char-arrays
            var newChars = new char[charsToCompare.length];
            var newCharIndex = 0;
            
            //Vergleiche für jeden Buchstaben im Eingabe/Compare-Array, ob der Buchstabe gelöscht werden soll
            for(var j = 0; j < charsToCompare.length; j++) {
                // Sind die Werte nicht gleich, wird der Buchstabe kopiert
                if(charsToRemoveLower[i] != charsToCompare[j] && charsToRemoveUpper[i] != charsToCompare[j] || (!Character.isLetter(charsToRemove[i]) == true) ) { //hot
                //if(charsToRemove[i] != charsToCompare[j] && charsToRemoveUpper[i] != charsToCompare[j] || (!Character.isLetter(charsToRemove[i]) == true) )
                    // wenn die Chars ungleich sind oder es ein symbol oder zahl ist, kopieren wir es in neue Array und wiederholen die loop
                    newChars[newCharIndex] = charsToCompare[j];
                    newCharIndex ++;
                }
                
            }    
            // Bevor ein neuer Durchlauf startet, setze das verkleinerte Array als Eingabe/Compare-Array
            charsToCompare = newChars;    // will replace the one with the removed letter
        } 
        String result = new String(charsToCompare);
        System.out.println(result);
    }
}
