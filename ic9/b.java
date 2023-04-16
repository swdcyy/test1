package ic9.b;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Iterator;
import ic9.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class b	// class@002670
{
    public final List a;
    public final List b;
    public final List c;

    public void b(List p0){
       super();
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.a = p0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa.d == null) {
             this.b.add(uoa);
          }else {
             this.c.add(uoa);
          }
       }
       return;
    }
    public boolean a(String p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (p0.equals(obj.next().c())) {
             break ;
          }
       }
       return true;
    }
    public a b(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.b.isEmpty()) {
          objArray = this.b.get(0);
       }else if(!this.c.isEmpty()){
          objArray = this.c.get(0);
       }
       return objArray;
    }
}
