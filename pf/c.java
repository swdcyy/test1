package pf.c;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.HashMap;
import com.facebook.imagepipeline.request.ImageRequest;
import ub.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yd.e;
import pf.c$b;

public class c	// class@00291d
{
    public final Set a;
    public final Map b;
    public long c;
    public long d;

    public void c(){
       super();
       this.c = 0;
       this.d = 0;
       this.a = new CopyOnWriteArraySet();
       this.b = new HashMap();
    }
    public a a(ImageRequest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.v) {
          return new c$b(this, p0);
       }
       return new a();
    }
    public long b(){
       return this.d;
    }
    public final void c(){
       if (this.c - this.d > 0) {
          this.d = this.c;
       }
       return;
    }
}
