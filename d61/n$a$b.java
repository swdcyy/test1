package d61.n$a$b;
import d61.n;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import d61.l0;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d61.n$b;

public abstract class n$a$b implements n	// class@001f35
{
    public long b;
    public int c;
    public final l0 d;

    public void n$a$b(String p0){
       a.p(p0, "key");
       super();
       l0 ol0 = l0.f(p0);
       this.d = ol0;
       Long longx = ol0.b(Long.valueOf(0));
       this.c = (int)(longx.longValue() >> 48);
       this.b = longx.longValue() & 0xffffffffffff;
    }
    public n a(n p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n$a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "other");
       return n$b.a(this, p0);
    }
    public final int d(){
       return this.c;
    }
    public final long e(){
       return this.b;
    }
    public final void f(int p0){
       this.c = p0;
    }
    public final void g(long p0){
       this.b = p0;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, n$a$b.class, "1")) {
          return;
       }
       long l = ((long)this.c << 48) | this.b;
       if (!l - null) {
          this.d.a();
       }else {
          this.d.i(Long.valueOf(l));
       }
       return;
    }
}
