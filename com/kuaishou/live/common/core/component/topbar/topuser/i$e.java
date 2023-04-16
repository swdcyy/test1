package com.kuaishou.live.common.core.component.topbar.topuser.i$e;
import cy1.q;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Integer;
import brd.y;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.common.core.component.watchingcount.updater.a;
import java.util.List;
import cy1.r;

public class i$e implements q	// class@00178b
{
    public final i a;

    public void i$e(i p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       i$e uoe = i$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "5")) {
          return;
       }
       uoe = this.a;
       if (uoe.H == p0) {
          return;
       }
       uoe.H = p0;
       uoe.y.invalidateItemDecorations();
       i$e ta = this.a;
       ta.T.onNext(Integer.valueOf(ta.X8()));
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i$e.class, "2")) {
          return;
       }
       this.a.o9("stopLoopGetAudience");
       return;
    }
    public long c(){
       Object obj = PatchProxy.apply(null, this, i$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (this.a.a9() != null)? this.a.a9().b(): 0;
       return l;
    }
    public List d(){
       return this.a.J;
    }
    public void e(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$e.class, "3")) {
          return;
       }
       this.a.A.add(p0);
       return;
    }
    public void f(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$e.class, "4")) {
          return;
       }
       this.a.A.remove(p0);
       return;
    }
}
