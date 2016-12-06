import java.math.BigDecimal;
import java.util.Scanner;


/**
 * Created by LunaFlores on 12/6/16.
 */
public class Scan2 {
    public static void main(String[] args) {
        Scanner s = null;
        try {
            s = new Scanner(System.in);

            BigDecimal op1 = null;
            BigDecimal op2 = null;

            while (s.hasNext()) {

                String tmp = s.next();
//                System.out.println(tmp);
                if (tmp.equals("q")){
                    return;
                }
                if (op1 == null) {
                    try {
                        op1 = new BigDecimal(tmp);
                        //System.out.println("op1 " + op1);
                        System.out.println(op1);

                    } catch (NumberFormatException e) {
                        System.out.println("try again");
                    }
                    continue;
                } else if (op2 == null) {
                    try {
                        op2 = new BigDecimal(tmp);
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
                        op1 = op1.add(op2);
//                        System.out.println("after + op1 " + op1);
                        op2 = null;
                        System.out.println(op1);
//                        System.out.println("after + op2 " + op2);
                    } else if (tmp.equals("-")) {
//                        System.out.println("i will substract");
                        op1 = op1.subtract(op2);
//                        System.out.println("after - op1 " + op1);
                        op2 = null;
                        System.out.println(op1);
//                        System.out.println("after - op2 " + op2);
                    } else  if (tmp.equals("*")){
                        op1 = op1.multiply(op2);
                        op2 = null;
                        System.out.println(op1);
                    }else  if (tmp.equals("/")){
                        op1 = op1.divide(op2);
                        op2 = null;
                        System.out.println(op1);
                    } else  if (tmp.equals("min")){
                        op1 = op1.min(op1);
                        op2 = null;
                        System.out.println(op1);
                    } else  if (tmp.equals("max")){
                        op1 = op1.max(op2);
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
