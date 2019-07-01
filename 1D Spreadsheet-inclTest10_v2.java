import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

class Solution {

    public static HashMap < Integer, String > operationMap = new HashMap < Integer, String > ();
    public static HashMap < Integer, Integer > numb1Map = new HashMap < Integer, Integer > ();
    public static HashMap < Integer, Integer > numb2Map = new HashMap < Integer, Integer > ();
    public static HashMap < Integer, Integer > ref1Map = new HashMap < Integer, Integer > ();
    public static HashMap < Integer, Integer > ref2Map = new HashMap < Integer, Integer > ();
    public static HashMap < Integer, Integer > resultMap = new HashMap < Integer, Integer > ();
    public static String operation = "";
    public static String arg1 = "";
    public static String arg2 = "";
    public static int res = 0;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in .nextInt();


        
        int done = -1;



        for (int i = 0; i < N; i++) {
            operation = in .next();
            arg1 = in .next();
            arg2 = in .next();

            //Maps befüllen
            operationMap.put(i, operation);
            resultMap.put(i,null);
            if (arg1.indexOf('$') < 0 && arg1.indexOf('_') < 0) {
                numb1Map.put(i, Integer.parseInt(arg1));
            } else if (arg1.indexOf('$') >= 0 && arg1.indexOf('_') < 0) {
                ref1Map.put(i, Integer.parseInt(arg1.replace("$", "")));
            }

            if (arg2.indexOf('$') < 0 && arg2.indexOf('_') < 0) {
                numb2Map.put(i, Integer.parseInt(arg2));
            } else if (arg2.indexOf('$') >= 0 && arg2.indexOf('_') < 0) {
                ref2Map.put(i, Integer.parseInt(arg2.replace("$", "")));
            }
        } 
        
        //while (resultMap.isEmpty()){
        //System.err.println(resultMap.isEmpty());
        while (resultMap.containsValue(null)){
          System.err.println(resultMap.containsValue(null));
        for (int i = 0; i < N; i++) {
            operation = operationMap.get(i);
           // if (numb1Map.get(i) != null && numb2Map.get(i) != null) {
                switch (operation) {
                    case "VALUE":
                        value(i);
                        break;
                    case "ADD":
                        add(i);
                        break;
                    case "SUB":
                        sub(i);
                        break;
                    case "MULT":
                        mult(i);
                        break;
                    }
            }
           // } else if (operation.equals("VALUE") && numb1Map.get(i) != null) {
        //        value(i);
          //  }
        }

        System.err.println(resultMap.isEmpty());
        
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
    
    //methods
    public static int calcMethod(int done) {
        System.err.println(done + " gets processed in calcMethod");
        return done = done + 1;

    }

    public static int value(int done) {
        if (ref1Map.get(done) != null && ref2Map.get(done) == null) {
            try {
                res = resultMap.get(ref1Map.get(done)) + numb2Map.get(done);
                System.err.println("res555 " + res);
                resultMap.put(done, res);
            } catch (Exception e) {
                System.err.println("Nullpointer111");
            }
        } else {
            resultMap.put(done, numb1Map.get(done));
        }
        return res;
    }
    public static int add(int done) {
        if (ref1Map.get(done) != null && ref2Map.get(done) == null) {
            try {
                res = resultMap.get(ref1Map.get(done)) + numb2Map.get(done);
                System.err.println("1 " + res);
                resultMap.put(done, res);
            } catch (Exception e) {
                System.err.println("Nullpointer111");
            }
        } else if (numb1Map.get(done) != null && numb2Map.get(done) != null) {
            res = numb1Map.get(done) + numb2Map.get(done);
            System.err.println("res555 " + res);
            resultMap.put(done, res);
        } else if (ref1Map.get(done) == null && ref2Map.get(done) != null) {
            try {
                res = numb1Map.get(done) + resultMap.get(ref2Map.get(done));
                System.err.println("res555 " + res);
                resultMap.put(done, res);
            } catch (Exception e) {
                System.err.println("Nullpointeraaa");
            }
        } else if (ref1Map.get(done) != null && ref2Map.get(done) != null) {
            try {
                res = resultMap.get(ref1Map.get(done)) + resultMap.get(ref2Map.get(done));
                System.err.println("res555 " + res);
                resultMap.put(done, res);
            } catch (Exception e) {
                System.err.println("Nullpointer");
            }
        }
        return res;
    }
    public static int sub(int done) {
        if (ref1Map.get(done) != null && ref2Map.get(done) == null) {
            try {
                res = resultMap.get(ref1Map.get(done)) - numb2Map.get(done);
                System.err.println("res555 " + res);
                resultMap.put(done, res);
            } catch (Exception e) {
                System.err.println("Nullpointer");
            }
        } else if (numb1Map.get(done) != null && numb2Map.get(done) != null) {
            res = numb1Map.get(done) - numb2Map.get(done);
            System.err.println("res555 " + res);
            resultMap.put(done, res);
        } else if (ref1Map.get(done) == null && ref2Map.get(done) != null) {
            try {
                res = numb1Map.get(done) - resultMap.get(ref2Map.get(done));
                System.err.println("res555 " + res);
                resultMap.put(done, res);
            } catch (Exception e) {
                System.err.println("Nullpointer");
            }
        } else if (ref1Map.get(done) != null && ref2Map.get(done) != null) {
            try {
                res = resultMap.get(ref1Map.get(done)) - resultMap.get(ref2Map.get(done));
                System.err.println("res555 " + res);
                resultMap.put(done, res);
            } catch (Exception e) {
                System.err.println("Nullpointer");
            }
        }
        return res;
    }
    public static int mult(int done) {
        if (ref1Map.get(done) != null && ref2Map.get(done) == null) {
            try {
                res = resultMap.get(ref1Map.get(done)) * numb2Map.get(done);
                System.err.println("1 " + res);
                resultMap.put(done, res);
            } catch (Exception e) {
                System.err.println("Nullpointer");
            }
        } else if (numb1Map.get(done) != null && numb2Map.get(done) != null) {
            res = numb1Map.get(done) * numb2Map.get(done);
            System.err.println("1 " + res);
            resultMap.put(done, res);
        } else if (ref1Map.get(done) == null && ref2Map.get(done) != null) {
            try {
                res = numb1Map.get(done) * resultMap.get(ref2Map.get(done));
                System.err.println("1 " + res);
                resultMap.put(done, res);
            } catch (Exception e) {
                System.err.println("Nullpointer");
            }
        } else if (ref1Map.get(done) != null && ref2Map.get(done) != null) {
            try {
                res = resultMap.get(ref1Map.get(done)) * resultMap.get(ref2Map.get(done));
                System.err.println("1 " + res);
                resultMap.put(done, res);
            } catch (Exception e) {
                System.err.println("Nullpointer");
            }
        }
        return res;
    }
}
