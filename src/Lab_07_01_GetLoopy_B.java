public class Lab_07_01_GetLoopy_B {
    public static void main(String[] args) {
        System.out.println("First Figure");
        for (int row = 0; row <= 5; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Next Figure");
        for (int row = 5; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Last Figure");
        for (int row = 1; row <= 5; row++){
            for (int col = 1; col <=5; col++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}