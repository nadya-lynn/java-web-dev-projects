import java.util.HashMap;
import java.util.Map;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap countCharMap = new HashMap();


        char[] strArray = myString.toCharArray();

        for (char c : strArray) {
            if(countCharMap.containsKey(c)) {
                countCharMap.put(c, Integer> countCharMap.get(c) + 1);
            }
            else {
                countCharMap.put(c, 1);
            }
        }

        for (Map.Entry entry : countCharMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



    }
}