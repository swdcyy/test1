package l0.c$a;
import aegon.chrome.net.o;
import l0.c;
import i0.k;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import l0.i;
import java.net.HttpRetryException;
import java.lang.String;
import java.lang.Exception;

public class c$a extends o	// class@0024e1
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public long a(){
       return this.b.g;
    }
    public void b(k p0,ByteBuffer p1){
       if (p1.remaining() >= this.b.h.remaining()) {
          p1.put(this.b.h);
          this.b.h.clear();
          p0.b(false);
          this.b.f.l();
       }else {
          c h = this.b.h;
          h.limit((h.position() + p1.remaining()));
          p1.put(this.b.h);
          this.b.h.limit(this.b.h.limit());
          p0.b(false);
       }
       return;
    }
    public void c(k p0){
       p0.c(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
