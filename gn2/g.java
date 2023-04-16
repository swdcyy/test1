package gn2.g;
import a71.b;
import gn2.i;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gn2.l;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import java.lang.Enum;
import mn2.c;

public final class g implements b	// class@002b53
{
    public final i a;

    public void g(i p0){
       this.a = p0;
    }
    public final void D(){
       g ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, ta, i.class, "2")) {
       }else {
          i a = ta.a;
          if (a != null && !PatchProxy.applyVoid(objArray, a, l.class, "7")) {
             if (!Lifecycle$State.CREATED.equals(a.n.getLifecycle().getCurrentState())) {
                a.n.f();
             }
             a.l.n = false;
          }
       }
       return;
    }
}
