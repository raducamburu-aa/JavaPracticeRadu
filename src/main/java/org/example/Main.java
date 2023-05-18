package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //primeste un array si o valoare si returneaza  indexul unde se gaseste valoarea aia sau-1 daca nu se gaseste
        //System.out.println(indexOf(new int[]{1, 2, 3, 4}, 5));

        //primeste un array si o valuare si returneaza true daca gaseste valoarea in array
        //System.out.println(contains(new int[]{1, 2, 3, 4}, 4));

        //primeste un array si returneaza true daca e palindrom
        //System.out.println(palindrome(new int[]{1, 4, 9, 5, 9, 4, 1}));

        //primeste un array si o valoare si returneaza de cate ori exista valoarea respectiva in array
        //System.out.println(countValue(new int[]{1, 2, 3, 1, 1, 4, 5}, 1));

        //primeste 2 arrayuri si retruneaza true daca sunt anagrame
        //System.out.println(areAnagrams(new int[]{1, 2, 3, 4, 5}, new int[]{4, 2, 3, 5, 1}));
        //System.out.println(areAnagrams(new int[]{1, 2, 3, 4, 5}, new int[]{4, 2, 3, 8, 1}));
        //System.out.println(areAnagrams(new int[]{1, 2, 3, 4, 5}, new int[]{4, 2, 3, 5, 1, 1}));

        //primeste un hashmap si o valoare si returneaza cheia la care se gaseste acea valoare
        //HashMap<String, Integer> hash = new HashMap<String, Integer>();
        //hash.put("a", 0);
        //hash.put("b", 1);
        //hash.put("c", 2);
        //hash.put("d", 3);
        //hash.put("e", 4);
        //System.out.println(indexOf(hash, 6));

        //primesti 2 arrayuri si returneaza true daca sunt anagrame - folosind hashmap
        //System.out.println(areAnagramsHash(new int[]{1, 2, 3, 4, 5}, new int[]{4, 2, 3, 5, 1}));
        //System.out.println(areAnagramsHash(new int[]{1, 2, 3, 4, 5}, new int[]{4, 2, 3, 8, 1}));
        //System.out.println(areAnagramsHash(new int[]{1, 2, 3, 4, 5}, new int[]{4, 2, 3, 5, 1, 1}));

        //primeste un array de int-uri si returneaza un hashmap de unde cheile sunt valorile din array si valorile sunt de cate ori au aparut
        System.out.println(countFrequencyOfArrayValues(new int[]{1, 2, 3, 4, 5, 2, 4, 7}));
    }

    //primeste un array si o valoare si returneaza  indexul unde se gaseste valoarea aia sau-1 daca nu se gaseste
    public static int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    //primeste un array si o valuare si returneaza true daca gaseste valoarea in array
    public static boolean contains(int[] arr, int value) {
        return indexOf(arr, value) != -1;
    }

    //primeste un array si returneaza true daca e palindrom
    public static boolean palindrome(int[]arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr[arr.length - 1 - i]){
                  return false;
            }
        }
        return true;
    }

    //primeste un array si o valoare si returneaza de cate ori exista valoarea respectiva in array
    public static int countValue(int[]arr, int value) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(value == arr[i]){
                count++;
            }
        }
        return count;
    }

    //primeste 2 arrayuri si retruneaza true daca sunt anagrame
    public static boolean areAnagrams(int[]arr, int[]arr2) {
        if(arr.length != arr2.length){
            return false;
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    //primeste un hashmap si o valoare si returneaza cheia la care se gaseste acea valoare
    public static String indexOf(HashMap<String, Integer> hash, int value) {
        for(String key: hash.keySet()) {
            if(hash.get(key) == value) {
                return key;
            }
        }
        return null;
    }

    //primesti 2 arrayuri si returneaza true daca sunt anagrame - folosind hashmap
    public static boolean areAnagramsHash(int[]arr, int[]arr2) {
        if(arr.length != arr2.length){
            return false;
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        HashMap<Integer, Integer>hash = new HashMap<>();
        for(int i = 0; i<arr.length; i++) {
            hash.put(arr[i], arr2[i]);
        }
        for(int key : hash.keySet()) {
            if(hash.get(key) != key) {
                return false;
            }
        }
        return true;
    }
    //primesti un array de int-uri si intorci un hashmap de int si int unde cheile sunt valorile si valorile sunt de cate ori au aparut
    public static HashMap<Integer, Integer> countFrequencyOfArrayValues(int[]arr) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for (int x : arr) {
            if (count.containsKey(x)) {
                count.put(x, count.get(x) + 1);
            } else {
                count.put(x, 1);
            }
        }
        return count;
    }

    //primesti un array de int-uri si reutrnezi un hashmap de int si array de int - in care cheile sunt valorile si valorile pt fiecare cheie sunt indecsii la care a aparut valoarea respectiva
    public static HashMap<Integer, Integer> x (int[]arr) {
        HashMap<Integer,Integer> count = new HashMap<>();
        for (int x : arr) {
            if (count.containsKey(x)) {
                count.put(x, count.get(x) + 1);
            } else {
                count.put(x, 1);
            }
        }
        return count;
    }


}
