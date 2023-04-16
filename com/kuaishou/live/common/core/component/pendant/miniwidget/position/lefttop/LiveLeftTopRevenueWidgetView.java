package com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.LiveLeftTopRevenueWidgetView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k51.b;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.LiveLeftTopRevenueArrowView;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.LiveMiniWidgetContainerView;
import android.widget.RelativeLayout;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveCommonActivityWidgetConfig;
import java.lang.reflect.Type;
import wg3.a;
import d61.k;
import wv1.x;
import android.view.View$OnClickListener;
import wv1.y;
import wv1.z;
import android.view.ViewOutlineProvider;
import android.animation.ObjectAnimator;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import java.lang.Integer;
import android.util.Property;
import android.animation.ValueAnimator;
import ekd.r;
import wv1.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import wv1.a0;
import android.animation.Animator$AnimatorListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Color;
import va1.l0;
import android.widget.ImageView;

public class LiveLeftTopRevenueWidgetView extends LinearLayout	// class@001701
{
    public a b;
    public a c;
    public boolean d;
    public float e;
    public int f;
    public int g;
    public LiveLeftTopRevenueArrowView h;
    public View i;
    public LiveMiniWidgetContainerView j;
    public View k;
    public ObjectAnimator l;
    public static final int m;

    public void LiveLeftTopRevenueWidgetView(Context p0){
       super(p0, null);
    }
    public void LiveLeftTopRevenueWidgetView(Context p0,AttributeSet p1){
       super(p0, null, 0);
    }
    public void LiveLeftTopRevenueWidgetView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = 0x3f4ccccd;
       int i = a1.a(R.color.arg_RES_7f060846);
       this.f = i;
       this.g = i;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLeftTopRevenueWidgetView.class, "6")) {
       }else {
          a.c(p0, b.a(R.layout.arg_RES_7f0d0c48, 0x7f0d0c49), this);
          this.h = this.findViewById(0x7f0a218a);
          this.j = this.findViewById(0x7f0a1876);
          this.k = this.findViewById(0x7f0a2092);
          this.i = this.findViewById(0x7f0a2093);
          this.h.setVisibility(0);
          this.k.setVisibility(0);
          if (!PatchProxy.applyVoid(null, this, LiveLeftTopRevenueWidgetView.class, "7")) {
             LiveConfigStartupResponse$LiveCommonActivityWidgetConfig liveCommonAc = a.j(LiveConfigStartupResponse$LiveCommonActivityWidgetConfig.class);
             if (liveCommonAc != null) {
                LiveConfigStartupResponse$LiveCommonActivityWidgetConfig mWidgetTrans = liveCommonAc.mWidgetTransparency;
                if (mWidgetTrans - 0x3f800000 <= 0 && mWidgetTrans >= 0) {
                   this.e = mWidgetTrans;
                }
                k.c(liveCommonAc.mDefaultPrimaryColor, a1.a(R.color.arg_RES_7f0600a6));
             }
             this.h.setOnClickListener(new x(this));
             this.k.setOnClickListener(new y(this));
          }
          if (!PatchProxy.applyVoid(null, this, LiveLeftTopRevenueWidgetView.class, "8")) {
             this.setOutlineProvider(new z(this));
             this.setClipToOutline(true);
          }
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveLeftTopRevenueWidgetView.class, "12")) {
          return;
       }
       LiveLeftTopRevenueWidgetView tl = this.l;
       if (tl != null && tl.isRunning()) {
          this.l.removeAllListeners();
          this.l.cancel();
       }
       this.l = null;
       return;
    }
    public final void b(){
       int i4;
       int i7;
       int i8;
       if (PatchProxy.applyVoid(null, this, LiveLeftTopRevenueWidgetView.class, "9")) {
          return;
       }
       int i = 1;
       int i1 = this.d ^ i;
       this.d = i1;
       b.c0(LiveLogTag.LIVE_LEFT_TOP_MINI_WIDGET_FOLD, "ArrowViewOnClick", "mIsFoldStatus", Boolean.valueOf(i1));
       LiveLeftTopRevenueWidgetView td = this.d;
       LiveLeftTopRevenueWidgetView tf = (td != null)? this.f: this.g;
       LiveLeftTopRevenueWidgetView th = this.h;
       Objects.requireNonNull(th);
       int i2 = 2;
       if (!PatchProxy.isSupport(LiveLeftTopRevenueArrowView.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(td), Integer.valueOf(tf), th, LiveLeftTopRevenueArrowView.class, "5")) {
          th.a();
          th.b();
          LiveLeftTopRevenueArrowView c = th.c;
          int i5 = 0x43340000;
          int i6 = 0;
          if (td != null) {
             i7 = LiveLeftTopRevenueArrowView.l;
             i5 = 0;
             i6 = 0x43340000;
             i8 = 0;
          }else {
             i8 = LiveLeftTopRevenueArrowView.l;
             i7 = 0;
          }
          int[] ointArray = new int[i2];
          ointArray[0] = i8;
          ointArray[i] = i7;
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofInt(th, LiveLeftTopRevenueArrowView.m, ointArray);
          if (td != null) {
             objectAnimat1.setStartDelay(200);
          }
          objectAnimat1.setDuration(100);
          float[] uofloatArray1 = new float[i2];
          uofloatArray1[0] = i5;
          uofloatArray1[i] = i6;
          ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(th.h, View.ROTATION, uofloatArray1);
          objectAnimat2.setDuration(300);
          int[] ointArray1 = new int[i2];
          ointArray1[0] = c;
          ointArray1[i] = tf;
          ValueAnimator valueAnimato = r.c(ointArray1);
          valueAnimato.setDuration(300);
          valueAnimato.addUpdateListener(new a(th));
          AnimatorSet uAnimatorSet = new AnimatorSet();
          th.i = uAnimatorSet;
          Animator[] uAnimatorArr = new Animator[]{objectAnimat1,objectAnimat2,valueAnimato};
          uAnimatorSet.playTogether(uAnimatorArr);
          th.i.setInterpolator(new AccelerateDecelerateInterpolator());
          th.i.start();
       }
       td = this.d;
       if (!PatchProxy.isSupport(LiveLeftTopRevenueWidgetView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(td), this, LiveLeftTopRevenueWidgetView.class, "10")) {
          this.a();
          int i3 = - a1.d(0x7f070807);
          if (td != null) {
             i4 = i3;
             i3 = 0;
          }else {
             i4 = 0;
          }
          float[] uofloatArray = new float[i2];
          uofloatArray[0] = (float)i3;
          uofloatArray[i] = (float)i4;
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.j, View.TRANSLATION_X, uofloatArray);
          this.l = objectAnimat;
          objectAnimat.setDuration(300);
          this.l.addListener(new a0(this, td));
          this.l.start();
       }
       return;
    }
    public final int c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLeftTopRevenueWidgetView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.x(p0)) {
          return this.f;
       }
       try{
          return l0.c(Color.parseColor(p0), this.e);
       }catch(java.lang.Exception e0){
          return this.f;
       }
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, LiveLeftTopRevenueWidgetView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.h.getVisibility())? true: false;
       return b;
    }
    public LiveMiniWidgetContainerView getContentContainer(){
       return this.j;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveLeftTopRevenueWidgetView.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       b.Z(LiveLogTag.LIVE_LEFT_TOP_MINI_WIDGET_FOLD, "LiveLeftTopRevenueWidgetView.onDetachedFromWindow");
       this.a();
       return;
    }
    public void setArrowColorWithAnimator(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLeftTopRevenueWidgetView.class, "2")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_LEFT_TOP_MINI_WIDGET_FOLD, "setArrowColorWithAnimator", "targetColor", p0);
       if (!this.h.getVisibility()) {
          int i = this.c(p0);
          this.g = i;
          this.h.setColorWithAnimator(i);
       }
       return;
    }
    public void setArrowTargetColorOnly(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLeftTopRevenueWidgetView.class, "3")) {
          return;
       }
       this.g = this.c(p0);
       return;
    }
    public void setFoldStatusWithoutAnimator(boolean p0){
       if (PatchProxy.isSupport(LiveLeftTopRevenueWidgetView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveLeftTopRevenueWidgetView.class, "4")) {
          return;
       }
       this.d = p0;
       if (!this.h.getVisibility()) {
          LiveLeftTopRevenueWidgetView td = this.d;
          LiveLeftTopRevenueWidgetView tf = (td != null)? this.f: this.g;
          LiveLeftTopRevenueWidgetView th = this.h;
          Objects.requireNonNull(th);
          int i = 0;
          if (!PatchProxy.isSupport(LiveLeftTopRevenueArrowView.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(td), Integer.valueOf(tf), th, LiveLeftTopRevenueArrowView.class, "6")) {
             if (td != null) {
                th.h.setRotation(180.00f);
                th.setLeftCorner(LiveLeftTopRevenueArrowView.l);
             }else {
                th.h.setRotation(0);
                th.setLeftCorner(i);
             }
             th.setPaintColor(tf);
          }
          td = this.i;
          if (p0) {
             i = 8;
          }
          td.setVisibility(i);
       }
       return;
    }
}
