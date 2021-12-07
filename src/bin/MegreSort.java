package bin;

import java.nio.file.Path;

public class MegreSort {
    int[] tab={10,1,9,2,8,3,7,4,6,5};
    int n=10;
    int tout[];

    public MegreSort() {
        this.tout=Divide(n,0,tab);
    }

    void In(Path path){

    }

    int[] MS(int n,int[] tinl,int[] tinr) {
        int tout[] = new int[n];
        int i, l = 0, r = 0;
        if (n == 2) {
            tout[0] = tinl[0];
            tout[1] = tinr[0];
        } else{
            for (i = 0; i < n; i++) {
                if (tinl[l] > tinr[r]) {
                    tout[i] = tinr[r];
                    r++;
                } else {
                    tout[i] = tinl[l];
                    l++;
                }
                if (r > n / 2 - 1 || l > n / 2 - 1) break;
            }
        }
        return tout;
    }

    int[] Divide(int end, int start, int[] tab){
        int x=end-start-1;
        int tinl[]=new int[end/2];
        int tinr[]=new int[end/2];
        int tout[];
        if(x==0){
            return tab;
        }
        for(int i=0;i<end/2;i++){
            tinl[i]=tab[i];
        }
        for(int i=0;i<end/2;i++){
            tinr[i]=tab[i+end/2];
        }
        if(x>2){
            Divide(end/2,start,tinl);
            Divide(end/2,start,tinr);
        }
        tout=MS(end,tinr,tinl);
        return tout;
    }
}
