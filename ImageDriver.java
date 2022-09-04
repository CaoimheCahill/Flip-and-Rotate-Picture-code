/**
 * Assignment 2022 Part1 (ImageDriver Class)
 *
 * Student Number: 21331308
 * Name: Caoimhe Cahill
 *
 * 7th March 2022
 */


public class ImageDriver {
    public static void main(String[] args) {
        Image picture;
        Image picture2;
        Image picture3;
        Image picture4;
        String originalImage;
        String originalImage2;
        String originalImage3;
        String originalImage4;
        String horizontalFlip;
        String horizontalFlip2;
        String horizontalFlip3;
        String horizontalFlip4;
        String verticalFlip;
        String verticalFlip2;
        String verticalFlip3;
        String verticalFlip4;
        String clockwise;
        String clockwise2;
        String clockwise3;
        String clockwise4;
        String anticlockwise;
        String anticlockwise2;
        String anticlockwise3;
        String anticlockwise4;


        //Test methods on a 2D array with the same width and height

        // Test the flip horizontal feature.
        // Original Image
        int[][] myPicture = { {0, 10, 20, 30, 40, 50},
                {1, 11, 21, 31, 41, 51},
                {2, 12, 22, 32, 42, 52},
                {3, 13, 23, 33, 43, 53},
                {4, 14, 24, 34, 44, 54},
                {5, 15, 25, 35, 45, 55}    };

        // Create the image instance for the test
        picture = new Image(myPicture);
        originalImage = picture.toString();

        // Use the flip horizontal operation method
        picture.flip(true);
        horizontalFlip = picture.toString();

        // Test the flip vertical feature.
        // Original Image
        myPicture = new int[][] { {0, 10, 20, 30, 40, 50},
                {1, 11, 21, 31, 41, 51},
                {2, 12, 22, 32, 42, 52},
                {3, 13, 23, 33, 43, 53},
                {4, 14, 24, 34, 44, 54},
                {5, 15, 25, 35, 45, 55}    };

        // Create the image instance for the test
        picture = new Image(myPicture);
        originalImage = picture.toString();

        // Use the flip vertical operation method
        picture.flip(false);
        verticalFlip = picture.toString();

        // Test the flip clockwise feature.
        // Original Image
        myPicture = new int[][] { {0, 10, 20, 30, 40, 50},
                {1, 11, 21, 31, 41, 51},
                {2, 12, 22, 32, 42, 52},
                {3, 13, 23, 33, 43, 53},
                {4, 14, 24, 34, 44, 54},
                {5, 15, 25, 35, 45, 55}    };

        // Create the image instance for the test
        picture = new Image(myPicture);
        originalImage = picture.toString();

        // Use the clockwise operation method
        picture.rotate(true);
        clockwise = picture.toString();

        // Test the flip anticlockwise feature.
        // Original Image
        myPicture = new int[][] { {0, 10, 20, 30, 40, 50},
                {1, 11, 21, 31, 41, 51},
                {2, 12, 22, 32, 42, 52},
                {3, 13, 23, 33, 43, 53},
                {4, 14, 24, 34, 44, 54},
                {5, 15, 25, 35, 45, 55}    };

        // Create the image instance for the test
        picture = new Image(myPicture);
        originalImage = picture.toString();

        // Use the anticlockwise operation method
        picture.rotate(false);
        anticlockwise = picture.toString();


        // Test methods on a 2D array with a greater width


        // Test the flip horizontal feature.
        // Original Image
        int[][] myPicture2 = {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
                {40, 41, 42, 43, 44, 45, 46, 47, 48, 49},
                {50, 51, 52, 53, 54, 55, 56, 57, 58, 59}};

        // Create the image instance for the test
        picture2 = new Image(myPicture2);
        originalImage2 = picture2.toString();

        // Use the flip horizontal operation method
        picture2.flip(true);
        horizontalFlip2 = picture2.toString();

        // Test the flip vertical feature.
        // Original Image
        myPicture2 = new int[][] {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
                {40, 41, 42, 43, 44, 45, 46, 47, 48, 49},
                {50, 51, 52, 53, 54, 55, 56, 57, 58, 59}};

        // Create the image instance for the test
        picture2 = new Image(myPicture2);
        originalImage2 = picture2.toString();

        // Use the flip vertical operation method
        picture2.flip(false);
        verticalFlip2 = picture2.toString();

        // Test the clockwise feature.
        // Original Image
        myPicture2 = new int[][] {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
                {40, 41, 42, 43, 44, 45, 46, 47, 48, 49},
                {50, 51, 52, 53, 54, 55, 56, 57, 58, 59}};

        // Create the image instance for the test
        picture2 = new Image(myPicture2);
        originalImage2 = picture2.toString();

        // Use the clockwise operation method
        picture2.rotate(true);
        clockwise2 = picture2.toString();

        // Test the anticlockwise feature.
        // Original Image
        myPicture2 = new int[][] {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
                {40, 41, 42, 43, 44, 45, 46, 47, 48, 49},
                {50, 51, 52, 53, 54, 55, 56, 57, 58, 59}};

        // Create the image instance for the test
        picture2 = new Image(myPicture2);
        originalImage2 = picture2.toString();

        // Use the anticlockwise operation method
        picture2.rotate(false);
        anticlockwise2 = picture2.toString();


        // Test methods on a 2D array with a greater height


        // Test the flip horizontal feature.
        // Original Image
        int[][] myPicture3 = {{0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34}};

        // Create the image instance for the test
        picture3 = new Image(myPicture3);
        originalImage3 = picture3.toString();

        // Use the flip horizontal operation method
        picture3.flip(true);
        horizontalFlip3 = picture3.toString();

        // Test the flip vertical feature.
        // Original Image
        myPicture3 = new int[][] {{0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34}};

        // Create the image instance for the test
        picture3 = new Image(myPicture3);
        originalImage3 = picture3.toString();

        // Use the flip vertical operation method
        picture3.flip(false);
        verticalFlip3 = picture3.toString();

        // Test the clockwise feature.
        // Original Image
        myPicture3 = new int[][] {{0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34}};

        // Create the image instance for the test
        picture3 = new Image(myPicture3);
        originalImage3 = picture3.toString();

        // Use the clockwise operation method
        picture3.rotate(true);
        clockwise3 = picture3.toString();

        // Test the anticlockwise feature.
        // Original Image
        myPicture3 = new int[][] {{0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34}};

        // Create the image instance for the test
        picture3 = new Image(myPicture3);
        originalImage3 = picture3.toString();

        // Use the anticlockwise operation method
        picture3.rotate(false);
        anticlockwise3 = picture3.toString();


        // Test methods on a 2x2 2D array


        // Test the flip horizontal feature.
        // Original Image
        int[][] myPicture4 = {{0, 1},
                {2, 3}};

        // Create the image instance for the test
        picture4 = new Image(myPicture4);
        originalImage4 = picture4.toString();

        // Use the flip horizontal operation method
        picture4.flip(true);
        horizontalFlip4 = picture4.toString();

        // Test the flip vertical feature.
        // Original Image
        myPicture4 = new int[][] {{0, 1},
                {2, 3}};

        // Create the image instance for the test
        picture4 = new Image(myPicture4);
        originalImage4 = picture4.toString();

        // Use the flip vertical operation method
        picture4.flip(false);
        verticalFlip4 = picture4.toString();

        // Test the clockwise feature.
        // Original Image
        myPicture4 = new int[][] {{0, 1},
                {2, 3}};

        // Create the image instance for the test
        picture4 = new Image(myPicture4);
        originalImage4 = picture4.toString();

        // Use the clockwise operation method
        picture4.rotate(true);
        clockwise4 = picture4.toString();

        // Test the anticlockwise feature.
        // Original Image
        myPicture4 = new int[][] {{0, 1},
                {2, 3}};

        // Create the image instance for the test
        picture4 = new Image(myPicture4);
        originalImage4 = picture4.toString();

        // Use the anticlockwise operation method
        picture4.rotate(false);
        anticlockwise4 = picture4.toString();


        // Print results
        System.out.println("Original Image with same width and height : " + originalImage);
        System.out.println("Horizontal Flip with same width and height : " + horizontalFlip);
        System.out.println("Vertical Flip with same width and height : " + verticalFlip);
        System.out.println("Clockwise with same width and height : " + clockwise);
        System.out.println("Anticlockwise with same width and height : " + anticlockwise);
        System.out.println(" ");
        System.out.println("Original Image with a greater width : " + originalImage2);
        System.out.println("Horizontal Flip with a greater width : " + horizontalFlip2);
        System.out.println("Vertical Flip with a greater width : " + verticalFlip2);
        System.out.println("Clockwise with a greater width : " + clockwise2);
        System.out.println("Anticlockwise with a greater width : " + anticlockwise2);
        System.out.println(" ");
        System.out.println("Original Image with a greater height : " + originalImage3);
        System.out.println("Horizontal Flip with a greater height : " + horizontalFlip3);
        System.out.println("Vertical Flip with a greater height : " + verticalFlip3);
        System.out.println("Clockwise with a greater height : " + clockwise3);
        System.out.println("Anticlockwise with a greater height : " + anticlockwise3);
        System.out.println(" ");
        System.out.println("Original Image with a 2x2 array : " + originalImage4);
        System.out.println("Horizontal Flip with a 2x2 array : " + horizontalFlip4);
        System.out.println("Vertical Flip with a 2x2 array : " + verticalFlip4);
        System.out.println("Clockwise with a 2x2 array : " + clockwise4);
        System.out.println("Anticlockwise with a 2x2 array : " + anticlockwise4);

    }

}
