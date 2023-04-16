package nsd.i0;
import nsd.l0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class i0 extends l0	// class@001ec8
{
    public final long[] d;

    public void i0(int p0){
       super(p0);
       long[] olongArray = new long[p0];
       this.d = olongArray;
    }
    public int c(Object p0){
       return this.i(p0);
    }
    public final void h(long p0){
       int i = this.b();
       this.e((i + 1));
       this.d[i] = p0;
    }
    public int i(long[] p0){
       a.p(p0, "$this$getSize");
       return p0.length;
    }
    public final long[] j(){
       long[] olongArray = new long[this.f()];
       return this.g(this.d, olongArray);
    }
}
