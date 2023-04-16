package nsd.e0;
import nsd.l0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class e0 extends l0	// class@001ec0
{
    public final int[] d;

    public void e0(int p0){
       super(p0);
       int[] ointArray = new int[p0];
       this.d = ointArray;
    }
    public int c(Object p0){
       return this.i(p0);
    }
    public final void h(int p0){
       int i = this.b();
       this.e((i + 1));
       this.d[i] = p0;
    }
    public int i(int[] p0){
       a.p(p0, "$this$getSize");
       return p0.length;
    }
    public final int[] j(){
       int[] ointArray = new int[this.f()];
       return this.g(this.d, ointArray);
    }
}
