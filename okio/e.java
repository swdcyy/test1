package okio.e;
import okio.m;
import okio.c;
import java.util.zip.Deflater;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import okio.b;
import cud.l;
import cud.m;
import okio.o;
import java.lang.StringBuilder;
import cud.c;
import java.lang.Math;

public final class e implements m	// class@001ff6
{
    public boolean b;
    public final c c;
    public final Deflater d;

    public void e(c p0,Deflater p1){
       a.q(p0, "sink");
       a.q(p1, "deflater");
       super();
       this.c = p0;
       this.d = p1;
    }
    public final void a(boolean p0){
       l c;
       int i;
       int i1;
       b uob = this.c.m();
       while (true) {
          l ol = uob.s(1);
          if (p0) {
             c = ol.c;
             i = c - 8192;
             i1 = this.d.deflate(ol.a, c, i, 2);
          label_0027 :
             if (i1 > 0) {
                int i2 = ol.c + i1;
                ol.c = i2;
                long l = uob.p() + (long)i1;
                uob.o(l);
                this.c.emitCompleteSegments();
             }else if(this.d.needsInput()){
                if (ol.b == ol.c) {
                   uob.b = ol.a();
                   m.a(ol);
                   break ;
                }
                break ;
             }
          }else {
             c = ol.c;
             i = c - 8192;
             i1 = this.d.deflate(ol.a, c, i);
             goto label_0027 ;
          }
       }
       return;
    }
    public final void c(){
       this.d.finish();
       this.a(false);
    }
    public void close(){
       if (this.b != null) {
          return;
       }
       this.c();
       this.d.end();
       this.c.close();
       this.b = true;
       if (!null) {
          return;
       }
       throw null;
    }
    public void flush(){
       this.a(true);
       this.c.flush();
    }
    public o timeout(){
       return this.c.timeout();
    }
    public String toString(){
       return "DeflaterSink\("+this.c+')';
    }
    public void write(b p0,long p1){
       a.q(p0, "source");
       c.b(p0.p(), 0, p1);
       while (p1 - null > 0) {
          b b = p0.b;
          if (b == null) {
             a.L();
          }
          int i = b.c - b.b;
          int i1 = (int)Math.min(p1, (long)i);
          this.d.setInput(b.a, b.b, i1);
          this.a(false);
          long l = (long)i1;
          long l1 = p0.p() - l;
          p0.o(l1);
          i = b.b + i1;
          b.b = i;
          if (i == b.c) {
             p0.b = b.a();
             m.a(b);
          }
          p1 = p1 - l;
       }
       return;
    }
}
