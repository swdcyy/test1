package okio.b$b;
import java.io.Closeable;
import java.lang.Object;
import okio.b;
import kotlin.jvm.internal.a;
import cud.l;
import java.util.Arrays;
import java.lang.String;
import java.lang.ArrayIndexOutOfBoundsException;
import nsd.r0;
import java.lang.Long;
import java.lang.IllegalStateException;

public final class b$b implements Closeable	// class@001ff0
{
    public b b;
    public boolean c;
    public l d;
    public long e;
    public byte[] f;
    public int g;
    public int h;

    public void b$b(){
       super();
       this.e = -1;
       this.g = -1;
       this.h = -1;
    }
    public final int a(long p0){
       long l2;
       b uob;
       l c;
       l b1;
       b$b tb = this.b;
       if (tb == null) {
          throw new IllegalStateException("not attached to a buffer".toString());
       }
       int i = -1;
       if (p0 - (long)i >= 0 && p0 - tb.p() <= 0) {
          if (!p0 - -1 || !p0 - tb.p()) {
             this.d = null;
             this.e = p0;
             this.f = null;
             this.g = i;
             this.h = i;
             return i;
          }else {
             long l = 0;
             long l1 = tb.p();
             b b = tb.b;
             b$b td = this.d;
             if (td != null) {
                b$b te = this.e;
                b$b tg = this.g;
                if (td == null) {
                   a.L();
                }
                l2 = te - (long)(tg - td.b);
                if (l2 - p0 > 0) {
                   uob = b;
                   b = this.d;
                   l1 = l2;
                }else {
                   uob = this.d;
                   l = l2;
                }
             }else {
                uob = b;
             }
             if ((l1 - p0) - (p0 - l) > 0) {
                while (uob == null) {
                   a.L();
                   break ;
                   int i2 = c - b1;
                   l = l + (long)i2;
                   uob = uob.f;
                }
                c = uob.c;
                b1 = uob.b;
                int i1 = c - b1;
                l2 = (long)i1 + l;
                if (p0 - l2 >= 0) {
                   goto label_0065 ;
                }
             }else {
                while (l1 - p0 > 0) {
                   if (b == null) {
                      a.L();
                   }
                   b = b.g;
                   if (b == null) {
                      a.L();
                   }
                   i = b.c - b.b;
                   l1 = l1 - (long)i;
                }
                l = l1;
                uob = b;
             }
             if (this.c != null) {
                if (uob == null) {
                   a.L();
                }
                if (uob.d != null) {
                   b1 = uob.a;
                   byte[] uobyteArray = Arrays.copyOf(b1, b1.length);
                   a.h(uobyteArray, "java.util.Arrays.copyOf\(this, size\)");
                   l ol = new l(uobyteArray, uob.b, uob.c, false, true);
                   if (tb.b == uob) {
                      tb.b = c;
                   }
                   uob.b(c);
                   l g = c.g;
                   if (g == null) {
                      a.L();
                   }
                   g.a();
                   uob = c;
                }
             }
             this.d = uob;
             this.e = p0;
             if (uob == null) {
                a.L();
             }
             this.f = uob.a;
             int i3 = uob.b + (int)(p0 - l);
             this.g = i3;
             l c1 = uob.c;
             this.h = c1;
             return (c1 - i3);
          }
       }else {
          Object[] objArray = new Object[]{Long.valueOf(p0),Long.valueOf(tb.p())};
          String str = String.format("offset=%s > size=%s", Arrays.copyOf(objArray, 2));
          a.h(str, "java.lang.String.format\(format, *args\)");
          throw new ArrayIndexOutOfBoundsException(str);
       }
    }
    public void close(){
       IllegalStateException illegalState = (this.b != null)? 1: null;
       if (illegalState) {
          this.b = null;
          this.d = null;
          this.e = -1;
          this.f = null;
          this.g = -1;
          this.h = -1;
          return;
       }else {
          throw new IllegalStateException("not attached to a buffer".toString());
       }
    }
}
