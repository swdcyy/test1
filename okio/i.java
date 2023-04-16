package okio.i;
import okio.m;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import cud.j;
import java.util.zip.Deflater;
import okio.e;
import okio.c;
import java.util.zip.CRC32;
import okio.b;
import okio.o;
import cud.l;
import java.lang.Math;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;

public final class i implements m	// class@001ffa
{
    public final j b;
    public final Deflater c;
    public final e d;
    public boolean e;
    public final CRC32 f;

    public void i(m p0){
       a.q(p0, "sink");
       super();
       j oj = new j(p0);
       this.b = oj;
       Deflater uDeflater = new Deflater(-1, true);
       this.c = uDeflater;
       this.d = new e(oj, uDeflater);
       this.f = new CRC32();
       j b = oj.b;
       b.K(8075);
       b.y(8);
       b.y(0);
       b.C(0);
       b.y(0);
       b.y(0);
    }
    public void close(){
       if (this.e != null) {
          return;
       }
       this.d.c();
       this.b.writeIntLe((int)this.f.getValue());
       this.b.writeIntLe((int)this.c.getBytesRead());
       this.c.end();
       this.b.close();
       this.e = true;
       if (!null) {
          return;
       }
       throw null;
    }
    public void flush(){
       this.d.flush();
    }
    public o timeout(){
       return this.b.timeout();
    }
    public void write(b p0,long p1){
       a.q(p0, "source");
       i oi = null;
       int i = ((v2 = p1 - oi) >= 0)? 1: 0;
       if (i) {
          if (!v2) {
             return;
          }else {
             b b = p0.b;
             if (b == null) {
                a.L();
             }
             long l = p1;
             while (l - oi > 0) {
                int i1 = b.c - b.b;
                int i2 = (int)Math.min(l, (long)i1);
                this.f.update(b.a, b.b, i2);
                l = l - (long)i2;
                if (b.f == null) {
                   a.L();
                }
             }
             this.d.write(p0, p1);
             return;
          }
       }else {
          throw new IllegalArgumentException("byteCount < 0: "+p1.toString());
       }
    }
}
