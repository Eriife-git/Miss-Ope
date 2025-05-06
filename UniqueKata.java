
    public static int[] printUniqueNumbers(int[] numbers) {

	int[] result = new int[2];
	int uniqueCount = 0;
      

        for (int counter = 0; counter < numbers.length; counter++) {
            int count = 0;

            // Count how many times numbers[counter] appears in the array
            for (int counter2 = 0; counter2 < numbers.length; counter2++) {
                if (numbers[counter] == numbers[counter2]) {
                    count++;
                }
            }

            // If count is 1, then it's unique
            if (count == 1) {

		result[uniqueCount] = numbers[counter];
		uniqueCount++;
            }
        }
	return result;

    }


