package com.kuaishou.merchant.live.bottombar.view.LiveMerchantAudienceBottomBarView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import com.kuaishou.merchant.live.bottombar.view.LiveMerchantAudienceBottomBarView$b;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.merchant.live.bottombar.view.LiveAutoSwitchBackgroundImageView;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.content.res.Configuration;
import android.widget.ImageView;
import com.kuaishou.merchant.live.bottombar.view.LiveMerchantAudienceBottomBarView$a;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;
import android.view.animation.Animation;
import crd.b;
import lnc.b9;
import ekd.m1;
import com.kuaishou.merchant.api.core.LiveMerchantSkin$Resource;
import com.kuaishou.merchant.live.bottombar.view.LiveMerchantAudienceBottomBarView$c;
import n74.b;
import java.io.FileInputStream;
import java.io.File;
import java.io.InputStream;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import w4.j;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import java.lang.Integer;

public class LiveMerchantAudienceBottomBarView extends FrameLayout implements d	// class@0018df
{
    public LottieAnimationView b;
    public LiveAutoSwitchBackgroundImageView c;
    public LiveMerchantAudienceBottomBarView$b d;
    public b e;
    public static final int f;

    public void LiveMerchantAudienceBottomBarView(Context p0){
       super(p0, null);
    }
    public void LiveMerchantAudienceBottomBarView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveMerchantAudienceBottomBarView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveMerchantAudienceBottomBarView.class, "2")) {
       }else {
          a.b(this.getContext(), this.getLayoutResId(), this);
          this.doBindView(this);
       }
       return;
    }
    public void a(LiveMerchantAudienceBottomBarView$b p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(LiveMerchantAudienceBottomBarView.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, LiveMerchantAudienceBottomBarView.class, "3")) {
          return;
       }
       this.d = p0;
       LiveMerchantAudienceBottomBarView tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.isSupport(LiveAutoSwitchBackgroundImageView.class) || (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p1), Boolean.valueOf(p2), tc, LiveAutoSwitchBackgroundImageView.class, "4") && tc.e == -1)) {
          tc.d = p2;
          tc.c = p1;
          if (!p1) {
             tc.b.setColor(tc.getResources().getColor(R.color.arg_RES_7f061818));
          }else if(tc.getResources().getConfiguration().orientation == 2){
             p1 = true;
          }else {
             p1 = false;
          }
          tc.a(p1);
       }
       this.b.setVisibility(0);
       this.c();
       this.b.a(new LiveMerchantAudienceBottomBarView$a(this));
       this.setAnimationSource(this.d);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantAudienceBottomBarView.class, "11")) {
          return;
       }
       LiveMerchantAudienceBottomBarView tb = this.b;
       if (tb != null) {
          if (tb.getAnimation() != null) {
             this.b.s();
          }else {
             tb = this.d;
             if (tb != null) {
                this.setAnimationSource(tb);
                this.b.s();
             }
          }
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantAudienceBottomBarView.class, "13")) {
          return;
       }
       LiveMerchantAudienceBottomBarView tb = this.b;
       if (tb != null) {
          tb.t();
          this.b.f();
       }
       b9.a(this.e);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantAudienceBottomBarView.class, "12")) {
          return;
       }
       this.c();
       this.d = null;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAudienceBottomBarView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a2566);
       this.c = m1.f(p0, 0x7f0a2565);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d1675;
    }
    public void setAnimationSource(LiveMerchantAudienceBottomBarView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAudienceBottomBarView.class, "8")) {
          return;
       }
       if (p0.b() != -1) {
          this.b.setAnimation(p0.b());
          this.b.s();
       }else {
          LiveMerchantAudienceBottomBarView tb = this.b;
          LiveMerchantSkin$Resource resource = p0.a();
          LiveMerchantAudienceBottomBarView$c uoc = new LiveMerchantAudienceBottomBarView$c(this);
          if (PatchProxy.applyVoidThreeRefs(tb, resource, uoc, null, b.class, "1") || (tb != null && resource != null)) {
             try{
                a.d(new FileInputStream(resource.getFile()), resource.getDir().getAbsolutePath()).addListener(uoc);
             }catch(java.io.IOException e9){
                a.l(MerchantLiveLogBiz.BOTTOM_BAR, "LiveMerchantSkinUtils", "update lottie error", e9);
             }
          }
       }
    }
    public void setShipIconBackground(int p0){
       if (PatchProxy.isSupport(LiveMerchantAudienceBottomBarView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveMerchantAudienceBottomBarView.class, "7")) {
          return;
       }
       this.c.setBackgroundResource(p0);
       return;
    }
    public void setShopIconBackgroundColor(int p0){
       if (PatchProxy.isSupport(LiveMerchantAudienceBottomBarView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveMerchantAudienceBottomBarView.class, "6")) {
          return;
       }
       this.c.setDrawableColor(p0);
       return;
    }
}
