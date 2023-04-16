package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$e;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b;
import android.animation.ValueAnimator;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.animation.ObjectAnimator;

public class b$e extends AnimatorListenerAdapter	// class@001b95
{
    public final ValueAnimator a;
    public final b b;

    public void b$e(b p0,ValueAnimator p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
          return;
       }
       this.b.Z.setImageResource(R.drawable.arg_RES_7f080124);
       this.b.X0.setVisibility(0);
       this.b.A1.start();
       this.a.start();
       return;
    }
}
