package zq.d$b;
import java.lang.Object;
import zq.d$a;
import zq.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zq.a;
import upd.d;
import zq.f;
import zq.d;

public final class d$b	// class@00295e
{
    public a a;
    public f b;

    public void d$b(){
       super();
    }
    public void d$b(d$a p0){
       super();
    }
    public e a(){
       Object obj = PatchProxy.apply(null, this, d$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d.a(this.a, a.class);
       d.a(this.b, f.class);
       return new d(this.a, this.b, null);
    }
    public d$b b(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d.b(p0);
       this.a = p0;
       return this;
    }
    public d$b c(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d.b(p0);
       this.b = p0;
       return this;
    }
}
