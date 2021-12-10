package bin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Triangle {

    int n;


    public Triangle() throws FileNotFoundException {
        PrintWriter out = new PrintWriter("Out0202.txt");
        Scanner in = new Scanner(new File("In0202.txt"));
        this.n = in.nextInt();
        f(this.n,out);
        out.close();
    }

    void f(int x,PrintWriter out){
        if(x!=1){
            f(x-2,out);
        }
        for(int i=0;i<(this.n-x)/2;i++){
            out.print(" ");
        }
        for(int i=0;i<x;i++){
            out.print("*");
        }
        for(int i=0;i<this.n-x;i++){
            out.print(" ");
        }
        out.print("\n");
    }
}
