
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class absolute {
   public absolute() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Eneter a number:");
      int var2 = var1.nextInt();
      if (var2 < 0) {
         var2 *= -1;
      }

      System.out.println("Absolute value is:" + var2);
   }
}




