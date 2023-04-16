package cud.h;
import okio.n;
import okio.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import okio.b;
import cud.l;
import java.lang.Math;
import java.lang.IllegalStateException;
import okio.o;

public final class h implements n	// class@000c89
{
    public final b b;
    public l c;
    public int d;
    public boolean e;
    public long f;
    public final d g;

    public void h(d p0){
       a.q(p0, "upstream");
       super();
       this.g = p0;
       b uob = p0.m();
       this.b = uob;
       uob = uob.b;
       this.c = uob;
       l b = (uob != null)? uob.b: -1;
       this.d = b;
       return;
    }
    public void close(){
       this.e = true;
    }
    public long read(b p0,long p1){
       a.q(p0, "sink");
       int i = 1;
       if (!(this.e ^ i)) {
          throw new IllegalStateException("closed".toString());
       }
       h tc = this.c;
       if (tc != null) {
          b b = this.b.b;
          if (tc == b) {
             tc = this.d;
             if (b == null) {
                a.L();
             }
             if (tc != b.b) {
             label_0021 :
                i = 0;
             }
          }else {
             goto label_0021 ;
          }
       }
       if (i) {
          this.g.request((this.f + p1));
          if (this.c == null) {
             b b1 = this.b.b;
             if (b1 != null) {
                this.c = b1;
                if (b1 == null) {
                   a.L();
                }
                this.d = b1.b;
             }
          }
          p1 = Math.min(p1, (this.b.p() - this.f));
          if (p1 - null <= 0) {
             return -1;
          }else {
             this.b.f(p0, this.f, p1);
             this.f = this.f + p1;
             return p1;
          }
       }else {
          throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
       }
    }
    public o timeout(){
       return this.g.timeout();
    }
}
