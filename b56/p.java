package b56.p;
import c56.b$a;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import sc6.d;
import b56.f0;
import b56.z;
import b56.d;
import java.util.Iterator;
import java.util.Set;
import com.kwai.feed.player.ui.KwaiXfControlPanel$d;
import com.kwai.feed.player.ui.KwaiXfControlPanel$i;
import java.lang.Float;
import com.kwai.framework.player.core.b;
import android.widget.FrameLayout;
import java.lang.Math;
import java.lang.Long;
import android.widget.ProgressBar;

public class p implements b$a	// class@00040f
{
    public boolean a;
    public long b;
    public final KwaiXfControlPanel c;

    public void p(KwaiXfControlPanel p0){
       this.c = p0;
       super();
       this.a = true;
       this.b = 0;
    }
    public void a(boolean p0){
       Iterator iterator;
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, op, "2")) {
          return;
       }
       if (this.a == null) {
          p tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(null, tc, KwaiXfControlPanel.class, "107")) {
             tc.n("onGestureSeekEnd");
             tc.G = false;
             if (tc.c != null) {
                long panelDisplay = tc.getPanelDisplayDurationMs();
                tc.j(z.b(tc.f.c().getProgress(), tc.f.c().e(), panelDisplay), panelDisplay);
             }
             tc.l(2);
             tc.g.h();
             KwaiXfControlPanel i = tc.I;
             if (i != null) {
                iterator = i.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a();
                }
             }
             i = tc.E;
             if (i != null) {
                iterator = i.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a();
                }
             }
             if (tc.y1 != null) {
                tc.f(5, true);
             }
          }
       }
       this.a = true;
       return;
    }
    public void b(float p0,float p1,float p2){
       KwaiXfControlPanel c;
       p tc;
       Iterator iterator;
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, p.class, "1")) {
          return;
       }
       if (this.a != null) {
          c = this.c.c;
          if (c == null) {
             return;
          }else {
             boolean b = false;
             this.a = b;
             this.b = c.getCurrentPosition();
             tc = this.c;
             Objects.requireNonNull(tc);
             if (!PatchProxy.applyVoid(null, tc, KwaiXfControlPanel.class, "105")) {
                tc.n("onGestureSeekStart");
                tc.G = true;
                tc.v(b);
                tc.o(2);
                c = tc.I;
                if (c != null) {
                   iterator = c.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().onSeekStart();
                   }
                }
             }
          }
       }
       if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, op, "3")) {
          tc = this.c;
          if (tc.k != null) {
             long l = Math.min(Math.max((this.b + (long)Math.round((((p1 - p0) / (float)tc.getWidth()) * (float)this.c.getPanelDisplayDurationMs()))), 0), this.c.getPanelDisplayDurationMs());
             tc = this.c;
             long panelDisplay = tc.getPanelDisplayDurationMs();
             if (!PatchProxy.isSupport(KwaiXfControlPanel.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), Long.valueOf(panelDisplay), tc, KwaiXfControlPanel.class, "106")) {
                tc.f.e(l, panelDisplay);
                tc.g.e(l, panelDisplay);
                if (tc.A != null) {
                   tc.f.f(l, panelDisplay);
                }
                KwaiXfControlPanel u1 = tc.u1;
                if (u1 != null) {
                   u1.setProgress(z.a(l, panelDisplay, u1.getMax()));
                }
                c = tc.E;
                if (c != null) {
                   iterator = c.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().b(l, panelDisplay);
                   }
                }
             }
          }
       }
       return;
    }
}
