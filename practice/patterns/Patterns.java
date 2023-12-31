package practice.patterns;

public class Patterns {

    public static void main(String[] args) {
        pattern8(5);
    }


//  * * * *
//  * * * *
//  * * * *
//  * * * *
    static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//  *
//  * *
//  * * *
//  * * * *
    static void pattern2(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//  * * * *
//  * * *
//  * *
//  *
    static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//  1
//  1 2
//  1 2 3
//  1 2 3 4
    static void pattern4(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

//    *
////  * *
////  * * *
////  * * * *
//    * * * * *
//    * * * *
//    * * *
//    * *
//    *
    static void pattern5(int n){
        for (int row = 0; row < 2*n ; row++) {

            int totalCols= row > n ? 2 * n - row : row;

            for (int col = 0; col < totalCols ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//          *
////       * *
////      * * *
////     * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *
    static void pattern6(int n){
        for (int row = 0; row < 2*n ; row++) {

            int totalCols= row > n ? 2 * n - row : row;

            for (int space = 0; space < n-totalCols; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalCols ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //      1
////      2 1 2
////    3 2 1 2 3
////  4 3 2 1 2 3 4
//  5 4 3 2 1 2 3 4 5
    static void pattern7(int n){
        for (int row = 1; row <= n ; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

//    4 4 4 4 4 4 4 4 4
//    4 3 3 3 3 3 3 3 4
//    4 3 2 2 2 2 2 3 4
//    4 3 2 1 1 1 2 3 4
//    4 3 2 1 0 1 2 3 4
//    4 3 2 1 1 1 2 3 4
//    4 3 2 2 2 2 2 3 4
//    4 3 3 3 3 3 3 3 4
//    4 4 4 4 4 4 4 4 4
    static void pattern8(int n){

        int originalN=n;
        n = n*2;
        for (int row = 0; row <= n ; row++) {

            for (int col = 0; col <=n ; col++) {
                int atEveryIndex =originalN - Math.min(Math.min(row, col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
