package Level_1.QuickSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(54);
        list.add(3);
        list.add(165);
        list.add(23);
        list.add(48);
        list.add(38);
        list.add(941);
        list.add(45);
        list.add(98);
        list.add(16);

        QuickSort.sort(list);

        for (int j=0;j<list.size();j++) {
            if(j!=list.size()-1) {
                System.out.print(list.get(j) + ",");
            }else{
                System.out.print(list.get(j));
            }
        }


    }
}