package nc.b;
import java.lang.String;
import java.lang.Object;
import ab.e;
import java.lang.RuntimeException;
import java.lang.Throwable;

public class b	// class@001f28
{

    public static byte[] a(String p0){
       try{
          e.d(p0);
          return p0.getBytes("ASCII");
       }catch(java.io.UnsupportedEncodingException e2){
          throw new RuntimeException("ASCII not found!", e2);
       }
    }
    public static boolean b(byte[] p0,byte[] p1,int p2){
       e.d(p0);
       e.d(p1);
       if ((p1.length + p2) > p0.length) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p1.length) {
             return true;
          }
          int i1 = p2 + i;
          if (p0[i1] != p1[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static boolean c(byte[] p0,byte[] p1){
       return b.b(p0, p1, 0);
    }
}
