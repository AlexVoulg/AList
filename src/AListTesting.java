import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class AListTesting {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //START INIT
        AList listamou = new AList();
//        listamou.add("Ilias");
//        listamou.add("Alex");
//        listamou.add("Java");
        for (int i = 0; i < 1000000; i++){
            String s = Integer.toString(i);
            listamou.add(s);
        }
        listamou.find("999999");
        long end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (end-start));

        start = System.currentTimeMillis();
        ArrayList<String> test = new ArrayList<>();
        for (int i = 0; i < 1000000; i++){
            String s = Integer.toString(i);
            test.add(s);
        }
        test.contains("999999");
        end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (end-start));


        //END INIT

//        TestGetAtIndex(listamou);
//        TestGetIndexOfElement(listamou);


    }

    public static void TestGetAtIndex(AList listamou){
        String result = listamou.get(2);
        System.out.println(result.equals("Java"));
    }

    public static void TestGetIndexOfElement(AList listamou){
        int result = listamou.find("Java");
        System.out.println(result == 2);
        System.out.println(result);
    }

}