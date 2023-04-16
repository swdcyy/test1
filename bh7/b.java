package bh7.b;
import bh7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class b	// class@000410
{
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final byte[] e;
    public final a f;
    public final long g;

    public void b(a p0,long p1){
       a.q(p0, "mElfFile");
       super();
       this.f = p0;
       this.g = p1;
       p0.f(p1);
       int i = p0.d();
       this.a = i;
       int i1 = p0.d();
       this.b = i1;
       this.c = p0.d();
       byte[] uobyteArray = new byte[i];
       this.d = uobyteArray;
       byte[] uobyteArray1 = new byte[i1];
       this.e = uobyteArray1;
       p0.g((p0.a(uobyteArray) % 4));
       p0.a(uobyteArray1);
    }
}
