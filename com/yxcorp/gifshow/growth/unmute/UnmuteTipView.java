package com.yxcorp.gifshow.growth.unmute.UnmuteTipView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView$e;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView$f;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import cra.w;
import q87.c;
import android.widget.ImageView;
import java.lang.StringBuilder;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import bra.b;
import w4.j;
import bra.c;
import bra.d;
import bra.e;
import bra.f;
import bra.g;
import android.text.TextPaint;
import java.lang.CharSequence;
import bra.h;
import android.view.View$OnClickListener;
import java.lang.Integer;
import java.lang.Runnable;
import ekd.k1;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView$d;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView$b;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView$c;

public final class UnmuteTipView extends ConstraintLayout	// class@001591
{
    public LottieAnimationView B;
    public LottieAnimationView C;
    public LottieAnimationView D;
    public boolean E;
    public boolean F;
    public boolean G;
    public View H;
    public TextView I;
    public TextView J;
    public int K;
    public UnmuteTipView$b L;
    public UnmuteTipView$c M;
    public long N;
    public boolean O;
    public final Runnable P;
    public final UnmuteTipView$f Q;
    public static final UnmuteTipView$a R;

    static {
       UnmuteTipView.R = new UnmuteTipView$a(null);
    }
    public void UnmuteTipView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void UnmuteTipView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void UnmuteTipView(Context p0,AttributeSet p1,int p2){
       TextPaint paint;
       a.p(p0, "context");
       super(p0, p1, p2);
       this.P = new UnmuteTipView$e(this);
       this.Q = new UnmuteTipView$f(this);
       ViewGroup.inflate(p0, R.layout.arg_RES_7f0d058e, this);
       this.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, a1.d(R.dimen.arg_RES_7f070335)));
       this.B = this.findViewById(0x7f0a4532);
       this.C = this.findViewById(0x7f0a4533);
       this.D = this.findViewById(0x7f0a4531);
       this.H = this.findViewById(0x7f0a2ece);
       this.I = this.findViewById(0x7f0a2ecf);
       this.J = this.findViewById(0x7f0a4534);
       if (PatchProxy.applyVoid(null, this, UnmuteTipView.class, "1")) {
       }else {
          boolean b = false;
          this.O = b;
          this.K = b;
          String str = a.t().c("growthCdnDomainName", "https://ali2.a.yximgs.com");
          Object[] objArray = new Object[b];
          w.C().s("VolumeTipView", str, objArray);
          UnmuteTipView tD = this.D;
          int i = -1;
          if (tD != null) {
             a.i(tD.getContext(), str+"/kos/nlav10225/ug_client/jzh/data_poke.zip").addListener(new b(tD, this, str)).addFailureListener(new c(this, str));
             tD.setVisibility(8);
             tD.setRepeatCount(i);
          }
          tD = this.C;
          if (tD != null) {
             a.i(tD.getContext(), str+"/kos/nlav10225/ug_client/jzh/data_transfer.zip").addListener(new d(tD, this, str)).addFailureListener(new e(this, str));
             tD.setVisibility(8);
             tD.setRepeatCount(b);
          }
          tD = this.B;
          if (tD != null) {
             a.i(tD.getContext(), str+"/kos/nlav10225/ug_client/jzh/data_shake.zip").addListener(new f(tD, this, str)).addFailureListener(new g(this, str));
             tD.setVisibility(8);
             tD.setRepeatCount(i);
          }
          UnmuteTipView tH = this.H;
          if (tH != null) {
             tH.setAlpha(0);
             this.setBgWidth(b);
          }
          UnmuteTipView tI = this.I;
          boolean b1 = true;
          if (tI != null) {
             paint = tI.getPaint();
             if (paint != null) {
                paint.setFakeBoldText(b1);
             }
             tI.setText(a1.p(R.string.arg_RES_7f101329));
             tI.setAlpha(0);
          }
          tI = this.J;
          if (tI != null) {
             paint = tI.getPaint();
             if (paint != null) {
                paint.setFakeBoldText(b1);
             }
             tI.setAlpha(0);
             tI.setOnClickListener(new h(this));
          }
       }
       return;
    }
    public final void L(int p0){
       if (PatchProxy.isSupport(UnmuteTipView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, UnmuteTipView.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       w.C().w("VolumeTipView", "hide anim tip", objArray);
       k1.m(this.P);
       k1.m(this.Q);
       float[] uofloatArray = new float[]{this.getAlpha(),0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this, "alpha", uofloatArray);
       objectAnimat.setDuration(600);
       objectAnimat.addListener(new UnmuteTipView$d(this));
       objectAnimat.start();
       return;
    }
    public final void M(int p0){
       int i1;
       if (PatchProxy.isSupport(UnmuteTipView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, UnmuteTipView.class, "8")) {
          return;
       }
       UnmuteTipView tB = this.B;
       int i = 0;
       if (tB != null) {
          i1 = (!p0)? 0: 8;
          tB.setVisibility(i1);
       }
       tB = this.C;
       if (tB != null) {
          i1 = (p0 == 1)? 0: 8;
          tB.setVisibility(i1);
       }
       tB = this.D;
       if (tB != null) {
          if (p0 != 2) {
             i = 8;
          }
          tB.setVisibility(i);
       }
       return;
    }
    public final boolean getMLoadError(){
       return this.O;
    }
    public final UnmuteTipView$b getMOnHideListener(){
       return this.L;
    }
    public final UnmuteTipView$c getMOnVolListener(){
       return this.M;
    }
    public final long getMPokeAnimationStartTime(){
       return this.N;
    }
    public final void setBgWidth(int p0){
       if (PatchProxy.isSupport(UnmuteTipView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, UnmuteTipView.class, "7")) {
          return;
       }
       UnmuteTipView tH = this.H;
       if (tH != null) {
          ViewGroup$LayoutParams layoutParams = tH.getLayoutParams();
          layoutParams.width = p0;
          tH.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void setMLoadError(boolean p0){
       this.O = p0;
    }
    public final void setMOnHideListener(UnmuteTipView$b p0){
       this.L = p0;
    }
    public final void setMOnVolListener(UnmuteTipView$c p0){
       this.M = p0;
    }
    public final void setMPokeAnimationStartTime(long p0){
       this.N = p0;
    }
}
