package questions;

public class OccuranceArray {
	
	public static void findCommonElements(int[][] arrays) {
        System.out.print("Common elements: ");
        
        // Iterate through the first array
        for (int i = 0; i < arrays[0].length; i++) {
            int currentElement = arrays[0][i];
            boolean isCommon = true;

            // Check if currentElement is present in all other arrays
            for (int j = 1; j < arrays.length; j++) {
                boolean foundInArray = false;
                
                for (int k = 0; k < arrays[j].length; k++) {
                    if (currentElement == arrays[j][k]) {
                        foundInArray = true;
                        break;
                    }
                }
                // If not found in any one array, set isCommon to false and break
                if (!foundInArray) {
                    isCommon = false;
                    break;
                }
            }

            // If the element is common in all arrays, print it
            if (isCommon) {
                System.out.print(currentElement + " ");
            }
        }
    }

	public static void main(String[] args) {
		
		
		
	}

}
