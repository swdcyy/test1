package wq.d;
import java.util.Queue;
import wq.b;
import java.lang.Object;
import java.util.Collection;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public abstract class d extends b implements Queue	// class@002777
{

    public void d(){
       super();
    }
    public Object b(){
       return this.l();
    }
    public Collection d(){
       return this.l();
    }
    public Object element(){
       Object obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l().element();
    }
    public abstract Queue l();
    public boolean offer(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.l().offer(p0);
    }
    public Object peek(){
       Object obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l().peek();
    }
    public Object poll(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l().poll();
    }
    public Object remove(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l().remove();
    }
}
