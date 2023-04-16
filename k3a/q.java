package k3a.q;
import com.yxcorp.gifshow.widget.m;
import k3a.r;
import java.util.ArrayList;
import java.util.List;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.detail.player.panel.elements.QualityItemModel;
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
import com.yxcorp.gifshow.detail.player.panel.elements.QualityMode;
import i3a.b;
import qrd.l1;

public final class q extends m	// class@002bd3
{
    public final r c;
    public final ArrayList d;
    public final List e;
    public final LinearLayout f;
    public final QualityItemModel g;
    public final p h;

    public void q(r p0,ArrayList p1,List p2,LinearLayout p3,QualityItemModel p4,p p5,boolean p6,long p7){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       super(p6, p7);
    }
    public void a(View p0){
       r or = r.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       a.p(p0, "v");
       if (p0.isSelected()) {
          return;
       }
       q tc = this.c;
       q td = this.d;
       q te = this.e;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidTwoRefs(td, te, tc, or, "2")) {
          Iterator iterator = td.iterator();
          while (iterator.hasNext()) {
             iterator.next().setSelected(false);
          }
          iterator = te.iterator();
          while (iterator.hasNext()) {
             iterator.next().setSelected$detail_release(false);
          }
       }
       this.f.setSelected(true);
       this.g.setSelected$detail_release(true);
       tc = this.c;
       td = this.g;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(td, tc, or, "3")) {
          QualityMode qualityMode = td.getQualityMode();
          if (!PatchProxy.applyVoidOneRefs(qualityMode, null, b.class, "2")) {
             a.p(qualityMode, "<set-?>");
             b.c = qualityMode;
          }
       }
       q th = this.h;
       if (th != null) {
          th.invoke(p0, this.g);
       }
       return;
    }
}
