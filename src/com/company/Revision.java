/*package com.company;

import java.util.Scanner;

public class Revision {

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();  // n=number of rows

        int nsp=n-1;
        int nst=1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }
            for(int j=1;j<=nst;j++){

                System.out.print("*\t");
            }

            nst++;
            nsp--;
            System.out.println();
        }
    }

}*/

//--------------------------------------------------------------------------------------------------------

/*package com.company;

import java.util.*;

public class Revision{

    public static void main(String args[]){

        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();     // n=number of rows

        int nst=n;
        int nsp=0;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nst;j++){

                System.out.print("*\t");
            }

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            nst--;
            nsp++;
            System.out.println();
        }

    }

}*/

//--------------------------------------------------------------------------------------------------------

// HOLLOW SQUARE

/*package com.company;

import java.util.*;

public class Revision{

    public static void main(String args[]){

        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();   // n=number of rows

        int nsp=n-2;

        for(int i=1;i<=n;i++){

            System.out.print("*\t");

            for(int j=1;j<=nsp;j++){

                if(i==1 || i==n){

                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }

            }

            System.out.print("*\t");
            System.out.println();
        }
    }

}*/

//--------------------------------------------------------------------------------------------------------

/*package com.company;

import java.util.Scanner;

public class Revision{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();   // n=number of rows

        int nsp=n-1;
        int nst=1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            for(int j=1;j<=nst;j++){

                System.out.print("*\t");
            }

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            nst+=2;
            nsp--;

            System.out.println();
        }
    }

}*/

//--------------------------------------------------------------------------------------------------------

// HOLLOW DUMBEL

package com.company;

import java.util.*;

public class Revision{

    public static void main(String args[]){

        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){

                if(i-j==0 || i+j==n+1 || j==1 || j==n){

                    System.out.print("*\t");
                }
                else{

                    System.out.print("\t");
                }
            }
            System.out.println();
        }


    }
}

