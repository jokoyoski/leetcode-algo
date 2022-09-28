package com.company.lesson;



public class Matrix
{
    static int R = 4;
    static int C = 4;

    // A function to rotate a matrix

    // mat[][] of size R x C.

    // Initially, m = R and n = C

   public  static void rotatematrix(int row_index,

                             int column_index, int mat[][])

    {

        int row = 0, col = 0;

        int prev, curr;


        /*

        row - Starting row index

        m - ending row index

        col - starting column index

        n - ending column index

        i - iterator

        */

        while (row < row_index && col < column_index)

        {



            if (row + 1 == row_index || col + 1 == column_index)

                break;



            // Store the first element of next

            // row, this element will replace

            // first element of current row


            prev = mat[row + 1][col];



            // Move elements of first row

            // from the remaining rows

            for (int i = col; i < column_index; i++)

            {
                var currentrow=row;
                var counter=i;


                curr = mat[row][i];

                mat[row][i] = prev;

                prev = curr;

            }

            row++;



            // Move elements of last column

            // from the remaining columns

            for (int i = row; i < row_index; i++)

            {

                curr = mat[i][column_index-1];

                mat[i][column_index-1] = prev;

                prev = curr;

            }

            column_index--;

            column_index=column_index;


            // Move elements of last row

            // from the remaining rows

            if (row < row_index)

            {

                for (int i = column_index-1; i >= col; i--)
                {
                    var cc=i;

                    curr = mat[row_index-1][i];

                    mat[row_index-1][i] = prev;

                    prev = curr;

                }

            }

            row_index--;
            row_index=row_index;



            // Move elements of first column

            // from the remaining rows

            if (col < column_index)

            {

                for (int i = row_index-1; i >= row; i--)

                {
                    var ww=i;

                    curr = mat[i][col];

                    mat[i][col] = prev;

                    prev = curr;

                }

            }

            col++;

        }


        // Print rotated matrix

        for (int i = 0; i < R; i++)

        {

            for (int j = 0; j < C; j++)

                System.out.print( mat[i][j] + " ");

            System.out.print("\n");

        }

    }

    /* Driver program to test above functions */

    public static void main(String[] args)

    {

        // Test Case 1

        int a[][] = { {1, 2, 3, 4},

                {5, 6, 7, 8},

                {9, 10, 11, 12},

                {13, 14, 15, 16} };


        // Test Case 2

    /* int a[][] = new int {{1, 2, 3},

                            {4, 5, 6},

                            {7, 8, 9}

                        };*/

        rotatematrix(R, C, a);



    }
}

// This code is contributed by Sahil_Bansall