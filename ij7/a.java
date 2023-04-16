package ij7.a;
import sj7.b;
import java.util.concurrent.Executor;
import ij7.d;
import java.lang.Object;
import com.kwai.plugin.dva.work.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ij7.a$a;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class a implements b	// class@0017f7
{
    public final Executor a;
    public final d b;

    public void a(Executor p0,d p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a$a uoa = new a$a(this, p0, p0.f(), p0.e(), p0.g());
       this.a.execute(v8);
       return;
    }
    public boolean equals(Object p0){
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || uoa != p0.getClass()) {
          return false;
       }
       return p0.b.equals(this.b);
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.hashCode();
    }
}
