// Simple Java program to print all
// permutations of a String that
// follow given constraint
//import java.util.*;
import java.util.*;  
import java.lang.*;  
import java.util.Scanner;
import java.util.Random;
 
class Main{

static void permute(char[] str, int l, int r)


{
     
    // Check if current permutation is
    // valid
    //String[] strArray = {"Delhi", "Mumbai", "Kolkata", "Chennai"};
     List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(15);
        li.add(20);
        //li.add("abc");
        System.out.println(li);
        
    String str1="migokpclbwehazdfuvxyqrjstn";
    char Index0 = str1.charAt(0); //value at index 0 is m
    char Index1 = str1.charAt(1) ; //value at Index 1 is i
    char Index2 = str1.charAt(2); //value at Index 2 is g
    char Index3 =str1.charAt(3); //value at Index 3 is o
    char Index4 = str1.charAt(4); //value at Index 4 is k
    char Index5 = str1.charAt(5); //value at Index 5 is p
    char Index6 = str1.charAt(6); //value at Index 6 is c
    char Index7 = str1.charAt(7); //value at Index 7 is l
    char Index8 = str1.charAt(8); //value at Index 8 is b
    char Index9 = str1.charAt(9); //value at Index 9 is w 
    char Index10 = str1.charAt(10); //value at Index 10 is e
    char Index11 = str1.charAt(11); //value at INdex 11 is h
    char Index12 = str1.charAt(12); //value at Index 12 is a
    char Index13 = str1.charAt(13); // value at Index 13 is z
    char Index14 = str1.charAt(14); //value at Index 14 is d
    char Index15 = str1.charAt(15); // value at Index 15 is f
    char Index16 = str1.charAt(16); //value at Index 16 is u
    char Index17 = str1.charAt(17); //value at Index 17 is v
    char Index18 = str1.charAt(18); //value at Index 18 is r
    char Index19 = str1.charAt(19); //value at Index 19 is q
    char Index20 = str1.charAt(20); //value at Index 20 is x
    char Index21 = str1.charAt(21); //value at Index 21 is y
    char Index22 = str1.charAt(22); //value at Index 22 is j
    char Index23 = str1.charAt(23); //value at Index 23 is s
    char Index24 = str1.charAt(24); //value at Index 24 is t
    char Index25 = str1.charAt(25); //value at Index 25 is n
    if (l == r)
      //String[] strArray = { String.valueOf(str) +"," };
       if (!String.valueOf(str).contains("migokpclbwehazdfuvxyqrjstn")) {
            //List<String> li2 = new ArrayList<>();
           //li2.add(String.valueOf(str));
            
        if (!String.valueOf(str).contains("migokpclbwehazdfuvxyqrjstn")){
               System.out.println("migokpclbwehazdfuvxyqrjstn");
               System.out.println(Index12 +" " + Index7 +" " + Index12 +" " + Index25);
            
        }
        if (String.valueOf(str).contains("!£")) { System.out.println("sorry string does not match");}
               //System.out,prinln()
           // li2.add("abcdfg");
            //System.out.println(li2);
            //System.out.println(String.valueOf(str));
             String strArray = String.valueOf(str);
        
        //System.out.println(strArray)
           System.out.print("The values permuted are give by" +" " + String.valueOf(str) + " ");
           //System.out.println("[" + strArray+ "]");
           //String[] strArray1 =strArray;
           //System.out.println(strArray1);
        
            
            //String thing=String.valueOf(str);
           // System.out.println(thing);
            
        return;
    }
 
    // Recursively generate all permutation
    for(int j = l; j <= r; j++)
    {
        char tmp = str[l];
        str[l] = str[j];
        str[j] = tmp;
         
        permute(str, l + 1, r);
         
        tmp = str[l];
        str[l] = str[j];
        str[j] = tmp;
    }
}
 
// Driver Code
public static void main(String[] args)
{
    //String str = "abcdefghij";
     Scanner scanner = new Scanner(System.in);
     System.out.println("Plase enter charaters from a-z ie adcsdcd?");
     
     String str=scanner.nextLine();
    
    permute(str.toCharArray(), 0,
            str.length() - 1);
            
   
            
  scanner.close();
}
}
 
// This code is contributed by Amit Katiyar
