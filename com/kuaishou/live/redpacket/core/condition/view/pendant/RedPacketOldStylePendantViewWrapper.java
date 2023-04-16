package com.kuaishou.live.redpacket.core.condition.view.pendant.RedPacketOldStylePendantViewWrapper;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.animation.AnimatorSet;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import va1.n0;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;

public class RedPacketOldStylePendantViewWrapper extends FrameLayout	// class@000ed6
{
    public AnimatorSet b;

    public void RedPacketOldStylePendantViewWrapper(Context p0){
       super(p0);
       this.a();
    }
    public void RedPacketOldStylePendantViewWrapper(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void RedPacketOldStylePendantViewWrapper(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RedPacketOldStylePendantViewWrapper.class, "1")) {
          return;
       }
       this.setClipChildren(false);
       a.k(this, R.layout.arg_RES_7f0d0d99, true);
       return;
    }
    public void addView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketOldStylePendantViewWrapper.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.addView(p0, 0);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, RedPacketOldStylePendantViewWrapper.class, "7")) {
          return;
       }
       RedPacketOldStylePendantViewWrapper tb = this.b;
       if (tb != null) {
          tb.removeAllListeners();
          this.b.end();
       }
       return;
    }
    public final AnimatorSet getContentViewAnim(){
       float f;
       AnimatorSet obj = PatchProxy.apply(null, this, RedPacketOldStylePendantViewWrapper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AnimatorSet();
       float[] uofloatArray = new float[]{(float)n0.f(),f};
       f = (float)(- n.c(a.a().a(), 8.00f));
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this, View.TRANSLATION_X, uofloatArray);
       objectAnimat.setDuration(252);
       float[] uofloatArray1 = new float[]{f,f};
       f = (float)n.c(a.a().a(), 2.00f);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this, View.TRANSLATION_X, uofloatArray1);
       objectAnimat1.setDuration(126);
       uofloatArray1 = new float[]{f,0};
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(this, View.TRANSLATION_X, uofloatArray1);
       objectAnimat2.setDuration(84);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       obj.playSequentially(uAnimatorArr);
       obj.setInterpolator(new LinearInterpolator());
       return obj;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, RedPacketOldStylePendantViewWrapper.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       this.b();
       return;
    }
}
