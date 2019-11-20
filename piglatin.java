
public class piglatin
{
    public static void pig(String str){
        String new1="";
        if(str.length()<2){
           System.out.println(str);
        }

        while(str.length()>0){
            if(str.indexOf(" ")<0){
            new1=str.substring(1)+str.substring(0,1)+"ay";  
            str="";
        }else{
         new1=str.substring(1)+str.substring(0,1)+"ay";
         str=str.substring(str.indexOf(" ")+1);
        }
        }
        System.out.println(new1);
    }
    
    public static void phrases(String arg[]){
        pig("I love starcraft");
        
    }
}
