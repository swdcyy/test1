package androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.k;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.NoSuchFieldException;

public class l	// class@00091d
{
    public static final boolean a;

    static {
       l.a = true;
    }
    public static void a(RecyclerView p0){
       if (l.a && p0 != null) {
          try{
             k ok = l.b(p0, "mGapWorker");
             if (ok == null) {
                return;
             }else {
                ok.i(p0);
                l.d(p0, "mGapWorker", null);
             }
          }catch(java.lang.Exception e2){
             e2.printStackTrace();
          }
       }
    }
    public static Object b(Object p0,String p1){
       return l.c(p0, p1);
    }
    public static Object c(Object p0,String p1){
       Class class = p0.getClass();
       Field uField = null;
       while (true) {
          if (uField == null) {
             try{
                uField = class.getDeclaredField(p1);
                uField.setAccessible(true);
             }catch(java.lang.NoSuchFieldException e0){
                class = e0.getSuperclass();
             }
          }else {
             uField.setAccessible(true);
             return uField.get(p0);
          }
       }
       throw new NoSuchFieldException();
    }
    public static void d(Object p0,String p1,Object p2){
       l.e(p0, p1, null);
    }
    public static void e(Object p0,String p1,Object p2){
       Class class = p0.getClass();
       Field uField = null;
       while (true) {
          if (uField == null) {
             try{
                uField = class.getDeclaredField(p1);
             }catch(java.lang.NoSuchFieldException e0){
                class = e0.getSuperclass();
             }
          }else {
             uField.setAccessible(true);
             uField.set(p0, p2);
             return;
          }
       }
       throw new NoSuchFieldException();
    }
    public static RuntimeException f(Throwable p0){
       if (p0 instanceof RuntimeException) {
          return p0;
       }
       return new RuntimeException(p0);
    }
}
