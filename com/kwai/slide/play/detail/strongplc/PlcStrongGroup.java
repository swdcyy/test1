package com.kwai.slide.play.detail.strongplc.PlcStrongGroup;
import qp7.e;
import ws7.b;
import qp7.g;
import com.kwai.slide.play.detail.strongplc.PlcStrongGroup$mLayoutChangeLnr$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.widget.RelativeLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qp7.h;
import vq7.d;
import android.widget.LinearLayout;
import com.kwai.robust.PatchProxyResult;
import vq7.e;
import lnc.a1;
import android.graphics.Rect;
import vq7.f;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.List;
import vq7.g;
import com.kwai.slide.play.detail.strongplc.PlcStrongGroup$mLayoutChangeLnr$2$a;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import com.kwai.slide.play.detail.group.Orientation;
import vq7.c;
import nsd.u;

public final class PlcStrongGroup extends e	// class@001879
{
    public View p;
    public final p q;

    public void PlcStrongGroup(){
       super(new b());
       this.q = s.c(new PlcStrongGroup$mLayoutChangeLnr$2(this));
    }
    public void l(RelativeLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcStrongGroup.class, "1")) {
          return;
       }
       a.p(p0, "detailPageView");
       super.l(p0);
       d uod = this.t();
       if (uod != null) {
          LinearLayout linearLayout = uod.d();
          if (linearLayout != null) {
             linearLayout.setVisibility(4);
          }
       }
       return;
    }
    public h m(RelativeLayout p0){
       d uod = PatchProxy.applyOneRefs(p0, this, PlcStrongGroup.class, "3");
       if (uod != PatchProxyResult.class) {
       }else {
          a.p(p0, "detailPageView");
          e uoe = new e(a1.e(270.00f), -2);
          int i = 0;
          uoe.j(new Rect(a1.d(R.dimen.pv), i, i, a1.d(R.dimen.arg_RES_7f070271)));
          uoe.i(R.id.group_plc_strong_root_layout);
          f[] uofArray = new f[]{new f(9)};
          uoe.g(CollectionsKt__CollectionsKt.r(uofArray));
          g[] ogArray = new g[]{new g(2, 0x7f0a111d)};
          uoe.h(CollectionsKt__CollectionsKt.r(ogArray));
          this.p = p0;
          if (p0 != null) {
             p0.addOnLayoutChangeListener(this.x());
          }
          d uod1 = new d(p0, 0, Orientation.VERTICAL, uoe, null, 16, null);
       }
       return uod;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, PlcStrongGroup.class, "4")) {
          return;
       }
       super.n();
       PlcStrongGroup tp = this.p;
       if (tp != null) {
          tp.removeOnLayoutChangeListener(this.x());
       }
       this.p = null;
       return;
    }
    public final PlcStrongGroup$mLayoutChangeLnr$2$a x(){
       Object obj = PatchProxy.apply(null, this, PlcStrongGroup.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
}
