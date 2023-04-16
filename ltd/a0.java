package ltd.a0;
import dsd.c;
import ftd.a;
import kotlin.coroutines.CoroutineContext;
import asd.c;
import java.lang.Object;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import ftd.y;
import ftd.u0;
import java.lang.StackTraceElement;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;

public class a0 extends a implements c	// class@001dfd
{
    public final c e;

    public void a0(CoroutineContext p0,c p1){
       super(p0, true);
       this.e = p1;
    }
    public final boolean E0(){
       return true;
    }
    public void Y(Object p0){
       u0.e(IntrinsicsKt__IntrinsicsJvmKt.d(this.e), y.a(p0, this.e));
    }
    public final c getCallerFrame(){
       return this.e;
    }
    public final StackTraceElement getStackTraceElement(){
       return null;
    }
    public void k1(Object p0){
       a0 te = this.e;
       te.resumeWith(y.a(p0, te));
    }
    public final z1 s1(){
       return this.d.get(z1.p0);
    }
}
