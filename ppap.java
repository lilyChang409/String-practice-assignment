
public class ppap
{
     public static void main (String[] args) {
        ppap("I have a pen, I have a apple.");
        ppap("I have a craft, I have a star.");
        ppap("I have a scholar, I have a AP.");
    }

    public static void ppap(String str) {
        
        String fi  = str.substring(9,str.indexOf(","));
        String second = str.substring(str.lastIndexOf(" ")+1,str.length()-1);
        second = second.substring(0,1).toUpperCase() + second.substring(1);
        System.out.println("Uh, " + second + " " + fi);
    }
}
