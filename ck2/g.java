package ck2.g;
import mq5.h;
import com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tj3.l;
import tj3.e;
import tj3.r;
import tj3.i;

public final class g implements h	// class@00054a
{
    public final LiveLogReporterBasePresenter b;

    public void g(LiveLogReporterBasePresenter p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       LiveLogReporterBasePresenter p;
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveLogReporterBasePresenter.class, "3")) {
       }else {
          int i = 8;
          if (tb.G == null) {
             p = tb.p;
             if (p != null) {
                l ol = p.n();
                String str = (tb.H != null)? "BRIGHT_VIEW": "DARK_VIEW";
                ol.i(str);
                ol.h(i);
                tb.p.z();
             }
          }
          tb.Y8();
          if (tb.C != null) {
             p = tb.p;
             if (p != null) {
                p.n().c(i);
                tb.p.g();
             }
          }
          tb.X8();
       }
       tb.w.y(true);
       tb.x.n(false);
       tb.D = true;
       return;
    }
}
