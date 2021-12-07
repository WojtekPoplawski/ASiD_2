package bin;

public class MegreSort {
    int[] tabin,tabout;
    int n;
    public MegreSort() {
    }
    void sort(int x,int y) {
        int i;
        int z = (x + y + 1) / 2;
        if (z > 2) {
            sort(x, z);
            sort(z + 1, y);
        }
        for(i = x;i <= y;i++){

        }
    }
}
