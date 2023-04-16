package ab.e;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.String;
import java.lang.IndexOutOfBoundsException;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.util.Objects;
import java.lang.NullPointerException;
import java.lang.IllegalStateException;

public final class e	// class@00003f
{

    public static void a(Boolean p0){
       if (p0 == null || p0.booleanValue()) {
          return;
       }
       throw new IllegalArgumentException();
    }
    public static void b(boolean p0,Object p1){
       if (p0) {
          return;
       }
       throw new IllegalArgumentException(String.valueOf(p1));
    }
    public static int c(int p0,int p1){
       String str;
       if (p0 >= 0 && p0 < p1) {
          return p0;
       }
       int i = 1;
       if (p0 >= 0) {
          if (p1 >= 0) {
             Object[] objArray = new Object[]{"index",Integer.valueOf(p0),Integer.valueOf(p1)};
             str = e.h("%s \(%s\) must be less than size \(%s\)", objArray);
          }else {
             throw new IllegalArgumentException("negative size: "+p1);
          }
       }else {
          Object[] objArray1 = new Object[]{"index",Integer.valueOf(p0)};
          str = e.h("%s \(%s\) must not be negative", objArray1);
       }
       throw new IndexOutOfBoundsException(str);
    }
    public static Object d(Object p0){
       Objects.requireNonNull(p0);
       return p0;
    }
    public static Object e(Object p0,Object p1){
       if (p0 != null) {
          return p0;
       }
       throw new NullPointerException(String.valueOf(p1));
    }
    public static void f(boolean p0){
       if (p0) {
          return;
       }
       throw new IllegalStateException();
    }
    public static void g(boolean p0,Object p1){
       if (p0) {
          return;
       }
       throw new IllegalStateException(String.valueOf(p1));
    }
    public static String h(String p0,Object[] p1){
       p0 = String.valueOf(p0);
       StringBuilder str = new StringBuilder((p0.length() + (p1.length * 16)));
       int i1 = 0;
       for (int i = 0; i < p1.length; i = i4) {
          int i2 = p0.indexOf("%s", i1);
          if (i2 == -1) {
             break ;
          }else {
             i1 = i + 1;
             str = str+p0.substring(i1, i2)+p1[i];
             i = i2 + 2;
             int i4 = i1;
             i1 = i;
          }
       }
       str = str+p0.substring(i1);
       if (i < p1.length) {
          str = str+" ["+p1[i];
          for (int i3 = i + 1; i3 < p1.length; i3 = i) {
             i = i3 + 1;
             str = str+", "+p1[i3];
          }
          str = str+']';
       }
       return str;
    }
}
