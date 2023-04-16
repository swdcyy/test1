package d61.n$a$a;
import d61.n;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d61.n$b;
import java.lang.Boolean;

public final class n$a$a implements n	// class@001f34
{
    public final n b;
    public final n c;

    public void n$a$a(n p0,n p1){
       a.p(p0, "limit1");
       a.p(p1, "limit2");
       super();
       this.b = p0;
       this.c = p1;
    }
    public n a(n p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n$a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "other");
       return n$b.a(this, p0);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, n$a$a.class, "2")) {
          return;
       }
       this.b.b();
       this.c.b();
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, n$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b.c() && this.c.c())? true: false;
       return b;
    }
}
