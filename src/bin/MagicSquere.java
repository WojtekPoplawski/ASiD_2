package bin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MagicSquere {
    public MagicSquere() throws FileNotFoundException {
        PrintWriter out = new PrintWriter("Out0203.txt");
        Scanner in = new Scanner(new File("In0203.txt"));
        int n = in.nextInt();
        char[][] tab = new char[n][n];
        char[] text = in.next().toCharArray();
        f(0,n,text,tab,0);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                out.print(tab[j][i]);
            }
            out.print("\n");
        }
        out.close();
    }
    void f(int start,int n,char[] text,char[][] tab,int p){
        for(int i=start;i<n;i++){
            tab[i][start]=text[p%text.length];
            p++;
        }
        for(int i=start+1;i<n;i++){
            tab[n-1][i]=text[p%text.length];
            p++;
        }
        for(int i=n-2;i>=start;i--){
            tab[i][n-1]=text[p%text.length];
            p++;
        }
        for(int i=n-2;i>start;i--){
            tab[start][i]=text[p%text.length];
            p++;
        }
        if(n>=0){f(start+1,n-1,text,tab,0);}
    }
}
