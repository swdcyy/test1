package b56.h;
import b56.a;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.view.View;
import com.yxcorp.utility.n;

public final class h implements a	// class@000405
{
    public final KwaiXfControlPanel a;

    public void h(KwaiXfControlPanel p0){
       this.a = p0;
    }
    public final void a(boolean p0){
       h ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(KwaiXfControlPanel.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), ta, KwaiXfControlPanel.class, "86")) {
          int i = 1;
          ta.c(i, p0);
          int i1 = 8;
          if (p0) {
             n.Y(ta.q, 0, 0);
          }else {
             n.Y(ta.q, i1, 0);
          }
          ta.e(2, p0, true, ta.y, false);
          KwaiXfControlPanel q = ta.Q;
          if (q != null) {
             int i2 = (p0)? 4: 0;
             n.Y(q, i2, 0);
          }
          if (ta.e == null && p0) {
             i = false;
          }
          if (!PatchProxy.isSupport(KwaiXfControlPanel.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), ta, KwaiXfControlPanel.class, "113")) {
             KwaiXfControlPanel s1 = ta.s1;
             if (s1 != null) {
                if (i) {
                   i1 = 0;
                }
                n.W(s1, i1, ta.b);
             }
          }
       }
    label_0073 :
       return;
    }
}
