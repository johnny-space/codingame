import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        HashMap<Integer, String> operationMap = new HashMap<Integer, String>();
        HashMap<Integer, Integer> numb1Map = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> numb2Map = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> ref1Map = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> ref2Map = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
        String operation = "";
        String arg1 = "";
        String arg2 = "";
        int res = 0;
        
        for (int i = 0; i < N; i++) {
            operation = in.next();
            arg1 = in.next();
            arg2 = in.next();
            
            //Maps befüllen
            operationMap.put(i,operation);
            
            if (arg1.indexOf('$') < 0 && arg1.indexOf('_') < 0) {
                numb1Map.put(i,Integer.parseInt(arg1));
            } else if (arg1.indexOf('$') >= 0 && arg1.indexOf('_') < 0) {
                ref1Map.put(i,Integer.parseInt(arg1.replace("$", "")));
            }
            
            if (arg2.indexOf('$') < 0 && arg2.indexOf('_') < 0) {
                numb2Map.put(i,Integer.parseInt(arg2));
            } else if (arg2.indexOf('$') >= 0 && arg2.indexOf('_') < 0) {
                ref2Map.put(i,Integer.parseInt(arg2.replace("$", "")));
            }
        }
        
        //Rechnen - mit Referenz
        int k = 0;
        while ( k <400){
        for (int i = 0; i < N; i++) {
            operation = operationMap.get(i);
            switch (operation){
                case "VALUE":
                    if (ref1Map.get(i) != null && ref2Map.get(i) == null) {
                        try {
                            res = resultMap.get(ref1Map.get(i)) + numb2Map.get(i);
                            System.err.println("res555 " + res);
                            resultMap.put(i,res);
                        } catch (Exception e) {
                            System.err.println("Nullpointer111");
                        } 
                    } else {
                            resultMap.put(i,numb1Map.get(i));
                    }
                case "ADD":
                    if (ref1Map.get(i) != null && ref2Map.get(i) == null) {
                        try {
                            res = resultMap.get(ref1Map.get(i)) + numb2Map.get(i);
                            System.err.println("res555 " + res);
                            resultMap.put(i,res);
                        } catch (Exception e) {
                            System.err.println("Nullpointer111");
                        }
                    } else if (numb1Map.get(i) != null && numb2Map.get(i) != null) {
                        res = numb1Map.get(i) + numb2Map.get(i);
                        System.err.println("res555 " + res);
                        resultMap.put(i,res);
                    } else if (ref1Map.get(i) == null && ref2Map.get(i) != null) {
                        try {
                            res = numb1Map.get(i) + resultMap.get(ref2Map.get(i));
                            System.err.println("res555 " + res);
                            resultMap.put(i,res);
                        } catch (Exception e) {
                            System.err.println("Nullpointeraaa");
                        }
                    } else if (ref1Map.get(i) != null && ref2Map.get(i) != null){
                        try {
                            res = resultMap.get(ref1Map.get(i)) + resultMap.get(ref2Map.get(i));
                            System.err.println("res555 " + res);
                            resultMap.put(i,res);
                        } catch (Exception e) {
                            System.err.println("Nullpointer");
                        }
                    }
                    break;
                case "SUB":
                    if (ref1Map.get(i) != null && ref2Map.get(i) == null) {
                        try {
                            res = resultMap.get(ref1Map.get(i)) - numb2Map.get(i);
                            System.err.println("res555 " + res);
                            resultMap.put(i,res);
                        } catch (Exception e) {
                            System.err.println("Nullpointer");
                        }
                    } else if (numb1Map.get(i) != null && numb2Map.get(i) != null) {
                        res = numb1Map.get(i) - numb2Map.get(i);
                        System.err.println("res555 " + res);
                        resultMap.put(i,res);
                    } else if (ref1Map.get(i) == null && ref2Map.get(i) != null) {
                        try {
                            res = numb1Map.get(i) - resultMap.get(ref2Map.get(i));
                            System.err.println("res555 " + res);
                            resultMap.put(i,res);
                        } catch (Exception e) {
                            System.err.println("Nullpointer");
                        }
                    } else if (ref1Map.get(i) != null && ref2Map.get(i) != null){
                        try {
                            res = resultMap.get(ref1Map.get(i)) - resultMap.get(ref2Map.get(i));
                            System.err.println("res555 " + res);
                            resultMap.put(i,res);
                        } catch (Exception e) {
                            System.err.println("Nullpointer");
                        }
                    }
                    break;
                case "MULT":
                    if (ref1Map.get(i) != null && ref2Map.get(i) == null) {
                        try {
                            res = resultMap.get(ref1Map.get(i)) * numb2Map.get(i);
                            System.err.println("res555 " + res);
                            resultMap.put(i,res);
                        } catch (Exception e) {
                            System.err.println("Nullpointer");
                        }
                    } else if (numb1Map.get(i) != null && numb2Map.get(i) != null) {
                        res = numb1Map.get(i) * numb2Map.get(i);
                        System.err.println("res555 " + res);
                        resultMap.put(i,res);
                    } else if (ref1Map.get(i) == null && ref2Map.get(i) != null) {
                        try {
                            res = numb1Map.get(i) * resultMap.get(ref2Map.get(i));
                            System.err.println("res555 " + res);
                            resultMap.put(i,res);
                        } catch (Exception e) {
                            System.err.println("Nullpointer");
                        }
                    } else if (ref1Map.get(i) != null && ref2Map.get(i) != null){
                        try {
                            res = resultMap.get(ref1Map.get(i)) * resultMap.get(ref2Map.get(i));
                            System.err.println("res555 " + res);
                            resultMap.put(i,res);
                        } catch (Exception e) {
                            System.err.println("Nullpointer");
                        }
                    }
                    break;
            }
        }
        k++;}

        for (int i = 0; i < N; i++) {

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(resultMap.get(i));
            System.err.println("i " + i);
            System.err.println("operationMap " + operationMap.get(i));
            System.err.println("numb1Map " + numb1Map.get(i));
            System.err.println("numb2Map " + numb2Map.get(i));
            System.err.println("ref1Map " + ref1Map.get(i));
            System.err.println("ref2Map " + ref2Map.get(i));
            System.err.println("#####################");
        }
    }
}
