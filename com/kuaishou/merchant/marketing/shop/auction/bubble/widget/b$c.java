package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b$c;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.b;
import bs3.a$a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z84.e0;
import java.lang.Runnable;
import ekd.k1;

public class b$c extends AnimatorListenerAdapter	// class@001b93
{
    public final a$a a;
    public final b b;

    public void b$c(b p0,a$a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       k1.s(new e0(this, this.a), this, 200);
       return;
    }
}
