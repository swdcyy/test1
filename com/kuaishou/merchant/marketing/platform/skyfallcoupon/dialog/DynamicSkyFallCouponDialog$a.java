package com.kuaishou.merchant.marketing.platform.skyfallcoupon.dialog.DynamicSkyFallCouponDialog$a;
import java.lang.Runnable;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.dialog.DynamicSkyFallCouponDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import o84.a;
import ks3.r;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.e$e;
import android.animation.AnimatorSet;
import android.animation.Animator;
import kotlin.jvm.internal.a;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import n84.a;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import n84.b;
import qrd.l1;

public final class DynamicSkyFallCouponDialog$a implements Runnable	// class@001b39
{
    public final DynamicSkyFallCouponDialog b;
    public final boolean c;

    public void DynamicSkyFallCouponDialog$a(DynamicSkyFallCouponDialog p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       DynamicSkyFallCouponDialog$a tb;
       Animator[] uAnimatorArr;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DynamicSkyFallCouponDialog$a.class, "1")) {
          return;
       }
       long l = 500;
       int i = 3;
       int i1 = 1;
       int i2 = 0;
       if (this.c != null) {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, DynamicSkyFallCouponDialog.class, "23")) {
             int[] ointArray = tb.C.d.e();
             if (ointArray == null) {
                tb.dismiss();
             }else if(tb.E == null){
                tb.dismiss();
                tb.C.e.b();
             }else {
                AnimatorSet uAnimatorSet = new AnimatorSet();
                uAnimatorArr = new Animator[i];
                DynamicSkyFallCouponDialog u = tb.u;
                if (u == null) {
                   a.S("mContentRootView");
                }
                uAnimatorArr[i2] = ObjectAnimator.ofFloat(u, View.SCALE_X, new float[2]{0x3f800000,0});
                DynamicSkyFallCouponDialog u1 = tb.u;
                if (u1 == null) {
                   a.S("mContentRootView");
                }
                uAnimatorArr[i1] = ObjectAnimator.ofFloat(u1, View.SCALE_Y, new float[2]{0x3f800000,0});
                DynamicSkyFallCouponDialog u2 = tb.u;
                if (u2 == null) {
                   a.S("mContentRootView");
                }
                uAnimatorArr[2] = ObjectAnimator.ofFloat(u2, View.ALPHA, new float[2]{0x3f800000,0});
                uAnimatorSet.playTogether(uAnimatorArr);
                uAnimatorSet.setDuration(l);
                uAnimatorSet.addListener(new a(tb, ointArray));
                uAnimatorSet.start();
                tb.z = uAnimatorSet;
             }
          }
       }else {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, DynamicSkyFallCouponDialog.class, "22")) {
             float[] uofloatArray = tb.C.e.a();
             if (uofloatArray == null) {
                tb.dismiss();
             }else if(PatchProxy.applyVoid(objArray, tb, DynamicSkyFallCouponDialog.class, "25")){
                DynamicSkyFallCouponDialog q = tb.q;
                if (q == null) {
                   a.S("mDialogReceiveButton");
                }
                int i3 = 8;
                q.setVisibility(i3);
                q = tb.t;
                if (q == null) {
                   a.S("mDialogCloseButton");
                }
                q.setVisibility(i3);
             }
             tb.v.setPivotX(uofloatArray[i2]);
             tb.v.setPivotY(uofloatArray[i1]);
             AnimatorSet uAnimatorSet1 = new AnimatorSet();
             uAnimatorArr = new Animator[i];
             uAnimatorArr[i2] = ObjectAnimator.ofFloat(tb.v, View.SCALE_X, new float[2]{0x3f800000,0x3dcccccd});
             uAnimatorArr[i1] = ObjectAnimator.ofFloat(tb.v, View.SCALE_Y, new float[2]{0x3f800000,0x3dcccccd});
             uAnimatorArr[2] = ObjectAnimator.ofFloat(tb.v, View.ALPHA, new float[2]{0x3f4ccccd,0});
             uAnimatorSet1.playTogether(uAnimatorArr);
             uAnimatorSet1.setDuration(l);
             uAnimatorSet1.setInterpolator(new AccelerateDecelerateInterpolator());
             uAnimatorSet1.addListener(new b(tb));
             uAnimatorSet1.start();
             tb.A = uAnimatorSet1;
          }
       }
       return;
    }
}
