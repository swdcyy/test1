package htd.i$a;
import htd.i;
import java.util.concurrent.CancellationException;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.Throwable;

public final class i$a	// class@000fcd
{

    public static void a(i p0,CancellationException p1,int p2,Object p3){
       if (p3 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
       }
       if (p2 & 0x01) {
          p1 = null;
       }
       p0.b(p1);
       return;
    }
    public static boolean b(i p0,Throwable p1,int p2,Object p3){
       if (p3 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
       }
       if (p2 & 0x01) {
          p1 = null;
       }
       return p0.a(p1);
    }
}
