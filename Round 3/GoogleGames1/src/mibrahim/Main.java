package mibrahim;

import javax.swing.tree.TreeNode;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");
        //BigDecimal k = BigDecimal.valueOf(Math.pow(600613,128));
        System.out.println(k);
        //System.out.println(Math.pow(600613,128));

    }
    static long nextPrime(long previous) {
        if (previous < 2L) { return 2L; }
        if (previous == 2L) { return 3L; }
        long next = 0L;
        int increment = 0;
        switch ((int)(previous % 6L)) {
            case 0: next = previous + 1L; increment = 4; break;
            case 1: next = previous + 4L; increment = 2; break;
            case 2: next = previous + 3L; increment = 2; break;
            case 3: next = previous + 2L; increment = 2; break;
            case 4: next = previous + 1L; increment = 2; break;
            case 5: next = previous + 2L; increment = 4; break;
        }
        //while (!isPrime(next)) {
          //  next += increment;
            //increment = 6 - increment;   // 2, 4 alternating
        //}
        return next;
        TreeNode test = new TreeNode;

    }
}
