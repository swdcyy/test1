package gg0.n;
import java.lang.Runnable;
import gg0.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hg0.b;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.util.Objects;
import crd.b;
import lnc.b9;

public final class n implements Runnable	// class@0024e1
{
    public final m b;

    public void n(m p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "1")) {
          return;
       }
       n tb = this.b;
       int i = tb.k + 1;
       tb.k = i;
       if (i >= tb.f.getMCheckValue()) {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, m.class, "8") && tb.l == null) {
             tb.l = true;
             b9.a(tb.m);
             tb.m = tb.e();
          }
       }
       return;
    }
}
