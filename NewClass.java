/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mang1chieu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NewClass {

    public static int cong(int a, int b) {
        return a + b;
    }

    public static int tru(int a, int b) {
        return a - b;
    }

    public static int nhan(int a, int b) {
        return a * b;
    }

    public static float chia(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        String str = "23+17+2+8";

//        String pheptinh = str.replaceAll("[0-9]", ",");
//        String so = str.replaceAll("[^0-9,-\\.]", ",");
//
//        String[] item = pheptinh.split(",");
//        String[] itemSo = so.split(",");
//
//        List<String> listSo = new ArrayList<String>(Arrays.asList(itemSo));
//        listSo.removeAll(Arrays.asList(""));
//
//        List<String> listDau = new ArrayList<String>(Arrays.asList(item));
//        listDau.removeAll(Arrays.asList(""));
//      
//        for (int i = 0; i < listDau.size(); i++) {
//            if (listDau.get(i).trim().equals("+")) {
//                System.out.print(cong(Integer.parseInt(listSo.get(  )  ), Integer.parseInt(listSo.get(  ))));
//                System.out.print(" + ");                    
//            } 
//        }

        while(str.contains("+")){     
        for(int i = 1; i < str.length(); i++){
            String left = "";
            String right = "";
            if( str.charAt(i) == '+'){
                int j = i - 1;
                while(str.charAt(j) != '+'){
                    left = left + str.charAt(j);
                    j--;
                    if(j < 0){
                        break;
                    }
                }
                // Dao nguoc so ben trai
                String reverse = new StringBuffer(left).reverse().toString();
                
                int m = i + 1;
                while( str.charAt(m) != '+' ){
                    right = right + str.charAt(m);
                    m++;
                    if(m >= str.length()){
                        break;
                    }
                }
                int tong = Integer.parseInt(reverse) + Integer.parseInt(right);
                String done = str.substring(i - left.length(), i + right.length());
                str = str.replace(done, "");
       
                str = tong + str;
                
                System.out.println("= " + str);
            }         
        }
        }
        
    }
}
