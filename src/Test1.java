public class Test1 {
        static String text = "123.3456";

    public static void main (String[] args)
        {
            Double myNumber = convert(text);
            System.out.println (myNumber);
        }

        static Double convert(String s){
        double var = Double.parseDouble (s);
        System.out.println ();
        return var;
        }


}