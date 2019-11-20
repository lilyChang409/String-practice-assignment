
public class palindrome
{
     public static void check (String[] args) {
        String a = "Amy, must I jujitsu my ma?";
         System.out.println(palindrome(a));
    }
    public static boolean palindrome(String str) {
        str = str.toLowerCase();
        String new1 = "";
        String back2="";
        for (int i=0;i< str.length();i++) {
            char letter = str.charAt(i);
            if (Character.isLetter(letter))
                new1 += letter;
        }
        for (int j= new1.length()-1; j >=0;j--) {
            char front = new1.charAt(j);
            char back  = new1.charAt(new1.length() - j);
            if (front != back) return false;
        }
        return true;
       
   
}}
