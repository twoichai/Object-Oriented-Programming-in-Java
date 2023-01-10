public String remove(String arg) {
		
		// our given values (strings)
		String elementsToRemove = arg, stringToCompare = myString;
		String elementsToRemoveLower = elementsToRemove.toLowerCase();
		String elementsToRemoveUpper = elementsToRemove.toUpperCase();

		// make char arrays out of the input string myString and arg in lower and upper case
		char[] charsToCompare = stringToCompare.toCharArray(), charsToRemoveUpper = elementsToRemoveUpper.toCharArray(), 
				charsToRemoveLower = elementsToRemoveLower.toCharArray();
		
		// compare each letter, which should be removed
		for(var i = 0; i < charsToRemoveUpper.length; i++) {
			
			// create a new char array to save the elements which should be kept
			// give the char array the length of the string
			var newChars = new char[charsToCompare.length];
			var newCharIndex = 0;
			
			// creating a loop, to go through the arg first && compare each element from compare/remove array which should or not be copied
			for(var j = 0; j < charsToCompare.length; j++) {
				
				//the value is not the same -> we copy the value to newChar array
				if(charsToRemoveLower[i] != charsToCompare[j] && charsToRemoveUpper[i] != charsToCompare[j] || (!Character.isLetter(charsToRemoveUpper[i]) == true) ) { 
					/* 1st: charToRemoveLower is not equal to charToCompare AND charsToRemoveUpper is not equal to charToCompare OR
					it is something except letter ------only then------> we can copy it out and insert it to the newChar
					*/ // -> case insensitive
					
					// then we do the copy:
					// wenn die Chars ungleich sind oder es ein symbol oder zahl ist, kopieren wir es in neue Array und wiederholen die loop
					newChars[newCharIndex] = charsToCompare[j];
					
					// going to the next placeholder of the newChar[]
					newCharIndex ++;
				}
			}	
			// going to the 1st loop again 
			// before we start the 1st loop, which changes the index of the toRemove arrays, we replace the chars to compare with the newChars array
			charsToCompare = newChars;	// will replace the one with the removed letter
		} 
		String result = new String(charsToCompare);		
	  	return result;
	}
