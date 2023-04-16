package kd9.r0;
import erd.g;
import com.yxcorp.gifshow.camera.record.frame.n;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import ed9.f;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import com.yxcorp.gifshow.camera.record.frame.c$e;
import android.view.View;
import com.yxcorp.utility.n;

public final class r0 implements g	// class@002c67
{
    public final n b;

    public void r0(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "3")) {
       }else if(p0.b != tb.c || !PanelShowEvent.a(tb.e, p0)){
          tb.r.c(p0);
          if (tb.p != null && (p0.c != PanelShowEvent$PanelType.MORE_OPTION && tb.q.q1())) {
             boolean b = tb.r.b(p0);
             if (p0.a == null && (b || tb.q.w1())) {
                n.Y(tb.p, 4, false);
             }else {
                n.Y(tb.p, false, false);
             }
          }
       }
       return;
    }
}
