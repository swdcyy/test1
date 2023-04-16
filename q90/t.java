package q90.t;
import erd.g;
import q90.q;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import u80.e;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import q87.c;
import v36.a;

public final class t implements g	// class@0029a0
{
    public final q b;

    public void t(q p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       t ot = t.class;
       if (!PatchProxy.isSupport(ot) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, ot, "1")) {
          Object[] objArray = new Object[0];
          e.D().s("KSFeedTab", "kuaishanVisiblePublisher:"+b+", tab:"+this.b.f(), objArray);
          if (!b) {
             q u = this.b.u;
             if (u != null) {
                u.c();
             }
          }
          this.b.l(b);
       }
       return;
    }
}
