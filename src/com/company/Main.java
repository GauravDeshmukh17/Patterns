/*package com.company;

import java.util.Scanner;  // alt + enter

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number is Stars");
        int n= sc.nextInt();  // n=number of rows

        int nst=1;  // Number of Stars
        int nsp=n/2;  // Number of Spaces

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            for(int j=1;j<=nst;j++){

                System.out.print("*\t");
            }

            if(i<=n/2){

                nsp=nsp-1;
                nst=nst+2;
            }

            else{

                nsp=nsp+1;
                nst=nst-2;
            }

            System.out.println();
        }

    }
}*/

//-------------------------------------------------------------------------------------------------------

// DUMBEL SHAPE PATTERN

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number is Stars");
        int n= sc.nextInt();  // n=number of rows

        int nst=n;  // Number of Stars
        int nsp=0;  // Number of Spaces

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            for(int j=1;j<=nst;j++){

                System.out.print("*\t");
            }

            if(i<=n/2){

                nsp=nsp+1;
                nst=nst-2;
            }

            else{

                nsp=nsp-1;
                nst=nst+2;
            }

            System.out.println();
        }


    }

}*/

//------------------------------------------------------------------------------------------------------------------------

// BUTTERFLY PATTERN

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        int n=sc.nextInt(); //Number of rows , n is odd

        int nst=1;
        int nsp=n-2;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nst;j++){

                System.out.print("*\t");
            }

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            for(int j=1;j<=nst;j++){

                if(nst==n/2+1 && j==nst-1){

                    continue;
                }
                else{

                    System.out.print("*\t");
                }

            }

            if(i<=n/2){

                nst=nst+1;
                nsp=nsp-2;
            }

            else{

                nst=nst-1;
                nsp=nsp+2;
            }

            System.out.println();

        }

    }
}*/

//------------------------------------------------------------------------------------------------------------------------

// PATTERN 6

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // n=number of rows

        int nst=(n/2)+1;
        int nsp=1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nst;j++){

                System.out.print("*\t");
            }

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            for(int j=1;j<=nst;j++){

                System.out.print("*\t");
            }

            if(i<=n/2){

                nst=nst-1;
                nsp=nsp+2;
            }
            else{

                nst=nst+1;
                nsp=nsp-2;
            }

            System.out.print("\n");
        }

    }
}*/

//------------------------------------------------------------------------------------------------------------------------

// PATTERN 7

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  // n=number of rows

        int nst=1;
        int nsp=0;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            System.out.println("*\t");

            nsp++;
        }
    }

}

*/

//------------------------------------------------------------------------------------------------------------------------

// PATTREN 8

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();  // n=number of rows

        int nsp=n-1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            System.out.println("*\t");

            nsp--;
        }

    }

}*/

//------------------------------------------------------------------------------------------------------------------------

// TRIANGLE PATTERN

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  // n=number of rows

        int nst=1;
        int nsp=n-1;

        for(int i=1;i<=n;i++) {

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            for(int j=1;j<=nst;j++){

                System.out.print("*\t");
            }

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            nsp-=1;
            nst+=2;
            System.out.println();
        }

    }

}*/

//-----------------------------------------------------------------------------------------------------------------

// PLUS PATTREN

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  // n = no. of rows  , n is odd

        int nst=1;
        int nsp=n/2;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nsp;j++){

                if(i==n/2+1){

                    System.out.print("*\t");
                }
                else{

                    System.out.print("\t");
                }
            }

            System.out.print("*\t");

            for(int j=1;j<=nsp;j++){

                if(i==n/2+1){

                    System.out.print("*\t");
                }
                else{

                    System.out.print("\t");
                }
            }

            System.out.println();

        }

    }

}*/

//-----------------------------------------------------------------------------------------------------------------

// PATTERN 11

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();  // n=number of rows

        int nst=1;
        int sum=0;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=nst;j++){

                sum=sum+1;
                System.out.print(sum+"\t");
            }
            nst++;
            System.out.println();
        }

    }

}*/

//-----------------------------------------------------------------------------------------------------------------

// PASCAL'S TRIANGLE

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int nst=1;
        int a=0;
        int b=1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nst;j++){



            }

        }

    }

}*/

//--------------------------------------------------------------------------------------------------------------------

// PATTERN 16

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int nst=1;
        int nsp=2*n-3;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nst;j++){

                System.out.print(j+"\t");
            }

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            if(i==n){

                nst--;
            }
            for(int j=nst;j>=1;j--){

                System.out.print(j+"\t");
            }

            System.out.println();
            nst++;
            nsp=nsp-2;
        }
    }


}*/

//--------------------------------------------------------------------------------------------------------------------

// PATTERN 17

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int nst=1;
        int nsp=n/2;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nsp;j++){

                if(i==n/2+1){

                    System.out.print("*\t");
                }
                else{

                    System.out.print("\t");
                }
            }

            for(int j=1;j<=nst;j++){

                System.out.print("*\t");
            }

            if(i<=n/2){

                nst++;
            }
            else{

                nst--;
            }

            System.out.println();
        }
    }

}*/

//--------------------------------------------------------------------------------------------------------------------

//  PATTERN 15

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();   // n=number of rows  ,  n is odd

        int nsp=n/2;
        int nst=1;
        int oval=1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            int ival=oval;
            for(int j=1;j<=nst;j++){

                System.out.print(ival+"\t");

                if(j<=nst/2){

                    ival++;
                }
                else{

                    ival--;
                }
            }

            if(i<=n/2){

                oval++;
                nst+=2;
                nsp--;
            }
            else{

                oval--;
                nst-=2;
                nsp++;
            }

            System.out.println();
        }
    }

}*/

//--------------------------------------------------------------------------------------------------------------------

// PATTERN 18

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt(); n=number of rows  ,  n is odd

        int nsp=0;
        int nst=n;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            for(int j=1;j<=nst;j++){

                if(i<=n/2 && i>1){

                    if(j==1 || j==nst){

                        System.out.print("*\t");
                    }
                    else{

                        System.out.print("\t");
                    }
                }
                else{

                    System.out.print("*\t");
                }
            }

            if(i<=n/2){

                nsp++;
                nst-=2;
            }
            else{

                nsp--;
                nst+=2;
            }
            System.out.println();

        }

    }

}*/

//-----------------------------------------------------------------------------------------------------------

// PATTERN 19

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  // n=number of rows , n is odd


    }
}*/

//---------------------------------------------------------------------------------------------------

// PATTERN 20

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();

        int nsp=n-2;

        for(int i=1;i<=n;i++){

            System.out.print("*\t");

            for(int j=1;j<=nsp;j++){

                if(i<=n/2){

                    System.out.print("\t");
                }
                else{

                    if(i-j==1 || i+j==n){

                        System.out.print("*\t");
                    }
                    else{

                        System.out.print("\t");
                    }
                }

            }
            System.out.print("*\t");

            System.out.println();
        }


    }
}*/

//------------------------------------------------------------------------------------------------
// OR
// PATTERN 20

package com.company;

import java.util.*;

public class Main{

    public static void main(String[] args){

        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();  // n=number of rows

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++) {

                if(i>=n/2+1){

                    if(i-j==0 || i+j==n+1 || j==1 || j==n){

                        System.out.print("*\t");
                    } else {

                        System.out.print("\t");
                    }
                }
                else{

                    if(j==1 || j==n){

                        System.out.print("*\t");
                    }
                    else{

                        System.out.print("\t");
                    }
                }

            }

            System.out.println();
        }


    }
}

//------------------------------------------------------------------------------------------------

// M PATTERN

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();  // n=number of rows  ,  n is odd

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){

                if(i<=n/2+1){
                    if(i-j==0 || i+j==n+1 || j==1 || j==n){

                        System.out.print("*\t");
                    }
                    else{

                        System.out.print("\t");
                    }
                }
                else{
                    if(j==1 || j==n){

                        System.out.print("*\t");
                    }
                    else{

                        System.out.print("\t");
                    }
                }

            }
            System.out.println();
        }

    }

}*/

//------------------------------------------------------------------------------------------------

// N PATTERN

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt(); // n=number of rows , n is odd

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){

                if(j==1 || j==n || i-j==0){

                    System.out.print("*\t");
                }
                else{

                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}*/

//-------------------------------------------------------------------------------------------

// PATTERN 6

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();  // n=number of rows

        int nst=n/2+1;
        int nsp=1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=nst;j++){

                System.out.print("*\t");
            }

            for(int j=1;j<=nsp;j++){

                System.out.print("\t");
            }

            for(int j=1;j<=nst;j++){

                System.out.print("*\t");
            }

            if(i<=n/2){

                nst--;
                nsp+=2;
            }
            else{

                nst++;
                nsp-=2;
            }
            System.out.println();
        }


    }
}*/
