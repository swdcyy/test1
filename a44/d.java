package a44.d;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;

public class d	// class@000026
{
    public int a;
    public final List b;

    public void d(int p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean a(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (!q.f(this.b)) {
          uod = this.b;
          if (uod != null && uod.contains(Integer.valueOf(p0)) == b) {
          label_0037 :
             return b;
          }
       }
       b = false;
       goto label_0037 ;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c();
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a == 4)? true: false;
       return b;
    }
}
