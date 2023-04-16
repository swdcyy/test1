package com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkScoreView;
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
import i2b.a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig;
import java.lang.reflect.Type;
import wg3.a;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType;
import java.lang.Long;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkScoreView$ThumbType;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import z12.x;
import android.graphics.drawable.Drawable;
import ekd.m1;
import java.lang.Integer;
import java.lang.Boolean;
import lnc.a1;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import java.lang.Math;
import bw2.b;
import android.animation.ValueAnimator;
import com.kuaishou.live.core.voiceparty.teampk.widget.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import vv2.g;

public class VoicePartyTeamPkScoreView extends FrameLayout implements d	// class@001944
{
    public TextView b;
    public TextView c;
    public LottieAnimationView d;
    public View e;
    public View f;
    public long g;
    public long h;
    public int i;
    public g j;
    public static final int k;

    public void VoicePartyTeamPkScoreView(Context p0){
       super(p0, null);
    }
    public void VoicePartyTeamPkScoreView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoicePartyTeamPkScoreView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = -1;
       this.h = -1;
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTeamPkScoreView.class, "1")) {
       }else {
          this.doBindView(a.c(p0, R.layout.arg_RES_7f0d16df, this));
       }
       if (!PatchProxy.applyVoid(null, this, VoicePartyTeamPkScoreView.class, "2")) {
          LiveConfigStartupResponse$LivePkConfig mCoolScoreAn = a.B(LiveConfigStartupResponse$LivePkConfig.class).mCoolScoreAnimationMinIncrement;
          this.i = mCoolScoreAn;
          if (mCoolScoreAn <= null) {
             this.i = 208;
          }
       }
       return;
    }
    public final VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType a(long p0,long p1){
       int i = 0;
       if (p0 - i < 0) {
          return VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType.NONE;
       }
       p1 = p1 - p0;
       if (p1 - i <= 0) {
          return VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType.NONE;
       }
       if (p1 - (long)this.i > 0) {
          return VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType.LARGE;
       }
       return VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType.SMALL;
    }
    public void b(long p0,long p1){
       if (PatchProxy.isSupport(VoicePartyTeamPkScoreView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, VoicePartyTeamPkScoreView.class, "4")) {
          return;
       }
       if (this.b != null && this.c != null) {
          int i = 0;
          if ((v2 = p0 - i) >= 0 && (v3 = p1 - i) >= 0) {
             VoicePartyTeamPkScoreView voicePartyTe = 50;
             int i1 = (!v2 && !v3)? 50: (int)((100 * p0) / (p0 + p1));
             boolean b = true;
             if (i1 <= voicePartyTe) {
                this.e(this.e, i1, b);
                this.e(this.f, (i1 - 100), false);
             }else {
                this.e(this.f, (i1 - 100), false);
                this.e(this.e, i1, b);
             }
             this.b.setText(String.valueOf(p0));
             this.c.setText(String.valueOf(p1));
          }
       }
       return;
    }
    public final void c(VoicePartyTeamPkScoreView$ThumbType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTeamPkScoreView.class, "11")) {
          return;
       }
       VoicePartyTeamPkScoreView td = this.d;
       if (td != null && (td.getTag() == null || (!this.d.getTag().equals(p0) || !this.d.p()))) {
          this.d();
          this.d.setTag(p0);
          if (p0 == VoicePartyTeamPkScoreView$ThumbType.LARGE) {
             this.d.setAnimationFromUrl(x.k);
          }else {
             this.d.setAnimationFromUrl(x.l);
          }
          if (this.d.getVisibility()) {
             this.d.setVisibility(0);
          }
          this.d.s();
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTeamPkScoreView.class, "12")) {
          return;
       }
       VoicePartyTeamPkScoreView td = this.d;
       if (td != null) {
          td.setVisibility(4);
          this.d.setTag(null);
          this.d.f();
          this.d.setImageDrawable(null);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTeamPkScoreView.class, "3")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a4505);
       this.c = m1.f(p0, 0x7f0a44eb);
       this.d = m1.f(p0, 0x7f0a44f6);
       this.e = m1.f(p0, 0x7f0a4504);
       this.f = m1.f(p0, 0x7f0a44ea);
       this.d.setAnimationFromUrl(x.k);
       return;
    }
    public final void e(View p0,int p1,boolean p2){
       if (PatchProxy.isSupport(VoicePartyTeamPkScoreView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, VoicePartyTeamPkScoreView.class, "6")) {
          return;
       }
       if (p0 != null) {
          int i = a1.e(36.00f);
          int i1 = n.k(n.d(this));
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          int[] ointArray = new int[]{layoutParams.width,b.a((int)Math.ceil((double)(((float)p1 / 100.00f) * (float)i1)), i, (i1 - i))};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          valueAnimato.setDuration(300);
          a uoa = new a(this, layoutParams, p0, p2, i1, i);
          valueAnimato.addUpdateListener(ointArray);
          valueAnimato.start();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTeamPkScoreView.class, "8")) {
          return;
       }
       super.onDetachedFromWindow();
       VoicePartyTeamPkScoreView tj = this.j;
       if (tj != null) {
          tj.b();
       }
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(VoicePartyTeamPkScoreView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyTeamPkScoreView.class, "9")) {
          return;
       }
       super.setVisibility(p0);
       if (p0) {
          VoicePartyTeamPkScoreView tj = this.j;
          if (tj != null) {
             tj.b();
          }
       }
       return;
    }
}
