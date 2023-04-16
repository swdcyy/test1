package cud.k$a;
import java.io.InputStream;
import cud.k;
import okio.b;
import java.lang.Math;
import java.io.IOException;
import java.lang.String;
import okio.n;
import java.lang.Object;
import kotlin.jvm.internal.a;
import cud.c;
import java.lang.StringBuilder;

public final class k$a extends InputStream	// class@000c8f
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public int available(){
       k$a tb = this.b;
       if (tb.c == null) {
          return (int)Math.min(tb.b.p(), (long)Integer.MAX_VALUE);
       }
       throw new IOException("closed");
    }
    public void close(){
       this.b.close();
    }
    public int read(){
       k$a tb = this.b;
       if (tb.c != null) {
          throw new IOException("closed");
       }
       if (!tb.b.p()) {
          tb = this.b;
          if (!tb.d.read(tb.b, (long)8192) - -1) {
             return -1;
          }
       }
       return (this.b.b.readByte() & 0x00ff);
    }
    public int read(byte[] p0,int p1,int p2){
       a.q(p0, "data");
       if (this.b.c != null) {
          throw new IOException("closed");
       }
       c.b((long)p0.length, (long)p1, (long)p2);
       if (!this.b.b.p()) {
          k$a tb = this.b;
          if (!tb.d.read(tb.b, (long)8192) - -1) {
             return -1;
          }
       }
       return this.b.b.read(p0, p1, p2);
    }
    public String toString(){
       return this.b+".inputStream\(\)";
    }
}
