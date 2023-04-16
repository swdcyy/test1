package com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionItemFlipperView$a;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionItemFlipperView;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.ViewFlipper;
import java.util.List;
import com.yxcorp.gifshow.local.sub.entrance.function.model.HeaderFunctionCard;
import android.view.View;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView;
import java.util.Objects;

public final class NearbyFunctionItemFlipperView$a implements Animation$AnimationListener	// class@001aac
{
    public final NearbyFunctionItemFlipperView b;

    public void NearbyFunctionItemFlipperView$a(NearbyFunctionItemFlipperView p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyFunctionItemFlipperView$a.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       NearbyFunctionItemFlipperView j = this.b.J;
       String str = "mHeaderFunctionCards";
       if (j == null) {
          a.S(str);
       }
       HeaderFunctionCard headerFuncti = j.get(this.b.H.getDisplayedChild());
       this.b.H.setFlipInterval((headerFuncti.mDisplaySeconds * 1000));
       View currentView = this.b.H.getCurrentView();
       if (currentView instanceof NearbyFunctionMatchView) {
          currentView.M();
       }
       this.b.M(headerFuncti);
       NearbyFunctionItemFlipperView$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, NearbyFunctionItemFlipperView.class, "1")) {
          if (tb.F != null) {
             tb.F = false;
          }else if(!tb.H.getDisplayedChild()){
             NearbyFunctionItemFlipperView j1 = tb.J;
             if (j1 == null) {
                a.S(str);
             }
             i = j1.size();
          }else {
             i = tb.H.getDisplayedChild();
          }
          i = i - 1;
          NearbyFunctionItemFlipperView j2 = tb.J;
          if (j2 == null) {
             a.S(str);
          }
          HeaderFunctionCard mMomentType = j2.get(i).mMomentType;
          if (mMomentType == 1 || mMomentType == 2) {
             j2 = tb.J;
             if (j2 == null) {
                a.S(str);
             }
             j2.remove(i);
             tb.H.removeViewAt(i);
             tb.F = true;
          }
          if (tb.H.getChildCount() == 1) {
             tb.H.stopFlipping();
          }
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyFunctionItemFlipperView$a.class, "3")) {
          return;
       }
       a.p(p0, "animation");
       return;
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyFunctionItemFlipperView$a.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       return;
    }
}
