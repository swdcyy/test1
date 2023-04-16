package com.kuaishou.live.preview.item.bottomcard.handler.k;
import erd.g;
import com.kuaishou.live.preview.item.bottomcard.handler.m;
import ik3.c;
import ok3.l;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import gk3.b;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kk3.f$b;
import hk3.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.animation.ValueAnimator;
import ok3.k;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import bt7.c;
import android.animation.TimeInterpolator;
import ok3.j;
import android.animation.AnimatorSet;
import android.animation.Animator;
import ok3.m;
import ok3.l$c;
import android.animation.Animator$AnimatorListener;

public final class k implements g	// class@000d89
{
    public final m b;
    public final c c;
    public final l d;

    public void k(m p0,c p1,l p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       k tb = this.b;
       k tc = this.c;
       k td = this.d;
       Objects.requireNonNull(tb);
       if (p0.d == null && (TextUtils.n(p0.b, r1.U1(tb.a.d().mEntity)) && p0.c != null)) {
          if (tb.a.c().a() == tc) {
             p0 = new j(tb);
             Objects.requireNonNull(td);
             if (!PatchProxy.applyVoidOneRefs(p0, td, l.class, "4")) {
                td.i.setBackground(a1.f(R.drawable.arg_RES_7f0813e9));
                td.j.setText(a1.p(R.string.arg_RES_7f101034));
                ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                valueAnimato.addUpdateListener(new k(td, td.f.getWidth(), td.i.getWidth()));
                valueAnimato.setDuration(280);
                valueAnimato.setInterpolator(new c(0x3f000000, 0, 0.30f, 0x3f800000));
                ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                valueAnimato1.addUpdateListener(new j(td));
                valueAnimato1.setDuration(150);
                AnimatorSet uAnimatorSet = new AnimatorSet();
                Animator[] uAnimatorArr = new Animator[]{valueAnimato,valueAnimato1};
                uAnimatorSet.playTogether(uAnimatorArr);
                uAnimatorSet.addListener(new m(td, p0));
                uAnimatorSet.start();
             }
          }else if(tb.a.c().d(tc)){
             tb.a.c().c(tc);
          }
       }
       return;
    }
}
