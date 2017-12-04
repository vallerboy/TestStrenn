import java.util.ArrayList;

import static java.util.Collections.sort;

public class TestInit {

   public void cos(byte o){
       System.out.println("byte");
   }

   public void cos(Object o){
       System.out.println("Object");
   }

//   public void cos(float o){
//       System.out.println("float " + o );
//   }

//    public void cos(double o){
//        System.out.println("double " + o );
//    }

    public static void main(String[] args) {


        TestInit testInit = new TestInit();
        testInit.cos("asd");
        testInit.cos(true);
        testInit.cos(123);
        testInit.cos(188888888885888888L); //Object
        testInit.cos((byte)1); // byte
        testInit.cos(12f); // float
        testInit.cos(100.0); // object
    }
}
