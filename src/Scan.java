import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
import java.lang.Integer;


/**
 * Created by LunaFlores on 12/6/16.
 */
public class Scan {
    public static void main(String[] args) {
        Scanner s = null;
        try {
            s = new Scanner(System.in);

            Double op1 = null;
            Double op2 = null;

            while (s.hasNext()) {

                String tmp = s.next();
//                System.out.println(tmp);
                if (tmp.equals("q")){
                    return;
                }
                if (op1 == null) {
                    try {
                        op1 = Double.parseDouble(tmp);
                        //System.out.println("op1 " + op1);
                        System.out.println(op1);

                    } catch (NumberFormatException e) {
                        System.out.println("try again");
                    }
                    continue;
                } else if (op2 == null) {
                    try {
                        op2 = Double.parseDouble(tmp);
                        //System.out.println("op2 " + op2);
                        System.out.println(op1 + " " + op2);

                    } catch (NumberFormatException e) {
                        System.out.println("try again");
                    }
                    continue;
                }

                if (op1 != null && op2 != null) {

                    if (tmp.equals("+")) {
//                        System.out.println("i will add");
                        op1 = op1 + op2;
//                        System.out.println("after + op1 " + op1);
                        op2 = null;
                        System.out.println(op1);
//                        System.out.println("after + op2 " + op2);
                    } else if (tmp.equals("-")) {
//                        System.out.println("i will substract");
                        op1 = op1 - op2;
//                        System.out.println("after - op1 " + op1);
                        op2 = null;
                        System.out.println(op1);
//                        System.out.println("after - op2 " + op2);
                    } else  if (tmp.equals("*")){
                        op1 = op1 * op2;
                        op2 = null;
                        System.out.println(op1);
                    }else  if (tmp.equals("/")){
                        op1 = op1 / op2;
                        op2 = null;
                        System.out.println(op1);
                    } else {
                        System.out.println("try again");
                    }
                }

            }
        } finally {
            if (s != null) {
                s.close();
            }
        }

    }


}
