package com.kcy;

public class ScoringNG {
    public static void main(String[] args) {
        String[]names={"Jyhon","Kevin","Dobby","James","Otter"};
        int[] maths ={50,60,70,90,30};
        int [] engilshs ={55,90,55,75,80};
        for(int i =0;i<5;i++){
            if (i!=3){
                System.out.println(names[i]+"\t"+maths[i]+"\t"+(engilshs[i]+maths[i])/2);
            }
        }
    }
}
