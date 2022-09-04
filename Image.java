/**
 * Assignment 2022 Part1 (Image Class)
 *
 * Student Number: 21331308
 * Name: Caoimhe Cahill
 *
 * 7th March 2022
 */

import java.util.Arrays;

public class Image {
    private int[][] pixels;
    private int width;
    private int height;


    public Image(int[][] pixels) {

        this. pixels = pixels;
        this.height = pixels.length;
        this.width = pixels[0].length;
    }

    // array as string method
    public String toString(){
        return Arrays.deepToString(pixels);
    }

    // horizontal and vertical flip method
    public void flip( boolean horizontal ){
        if(horizontal){
            for(int i=0; i<height; i++){
                for(int j=0; j<height/2; j++){
                    int temp= pixels[i][j];
                    pixels[i][j] = pixels[i][pixels[i].length-j-1];
                    pixels[i][pixels[i].length-j-1] = temp;
                }
            }
        }else {
            for(int i=0; i<height/2; i++){
                int[] temp= pixels[i];
                pixels[i] = pixels[height-i-1];
                pixels[height-i-1] = temp;
            }
        }

    }

    // clockwise and anticlockwise method
    public void rotate( boolean clockwise ) {
        int[][] tempPixel = new int[width][height];

        if (clockwise) {
            //Getting each column
            for (int j = 0; j < width; j++) {
                int[] tempRow = new int[height];

                //Getting Each Row
                for (int k = 0; k < height; k++) {
                    int[] oldRow = pixels[height - k - 1];
                    tempRow[k] = oldRow[j];
                }

                tempPixel[j] = tempRow;
            }
        }else {
            for (int i = 0; i < width; i++){
                int[] tempRow = new int[height];

                for(int j = 0; j < height; j++){
                    int[] oldRow = pixels[j];
                    tempRow[j] = oldRow[width-i-1];
                }

                tempPixel[i] = tempRow;
            }
        }
        pixels = tempPixel;

    }
}

