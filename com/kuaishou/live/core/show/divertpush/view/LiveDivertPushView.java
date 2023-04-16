package com.kuaishou.live.core.show.divertpush.view.LiveDivertPushView;
import ml8.d;
import android.widget.LinearLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import d72.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.view.ViewConfiguration;
import c72.f;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView;
import c72.e;
import com.kwai.library.widget.specific.misc.CircleWithStrokeView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c72.c;
import d72.a;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import java.lang.Runnable;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.live.core.show.divertpush.view.LiveDivertPushView$a;
import android.animation.Animator$AnimatorListener;
import android.app.Activity;
import java.lang.Float;
import d61.y;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import java.lang.Number;
import android.view.MotionEvent;
import java.lang.Math;
import android.view.View$OnClickListener;
import com.kuaishou.livestream.message.nano.SCLiveActivityPushV2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.StringBuilder;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.Objects;
import android.text.TextUtils;
import fg6.a;
import com.kuaishou.live.core.show.divertpush.LiveDivertPushRecommendTagModel;
import com.google.gson.Gson;
import com.kuaishou.live.core.show.divertpush.LiveDivertPushRecommendTagModel$TextInfo;
import com.yxcorp.gifshow.widget.LiveCoverIconView$e;
import d61.k;
import android.graphics.drawable.Drawable;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import ekd.j;

public class LiveDivertPushView extends LinearLayout implements d	// class@000afd
{
    public View b;
    public CircleWithStrokeView c;
    public LiveKidLottieAnimationView d;
    public LiveCoverIconView e;
    public TextView f;
    public KwaiCDNImageView g;
    public KwaiImageView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public LinearLayout l;
    public int m;
    public boolean n;
    public boolean o;
    public float p;
    public float q;
    public float r;
    public long s;
    public View$OnClickListener t;
    public final Runnable u;
    public a v;
    public a w;
    public ObjectAnimator x;
    public ObjectAnimator y;
    public static final int A;
    public static final int z;

    static {
       LiveDivertPushView.z = a1.d(0x7f07062b);
       LiveDivertPushView.A = a1.d(0x7f07062c);
    }
    public void LiveDivertPushView(Context p0){
       super(p0, null);
    }
    public void LiveDivertPushView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveDivertPushView(Context p0,AttributeSet p1,int p2){
       int i;
       boolean b;
       super(p0, p1, p2);
       this.u = new b(this);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDivertPushView.class, "2")) {
       }else if(this.a()){
          i = 0x7f0d0ae1;
       }else {
          i = 0x7f0d0ae0;
       }
       a.c(p0, i, this);
       this.doBindView(this);
       this.m = ViewConfiguration.get(p0).getScaledTouchSlop();
       this.v = (this.a())? new f(this.h, this.d): new e(this.b, this.c);
       p0 = PatchProxy.apply(null, this, LiveDivertPushView.class, "10");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else if(c.a() == 2){
          b = true;
       }else {
          b = false;
       }
       if (b && this.e != null) {
          this.w = new a(this.e);
       }
       this.setTranslationY((float)this.getDefaultTranslationYPx());
       return;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, LiveDivertPushView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (c.a())? true: false;
       return b;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveDivertPushView.class, "8")) {
          return;
       }
       this.removeCallbacks(this.u);
       float[] uofloatArray = new float[]{this.getTranslationY(),(float)this.getDefaultTranslationYPx()};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this, "TranslationY", uofloatArray);
       this.y = objectAnimat;
       objectAnimat.setDuration(300);
       this.y.setInterpolator(new DecelerateInterpolator());
       this.y.addListener(new LiveDivertPushView$a(this));
       this.y.start();
       return;
    }
    public void c(Activity p0,boolean p1,float p2){
       if (PatchProxy.isSupport(LiveDivertPushView.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Float.valueOf(p2), this, LiveDivertPushView.class, "6")) {
          return;
       }
       boolean b = y.d(p0);
       if (this.o == b && !p1) {
          return;
       }
       this.o = b;
       LiveDivertPushView ty = this.y;
       if (ty != null && ty.isRunning()) {
          return;
       }
       ty = this.x;
       if (ty != null && ty.isRunning()) {
          this.x.cancel();
       }
       if (b) {
          p2 = (float)a1.e(20.00f);
       }
       this.r = p2;
       if (this.n != null) {
          this.setTranslationY(p2);
       }
       ViewGroup$LayoutParams layoutParams = this.l.getLayoutParams();
       int a = (b)? LiveDivertPushView.A: n.m(p0);
       layoutParams.width = a;
       this.l.setLayoutParams(layoutParams);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDivertPushView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a1bf4);
       this.h = m1.f(p0, 0x7f0a1bf7);
       this.c = m1.f(p0, 0x7f0a288a);
       this.i = m1.f(p0, 0x7f0a1bfc);
       this.j = m1.f(p0, 0x7f0a1bfa);
       this.k = m1.f(p0, 0x7f0a1c00);
       this.l = m1.f(p0, 0x7f0a1c02);
       this.d = m1.f(p0, 0x7f0a2889);
       this.e = m1.f(p0, 0x7f0a1c01);
       this.f = m1.f(p0, 0x7f0a1bfb);
       this.g = m1.f(p0, 0x7f0a1bf6);
       return;
    }
    public final int getDefaultTranslationYPx(){
       Object obj = PatchProxy.apply(null, this, LiveDivertPushView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.a())? a1.d(R.dimen.arg_RES_7f070346): LiveDivertPushView.z;
       return (- i);
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveDivertPushView.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int actionMasked = p0.getActionMasked();
       if (actionMasked) {
          if (actionMasked != 1) {
             if (actionMasked == 2) {
                float f = p0.getY() - this.q;
                float f1 = p0.getX() - this.p;
                if (Math.sqrt((double)((f1 * f1) + (f * f))) - (double)this.m > 0) {
                   if (PatchProxy.isSupport(LiveDivertPushView.class)) {
                      Object obj1 = PatchProxy.applyTwoRefs(Float.valueOf(f1), Float.valueOf(f), this, LiveDivertPushView.class, "4");
                      if (obj1 != patchProxyRe) {
                         b = obj1.booleanValue();
                      }else if(((double)Math.abs(f) * 0x3fe0000000000000) - (double)Math.abs(f1) > 0 && (Math.abs(f) - (float)this.getHeight() < 0 && f < 0)){
                         b = true;
                      }else {
                         b = false;
                      }
                   }else {
                      goto label_0061 ;
                   }
                   if (b) {
                      this.b();
                   }
                }
             }
          }else if(Math.sqrt((double)(((p0.getX() - this.p) * (p0.getX() - this.p)) + ((p0.getY() - this.q) * (p0.getY() - this.q)))) - (double)this.m < 0){
             LiveDivertPushView tt = this.t;
             if (tt != null) {
                tt.onClick(this);
             }
          }
       }else {
          this.p = p0.getX();
          this.q = p0.getY();
       }
       return true;
    }
    public void setOnClickListener(View$OnClickListener p0){
       this.t = p0;
    }
    public void setPushV2Info(SCLiveActivityPushV2 p0){
       int i;
       LiveDivertPushRecommendTagModel liveDivertPu;
       boolean b;
       int c;
       int i3;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDivertPushView.class, "5")) {
          return;
       }
       if (p0.targetAuthorInfo != null) {
          if (TextUtils.x(p0.subTitle)) {
             UserInfos$UserInfo userName = p0.targetAuthorInfo.userName;
             i = 9;
             if (userName.length() > i) {
                userName = TextUtils.A(userName, i)+"...";
             }
             this.j.setText(userName+a1.p(R.string.arg_RES_7f102085));
          }
          this.h.U(e0.i(p0.targetAuthorInfo.headUrls));
       }
       if (!TextUtils.x(p0.title)) {
          this.i.setText(p0.title);
       }
       if (!TextUtils.x(p0.subTitle)) {
          this.j.setText(p0.subTitle);
       }
       SCLiveActivityPushV2 displayOnlin = (p0.isShowOnlineCount != null)? p0.displayOnlineCount: "";
       i = 8;
       if (TextUtils.x(displayOnlin)) {
          this.k.setVisibility(i);
       }else {
          this.k.setText(displayOnlin+a1.p(R.string.arg_RES_7f1013c0));
          this.k.setVisibility(0);
       }
       LiveDivertPushView tw = this.w;
       if (tw != null) {
          SCLiveActivityPushV2 reasonTagJso = p0.reasonTagJson;
          Objects.requireNonNull(tw);
          a uoa = a.class;
          if (!PatchProxy.applyVoidOneRefs(reasonTagJso, tw, uoa, "1") && !TextUtils.isEmpty(reasonTagJso)) {
             int i1 = 0;
             try{
                liveDivertPu = a.a.h(reasonTagJso, LiveDivertPushRecommendTagModel.class);
             }catch(com.google.gson.JsonSyntaxException e0){
             }
             if (liveDivertPu != null) {
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                if (!PatchProxy.applyVoidOneRefs(liveDivertPu, e0, uoa, "2")) {
                   LiveCoverIconView$e obj = PatchProxy.applyOneRefs(liveDivertPu, e0, uoa, "3");
                   int i2 = 1;
                   if (obj != patchProxyRe) {
                      b = obj.booleanValue();
                   }else {
                      LiveDivertPushRecommendTagModel mTextInfo = liveDivertPu.mTextInfo;
                      b = (mTextInfo != null && !TextUtils.isEmpty(mTextInfo.mContent))? true: false;
                   }
                   if (b) {
                      e0.a.setVisibility(0);
                      obj = e0.a.Y();
                      obj.p(liveDivertPu.mTextInfo.mContent);
                      obj.r(9.00f);
                      obj.o(k.c(liveDivertPu.mTextInfo.mTextColor, a.b));
                      Drawable uDrawable = PatchProxy.applyOneRefs(liveDivertPu, e0, uoa, "4");
                      if (uDrawable != patchProxyRe) {
                      }else {
                         b uob = new b();
                         uob.g(KwaiRadiusStyles.R3);
                         if (j.h(liveDivertPu.mBackgroundColor)) {
                            uob.v(a.c);
                         }else {
                            LiveDivertPushRecommendTagModel mBackgroundC = liveDivertPu.mBackgroundColor;
                            if (mBackgroundC.length == i2) {
                               uob.v(k.c(mBackgroundC[0], a.c));
                            }else {
                               LiveDivertPushRecommendTagModel liveDivertPu1 = 2;
                               if (mBackgroundC.length == liveDivertPu1) {
                                  c = a.c;
                                  i3 = k.c(mBackgroundC[0], c);
                                  uob.l(i3, k.c(liveDivertPu.mBackgroundColor[i2], c));
                                  uob.j(liveDivertPu.mBackgroundGradientAngle);
                               }else {
                                  c = a.c;
                                  i3 = k.c(mBackgroundC[0], c);
                                  i2 = k.c(liveDivertPu.mBackgroundColor[i2], c);
                                  uob.m(i3, i2, k.c(liveDivertPu.mBackgroundColor[liveDivertPu1], c));
                                  uob.j(liveDivertPu.mBackgroundGradientAngle);
                               }
                            }
                         }
                         uDrawable = uob.a();
                      }
                      obj.c(uDrawable);
                      obj.a();
                   }
                }
             }
          }
       }
       tw = this.g;
       if (tw != null) {
          tw.n0(R.string.arg_RES_7f1025c8);
       }
       if (this.f != null) {
          displayOnlin = p0.buttonText;
          if (TextUtils.x(displayOnlin)) {
             this.f.setVisibility(i);
          }else {
             this.f.setText(displayOnlin);
             this.f.setVisibility(0);
          }
       }
       displayOnlin = p0.displayDurationMillis;
       this.s = (displayOnlin)? displayOnlin: 5000;
       return;
    }
}
