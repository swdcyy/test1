package com.kwai.slide.play.detail.information.caption.j;
import qp7.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.slide.play.detail.information.caption.CaptionView;
import android.content.Context;
import qp7.x0;
import com.kwai.slide.play.detail.information.caption.l;
import qp7.t0;
import com.kwai.slide.play.detail.information.caption.k;
import java.util.Objects;
import kotlin.jvm.internal.a;
import zq7.z;
import com.kwai.slide.play.detail.information.caption.CaptionView$b;
import zq7.y;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import zq7.t;
import zq7.v;
import zq7.w;
import zq7.x;
import zq7.u;
import android.graphics.Paint;

public class j extends d	// class@0017dc
{
    public CaptionView l;
    public TextView m;
    public SpannableStringBuilder n;

    public void j(){
       super();
    }
    public View i(){
       Object obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CaptionView(this.k());
    }
    public void q(x0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "3")) {
       }else {
          j tl = this.l;
          t0 ot0 = this.j();
          d uod = this.i;
          Objects.requireNonNull(tl);
          if (!PatchProxy.applyVoidThreeRefs(ot0, p0, uod, tl, CaptionView.class, "7")) {
             a.p(ot0, "config");
             a.p(p0, "viewModel");
             a.p(uod, "eventBus");
             tl.e = ot0;
             tl.d = p0;
             tl.c = uod;
          }
          this.l.setAnimListener(new z(this));
          y oy = new y(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(oy, p0, l.class, "20")) {
             a.p(oy, "observer");
             p0.l.d(p0.c(), oy);
          }
          p0.l(new t(this));
          p0.j(new v(this));
          p0.k(new w(this));
          p0.g(new x(this));
          p0.h(new u(this));
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       if (this.b.f()) {
          this.f.setLayerType(2, null);
       }
       this.l = this.p();
       return;
    }
}
