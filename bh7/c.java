package bh7.c;
import bh7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import zsd.d;
import java.nio.charset.Charset;

public final class c	// class@000413
{
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final int h;
    public final long i;
    public final long j;
    public final a k;
    public final long l;

    public void c(a p0,long p1){
       a.q(p0, "mElfFile");
       super();
       this.k = p0;
       this.l = p1;
       p0.f(p1);
       this.a = p0.d();
       this.b = p0.d();
       this.c = p0.c();
       this.d = p0.c();
       this.e = p0.c();
       this.f = p0.c();
       this.g = p0.d();
       this.h = p0.d();
       this.i = p0.c();
       this.j = p0.c();
    }
    public final String a(){
       if (this.a == null) {
          return null;
       }
       c tk = this.k;
       tk = tk.r.get(tk.q);
       this.k.f(tk.e);
       this.k.g(this.a);
       byte[] uobyteArray = new byte[(int)tk.f];
       byte b = this.k.b();
       int i = 0;
       while (b != (byte)0) {
          int i1 = i + 1;
          uobyteArray[i] = b;
          b = this.k.b();
          i = i1;
       }
       return new String(uobyteArray, 0, i, d.a);
    }
}
