package md1.c;
import ps5.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.e;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.e$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeView;
import java.util.Objects;
import bq5.f;
import ps5.a;

public final class c implements b	// class@003152
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Boolean p0){
       c tb = this.b;
       tb.g = false;
       if (p0.booleanValue()) {
          e$b uob = e$b.class;
          if (!PatchProxy.applyVoid(null, tb, e.class, "6")) {
             e i = tb.i;
             if (i != null) {
                String str = a1.p(R.string.arg_RES_7f102a7e);
                if (!PatchProxy.applyVoidOneRefs(str, i, uob, "2")) {
                   i.d.setRightButtonContent(str);
                }
                i = tb.i;
                Objects.requireNonNull(i);
                if (!PatchProxy.applyVoid(null, i, uob, "3")) {
                   i.d.d();
                }
             }
          }
       }
       tb.h.e(2000);
       return;
    }
    public void accept(Object p0){
       a.a(this, p0);
    }
}
