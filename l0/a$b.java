package l0.a$b;
import aegon.chrome.net.o;
import l0.a;
import l0.a$a;
import java.nio.ByteBuffer;
import i0.k;
import java.nio.Buffer;

public class a$b extends o	// class@0024dd
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void a$b(a p0,a$a p1){
       super(p0);
    }
    public long a(){
       a$b tb = this.b;
       a e = tb.e;
       if (e != -1) {
          return (long)e;
       }
       a h = tb.h;
       int i = (tb.i != null)? h.limit(): h.position();
       return (long)i;
    }
    public void b(k p0,ByteBuffer p1){
       int i = p1.remaining();
       if (i < this.b.h.remaining()) {
          p1.put(this.b.h.array(), this.b.h.position(), i);
          a h = this.b.h;
          h.position((h.position() + i));
       }else {
          p1.put(this.b.h);
       }
       p0.b(false);
       return;
    }
    public void c(k p0){
       this.b.h.position(0);
       p0.d();
    }
}
