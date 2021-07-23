package Level_1.QuickSort;

import java.util.ArrayList;

public class QuickSort {


    public static ArrayList<Integer> sort(ArrayList<Integer> list) {
        if(list.size()==1){ // liste uzunluğunu alıp işleme sokmasını engelelyen anahtar
            return list;
        }
        int pivot=list.get(list.size()-1); //listenin son elemanı pivot olarak seçiliyor
        ArrayList<Integer> lower=new ArrayList<>(); //pivottan daha küçük elemanlar için oluşturulan liste
        ArrayList<Integer> higher=new ArrayList<>(); // pivottan daha büyük elemanlar için oluşturulan liste
        ArrayList<Integer> pivotAr=new ArrayList<>(); //pivot ve ya pivota eşit olan değerler için liste
        for (int a:list //listelere elemanlar dağıtılıyor
             ) {
            if(a>pivot){
                higher.add(a);
            }else if(a<pivot) {
                lower.add(a);
            }else{
                pivotAr.add(a);
            }
        }
        list.clear(); //liste temizleniyor
        if(lower.size()!=0){ //listenin boş olup olmadığı  denetlenip recursive olark method çağırılıyor
            list.addAll(sort(lower));
        }
        list.addAll(pivotAr);
        if(higher.size()!=0){
            list.addAll(sort(higher));
        }
        return list;
    }
    public static ArrayList<Integer> reversed(ArrayList<Integer> list){ //tersine sıralanması istenirse reverse methoduda ekledim
        ArrayList<Integer> myList=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            myList.add(list.get(list.size()-1-i));
        }
        return myList;
    }
}
