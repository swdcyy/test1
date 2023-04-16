package nsd.z;
import nsd.l0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class z extends l0	// class@001ee6
{
    public final float[] d;

    public void z(int p0){
       super(p0);
       float[] uofloatArray = new float[p0];
       this.d = uofloatArray;
    }
    public int c(Object p0){
       return this.i(p0);
    }
    public final void h(float p0){
       int i = this.b();
       this.e((i + 1));
       this.d[i] = p0;
    }
    public int i(float[] p0){
       a.p(p0, "$this$getSize");
       return p0.length;
    }
    public final float[] j(){
       float[] uofloatArray = new float[this.f()];
       return this.g(this.d, uofloatArray);
    }
}
