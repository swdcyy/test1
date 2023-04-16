package k3a.x;
import com.yxcorp.gifshow.widget.m;
import k3a.w;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.detail.player.panel.elements.SpeedItemModel;
import msd.p;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import qrd.l1;

public final class x extends m	// class@002bdb
{
    public final w c;
    public final ArrayList d;
    public final List e;
    public final SpeedItemModel f;
    public final p g;

    public void x(w p0,ArrayList p1,List p2,SpeedItemModel p3,p p4,boolean p5,long p6){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       super(p5, p6);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
          return;
       }
       a.p(p0, "v");
       if (p0.isSelected()) {
          return;
       }
       x tc = this.c;
       x td = this.d;
       x te = this.e;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidTwoRefs(td, te, tc, w.class, "2")) {
          Iterator iterator = td.iterator();
          while (iterator.hasNext()) {
             iterator.next().setSelected(false);
          }
          iterator = te.iterator();
          while (iterator.hasNext()) {
             iterator.next().setSelected$detail_release(false);
          }
       }
       p0.setSelected(true);
       this.f.setSelected$detail_release(true);
       tc = this.g;
       if (tc != null) {
          tc.invoke(p0, this.f);
       }
       return;
    }
}
