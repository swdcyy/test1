package l0.c;
import l0.g;
import l0.d;
import l0.i;
import l0.c$a;
import java.lang.Math;
import java.nio.ByteBuffer;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.net.ProtocolException;
import aegon.chrome.net.o;
import java.lang.StringBuilder;
import java.nio.Buffer;
import java.lang.IndexOutOfBoundsException;

public final class c extends g	// class@0024e2
{
    public final d e;
    public final i f;
    public final long g;
    public final ByteBuffer h;
    public final o i;
    public long j;
    public static int k = 16384;

    public void c(d p0,long p1,i p2){
       super();
       this.i = new c$a(this);
       if (p1 < 0) {
          throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
       }
       this.g = p1;
       this.h = ByteBuffer.allocate((int)Math.min(p1, (long)c.k));
       this.e = p0;
       this.f = p2;
       this.j = 0;
       return;
    }
    public void e(){
       if (this.j - this.g >= 0) {
          return;
       }
       throw new ProtocolException("Content received is less than Content-Length.");
    }
    public o f(){
       return this.i;
    }
    public void g(){
    }
    public final void h(int p0){
       if ((this.j + (long)p0) - this.g <= 0) {
          return;
       }
       throw new ProtocolException("expected "+(this.g - this.j)+" bytes but received "+p0);
    }
    public final void j(){
       if (!this.h.hasRemaining()) {
          this.k();
       }
       return;
    }
    public final void k(){
       this.c();
       this.h.flip();
       this.f.a();
       this.a();
    }
    public final void l(){
       if (!this.j - this.g) {
          this.k();
       }
       return;
    }
    public void write(int p0){
       this.c();
       this.h(1);
       this.j();
       this.h.put((byte)p0);
       this.j = this.j + 1;
       this.l();
    }
    public void write(byte[] p0,int p1,int p2){
       this.c();
       if ((p0.length - p1) < p2 || (p1 < 0 || p2 < 0)) {
          throw new IndexOutOfBoundsException();
       }
       this.h(p2);
       int i = p2;
       while (i > 0) {
          this.j();
          int i1 = Math.min(i, this.h.remaining());
          int i2 = p1 + p2;
          i2 = i2 - i;
          this.h.put(p0, i2, i1);
          i = i - i1;
       }
       this.j = this.j + (long)p2;
       this.l();
       return;
    }
}
