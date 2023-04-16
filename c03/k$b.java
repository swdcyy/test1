package c03.k$b;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.util.HashMap;
import java.util.Iterator;
import com.kuaishou.live.effect.resource.download.v2.Status;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;

public class k$b	// class@000492
{
    public Map a;
    public String b;

    public void k$b(String p0,List p1){
       super();
       this.a = new HashMap();
       this.b = p0;
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          this.a.put(iterator.next(), Status.IDLE);
       }
       return;
    }
    public boolean a(){
       Iterator obj = PatchProxy.apply(null, this, k$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.values().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return true;
          }
          if (!Status.isDownloadSuccess(obj.next())) {
             break ;
          }
       }
       return false;
    }
    public void b(String p0,Status p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$b.class, "1")) {
          return;
       }
       if (this.a.containsKey(p0)) {
          this.a.put(p0, p1);
       }
       return;
    }
}
