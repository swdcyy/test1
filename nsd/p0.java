package nsd.p0;
import nsd.l0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class p0 extends l0	// class@001ed5
{
    public final short[] d;

    public void p0(int p0){
       super(p0);
       short[] oshortArray = new short[p0];
       this.d = oshortArray;
    }
    public int c(Object p0){
       return this.i(p0);
    }
    public final void h(short p0){
       int i = this.b();
       this.e((i + 1));
       this.d[i] = p0;
    }
    public int i(short[] p0){
       a.p(p0, "$this$getSize");
       return p0.length;
    }
    public final short[] j(){
       short[] oshortArray = new short[this.f()];
       return this.g(this.d, oshortArray);
    }
}
