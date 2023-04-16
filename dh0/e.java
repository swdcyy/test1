package dh0.e;
import gh0.a;
import java.lang.Object;
import xs5.a;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import dh0.a;
import dh0.b;
import dh0.c;
import dh0.d;
import pg0.p;
import vg0.d;
import bh0.a;
import com.kuaishou.house.live.prerequest.a;

public class e implements a	// class@001f98
{

    public void e(){
       super();
    }
    public List C7(a p0){
       p0 = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(a.a);
       uArrayList.add(b.a);
       uArrayList.add(c.a);
       uArrayList.add(d.a);
       return uArrayList;
    }
    public List Dd(){
       ArrayList obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new p());
       obj.add(new d());
       obj.add(new a());
       return obj;
    }
    public List hs(){
       ArrayList obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new p());
       obj.add(new d());
       return obj;
    }
    public boolean isAvailable(){
       return true;
    }
    public List li(a p0){
       p0 = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new a());
       return uArrayList;
    }
}
