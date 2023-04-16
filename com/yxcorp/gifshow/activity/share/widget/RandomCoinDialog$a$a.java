package com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$a$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$a;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog;
import qrd.p;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.a;
import com.airbnb.lottie.LottieAnimationView;
import dnc.v1;
import android.animation.AnimatorSet;
import ix8.b;
import java.lang.Runnable;
import ekd.k1;

public final class RandomCoinDialog$a$a extends AnimatorListenerAdapter	// class@00149c
{
    public final RandomCoinDialog$a a;
    public final ObjectAnimator b;
    public final ObjectAnimator c;
    public final ObjectAnimator d;
    public final ObjectAnimator e;

    public void RandomCoinDialog$a$a(RandomCoinDialog$a p0,ObjectAnimator p1,ObjectAnimator p2,ObjectAnimator p3,ObjectAnimator p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RandomCoinDialog$a$a.class, "1")) {
          return;
       }
       RandomCoinDialog$a a = this.a.a;
       Objects.requireNonNull(a);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(null, a, RandomCoinDialog.class, "6")) {
          ObjectAnimator objectAnimat = PatchProxy.apply(null, a, RandomCoinDialog.class, "3");
          if (objectAnimat == patchProxyRe) {
             objectAnimat = a.C.getValue();
          }
          objectAnimat.start();
          ValueAnimator valueAnimato = PatchProxy.apply(null, a, RandomCoinDialog.class, "2");
          if (valueAnimato == patchProxyRe) {
             valueAnimato = a.B.getValue();
          }
          valueAnimato.start();
          RandomCoinDialog y = a.y;
          if (y == null) {
             a.S("mLottieCoin");
          }
          y.s();
          if (a.E.d != null) {
             Object obj = PatchProxy.apply(null, a, RandomCoinDialog.class, "4");
             if (obj != patchProxyRe) {
             }else {
                obj = a.D.getValue();
             }
             obj.start();
             k1.r(new b(a), 900);
          }
       }
       PatchProxy.onMethodExit(RandomCoinDialog$a$a.class, "1");
       return;
    }
}
