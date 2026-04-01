// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pair) {
        int n= pair.size();
    List<List<Pair>> I=new ArrayList<>();
    for(int i=0;i<n;i++){
        int j=i-1;
        while(j>=0 && pair.get(j).key>pair.get(j+1).key){
            Pair temp =pair.get(j);
            pair.set(j,pair.get(j+1));
            pair.set(j+1,temp);
            j--;
        }
            List<Pair> cloneList = new ArrayList<>(pair);
            I.add(cloneList);
    }
    return I;
    }
}
