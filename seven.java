public class seven {
    public static void main(String[] args) {


       // precendence & Associatitvity
        int a = 6*5-34/2;
        /* 
        highest precedence goes to * and /. thy are than evaluate on the basis of the 
        basis of left to right associativity
        30-34/2
         * 30-17
         * 13
         */
        System.out.println(a);

        int b = 60/5-34*2;
        /*    12-68
        -56
        */
        System.out.println(b);



       // quick quiz  

       int x = 5;
       int y = 7;
       int k = x * y/2;
       System.out.println(k);

       int b1 = 1;
       int c = 4;
       int a1 = 5;

       int d = b1*b1 - (4*a1*c)/(2*a1);
       System.out.println(d);



    }
    
}