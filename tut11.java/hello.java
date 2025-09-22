

public class hello {
    public static void main(String[] args) {
        String name  = "Deepak";
        System.out.println(name);

    
        //int value = name.length();
       // System.out.println(value);


       String lString =name.toLowerCase();
       System.out.println(lString);


       String uString =name.toUpperCase();
       System.out.println(uString);


       String nonTrimmedString = "    Deepak   ";
       System.out.println(nonTrimmedString);


       String trimmString = nonTrimmedString.trim();
       System.out.println(nonTrimmedString.trim());


       System.out.println(name.substring(4));

       System.out.println(name.substring(1,5));

       System.out.println(name.replace('k','l'));

       System.out.println(name.replace("ee","iii"));


       System.out.println(name.startsWith("Dee"));

       System.out.println(name.endsWith("ak"));


       System.out.println(name.charAt(4));

       String modifiedName = "Deepakpak";
       System.out.println(modifiedName.indexOf("k"));


       System.out.println(name.indexOf("a"));
       
       System.out.println(name.equals("Deepak"));


       System.out.println(name.equalsIgnoreCase("DeePAk"));


       System.out.println(" I am escape \\ double quote");



    }
    
}
