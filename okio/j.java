package okio.j;
import okio.n;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import cud.k;
import java.util.zip.Inflater;
import okio.k;
import okio.d;
import java.util.zip.CRC32;
import java.io.IOException;
import java.lang.Integer;
import java.util.Arrays;
import okio.b;
import cud.l;
import java.lang.Math;
import java.io.EOFException;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import okio.o;

public final class j implements n	// class@0020f6
{
    public byte b;
    public final k c;
    public final Inflater d;
    public final k e;
    public final CRC32 f;

    public void j(n p0){
       a.q(p0, "source");
       super();
       k ok = new k(p0);
       this.c = ok;
       Inflater inflater = new Inflater(true);
       this.d = inflater;
       this.e = new k(ok, inflater);
       this.f = new CRC32();
    }
    public final void a(String p0,int p1,int p2){
       if (p2 == p1) {
          return;
       }
       Object[] objArray = new Object[]{p0,Integer.valueOf(p2),Integer.valueOf(p1)};
       p0 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(objArray, 3));
       a.h(p0, "java.lang.String.format\(this, *args\)");
       throw new IOException(p0);
    }
    public final void b(b p0,long p1,long p2){
       int i1;
       p0 = p0.b;
       if (p0 == null) {
          a.L();
       }
       l c = p0.c;
       l b = p0.b;
       int i = c - b;
       while (p1 - (long)i >= 0) {
          i1 = c - b;
          p1 = p1 - (long)i1;
          l f = p0.f;
          if (f == null) {
             a.L();
          }
       }
       i1 = 0;
       while (p2 - i1 > 0) {
          long l = (long)p0.b + p1;
          int i2 = (int)l;
          int i3 = p0.c - i2;
          i3 = (int)Math.min((long)i3, p2);
          this.f.update(p0.a, i2, i3);
          p2 = p2 - (long)i3;
          if (p0.f == null) {
             a.L();
          }
          i2 = i1;
       }
       return;
    }
    public void close(){
       this.e.close();
    }
    public long read(b p0,long p1){
       long l3;
       long l4;
       j oj = this;
       Object obj = p0;
       long l = p1;
       a.q(obj, "sink");
       long l1 = 0;
       int i = ((v2 = l - l1) >= 0)? 1: 0;
       if (i) {
          if (!v2) {
             return l1;
          }else if(oj.b == null){
             oj.c.require(10);
             byte b = oj.c.b.g(3);
             int i1 = (((b >> 1) & 1) == 1)? 1: 0;
             if (i1) {
                this.b(oj.c.b, 0, 10);
             }
             oj.a("ID1ID2", 8075, oj.c.readShort());
             oj.c.skip(8);
             j oj1 = (((b >> 2) & 1) == 1)? 1: null;
             if (oj1) {
                oj.c.require(2);
                if (i1) {
                   this.b(oj.c.b, 0, 2);
                }
                long l2 = (long)oj.c.b.readShortLe();
                oj.c.require(l2);
                if (i1) {
                   l3 = l2;
                   this.b(oj.c.b, 0, l2);
                }else {
                   l3 = l2;
                }
                oj.c.skip(l3);
             }
             oj1 = (((b >> 3) & 1) == 1)? 1: null;
             if (oj1) {
                l4 = oj.c.indexOf(0);
                if (l4 - -1) {
                   if (i1) {
                      this.b(oj.c.b, 0, (l4 + 1));
                   }
                   oj.c.skip((l4 + 1));
                }else {
                   throw new EOFException();
                }
             }
             oj1 = (((b >> 4) & 1) == 1)? 1: null;
             if (oj1) {
                l4 = oj.c.indexOf(0);
                if (l4 - -1) {
                   if (i1) {
                      this.b(oj.c.b, 0, (l4 + 1));
                   }
                   oj.c.skip((l4 + 1));
                }else {
                   throw new EOFException();
                }
             }
             if (i1) {
                oj.a("FHCRC", oj.c.readShortLe(), (short)(int)oj.f.getValue());
                oj.f.reset();
             }
             oj.b = 1;
          }
          byte b1 = 2;
          if (oj.b == 1) {
             long l5 = p0.p();
             l = oj.e.read(obj, l);
             if (l - -1) {
                this.b(p0, l5, l);
                return l;
             }else {
                oj.b = b1;
             }
          }
          if (oj.b == b1) {
             oj.a("CRC", oj.c.readIntLe(), (int)oj.f.getValue());
             oj.a("ISIZE", oj.c.readIntLe(), (int)oj.d.getBytesWritten());
             oj.b = 3;
             if (!oj.c.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
             }
          }
          return -1;
       }else {
          throw new IllegalArgumentException("byteCount < 0: "+l.toString());
       }
    }
    public o timeout(){
       return this.c.timeout();
    }
}
