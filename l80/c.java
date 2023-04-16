package l80.c;
import l80.a;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import l80.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.NullPointerException;
import qrd.l1;

public final class c implements a	// class@001d66
{
    public a b;
    public final Object c;
    public Object d;

    public void c(a p0,Object p1){
       a.p(p0, "initializer");
       super();
       this.b = p0;
       if (p1 != null) {
       }else {
          p1 = this;
       }
       this.c = p1;
       this.d = d.a;
       return;
    }
    public Object getValue(){
       c obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       d a = d.a;
       if (obj != a) {
          Objects.requireNonNull(obj, "null cannot be cast to non-null type T");
          return obj;
       }else {
          obj = this.c;
          _monitor_enter(obj);
          c td = this.d;
          if (td != a) {
             if (td == null) {
                throw new NullPointerException("null cannot be cast to non-null type T");
             }
          }else {
             td = this.b.invoke();
             this.d = td;
          }
          _monitor_exit(obj);
          return td;
       }
    }
    public boolean isInitialized(){
       boolean b = (this.d != d.a)? true: false;
       return b;
    }
    public void reset(){
       c tc = this.c;
       _monitor_enter(tc);
       this.d = d.a;
       _monitor_exit(tc);
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.isInitialized())? this.getValue().toString(): "Lazy value not initialized yet.";
       return obj;
    }
}
