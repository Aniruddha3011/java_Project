import java.util.*;


class matrix1{
    Scanner sc=new Scanner(System.in);
    int a,b,c,z;
    void add(int i,int w){
        if (i==1 && w==2){

            b=2;
            c=2;
            int a[][]=new int[b][c];
            int z[][]=new int[b][c];
            int n[][]=new int[b][c];
            System.out.println("Enter a first matrix:");
            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    a[k][j]=sc.nextInt();

                }
            }

            System.out.println("first matrix is:");
            System.out.println("["+a[0][0]+" "+a[0][1]+"]");
            
            System.out.println("["+a[1][0]+" "+a[1][1]+"]");
            System.out.println("\n");

            System.out.println("Enter a second matrix");

            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    z[k][j]=sc.nextInt();

                }
            }
            System.out.println("Second matrix is:");
            System.out.println("["+z[0][0]+" "+z[0][1]+"]");
            System.out.println("["+z[1][0]+" "+z[1][1]+"]");
            System.out.println("\n");

            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    n[k][j]=a[k][j]+z[k][j];

                }
            }
            System.out.println("Addition of two matrix:");
            System.out.println("["+n[0][0]+" "+n[0][1]+"]");
            System.out.println("["+n[1][0]+" "+n[1][1]+"]");
            System.out.println("\n");
        }

        else if(i==1 && w==3){
            b=2;
            c=2;
            int a[][]=new int[b][c];
            int z[][]=new int[b][c];
            int r[][]=new int[b][c];
            int n[][]=new int[b][c];
            System.out.println("Enter a first matrix:");
            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    a[k][j]=sc.nextInt();

                }
            }

            System.out.println("first matrix is:");
            System.out.println("["+a[0][0]+" "+a[0][1]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+"]");
            System.out.println("\n");

            System.out.println("Enter a second matrix");

            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    z[k][j]=sc.nextInt();

                }
            }
            System.out.println("Second matrix is:");
            System.out.println("["+z[0][0]+" "+z[0][1]+"]");
            System.out.println("["+z[1][0]+" "+z[1][1]+"]");
            System.out.println("\n");

            System.out.println("Enter a third matrix");
            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    r[k][j]=sc.nextInt();

                }
            }
            System.out.println("["+r[0][0]+" "+r[0][1]+"]");
            System.out.println("["+r[1][0]+" "+r[1][1]+"]");
            System.out.println("\n");




            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    n[k][j]=a[k][j]+z[k][j]+r[k][j];

                }
            }
            System.out.println("Addition of two matrix:");
            System.out.println("["+n[0][0]+" "+n[0][1]+"]");
            System.out.println("["+n[1][0]+" "+n[1][1]+"]");
            System.out.println("\n");

        }

        else if(i==2 && w==2){
            b=3;
            c=3;
            int a[][]=new int[b][c];
            int z[][]=new int[b][c];
            int n[][]=new int[b][c];
            System.out.println("Enter a first matrix:");
            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    a[k][j]=sc.nextInt();

                }
            }

            System.out.println("first matrix is:");
            System.out.println("["+a[0][0]+" "+a[0][1]+" "+a[0][2]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+" "+a[1][2]+"]");
            System.out.println("["+a[2][0]+" "+a[2][1]+" "+a[2][2]+"]");
            System.out.println("\n");

            System.out.println("Enter a second matrix");

            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    z[k][j]=sc.nextInt();

                }
            }
            System.out.println("Second matrix is:");
            System.out.println("["+z[0][0]+" "+z[0][1]+" "+z[0][2]+"]");
            System.out.println("["+z[1][0]+" "+z[1][1]+" "+z[1][2]+"]");
            System.out.println("["+z[2][0]+" "+z[2][1]+" "+z[2][2]+"]");
            System.out.println("\n");
            

            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    n[k][j]=a[k][j]+z[k][j];

                }
            }
            System.out.println("Addition of two matrix:");
            System.out.println("["+n[0][0]+" "+n[0][1]+" "+n[0][2]+"]");
            System.out.println("["+n[1][0]+" "+n[1][1]+" "+n[1][2]+"]");
            System.out.println("["+n[2][0]+" "+z[2][1]+" "+z[2][2]+"]");
            System.out.println("\n");

        }

        else if(i==2 && w==3){
            b=3;
            c=3;
            int a[][]=new int[b][c];
            int z[][]=new int[b][c];
            int r[][]=new int[b][c];
            int n[][]=new int[b][c];
            System.out.println("Enter a first matrix:");
            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    a[k][j]=sc.nextInt();

                }
            }

            System.out.println("first matrix is:");
            System.out.println("["+a[0][0]+" "+a[0][1]+" "+a[0][2]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+" "+a[1][2]+"]");
            System.out.println("["+a[2][0]+" "+a[2][1]+" "+a[2][2]+"]");
            System.out.println("\n");

            System.out.println("Enter a second matrix");

            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    z[k][j]=sc.nextInt();

                }
            }
            System.out.println("Second matrix is:");
            System.out.println("["+z[0][0]+" "+z[0][1]+" "+z[0][2]+"]");
            System.out.println("["+z[1][0]+" "+z[1][1]+" "+z[1][2]+"]");
            System.out.println("["+z[2][0]+" "+z[2][1]+" "+z[2][2]+"]");
            System.out.println("\n");

            System.out.println("Enter a third matrix");
            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    r[k][j]=sc.nextInt();

                }
            }
            System.out.println("third matrix is:");
            System.out.println("["+r[0][0]+" "+r[0][1]+" "+r[0][2]+"]");
            System.out.println("["+r[1][0]+" "+r[1][1]+" "+r[1][2]+"]");
            System.out.println("["+r[2][0]+" "+r[2][1]+" "+r[2][2]+"]");
            System.out.println("\n");



            

            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    n[k][j]=a[k][j]+z[k][j]+r[k][j];

                }
            }
            System.out.println("Addition of three matrix:");
            System.out.println("["+n[0][0]+" "+n[0][1]+" "+n[0][2]+"]");
            System.out.println("["+n[1][0]+" "+n[1][1]+" "+n[1][2]+"]");
            System.out.println("["+n[2][0]+" "+z[2][1]+" "+z[2][2]+"]");
            System.out.println("\n");


        }
        
    }
    void sub(int i,int w){
        if (i==1 && w==2){

            b=2;
            c=2;
            int a[][]=new int[b][c];
            int z[][]=new int[b][c];
            int n[][]=new int[b][c];
            System.out.println("Enter a first matrix:");
            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    a[k][j]=sc.nextInt();

                }
            }

            System.out.println("first matrix is:");
            System.out.println("["+a[0][0]+" "+a[0][1]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+"]");
            System.out.println("\n");

            System.out.println("Enter a second matrix");

            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    z[k][j]=sc.nextInt();

                }
            }
            System.out.println("Second matrix is:");
            System.out.println("["+z[0][0]+" "+z[0][1]+"]");
            System.out.println("["+z[1][0]+" "+z[1][1]+"]");
            System.out.println("\n");

            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    n[k][j]=a[k][j]-z[k][j];

                }
            }
            System.out.println("subtraction of two matrix:");
            System.out.println("["+n[0][0]+" "+n[0][1]+"]");
            System.out.println("["+n[1][0]+" "+n[1][1]+"]");
            System.out.println("\n");
        }

        else if(i==1 && w==3){
            b=2;
            c=2;
            int a[][]=new int[b][c];
            int z[][]=new int[b][c];
            int r[][]=new int[b][c];
            int n[][]=new int[b][c];
            System.out.println("Enter a first matrix:");
            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    a[k][j]=sc.nextInt();

                }
            }

            System.out.println("first matrix is:");
            System.out.println("["+a[0][0]+" "+a[0][1]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+"]");
            System.out.println("\n");

            System.out.println("Enter a second matrix");

            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    z[k][j]=sc.nextInt();

                }
            }
            System.out.println("Second matrix is:");
            System.out.println("["+z[0][0]+" "+z[0][1]+"]");
            System.out.println("["+z[1][0]+" "+z[1][1]+"]");
            System.out.println("\n");

            System.out.println("Enter a third matrix");
            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    r[k][j]=sc.nextInt();

                }
            }
            System.out.println("["+r[0][0]+" "+r[0][1]+"]");
            System.out.println("["+r[1][0]+" "+r[1][1]+"]");
            System.out.println("\n");




            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    n[k][j]=a[k][j]-z[k][j]-r[k][j];

                }
            }
            System.out.println("subtraction of three matrix:");
            System.out.println("["+n[0][0]+" "+n[0][1]+"]");
            System.out.println("["+n[1][0]+" "+n[1][1]+"]");
            System.out.println("\n");

        }

        else if(i==2 && w==2){
            b=3;
            c=3;
            int a[][]=new int[b][c];
            int z[][]=new int[b][c];
            int n[][]=new int[b][c];
            System.out.println("Enter a first matrix:");
            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    a[k][j]=sc.nextInt();

                }
            }

            System.out.println("first matrix is:");
            System.out.println("["+a[0][0]+" "+a[0][1]+" "+a[0][2]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+" "+a[1][2]+"]");
            System.out.println("["+a[2][0]+" "+a[2][1]+" "+a[2][2]+"]");
            System.out.println("\n");

            System.out.println("Enter a second matrix");

            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    z[k][j]=sc.nextInt();

                }
            }
            System.out.println("Second matrix is:");
            System.out.println("["+z[0][0]+" "+z[0][1]+" "+z[0][2]+"]");
            System.out.println("["+z[1][0]+" "+z[1][1]+" "+z[1][2]+"]");
            System.out.println("["+z[2][0]+" "+z[2][1]+" "+z[2][2]+"]");
            System.out.println("\n");
            

            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    n[k][j]=a[k][j]-z[k][j];

                }
            }
            System.out.println("subtraction of two matrix:");
            System.out.println("["+n[0][0]+" "+n[0][1]+" "+n[0][2]+"]");
            System.out.println("["+n[1][0]+" "+n[1][1]+" "+n[1][2]+"]");
            System.out.println("["+n[2][0]+" "+z[2][1]+" "+z[2][2]+"]");
            System.out.println("\n");

        }

        else if(i==2 && w==3){
            b=3;
            c=3;
            int a[][]=new int[b][c];
            int z[][]=new int[b][c];
            int r[][]=new int[b][c];
            int n[][]=new int[b][c];
            System.out.println("Enter a first matrix:");
            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    a[k][j]=sc.nextInt();

                }
            }

            System.out.println("first matrix is:");
            System.out.println("["+a[0][0]+" "+a[0][1]+" "+a[0][2]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+" "+a[1][2]+"]");
            System.out.println("["+a[2][0]+" "+a[2][1]+" "+a[2][2]+"]");
            System.out.println("\n");

            System.out.println("Enter a second matrix");

            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    z[k][j]=sc.nextInt();

                }
            }
            System.out.println("Second matrix is:");
            System.out.println("["+z[0][0]+" "+z[0][1]+" "+z[0][2]+"]");
            System.out.println("["+z[1][0]+" "+z[1][1]+" "+z[1][2]+"]");
            System.out.println("["+z[2][0]+" "+z[2][1]+" "+z[2][2]+"]");
            System.out.println("\n");

            System.out.println("Enter a third matrix");
            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    r[k][j]=sc.nextInt();

                }
            }
            System.out.println("third matrix is:");
            System.out.println("["+r[0][0]+" "+r[0][1]+" "+r[0][2]+"]");
            System.out.println("["+r[1][0]+" "+r[1][1]+" "+r[1][2]+"]");
            System.out.println("["+r[2][0]+" "+r[2][1]+" "+r[2][2]+"]");
            System.out.println("\n");



            

            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    n[k][j]=a[k][j]-z[k][j]-
                    r[k][j];

                }
            }
            System.out.println("subtraction of three matrix:");
            System.out.println("["+n[0][0]+" "+n[0][1]+" "+n[0][2]+"]");
            System.out.println("["+n[1][0]+" "+n[1][1]+" "+n[1][2]+"]");
            System.out.println("["+n[2][0]+" "+z[2][1]+" "+z[2][2]+"]");
            System.out.println("\n");


        }
        
    }

    void mul(int i,int w){
        if (i==1 && w==2){

            b=2;
            c=2;
            int a[][]=new int[b][c];
            int z[][]=new int[b][c];
            int n[][]=new int[b][c];
            System.out.println("Enter a first matrix:");
            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    a[k][j]=sc.nextInt();

                }
            }

            System.out.println("first matrix is:");
            System.out.println("["+a[0][0]+" "+a[0][1]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+"]");
            System.out.println("\n");

            System.out.println("Enter a second matrix");

            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    z[k][j]=sc.nextInt();

                }
            }
            System.out.println("Second matrix is:");
            System.out.println("["+z[0][0]+" "+z[0][1]+"]");
            System.out.println("["+z[1][0]+" "+z[1][1]+"]");
            System.out.println("\n");

            System.out.println("multiplication of two matrix is:");
            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    for (int o=0;o<2;o++){
                        n[k][j]=n[k][j]+a[k][o]*z[o][j];
                    }
                }
            }

                            

            System.out.println("["+n[0][0]+" "+n[0][1]+"]");
            System.out.println("["+n[1][0]+" "+n[1][1]+"]");
            System.out.println("\n");
        }

        else if(i==1 && w==3){
            b=2;
            c=2;
            int a[][]=new int[b][c];
            int z[][]=new int[b][c];
            int r[][]=new int[b][c];
            int n[][]=new int[b][c];
            int m[][]=new int[b][c];
            System.out.println("Enter a first matrix:");
            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    a[k][j]=sc.nextInt();

                }
            }

            System.out.println("first matrix is:");
            System.out.println("["+a[0][0]+" "+a[0][1]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+"]");
            System.out.println("\n");

            System.out.println("Enter a second matrix");

            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    z[k][j]=sc.nextInt();

                }
            }
            System.out.println("Second matrix is:");
            System.out.println("["+z[0][0]+" "+z[0][1]+"]");
            System.out.println("["+z[1][0]+" "+z[1][1]+"]");
            System.out.println("\n");

            System.out.println("Enter a third matrix");
            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter a element of matrix:");
                    r[k][j]=sc.nextInt();

                }
            }
            System.out.println("["+r[0][0]+" "+r[0][1]+"]");
            System.out.println("["+r[1][0]+" "+r[1][1]+"]");
            System.out.println("\n");




            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    for (int o=0;o<2;o++){
                        n[k][j]=n[k][j]+a[k][o]*z[o][j];
                    }
                    

                }
            }
            System.out.println("["+n[0][0]+" "+n[0][1]+"]");
            System.out.println("["+n[1][0]+" "+n[1][1]+"]");
            System.out.println("\n");


            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    for (int o=0;o<2;o++){
                        m[k][j]=m[k][j]+n[k][o]*r[o][j];
                    }
                }
            }




            System.out.println("multiplication of three matrix:");
            System.out.println("["+m[0][0]+" "+m[0][1]+"]");
            System.out.println("["+m[1][0]+" "+m[1][1]+"]");
            System.out.println("\n");

        }

        else if(i==2 && w==2){
            b=3;
            c=3;
            int a[][]=new int[b][c];
            int z[][]=new int[b][c];
            int n[][]=new int[b][c];
            System.out.println("Enter a first matrix:");
            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    a[k][j]=sc.nextInt();

                }
            }

            System.out.println("first matrix is:");
            System.out.println("["+a[0][0]+" "+a[0][1]+" "+a[0][2]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+" "+a[1][2]+"]");
            System.out.println("["+a[2][0]+" "+a[2][1]+" "+a[2][2]+"]");
            System.out.println("\n");

            System.out.println("Enter a second matrix");

            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    z[k][j]=sc.nextInt();

                }
            }
            System.out.println("Second matrix is:");
            System.out.println("["+z[0][0]+" "+z[0][1]+" "+z[0][2]+"]");
            System.out.println("["+z[1][0]+" "+z[1][1]+" "+z[1][2]+"]");
            System.out.println("["+z[2][0]+" "+z[2][1]+" "+z[2][2]+"]");
            System.out.println("\n");
            

            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    for (int o=0;o<3;o++){
                        n[k][j]=n[k][j]+a[k][o]*z[o][j];
                    }


                }
            }
            System.out.println("multiplication of two matrix:");
            System.out.println("["+n[0][0]+" "+n[0][1]+" "+n[0][2]+"]");
            System.out.println("["+n[1][0]+" "+n[1][1]+" "+n[1][2]+"]");
            System.out.println("["+n[2][0]+" "+n[2][1]+" "+n[2][2]+"]");
            System.out.println("\n");

        }

        else if(i==2 && w==3){
            b=3;
            c=3;
            int a[][]=new int[b][c];
            int z[][]=new int[b][c];
            int r[][]=new int[b][c];
            int n[][]=new int[b][c];
            int m[][]=new int[b][c];
            System.out.println("Enter a first matrix:");
            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    a[k][j]=sc.nextInt();

                }
            }

            System.out.println("first matrix is:");
            System.out.println("["+a[0][0]+" "+a[0][1]+" "+a[0][2]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+" "+a[1][2]+"]");
            System.out.println("["+a[2][0]+" "+a[2][1]+" "+a[2][2]+"]");
            System.out.println("\n");

            System.out.println("Enter a second matrix");

            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    z[k][j]=sc.nextInt();

                }
            }
            System.out.println("Second matrix is:");
            System.out.println("["+z[0][0]+" "+z[0][1]+" "+z[0][2]+"]");
            System.out.println("["+z[1][0]+" "+z[1][1]+" "+z[1][2]+"]");
            System.out.println("["+z[2][0]+" "+z[2][1]+" "+z[2][2]+"]");
            System.out.println("\n");

            System.out.println("Enter a third matrix");
            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter a element of matrix:");
                    r[k][j]=sc.nextInt();

                }
            }
            System.out.println("third matrix is:");
            System.out.println("["+r[0][0]+" "+r[0][1]+" "+r[0][2]+"]");
            System.out.println("["+r[1][0]+" "+r[1][1]+" "+r[1][2]+"]");
            System.out.println("["+r[2][0]+" "+r[2][1]+" "+r[2][2]+"]");
            System.out.println("\n");



            

            for (int k=0;k<3;k++){
                
                for (int j=0;j<3;j++){
                    for (int o=0;o<3;o++){
                        n[k][j]=n[k][j]+a[k][o]*z[o][j];
                    }

                }
            }
            System.out.println("["+n[0][0]+" "+n[0][1]+" "+n[0][2]+"]");
            System.out.println("["+n[1][0]+" "+n[1][1]+" "+n[1][2]+"]");
            System.out.println("["+n[2][0]+" "+z[2][1]+" "+z[2][2]+"]");
            System.out.println("\n");

            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    for (int o=0; o<3; o++){
                        m[k][j]=m[k][j]+n[k][o]*r[o][j];
                    }
                }
            }


            System.out.println("multiplication of three matrix:");
            System.out.println("["+m[0][0]+" "+m[0][1]+" "+m[0][2]+"]");
            System.out.println("["+m[1][0]+" "+m[1][1]+" "+m[1][2]+"]");
            System.out.println("["+m[2][0]+" "+m[2][1]+" "+m[2][2]+"]");
            System.out.println("\n");


        }
        

    }


    void dete(int i){
        if (i==1){
            b=2;
            c=2;
            int a[][]=new int[b][c];
            System.out.println("Enter the matrix");
            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter the element:");
                    a[k][j]=sc.nextInt();
                }
            }

            System.out.println("["+a[0][0]+" "+a[0][1]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+"]");
            System.out.println("\n");

            int l=(a[0][0]*a[1][1])-(a[0][1]*a[1][0]);

            System.out.print("Determinant of matrix is:"+l);
            System.out.println("\n");
            

        }

        else if(i==2){
            b=3;
            c=3;

            System.out.println("Enter the matrix");
            int a[][]=new int[b][c];
            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter the element:");
                    a[k][j]=sc.nextInt();
                }
            }

            System.out.println("["+a[0][0]+" "+a[0][1]+" "+a[0][2]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+" "+a[1][2]+"]");
            System.out.println("["+a[2][0]+" "+a[2][1]+" "+a[2][2]+"]");

            int l=a[0][0]*((a[1][1]*a[2][2])-(a[1][2]*a[2][1]))-a[0][1]*((a[1][0]*a[2][2])-(a[1][2]*a[2][0]))+a[0][2]*((a[1][0]*a[2][1])-(a[1][1]*a[2][0]));

            System.out.print("Determinant of matrix is:"+l);
            System.out.println("\n");
        }

        else{
            System.out.println("please enter a valid choice");
        }
    }

    void tran(int i){
        if (i==1){
            b=2;
            c=2;
            int a[][]=new int[b][c];
            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter the element:");
                    a[k][j]=sc.nextInt();
                }
            }

            System.out.println("["+a[0][0]+" "+a[0][1]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+"]");
            System.out.println("\n");

            System.out.println("transpose of matrix is:");
            System.out.println("["+a[0][0]+" "+a[1][0]+"]");
            System.out.println("["+a[0][1]+" "+a[1][1]+"]");
            System.out.println("\n");
        }

        else if(i==2){
            b=3;
            c=3;
            int a[][]=new int[b][c];
            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.print("Enter the  element:");
                    a[k][j]=sc.nextInt();
                }
            }

            System.out.println("["+a[0][0]+" "+a[0][1]+" "+a[0][2]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+" "+a[1][2]+"]");
            System.out.println("["+a[2][0]+" "+a[2][1]+" "+a[2][2]+"]");
            System.out.println("\n");

            System.out.println("transpose of matrix is:");
            System.out.println("["+a[0][0]+" "+a[1][0]+" "+a[2][0]+"]");
            System.out.println("["+a[0][1]+" "+a[1][1]+" "+a[2][1]+"]");
            System.out.println("["+a[0][2]+" "+a[1][2]+" "+a[2][2]+"]");
            System.out.println("\n");
        }
    }

    void inv(int i){
        if (i==1){
            b=2;
            c=2;
            float a[][]=new float[b][c];
            System.out.println("Enter the matrix");
            for (int k=0;k<2;k++){
                for (int j=0;j<2;j++){
                    System.out.print("Enter the element:");
                    a[k][j]=sc.nextInt();
                }
            }

            System.out.println("["+a[0][0]+" "+a[0][1]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+"]");
            System.out.println("\n");

            float l=((a[0][0]*a[1][1])-(a[0][1]*a[1][0]));

            float g=1/l;
            System.out.println("["+g*a[0][0]+" "+g*a[0][1]+"]");
            System.out.println("["+g*a[1][0]+" "+g*a[1][1]+"]");
            System.out.println("\n");
            
        }

        else if(i==2){

            b=3;
            c=3;
            float a[][]=new float[b][c];
            System.out.println("Enter the matrix:");
            for (int k=0;k<3;k++){
                for (int j=0;j<3;j++){
                    System.out.println("Enter the element:");
                    a[k][j]=sc.nextInt();
                }
            } 
            System.out.println("["+a[0][0]+" "+a[0][1]+" "+a[0][2]+"]");
            System.out.println("["+a[1][0]+" "+a[1][1]+" "+a[1][2]+"]");
            System.out.println("["+a[2][0]+" "+a[2][1]+" "+a[2][2]+"]");
            System.out.println("\n");

            float l=a[0][0]*((a[1][1]*a[2][2])-(a[1][2]*a[2][1]))-a[0][1]*((a[1][0]*a[2][2])-(a[1][2]*a[2][0]))+a[0][2]*((a[1][0]*a[2][1])-(a[1][1]*a[2][0]));

            float g=1/l;

            System.out.println("["+g*a[0][0]+" "+g*a[0][1]+" "+g*a[0][2]+"]");
            System.out.println("["+g*a[1][0]+" "+g*a[1][1]+" "+g*a[1][2]+"]");
            System.out.println("["+g*a[2][0]+" "+g*a[2][1]+" "+g*a[2][2]+"]");
            System.out.println("\n");
        }
    }

}

public class matrix {
    static matrix1 m=new matrix1();
    public static void main(String[] args){
        String ch;
        int choice,t,x;
        
        
        
        do{

            Scanner oc = new Scanner(System.in);
            System.out.println("Welcome to our matrix calculator");
            System.out.println("1.Addition of matix");
            System.out.println("2.subtraction of matrix");
            System.out.println("3.multiplication of matrix");
            System.out.println("4.determinant of matrix");
            System.out.println("5.transpose of matrix");
            System.out.println("6.inverse of matrix");
            System.out.println("7.Exit");
            System.out.print("Enter your choice:");
            choice=oc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("select the order of matrix");
                    System.out.println("press 1 for 2*2 matrix");
                    System.out.println("press 2 for 3*3 matrix");
                    System.out.print("Enter a choice:");
                    t= oc.nextInt();
                    System.out.print("How many matrix do you want to Add:");
                    x=oc.nextInt();
                    

                    m.add(t,x);
                    break;

                case 2:
                    System.out.println("select the order of matrix");
                    System.out.println("press 1 for 2*2 matrix");
                    System.out.println("press 2 for 3*3 matrix");
                    System.out.print("Enter a choice:");
                    t= oc.nextInt();
                    System.out.print("How many matrix do you want to subtract:");
                    x=oc.nextInt();
                    m.sub(t,x);
                    break;

                case 3:
                    System.out.println("select the order of matrix");
                    System.out.println("press 1 for 2*2 matrix");
                    System.out.println("press 2 for 3*3 matrix");
                    System.out.print("Enter a choice:");
                    t= oc.nextInt();
                    System.out.print("How many matrix do you want to multiply:");
                    x=oc.nextInt();
                    m.mul(t,x);
                    break;
                
                case 4:
                    System.out.println("select the order of matrix");
                    System.out.println("press 1 for 2*2 matrix");
                    System.out.println("press 2 for 3*3 matrix");
                    System.out.print("Enter a choice:");
                    t= oc.nextInt();
                    m.dete(t);
                    break;

                case 5:
                    System.out.println("select the order of matrix");
                    System.out.println("press 1 for 2*2 matrix");
                    System.out.println("press 2 for 3*3 matrix");
                    System.out.print("Enter a choice:");
                    t= oc.nextInt();
                    m.tran(t);
                    break;
                case 6:
                    System.out.println("select the order of matrix");
                    System.out.println("press 1 for 2*2 matrix");
                    System.out.println("press 2 for 3*3 matrix");
                    System.out.print("Enter a choice:");
                    t= oc.nextInt();
                    m.inv(t);
                    break;

                case 7:
                     System.out.println("thanks for using our matrix calcultor");
                     break; 

                  
                                
                default:
                        System.out.println("invalid choice");
                    break;
            }


        }while(choice!=0);
       

        
    }
    
}
