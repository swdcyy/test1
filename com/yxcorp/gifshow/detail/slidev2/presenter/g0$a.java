package com.yxcorp.gifshow.detail.slidev2.presenter.g0$a;
import jta.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.g0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;

public class g0$a extends a	// class@0019af
{
    public final g0 a;

    public void g0$a(g0 p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       g0$a uoa = g0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       boolean b = true;
       boolean b1 = (p0 - 0x3f800000)? true: false;
       uoa.D = b1;
       g0 p = uoa.p;
       if (b1 || uoa.s.isHdr()) {
          b = false;
       }
       p.setScaleEnabled(b);
       return;
    }
}
