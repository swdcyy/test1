package isd.b;
import java.io.Closeable;
import java.lang.Throwable;
import qrd.i;
import msd.l;
import java.lang.Object;
import nsd.c0;
import fsd.l;

public final class b	// class@001981
{

    public static final void a(Closeable p0,Throwable p1){
       if (p0 == null) {
       }else if(p1 == null){
          p0.close();
       }else {
          p0.close();
       }
       return;
    }
    public static final Object b(Closeable p0,l p1){
       p1 = p1.invoke(p0);
       c0.d(1);
       if (l.a(1, 1, 0)) {
          b.a(p0, null);
       }else if(p0 == null){
          p0.close();
       }
       c0.c(1);
       return p1;
    }
}
