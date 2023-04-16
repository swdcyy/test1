package htd.s;
import otd.e;
import htd.d;
import kotlin.coroutines.CoroutineContext;
import htd.l;
import msd.p;
import java.lang.Object;
import asd.c;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import otd.f;
import kotlinx.coroutines.JobSupport;
import htd.m;
import java.lang.Throwable;
import csd.b;
import qrd.l1;
import mtd.a;

public final class s extends d implements e	// class@000fe0
{
    public c f;

    public void s(CoroutineContext p0,l p1,p p2){
       super(p0, p1, false);
       this.f = IntrinsicsKt__IntrinsicsJvmKt.c(p2, this, this);
    }
    public void D(f p0,Object p1,p p2){
       this.start();
       super.f().D(p0, p1, p2);
    }
    public boolean T(Throwable p0){
       this.start();
       return super.T(p0);
    }
    public e f(){
       return this;
    }
    public Object l(Object p0,c p1){
       this.start();
       p0 = super.l(p0, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public boolean offer(Object p0){
       this.start();
       return super.offer(p0);
    }
    public void p1(){
       a.b(this.f, this);
    }
}
