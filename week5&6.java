// Program Name: AllInOneArrayProgram
// Description: Demonstrates all array concepts (1D + 2D)

import java.util.Scanner;

public class AllInOneArrayProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ================================
        // 1. CREATE ARRAY
        // ================================
        System.out.print("Enter size of 1D array: ");
        int size = scanner.nextInt();

        // Input validation
        if (size <= 0) {
            System.err.println("Invalid array size! Exiting program.");
            System.exit(0);
        }

        int[] array = new int[size];

        // ================================
        // 2. ACCESS ARRAY USING LOOP
        // ================================
        System.out.println("Enter elements of array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // ================================
        // 3. DISPLAY ARRAY
        // ================================
        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // ================================
        // 4. MODIFY ARRAY
        // ================================
        System.out.print("Enter index to modify: ");
        int index = scanner.nextInt();

        if (index < 0 || index >= array.length) {
            System.err.println("Invalid index! Exiting.");
            System.exit(0);
        }

        System.out.print("Enter new value: ");
        int newValue = scanner.nextInt();

        array[index] = newValue;

        // ================================
        // 5. DISPLAY MODIFIED ARRAY
        // ================================
        System.out.println("Modified array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // ================================
        // 6. FIND SUM & MAX
        // ================================
        int sum = 0;
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Max = " + max);

        // ================================
        // 7. REVERSE ARRAY
        // ================================
        System.out.println("Reversed array:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // ================================
        // 8. 2D ARRAY (MATRIX)
        // ================================
        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter columns: ");
        int cols = scanner.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.err.println("Invalid matrix size! Exiting.");
            System.exit(0);
        }

        int[][] matrix = new int[rows][cols];

        // Input matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // ================================
        // 9. DISPLAY MATRIX
        // ================================
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // ================================
        // 10. ROW-WISE SUM
        // ================================
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;

            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }

            System.out.println("Sum of row " + i + " = " + rowSum);
        }

        // ================================
        // 11. TRANSPOSE MATRIX
        // ================================
        System.out.println("Transpose:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}