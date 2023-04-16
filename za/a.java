package za.a;
import java.io.File;
import za.b;

public class a	// class@00290b
{

    public static boolean a(File p0){
       File[] uFileArray = p0.listFiles();
       int i = 1;
       if (uFileArray != null) {
          int len = uFileArray.length;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             i = i & a.b(uFileArray[i1]);
          }
       }
       return i;
    }
    public static boolean b(File p0){
       if (p0.isDirectory()) {
          a.a(p0);
       }
       return p0.delete();
    }
    public static void c(File p0,b p1){
       p1.a(p0);
       File[] uFileArray = p0.listFiles();
       if (uFileArray != null) {
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             if (oobject.isDirectory()) {
                a.c(oobject, p1);
             }else {
                p1.b(oobject);
             }
             i = i + 1;
          }
       }
       p1.c(p0);
       return;
    }
}
