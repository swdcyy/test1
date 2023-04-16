package ftd.e3;
import java.lang.ThreadLocal;
import java.lang.Object;
import ftd.d3;
import ltd.j0;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import ltd.k0;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import java.lang.Boolean;
import dsd.a;
import qrd.l1;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalStateException;
import nsd.c0;

public final class e3	// class@000e83
{

    public static final d3 a(ThreadLocal p0,Object p1){
       return new j0(p1, p0);
    }
    public static d3 b(ThreadLocal p0,Object p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = p0.get();
       }
       return e3.a(p0, p1);
    }
    public static final Object c(ThreadLocal p0,c p1){
       boolean b = (p1.getContext().get(new k0(p0)) != null)? true: false;
       if (a.a(b).booleanValue()) {
          return l1.a;
       }else {
          throw new IllegalStateException("ThreadLocal "+p0+" is missing from context "+p1.getContext().toString());
       }
    }
    public static final Object d(ThreadLocal p0,c p1){
       c0.e(3);
       throw null;
    }
    public static final Object e(ThreadLocal p0,c p1){
       boolean b = (p1.getContext().get(new k0(p0)) != null)? true: false;
       return a.a(b);
    }
    public static final Object f(ThreadLocal p0,c p1){
       c0.e(3);
       throw null;
    }
}
