package com.kuaishou.live.common.core.component.topbar.topuser.i$b;
import com.kuaishou.live.common.core.component.topbar.topuser.l;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import g9c.a;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.common.core.component.topbar.topuser.l$a;
import java.util.Set;
import android.view.ViewGroup;

public class i$b implements l	// class@001788
{
    public final i a;

    public void i$b(i p0){
       this.a = p0;
       super();
    }
    public UserInfo a(){
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, this, i$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.G;
       if (obj != null && !q.f(obj.Q0())) {
          List list = this.a.G.Q0();
          int i = this.a.G.Q0().size() - 1;
          if (!q.f(list)) {
             if (list.size() <= i) {
                i = 0;
             }
             objArray = list.get(i);
          }
       }
       return objArray;
    }
    public void b(l$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, "3")) {
          return;
       }
       this.a.z.remove(p0);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "4")) {
          return;
       }
       this.a.y.setVisibility(8);
       return;
    }
    public void d(l$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, "2")) {
          return;
       }
       this.a.z.add(p0);
       return;
    }
}
