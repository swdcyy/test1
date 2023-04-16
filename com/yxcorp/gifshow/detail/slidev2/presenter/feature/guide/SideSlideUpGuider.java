package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.SideSlideUpGuider;
import j8a.d1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.SideSlideUpGuider$a;
import nsd.u;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.a;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.SideSlideUpGuider$showGuide$1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewParent;
import ga5.d;
import android.widget.TextView;
import android.content.Context;
import java.lang.CharSequence;
import qrd.l1;
import com.airbnb.lottie.LottieAnimationView;

public final class SideSlideUpGuider extends d1	// class@001980
{
    public u h;
    public TextView i;
    public final Activity j;
    public static final SideSlideUpGuider$a k;

    static {
       SideSlideUpGuider.k = new SideSlideUpGuider$a(null);
    }
    public void SideSlideUpGuider(Activity p0){
       a.p(p0, "activity");
       super(0x7f0f0052);
       this.j = p0;
    }
    public void E(a p0,a p1,l p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SideSlideUpGuider.class, "4")) {
          return;
       }
       super.E(new SideSlideUpGuider$showGuide$1(this, p0), p1, p2);
       return;
    }
    public boolean N(){
       Object[] objArray = null;
       ViewStub obj = PatchProxy.apply(objArray, this, SideSlideUpGuider.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.P() == null) {
          obj = this.j.findViewById(R.id.left_up_guide_layout_stub);
          if (obj != null) {
             objArray = obj.getParent();
          }
          if (objArray != null) {
             this.T(d.b(obj));
          }
          View view = this.P();
          if (view == null) {
             view = this.j.findViewById(R.id.left_up_guide_layout);
          }
          this.T(view);
          view = this.P();
          if (view != null) {
             View view1 = view.findViewById(R.id.guide_text_2);
             View view2 = view1;
             view2.setText(view2.getContext().getString(R.string.arg_RES_7f104872));
             a.o(view1, "findViewById<TextView>\(R¡­n_switch_works\)\n        }");
             this.i = view2;
             view = view.findViewById(R.id.left_up_slide_guide_lottie_view);
             a.o(view, "findViewById\(R.id.left_up_slide_guide_lottie_view\)");
             this.U(view);
             this.Q().setRepeatCount(2);
          }
       }
       boolean b = (this.P() != null)? true: false;
       return b;
    }
    public void O(){
       if (PatchProxy.applyVoid(null, this, SideSlideUpGuider.class, "8")) {
          return;
       }
       super.O();
       SideSlideUpGuider ti = this.i;
       if (ti == null) {
          a.S("mGuideTextView");
       }
       ti.setVisibility(8);
       return;
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, SideSlideUpGuider.class, "7")) {
          return;
       }
       super.R();
       SideSlideUpGuider ti = this.i;
       if (ti == null) {
          a.S("mGuideTextView");
       }
       ti.setVisibility(0);
       return;
    }
}
