package bin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int tab[];
        MegreSort megreSort = new MegreSort();
        tab= megreSort.tout;
        for(int i=0;i<megreSort.n;i++){
            System.out.print(tab[i]+',');
        }
    }
}
