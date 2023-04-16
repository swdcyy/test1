package bh9.p;
import erd.g;
import bh9.r;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import ed9.f;
import java.util.BitSet;
import bh9.c;
import java.lang.Runnable;
import android.view.View;

public final class p implements g	// class@0004a5
{
    public final r b;

    public void p(r p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, r.class, "5")) {
       }else if(p0.b != tb.c || !PanelShowEvent.a(tb.e, p0)){
          if (p0.a != null && p0.c == PanelShowEvent$PanelType.MORE_OPTION) {
             tb.m2();
          }else {
             tb.q.c(p0);
             if (tb.q.a()) {
                tb.t.set(4);
                tb.h2(true);
             }else {
                p0 = tb.l;
                if (p0 != null) {
                   p0.postDelayed(new c(tb), 10);
                }
             }
          }
       }
       return;
    }
}
