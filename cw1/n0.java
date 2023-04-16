package cw1.n0;
import java.lang.Object;
import java.util.HashSet;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import java.util.Set;
import cw1.m0;

public abstract class n0	// class@001e72
{
    public Set a;
    public m0 b;

    public void n0(){
       super();
       this.a = new HashSet();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "1")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          LivePendantRelation livePendantR = iterator.next();
          if (!this.a.contains(livePendantR)) {
             this.a.add(livePendantR);
             this.c(livePendantR);
          }
       }
       return;
    }
    public m0 b(){
       return this.b;
    }
    public abstract void c(LivePendantRelation p0);
    public abstract void d(LivePendantRelation p0);
    public void e(LivePendantRelation[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "2")) {
          return;
       }
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (this.a.contains(oobject)) {
             this.a.remove(oobject);
             this.d(oobject);
          }
          i = i + 1;
       }
       return;
    }
    public void f(m0 p0){
       this.b = p0;
    }
}
