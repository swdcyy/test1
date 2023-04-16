package htd.y$a;
import htd.y;
import java.util.concurrent.CancellationException;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.Throwable;

public final class y$a	// class@000fe6
{

    public static void a(y p0){
       p0.b(null);
    }
    public static void b(y p0,CancellationException p1,int p2,Object p3){
       if (p3 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
       }
       if (p2 & 0x01) {
          p1 = null;
       }
       p0.b(p1);
       return;
    }
    public static boolean c(y p0,Throwable p1,int p2,Object p3){
       if (p3 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
       }
       if (p2 & 0x01) {
          p1 = null;
       }
       return p0.a(p1);
    }
    public static void d(){
    }
    public static void e(){
    }
    public static void f(){
    }
    public static void g(){
    }
}
