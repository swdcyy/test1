package com.kwai.slide.play.detail.rightactionbar.like.a;
import qp7.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.ViewGroup;
import gs7.a;
import qp7.x0;
import com.kwai.slide.play.detail.rightactionbar.like.b;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import android.content.res.Resources;
import android.widget.TextView;
import qs7.f;
import java.util.Objects;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import qs7.e;
import qs7.b;
import qs7.c;
import uy6.h;
import uy6.b;
import qs7.g;
import qs7.d;
import o56.a;
import lnc.a1;
import java.lang.CharSequence;
import qs7.a;
import android.view.View$OnClickListener;
import qp7.t0;
import android.graphics.Paint;
import com.airbnb.lottie.LottieAnimationView;
import com.kwai.component.uiconfig.burnin.BurnInOptUtils;
import bt7.e;

public class a extends d	// class@001864
{
    public View l;
    public View m;
    public LottieAnimationView n;
    public TextView o;
    public AnimatorSet p;

    public void a(){
       super();
    }
    public View i(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(this.h, 0x7f0d03bd, this.g, false);
    }
    public void q(x0 p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
       }else {
          a to = this.o;
          float f = 0x3f800000;
          float f1 = (NasaSlidePlayExperimentUtil.k())? 0: 0x3f800000;
          to.setShadowLayer(f, f1, f, this.o.getResources().getColor(R.color.arg_RES_7f061ec8));
          f uof = new f(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uof, p0, uob, "16")) {
             a.p(uof, "observer");
             p0.f.d(p0.c(), uof);
          }
          e uoe = new e(this);
          if (!PatchProxy.applyVoidOneRefs(uoe, p0, uob, "4")) {
             a.p(uoe, "observer");
             p0.h.d(p0.c(), uoe);
          }
          b uob1 = new b(this);
          if (!PatchProxy.applyVoidOneRefs(uob1, p0, uob, "2")) {
             a.p(uob1, "observer");
             p0.i.d(p0.c(), uob1);
          }
          c uoc = new c(this);
          if (!PatchProxy.applyVoidOneRefs(uoc, p0, uob, "12")) {
             a.p(uoc, "observer");
             if (h.a.i == null) {
                p0.d.d(p0.c(), uoc);
             }else {
                p0.d.e(p0.c(), uoc);
             }
          }
          g og = new g(this, p0);
          if (!PatchProxy.applyVoidOneRefs(og, p0, uob, "6")) {
             a.p(og, "observer");
             p0.e.d(p0.c(), og);
          }
          d uod = new d(this);
          if (!PatchProxy.applyVoidOneRefs(uod, p0, uob, "9")) {
             a.p(uod, "observer");
             if (h.a.i == null) {
                p0.g.d(p0.c(), uod);
             }else {
                p0.g.e(p0.c(), uod);
             }
          }
          if (a.d()) {
             a tm = this.m;
             if (tm != null) {
                tm.setContentDescription(a1.p(R.string.arg_RES_7f101cb3));
             }
          }
          this.l.setOnClickListener(new a(this));
       }
       return;
    }
    public void r(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       if (this.b.f()) {
          this.f.setLayerType(2, objArray);
       }
       this.m = this.f.findViewById(0x7f0a1784);
       this.l = this.f.findViewById(0x7f0a1778);
       this.n = this.f.findViewById(0x7f0a1775);
       this.o = this.f.findViewById(0x7f0a177d);
       if (BurnInOptUtils.a()) {
          BurnInOptUtils.c(this.m);
          this.o.setTextColor(BurnInOptUtils.e(this.f.getResources().getColor(R.color.arg_RES_7f061c32)));
       }
       e.b.a(this.b, this.f);
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.n.f();
       this.n.t();
       return;
    }
}
