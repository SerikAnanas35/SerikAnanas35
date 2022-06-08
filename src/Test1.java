public class Test1 {
        static String text = "123.3456";

    public static void main (String[] args)
        {
            ;
            System.out.println (convert());
        }

        static Double convert(String s){
        double value = Double.parseDouble (s);
        double var = Double.valueOf(String.format("%.2f",value));
        return convert();
        }


}