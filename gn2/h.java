package gn2.h;
import a71.c;
import gn2.i;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gn2.l;
import jn2.d;
import com.yxcorp.gifshow.models.Gift;
import lp3.e;
import gn2.m;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import java.lang.Enum;
import mn2.c;
import zh3.c;

public final class h implements c	// class@002b54
{
    public final i a;

    public void h(i p0){
       this.a = p0;
    }
    public final void onShow(){
       l l;
       h ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, i.class, "1")) {
       }else {
          i a = ta.a;
          if (a != null && !PatchProxy.applyVoid(null, a, l.class, "6")) {
             l k = a.k;
             Objects.requireNonNull(k);
             if (!PatchProxy.applyVoid(null, k, d.class, "15")) {
                m.c(k.n, k.h, false);
             }
             if (!Lifecycle$State.STARTED.equals(a.n.getLifecycle().getCurrentState())) {
                a.n.e();
             }
             l = a.l;
             Objects.requireNonNull(l);
             if (!PatchProxy.applyVoid(null, l, c.class, "19")) {
                l.n = true;
                if (l.o0()) {
                   l.g.q(new Object());
                }
             }
          }
       }
       return;
    }
}
