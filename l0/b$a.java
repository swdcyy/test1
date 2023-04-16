package l0.b$a;
import aegon.chrome.net.o;
import l0.b;
import i0.k;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import l0.i;
import java.net.HttpRetryException;
import java.lang.String;
import java.lang.Exception;

public class b$a extends o	// class@0024df
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public long a(){
       return -1;
    }
    public void b(k p0,ByteBuffer p1){
       if (p1.remaining() >= this.b.g.remaining()) {
          p1.put(this.b.g);
          this.b.g.clear();
          p0.b(this.b.i);
          b$a tb = this.b;
          if (tb.i == null) {
             tb.f.l();
          }
       }else {
          b g = this.b.g;
          g.limit((g.position() + p1.remaining()));
          p1.put(this.b.g);
          this.b.g.limit(this.b.g.limit());
          p0.b(false);
       }
       return;
    }
    public void c(k p0){
       p0.c(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
