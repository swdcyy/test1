package com.kuaishou.live.core.show.enterroom.v2.view.LiveEnterRoomEffectCommonView;
import ml8.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.widget.ShootMarqueeView;
import com.kuaishou.live.core.show.enterroom.v2.view.LiveEnterRoomEffectBackgroundView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import android.widget.Space;
import ekd.k1;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.ImageView;
import java.lang.Float;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.LinearLayout$LayoutParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveEnterRoomEffectCommonView extends ConstraintLayout implements d	// class@000b1e
{
    public KwaiImageView B;
    public KwaiImageView C;
    public TextView D;
    public ShootMarqueeView E;
    public KwaiImageView F;
    public LiveEnterRoomEffectBackgroundView G;
    public ViewGroup H;
    public KwaiImageView I;
    public LiveLottieAnimationView J;
    public Space K;
    public Space L;
    public List M;
    public List N;
    public Animator O;

    public void LiveEnterRoomEffectCommonView(Context p0){
       super(p0, null);
    }
    public void LiveEnterRoomEffectCommonView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveEnterRoomEffectCommonView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.M = new ArrayList();
       this.N = new ArrayList();
       a.d(p0, R.layout.arg_RES_7f0d0aed, this, true);
       this.doBindView(this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEnterRoomEffectCommonView.class, "1")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a1c20);
       this.C = m1.f(p0, 0x7f0a1c22);
       this.D = m1.f(p0, 0x7f0a1c28);
       this.E = m1.f(p0, 0x7f0a1c21);
       this.F = m1.f(p0, 0x7f0a1c1d);
       this.G = m1.f(p0, 0x7f0a1c1e);
       this.H = m1.f(p0, 0x7f0a1c1f);
       this.I = m1.f(p0, 0x7f0a1c24);
       this.J = m1.f(p0, 0x7f0a1c1c);
       this.K = m1.f(p0, 0x7f0a1c27);
       this.L = m1.f(p0, 0x7f0a1c26);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveEnterRoomEffectCommonView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       k1.n(this);
       return;
    }
    public void setAtmosphereViewMarginStart(int p0){
       if (PatchProxy.isSupport(LiveEnterRoomEffectCommonView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveEnterRoomEffectCommonView.class, "22")) {
          return;
       }
       int i = 0;
       if (p0 < 0) {
          i = - p0;
          p0 = 0;
       }
       ViewGroup$LayoutParams layoutParams = this.L.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams.setMarginEnd(i);
       }
       ViewGroup$LayoutParams layoutParams1 = this.J.getLayoutParams();
       if (layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
          layoutParams1.setMarginStart(p0);
       }
       return;
    }
    public void setBackgroundBorderWidth(float p0){
       if (PatchProxy.isSupport(LiveEnterRoomEffectCommonView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveEnterRoomEffectCommonView.class, "16")) {
          return;
       }
       this.G.setBorderWidth(p0);
       return;
    }
    public void setBackgroundRadius(float p0){
       if (PatchProxy.isSupport(LiveEnterRoomEffectCommonView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveEnterRoomEffectCommonView.class, "15")) {
          return;
       }
       this.G.setRadius(p0);
       return;
    }
    public void setBackgroundViewDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEnterRoomEffectCommonView.class, "18")) {
          return;
       }
       this.F.setPlaceHolderImage(p0);
       return;
    }
    public void setLeftIconDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEnterRoomEffectCommonView.class, "3")) {
          return;
       }
       if (p0 == null) {
          this.B.setVisibility(8);
       }else {
          this.B.setPlaceHolderImage(p0);
          this.B.setVisibility(0);
          this.H.setVisibility(0);
       }
       return;
    }
    public void setLeftIconViewLayoutParams(LinearLayout$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEnterRoomEffectCommonView.class, "5")) {
          return;
       }
       this.B.setLayoutParams(p0);
       return;
    }
    public void setMarqueeText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEnterRoomEffectCommonView.class, "10")) {
          return;
       }
       if (TextUtils.x(p0)) {
          this.E.setText("");
          this.E.setVisibility(8);
       }else {
          this.E.setText(p0);
          this.E.setVisibility(0);
          this.D.setVisibility(8);
       }
       return;
    }
    public void setMarqueeTextViewMaxWidth(int p0){
       if (PatchProxy.isSupport(LiveEnterRoomEffectCommonView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveEnterRoomEffectCommonView.class, "11")) {
          return;
       }
       this.E.setMaxWidth(p0);
       return;
    }
    public void setRightIconDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEnterRoomEffectCommonView.class, "4")) {
          return;
       }
       if (p0 == null) {
          this.C.setVisibility(8);
       }else {
          this.C.setPlaceHolderImage(p0);
          this.C.setVisibility(0);
          this.H.setVisibility(0);
       }
       return;
    }
    public void setRightIconViewLayoutParams(LinearLayout$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEnterRoomEffectCommonView.class, "6")) {
          return;
       }
       this.C.setLayoutParams(p0);
       return;
    }
    public void setTailDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEnterRoomEffectCommonView.class, "23")) {
          return;
       }
       this.I.setPlaceHolderImage(p0);
       if (p0 == null) {
          this.I.setVisibility(8);
       }else {
          this.I.setVisibility(0);
       }
       return;
    }
    public void setTailViewMarginStart(int p0){
       if (PatchProxy.isSupport(LiveEnterRoomEffectCommonView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveEnterRoomEffectCommonView.class, "20")) {
          return;
       }
       int i = 0;
       if (p0 < 0) {
          i = - p0;
          p0 = 0;
       }
       ViewGroup$LayoutParams layoutParams = this.K.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams.setMarginEnd(i);
       }
       ViewGroup$LayoutParams layoutParams1 = this.I.getLayoutParams();
       if (layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
          layoutParams1.setMarginStart(p0);
       }
       return;
    }
    public void setText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEnterRoomEffectCommonView.class, "9")) {
          return;
       }
       if (TextUtils.x(p0)) {
          this.D.setText("");
          this.D.setVisibility(8);
       }else {
          this.D.setText(p0);
          this.D.setVisibility(0);
          this.E.setVisibility(8);
       }
       return;
    }
}
