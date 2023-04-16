package d1.c;
import java.lang.String;
import java.lang.Object;
import d1.c$a;
import java.util.Arrays;

public class c	// class@001dee
{
    public String a;
    public static c b;
    public static String[] c;

    static {
       c.b = new c();
       String[] stringArray = new String[]{"standard","accelerate","decelerate","linear"};
       c.c = stringArray;
    }
    public void c(){
       super();
       this.a = "identity";
    }
    public static c c(String p0){
       if (p0 == null) {
          return null;
       }
       if (p0.startsWith("cubic")) {
          return new c$a(p0);
       }
       int i = -1;
       switch (p0.hashCode()){
           case 0xaf447add:
             if (p0.equals("accelerate")) {
                i = 0;
             }
             break;
           case 0xb4a9ac3c:
             if (p0.equals("decelerate")) {
                i = 1;
             }
             break;
           case 0xbe468f25:
             if (p0.equals("linear")) {
                i = 2;
             }
             break;
           case 0x4e3d1ebd:
             if (p0.equals("standard")) {
                i = 3;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return new c$a("cubic\(0.4, 0.05, 0.8, 0.7\)");
           case 1:
             return new c$a("cubic\(0.0, 0.0, 0.2, 0.95\)");
           case 2:
             return new c$a("cubic\(1, 1, 0, 0\)");
           case 3:
             return new c$a("cubic\(0.4, 0.0, 0.2, 1\)");
           default:
             Arrays.toString(c.c);
             return c.b;
       }
    }
    public double a(double p0){
       return p0;
    }
    public double b(double p0){
       return 0x3ff0000000000000;
    }
    public String toString(){
       return this.a;
    }
}
