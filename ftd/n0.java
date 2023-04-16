package ftd.n0;
import java.lang.String;
import ltd.g0;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import msd.a;

public final class n0	// class@000eac
{
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    public static final AtomicLong d;

    static {
       boolean b1;
       String str = g0.d("kotlinx.coroutines.debug");
       boolean b = true;
       if (str == null) {
       }else {
          int i = str.hashCode();
          if (i) {
             if (i != 3551) {
                if (i != 0x1ad6f) {
                   if (i != 0x2dddaf || !str.equals("auto")) {
                   }
                }else if(str.equals("off")){
                }
             }else if(str.equals("on")){
             label_0043 :
                b1 = true;
             label_0044 :
                n0.b = b1;
                if (!b1 || !g0.e("kotlinx.coroutines.stacktrace.recovery", b)) {
                   b = false;
                }
                n0.c = b;
                n0.d = new AtomicLong(0);
             }else {
             }
          }else if(str.equals("")){
             goto label_0043 ;
          }else {
          }
       }
       b1 = false;
       goto label_0044 ;
    }
    public static final void a(a p0){
    }
    public static final boolean b(){
       return n0.a;
    }
    public static final AtomicLong c(){
       return n0.d;
    }
    public static final boolean d(){
       return n0.b;
    }
    public static final boolean e(){
       return n0.c;
    }
    public static final void f(){
       n0.d.set(0);
    }
}
