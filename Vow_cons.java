package vow_cons;
import java.util.*;
public class Vow_cons {
    
    static String str;
    
    public static void vowelcons(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        int space = 0;
        int len = str.length();
        int len2;
        int vowels = 0; int consonants = 0;
        int flag = 0;
        String word2 = "";
        String word = "";
        
        if(str.charAt(len-1) == '.' || str.charAt(len-1) == '?'){
            System.out.println("Word             Vowels       Consonants");
            int i = 0, ind=0;
            str = str.substring(0,len-1) + " ";
            
            do {  
                
                ind = str.indexOf(" ");
                word = str.substring(0, ind);
                System.out.println("str: " + str + " " + ind);
                str = str.substring(ind+1);                 
                len2 = word.length();
                    for(int j = 0; j < len2; j++){
                        if(word.charAt(j) == 'a' || word.charAt(j) == 'e'|| word.charAt(j)== 'i'|| word.charAt(j) == 'o'|| word.charAt(j) == 'u')
                        {
                         vowels++;   
                        }
                        else{
                         consonants++;   
                        }
                        }

                    char s = Character.toUpperCase(word.charAt(0));
                    // creating output by adding upper case letter and rest of substring of original word
                    word2 =  s + word.substring(1);
                    
                    // if len of word is < 20 char filling it with spaces
                    if (len2 < 20) {
                        for (int c=len2; c<20; c++) word2 = word2 + " ";
                    }
                    
                    word2 = word2 + " " + String.valueOf(vowels) + "            " + String.valueOf(consonants); 
                    System.out.println(word2);   
                    
            vowels = 0;
            consonants = 0;
            }
        while(ind < str.length() );
        }
            else{
           System.out.println("SENTENCE DOES NOT END WITH '.' NOR '?'. TRY AGAIN");
        }
    }
    
    public static void main(String[] args) {
     
        Vow_cons ob = new Vow_cons();
        ob.vowelcons();
               
    }
    
}
