package nsd.q;
import nsd.l0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class q extends l0	// class@001ed8
{
    public final char[] d;

    public void q(int p0){
       super(p0);
       char[] uocharArray = new char[p0];
       this.d = uocharArray;
    }
    public int c(Object p0){
       return this.i(p0);
    }
    public final void h(char p0){
       int i = this.b();
       this.e((i + 1));
       this.d[i] = p0;
    }
    public int i(char[] p0){
       a.p(p0, "$this$getSize");
       return p0.length;
    }
    public final char[] j(){
       char[] uocharArray = new char[this.f()];
       return this.g(this.d, uocharArray);
    }
}
