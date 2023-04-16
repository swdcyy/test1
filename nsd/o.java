package nsd.o;
import nsd.l0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class o extends l0	// class@001ed4
{
    public final byte[] d;

    public void o(int p0){
       super(p0);
       byte[] uobyteArray = new byte[p0];
       this.d = uobyteArray;
    }
    public int c(Object p0){
       return this.i(p0);
    }
    public final void h(byte p0){
       int i = this.b();
       this.e((i + 1));
       this.d[i] = p0;
    }
    public int i(byte[] p0){
       a.p(p0, "$this$getSize");
       return p0.length;
    }
    public final byte[] j(){
       byte[] uobyteArray = new byte[this.f()];
       return this.g(this.d, uobyteArray);
    }
}
