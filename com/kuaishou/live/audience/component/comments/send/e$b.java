package com.kuaishou.live.audience.component.comments.send.e$b;
import pf1.b;
import com.kuaishou.live.audience.component.comments.send.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import ne1.a;
import ne1.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;

public class e$b implements b	// class@000abb
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public void b(boolean p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "3")) {
          return;
       }
       e p = this.a.p;
       Objects.requireNonNull(p);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), p, uoa, "8")) {
          p.a.e(p0);
       }
       return;
    }
    public void g(int p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       e p = this.a.p;
       Objects.requireNonNull(p);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), p, uoa, "7")) {
          p.a.l(p0);
       }
       return;
    }
    public boolean h(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, e$b.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a.p;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, a.class, "9");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.a.k();
       return b;
    }
    public void i(int p0){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.p.b(p0);
       return;
    }
}
