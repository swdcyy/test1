package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$f;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AuctionBidButton;
import com.kwai.sdk.switchconfig.a;
import java.util.Objects;
import bh.d;
import android.view.View;
import bh.o;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import z84.f0;
import android.animation.Animator$AnimatorListener;

public class b$f extends AnimatorListenerAdapter	// class@001b96
{
    public final b a;

    public void b$f(b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       boolean b;
       b$f ta;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$f.class, "1")) {
          return;
       }
       this.a.h1.c();
       this.a.h1.b(800, 400, false);
       b = false;
       Object[] objArray = null;
       if (a.t().d("merchantAttributeAnimationUseAE", b)) {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, uob, "35")) {
             if (ta.B1 == null) {
                ta.B1 = d.c().b(ta.X0, "lottie/auction.json", "count_down_twinkle");
             }
             b b1 = ta.B1;
             if (b1 != null) {
                b1.f(-1);
             }
          }
       }else {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, uob, "34")) {
             int i = 1;
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
             propertyValu[b] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[3]{0,0x3f800000,0});
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(ta.X0, propertyValu);
             objectAnimat.setDuration(800);
             PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[i];
             propertyValu1[b] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0});
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(ta.X0, propertyValu1);
             objectAnimat1.setDuration(400);
             if (ta.x1 == null) {
                ta.x1 = new AnimatorSet();
             }
             ta.x1.cancel();
             ta.x1.setInterpolator(new LinearInterpolator());
             Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
             ta.x1.playSequentially(uAnimatorArr);
             ta.x1.removeAllListeners();
             ta.x1.addListener(new f0(ta));
             ta.x1.start();
          }
       }
       return;
    }
}
