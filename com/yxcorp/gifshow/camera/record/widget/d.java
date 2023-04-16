package com.yxcorp.gifshow.camera.record.widget.d;
import erd.g;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.util.DisplayMetrics;
import cw9.c;
import lnc.a1;
import android.graphics.Rect;
import com.yxcorp.gifshow.camera.record.widget.FocusView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import android.animation.ValueAnimator;
import th0.j;
import android.animation.TimeInterpolator;
import th0.e;
import ki9.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.AnimatorSet;
import android.animation.Animator;
import java.lang.Runnable;
import android.view.View;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import gxc.d;

public final class d implements g	// class@000fe6
{
    public final CameraView b;
    public final float c;
    public final float d;

    public void d(CameraView p0,float p1,float p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          float f = c.c(tb.getResources()).density * 40.00f;
          float f1 = tc - f;
          int i = (int)f1;
          float f2 = tc + f;
          int i1 = (int)f2;
          float f3 = td - f;
          int i2 = (int)f3;
          float f4 = td + f;
          int i3 = (int)f4;
          if (f1 < 0) {
             i1 = (int)(f * 2.00f);
             i = 0;
          }else if(f2 - (float)a1.h() > 0){
             i1 = a1.h();
             i = (int)((float)i1 - (f * 2.00f));
          }
          if (f3 < 0) {
             i3 = (int)(f * 2.00f);
             i2 = 0;
          }else if(f4 - (float)a1.g() > 0){
             i3 = a1.g();
             i2 = (int)((float)i3 - (f * 2.00f));
          }
          f1 = new Rect(i, i2, i1, i3);
          CameraView e = tb.e;
          i = 1;
          boolean b = ((f1.right + FocusView.t) > a1.h())? true: false;
          Objects.requireNonNull(e);
          if (!PatchProxy.isSupport(FocusView.class) || !PatchProxy.applyVoidTwoRefs(f1, Boolean.valueOf(b), e, FocusView.class, "7")) {
             e.e();
             e.i = b;
             e.setCircleArea(f1);
             int i4 = 3;
             ValueAnimator valueAnimato = ValueAnimator.ofInt(new int[i4]{255,205,255});
             e.p = valueAnimato;
             valueAnimato.setInterpolator(new j());
             e.p.setDuration(100);
             ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0x40000000,0x3f800000});
             e.o = valueAnimato1;
             valueAnimato1.setInterpolator(new e());
             e.o.setDuration(200);
             e.o.addUpdateListener(new e(e));
             AnimatorSet uAnimatorSet = new AnimatorSet();
             Animator[] uAnimatorArr = new Animator[]{e.p,e.o};
             uAnimatorSet.playTogether(uAnimatorArr);
             uAnimatorSet.start();
             e.removeCallbacks(e);
             if (e.b != null) {
                e.postDelayed(e, 1000);
             }
             if (!PatchProxy.applyVoid(null, e, FocusView.class, "15")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SHOW_ADJUST_BRIGHTNESS_SLIDER";
                u1.u0(i4, uElementPack, new ClientContent$ContentPackage());
             }
          }
          f1 = tb.i;
          if (f1 != null) {
             f1.b();
          }
       }
       return;
    }
}
