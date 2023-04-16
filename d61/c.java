package d61.c;
import java.lang.Object;
import ok.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d61.c$a;
import ok.n;

public abstract class c	// class@001f14
{
    public Object a;

    public void c(){
       super();
    }
    public static c d(x p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c$a(p0);
    }
    public final Object a(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          obj = this.c();
          n.j(obj);
          this.a = obj;
       }
       return this.a;
    }
    public final boolean b(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public abstract Object c();
}
