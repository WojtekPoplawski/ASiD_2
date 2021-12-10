package bin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MegreSort {

    public MegreSort() throws FileNotFoundException {
        PrintWriter out = new PrintWriter("Out0201.txt");
        Scanner in = new Scanner(new File("In0201.txt"));
        int n = in.nextInt();
        int[] tab = new int[n];
        for(int i=0;i<n;i++){
            tab[i]=in.nextInt();
        }
        f(tab,n);
        for(int i=0;i<n;i++){
            out.print(tab[i]+" ");
        }
        out.close();
    }
    void f(int[] inTab,int n){
        if(n<2){
            return;
        }
        int x=n/2;
        int[] lTab=new int[x];
        int[] rTab=new int[n-x];
        System.arraycopy(inTab, 0, lTab, 0, x);
        System.arraycopy(inTab, x, rTab, 0, n - x);
        f(lTab,x);
        f(rTab,n-x);
        g(inTab,lTab,rTab,x,n-x);
    }
    void g(int[] inTab,int[] lTab,int[] rTab,int l,int r){
        int x=0,y=0,z=0;
        while(x<l && y<r){
            if(lTab[x]<=rTab[y]){
                inTab[z]=lTab[x];
                z++;
                x++;
            }
            else {
                inTab[z]=rTab[y];
                z++;
                y++;
            }
        }
        while(x<l){
            inTab[z]=lTab[x];
            z++;
            x++;
        }
        while(y<r){
            inTab[z]=rTab[y];
            z++;
            y++;
        }
    }
}
