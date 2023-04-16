package nsd.w;
import nsd.l0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class w extends l0	// class@001ee3
{
    public final double[] d;

    public void w(int p0){
       super(p0);
       double[] uodoubleArra = new double[p0];
       this.d = uodoubleArra;
    }
    public int c(Object p0){
       return this.i(p0);
    }
    public final void h(double p0){
       int i = this.b();
       this.e((i + 1));
       this.d[i] = p0;
    }
    public int i(double[] p0){
       a.p(p0, "$this$getSize");
       return p0.length;
    }
    public final double[] j(){
       double[] uodoubleArra = new double[this.f()];
       return this.g(this.d, uodoubleArra);
    }
}
