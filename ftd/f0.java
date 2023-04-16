package ftd.f0;
import java.lang.String;
import ltd.g0;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import kotlinx.coroutines.CoroutineDispatcher;
import ntd.c;
import ftd.t;
import kotlin.coroutines.CoroutineContext;
import ftd.k0;
import ftd.z0;
import asd.d;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import msd.a;
import kotlinx.coroutines.internal.ThreadContextKt;
import nsd.c0;

public final class f0	// class@00163d
{
    public static final boolean a;

    static {
       boolean b;
       String str = g0.d("kotlinx.coroutines.scheduler");
       if (str == null) {
       }else {
          int i = str.hashCode();
          if (i) {
             if (i != 3551) {
                if (i == 0x1ad6f && str.equals("off")) {
                   b = false;
                label_0034 :
                   f0.a = b;
                }
             }else if(str.equals("on")){
             }
          }else if(str.equals("")){
          }
       }
       b = true;
       goto label_0034 ;
    }
    public static final CoroutineDispatcher a(){
       c j = (f0.a)? c.j: t.f;
       return j;
    }
    public static final String b(CoroutineContext p0){
       return null;
    }
    public static final boolean c(){
       return f0.a;
    }
    public static final CoroutineContext d(k0 p0,CoroutineContext p1){
       CoroutineContext uCoroutineCo = p0.getCoroutineContext().plus(p1);
       if (uCoroutineCo != z0.e() && uCoroutineCo.get(d.b0) == null) {
          uCoroutineCo = uCoroutineCo.plus(z0.e());
       }
       return uCoroutineCo;
    }
    public static final Object e(CoroutineContext p0,Object p1,a p2){
       c0.d(1);
       ThreadContextKt.a(p0, ThreadContextKt.c(p0, p1));
       c0.c(1);
       return p2.invoke();
    }
}
