package e19.f;
import erd.g;
import e19.g;
import java.lang.Object;
import ub6.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.entity.QPhoto;
import p5a.b;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;

public final class f implements g	// class@002124
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, g.class, "7")) {
       }else {
          p0 = tb.s;
          if (p0 == null || (p0.isAdded() && tb.y != null)) {
             if (b.h(tb.q)) {
                if (tb.s.getLifecycle().getCurrentState() == Lifecycle$State.RESUMED) {
                   tb.P8();
                }
             }else {
                tb.P8();
             }
          }
       }
       return;
    }
}
