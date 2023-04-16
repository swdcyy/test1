package nsd.m;
import nsd.l0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class m extends l0	// class@001ed1
{
    public final boolean[] d;

    public void m(int p0){
       super(p0);
       boolean[] uobooleanArr = new boolean[p0];
       this.d = uobooleanArr;
    }
    public int c(Object p0){
       return this.i(p0);
    }
    public final void h(boolean p0){
       int i = this.b();
       this.e((i + 1));
       this.d[i] = p0;
    }
    public int i(boolean[] p0){
       a.p(p0, "$this$getSize");
       return p0.length;
    }
    public final boolean[] j(){
       boolean[] uobooleanArr = new boolean[this.f()];
       return this.g(this.d, uobooleanArr);
    }
}
