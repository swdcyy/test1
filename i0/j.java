package i0.j;
import aegon.chrome.net.o;
import java.nio.ByteBuffer;
import i0.k;
import java.nio.Buffer;
import java.lang.IllegalStateException;
import java.lang.String;

public final class j extends o	// class@00177b
{
    public final ByteBuffer b;

    public void j(ByteBuffer p0){
       super();
       this.b = p0;
    }
    public long a(){
       return (long)this.b.limit();
    }
    public void b(k p0,ByteBuffer p1){
       if (!p1.hasRemaining()) {
          throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
       }
       if (p1.remaining() >= this.b.remaining()) {
          p1.put(this.b);
       }else {
          j tb = this.b;
          tb.limit((tb.position() + p1.remaining()));
          p1.put(this.b);
          this.b.limit(this.b.limit());
       }
       p0.b(false);
       return;
    }
    public void c(k p0){
       this.b.position(0);
       p0.d();
    }
}
