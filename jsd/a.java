package jsd.a;
import java.lang.AutoCloseable;
import java.lang.Throwable;
import qrd.i;
import msd.l;
import java.lang.Object;
import nsd.c0;

public final class a	// class@001731
{

    public static final void a(AutoCloseable p0,Throwable p1){
       if (p0 == null) {
       }else if(p1 == null){
          p0.close();
       }else {
          p0.close();
       }
       return;
    }
    public static final Object b(AutoCloseable p0,l p1){
       c0.d(1);
       a.a(p0, null);
       c0.c(1);
       return p1.invoke(p0);
    }
}
