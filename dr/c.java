package dr.c;
import java.lang.Object;
import java.util.ArrayList;
import dr.d;
import java.util.List;
import dr.g;
import dr.f;
import dr.a;
import dr.e;
import com.kuaishou.android.vader.type.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import dr.b;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class c	// class@0014dc
{
    public List a;

    public void c(){
       super();
       ArrayList uArrayList = new ArrayList();
       this.a = uArrayList;
       uArrayList.add(new d());
       this.a.add(new g());
       this.a.add(new f());
       this.a.add(new a());
       this.a.add(new e());
    }
    public b a(Object p0){
       b uob;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.iterator();
       while (true) {
          if (!obj.hasNext()) {
             throw new IllegalStateException("Missing adapter for object: "+p0);
          }
          uob = obj.next().accept(p0);
          if (uob != null) {
             break ;
          }
       }
       return uob;
    }
}
