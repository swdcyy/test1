package l0.b;
import l0.g;
import l0.d;
import l0.i;
import l0.b$a;
import java.nio.ByteBuffer;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.nio.Buffer;
import aegon.chrome.net.o;
import java.lang.Math;
import java.lang.IndexOutOfBoundsException;

public final class b extends g	// class@0024e0
{
    public final d e;
    public final i f;
    public final ByteBuffer g;
    public final o h;
    public boolean i;

    public void b(d p0,int p1,i p2){
       super();
       this.h = new b$a(this);
       if (p1 <= 0) {
          throw new IllegalArgumentException("chunkLength should be greater than 0");
       }
       this.g = ByteBuffer.allocate(p1);
       this.e = p0;
       this.f = p2;
       return;
    }
    public void close(){
       super.close();
       if (this.i == null) {
          this.i = true;
          this.g.flip();
       }
       return;
    }
    public void e(){
    }
    public o f(){
       return this.h;
    }
    public void g(){
    }
    public final void j(){
       if (!this.g.hasRemaining()) {
          this.c();
          this.g.flip();
          this.f.a();
          this.a();
       }
       return;
    }
    public void write(int p0){
       this.j();
       this.g.put((byte)p0);
    }
    public void write(byte[] p0,int p1,int p2){
       this.c();
       if ((p0.length - p1) < p2 || (p1 < 0 || p2 < 0)) {
          throw new IndexOutOfBoundsException();
       }
       int i = p2;
       while (i > 0) {
          int i1 = Math.min(i, this.g.remaining());
          int i2 = p1 + p2;
          i2 = i2 - i;
          this.g.put(p0, i2, i1);
          i = i - i1;
          this.j();
       }
       return;
    }
}
