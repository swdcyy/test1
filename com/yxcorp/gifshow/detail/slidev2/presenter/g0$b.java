package com.yxcorp.gifshow.detail.slidev2.presenter.g0$b;
import tw6.e;
import com.yxcorp.gifshow.detail.slidev2.presenter.g0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import w85.a;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import com.yxcorp.gifshow.entity.QPhoto;

public class g0$b implements e	// class@0019b0
{
    public final g0 a;

    public void g0$b(g0 p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       g0$b uob = g0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (!this.a.v.g()) {
          return;
       }
       this.a.p.setScaleEnabled(false);
       return;
    }
    public void b(int p0){
       g0$b uob = g0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (!this.a.v.g()) {
          return;
       }
       g0$b ta = this.a;
       g0 p = ta.p;
       boolean b = (ta.D == null && !ta.s.isHdr())? true: false;
       p.setScaleEnabled(b);
       return;
    }
}
