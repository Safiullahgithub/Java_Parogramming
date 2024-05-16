package com.company;

import java.util.ArrayList;
//generic increase the enhancement of type  casting and put away from the bugs
class Mygeneric<T1>{
    int val;
    private  T1 t;

    public Mygeneric(int val, T1 t) {
        this.val = val;
        this.t = t;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT() {
        return t;
    }

    public void setT(T1 t) {
        this.t = t;
    }
}
public class generic {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist=new ArrayList<>();//make an array arraylist
//        ArrayList<int> arraylist=new ArrayList<>(); //this will produce an error becuase the int is not allowed in the java it is primitive data type
        //add some value to arraylist both integer and string
        arraylist.add(23);
//        arraylist.add("strng");
        arraylist.add(34);

        //get some value from the arraylist
        // it is correct but it is not needed because
        // we can write every line for typecasting so this problem is
        // solve by generic geneic tell us that yoy can put same data type
        // in your array
       // int a=(int) arraylist.get(2);
         int a =arraylist.get(1);
//         System.out.println(a);
        int val;
        Mygeneric<String> g1 = new Mygeneric<>(23, "this is string generic");

        String str=g1.getT();
        System.out.println(str);
    }

}
