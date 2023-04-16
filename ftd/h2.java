package ftd.h2;
import kotlinx.coroutines.DeferredCoroutine;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import java.lang.Object;
import asd.c;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import mtd.a;

public final class h2 extends DeferredCoroutine	// class@000e91
{
    public final c e;

    public void h2(CoroutineContext p0,p p1){
       super(p0, false);
       this.e = IntrinsicsKt__IntrinsicsJvmKt.c(p1, this, this);
    }
    public void p1(){
       a.b(this.e, this);
    }
}
