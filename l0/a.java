package l0.a;
import l0.g;
import l0.d;
import l0.a$b;
import l0.a$a;
import java.lang.Object;
import java.util.Objects;
import java.nio.ByteBuffer;
import java.lang.IllegalArgumentException;
import java.lang.String;
import aegon.chrome.net.o;
import java.nio.Buffer;
import java.net.ProtocolException;
import java.lang.StringBuilder;
import java.lang.Math;
import java.lang.IllegalStateException;

public final class a extends g	// class@0024de
{
    public final int e;
    public final d f;
    public final o g;
    public ByteBuffer h;
    public boolean i;

    public void a(d p0){
       super();
       this.g = new a$b(this, null);
       Objects.requireNonNull(p0);
       this.f = p0;
       this.e = -1;
       this.h = ByteBuffer.allocate(0x4000);
    }
    public void a(d p0,long p1){
       super();
       this.g = new a$b(this, null);
       if (p1 - 0x7fffffff > 0) {
          throw new IllegalArgumentException("Use setFixedLengthStreamingMode\(\) or setChunkedStreamingMode\(\) for requests larger than 2GB.");
       }
       if (p1 < 0) {
          throw new IllegalArgumentException("Content length < 0.");
       }
       this.f = p0;
       int i = (int)p1;
       this.e = i;
       this.h = ByteBuffer.allocate(i);
       return;
    }
    public void e(){
    }
    public o f(){
       return this.g;
    }
    public void g(){
       this.i = true;
       if (this.h.position() < this.e) {
          throw new ProtocolException("Content received is less than Content-Length");
       }
       this.h.flip();
       return;
    }
    public final void h(int p0){
       a uoa = -1;
       if (this.e != uoa && (this.h.position() + p0) > this.e) {
          throw new ProtocolException("exceeded content-length limit of "+this.e+" bytes");
       }
       if (this.i != null) {
          throw new IllegalStateException("Use setFixedLengthStreamingMode\(\) or setChunkedStreamingMode\(\) for writing after connect");
       }
       if (this.e != uoa) {
          return;
       }
       if ((this.h.limit() - this.h.position()) > p0) {
          return;
       }
       ByteBuffer uByteBuffer = ByteBuffer.allocate(Math.max((this.h.capacity() * 2), (this.h.capacity() + p0)));
       this.h.flip();
       uByteBuffer.put(this.h);
       this.h = uByteBuffer;
       return;
    }
    public void write(int p0){
       this.c();
       this.h(1);
       this.h.put((byte)p0);
    }
    public void write(byte[] p0,int p1,int p2){
       this.c();
       this.h(p2);
       this.h.put(p0, p1, p2);
    }
}
