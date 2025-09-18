public class eight {
    public static void main(String[] args) {


        /* 
         * R =  b+s = int          b = byte
         * R =  s+i = int          s = short
         * R =  l+f = float        i = integer
         * R =  i+f = float        l = long
         * R =  c+i = int          f = float
         * R =  c+s = int          d = double
         * R =  l+d = double       c = charecter
         * R =  f+d = double
         */


        byte x = 5;
        int y = 10;
        short z = 8;
        //long l = 50;
       // double d = 5.455;
       // char h = 'r';
      //  int a1 = z + y;
       // System.out.println(a1);
        int a = y+z;
        float b = 9.54f + x;
        System.out.println(a);
        System.out.println(b);


        //increment ane decrement operators

        int i  =60;

        // int b = i++;   // first b is assigned i (60) then i is increment
        // int b = ++i;   // first b is incement then b isasigned i (61)

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        // int c = n--;  // first c is assigned n (90) then n is decement
        // int c = --n;  // first c is decrement then c issigned n (89) 


        int n =90;
        System.out.println(n--);
        System.out.println(n);
        System.out.println(--n);
        System.out.println(n);


        //Quick Quig : 

        int t = 10;
        int p = ++t * 50;
        System.out.println(p);



    char ch = 'q';
    System.out.println(++ch);
        

    
    }
    
}
