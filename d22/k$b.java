package d22.k$b;
import d22.k;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.nio.Buffer;

public class k$b	// class@00242f
{
    public ByteBuffer a;
    public ByteBuffer b;
    public ByteBuffer c;
    public int d;
    public int e;
    public int f;
    public final k g;

    public void k$b(k p0,int p1,int p2){
       this.g = p0;
       super();
       int i = p1 * p2;
       this.a = ByteBuffer.allocate(i);
       i = i / 4;
       this.b = ByteBuffer.allocate(i);
       this.c = ByteBuffer.allocate(i);
       this.d = p1;
       this.e = p2;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, k$b.class, "1")) {
          return;
       }
       this.a.clear();
       this.b.clear();
       this.c.clear();
       return;
    }
}
