public class Exercise {
    public static void main(String[] args) {
        int[][] mdArray = { 
            { 1, 2, 3, 4 }, 
            { 5, 6, 7, 8 }, 
            { 9, 10, 11, 12 }, 
            { 13, 14, 15, 16 } 
        };
        
// PATTERN 1
        System.out.println("1. SUM OF PATTERN 1");
            for (int row = 0; row < mdArray[0].length; row++) {
                int sum1 = 0;
                    for (int row1 = 0; row1 < mdArray.length; row1++) {
                        sum1 += mdArray[row][row1];
        }
            System.out.println("The sum of row 1 is: " + sum1);
        break;
        }
          
// PATTERN 2
        System.out.println("");
        System.out.println("2. SUM OF PATTERN 2");
        int sum2 = 0;

        for (int row1 = 0; row1 < mdArray.length; row1++) {
          sum2 += mdArray[row1][0];
        }
        System.out.println("Sum of Pattern : "+ sum2);

// PATTERN 3
        System.out.println("");
        System.out.println("3. SUM OF PATTERN 3");
        int sum3 = 0;
        
        for (int row3 = 0; row3 < mdArray.length; row3++) {
          for (int col = 0; col < 4; col++) {
            if (row3 == 0 || col == 0) {
              sum3 += mdArray[row3][col];
            }
          }
        }
            System.out.println("Sum of Pattern 3: "+ sum3);
    
// PATTERN 4
        System.out.println("");
        System.out.println("4. SUM OF PATTERN 4");
        int sum4 = 0;

        for (int i = 0; i <= mdArray.length; i++) {
            for (int j = 0; j <= mdArray.length; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == 3) || (i == 3 && j == 0) || (i == 3 && j == 3)) {
                    sum4 += mdArray[i][j];
                }
            }
        }
            System.out.println("The sum = " + sum4);

// PATTERN 5
        System.out.println("");
        System.out.println("5. SUM OF PATTERN 5");
        int sum5 = 0;
        
            for( int i = 0; i<=mdArray.length; i++){
                for (int j = 0; j <= mdArray.length; j++) {
                    if ((i == 1 && j == 1) || (i == 2 && j == 2) || (i == 1 && j == 2) || (i == 2 && j == 1)){
                    sum5 += mdArray[i][j];
                }
            }
        }
            System.out.println("The sum = " + sum5);

// PATTERN 6
        System.out.println("");
        System.out.println("6. SUM OF PATTERN 6");
        int sum6 = 0;

        for( int i = 0; i<=mdArray.length; i++){
            for (int j = 0; j <= mdArray.length; j++) {
                if ((i == 1 && j == 1) || (i == 2 && j == 2) || (i == 1 && j == 2) || (i == 2 && j == 1) || (i == 0 && j == 0) || (i == 0 && j == 3) || (i == 3 && j == 0) || (i == 3 && j == 3)){
                    sum6 += mdArray[i][j];
                }
            }
        }
            System.out.println("The sum = " + sum6);
    }
}
