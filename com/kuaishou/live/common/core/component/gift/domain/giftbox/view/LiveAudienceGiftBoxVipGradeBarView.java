package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import zi1.a;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxWealthGradeIncrementProgressBar;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveUserRightsCenterView;
import zi1.b;
import android.view.View$OnClickListener;
import zi1.c;
import java.lang.CharSequence;
import java.lang.Integer;
import java.lang.Long;
import android.text.TextUtils;
import java.lang.Runnable;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Math;
import android.view.View$MeasureSpec;
import com.yxcorp.gifshow.widget.m;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView$a;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.LayerDrawable;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveAudienceGiftBoxVipGradeBarView$b;

public class LiveAudienceGiftBoxVipGradeBarView extends FrameLayout	// class@00120d
{
    public TextView b;
    public RelativeLayout c;
    public TextView d;
    public ProgressBar e;
    public TextView f;
    public KwaiImageView g;
    public KwaiImageView h;
    public LiveGiftBoxWealthGradeIncrementProgressBar i;
    public ViewGroup j;
    public ViewGroup k;
    public LiveUserRightsCenterView l;
    public CharSequence m;
    public boolean n;
    public final Runnable o;
    public boolean p;
    public int q;
    public String r;
    public LiveAudienceGiftBoxVipGradeBarView$b s;
    public static final int[] t;

    static {
       int[] ointArray = new int[]{a1.a(0x7f060556),a1.a(0x7f060557)};
       LiveAudienceGiftBoxVipGradeBarView.t = ointArray;
    }
    public void LiveAudienceGiftBoxVipGradeBarView(Context p0){
       super(p0, null);
    }
    public void LiveAudienceGiftBoxVipGradeBarView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceGiftBoxVipGradeBarView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.n = false;
       this.o = new a(this);
       this.p = false;
       this.q = 0;
       a.c(this.getContext(), R.layout.arg_RES_7f0d0b2b, this);
       if (PatchProxy.applyVoid(null, this, LiveAudienceGiftBoxVipGradeBarView.class, "1")) {
       }else {
          this.b = this.findViewById(0x7f0a2705);
          this.c = this.findViewById(0x7f0a2709);
          this.d = this.findViewById(0x7f0a2704);
          this.f = this.findViewById(0x7f0a2708);
          this.e = this.findViewById(0x7f0a270a);
          this.g = this.findViewById(0x7f0a2707);
          this.h = this.findViewById(0x7f0a270c);
          this.i = this.findViewById(0x7f0a2706);
          this.j = this.findViewById(0x7f0a2703);
          this.k = this.findViewById(0x7f0a270b);
          this.l = this.findViewById(0x7f0a26ff);
          this.c.setOnClickListener(new b(this));
          this.b.setOnClickListener(new c(this));
       }
       return;
    }
    public void a(int p0,CharSequence p1){
       if (PatchProxy.isSupport(LiveAudienceGiftBoxVipGradeBarView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, LiveAudienceGiftBoxVipGradeBarView.class, "3")) {
          return;
       }
       this.b.setText(p1);
       this.b.setVisibility(0);
       this.c.setVisibility(8);
       this.q = p0;
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceGiftBoxVipGradeBarView.class, "2")) {
          return;
       }
       this.b.setVisibility(8);
       this.c.setVisibility(0);
       this.q = 0;
       return;
    }
    public void c(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBoxVipGradeBarView.class, "10")) {
          return;
       }
       long l = 5000;
       if (!PatchProxy.isSupport(LiveAudienceGiftBoxVipGradeBarView.class) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(l), this, LiveAudienceGiftBoxVipGradeBarView.class, "8")) {
          if (TextUtils.isEmpty(p0)) {
             if (this.n != null) {
                this.removeCallbacks(this.o);
                this.n = false;
                this.d.setText(this.m);
             }
          }else {
             this.d.setText(p0);
             this.removeCallbacks(this.o);
             this.n = true;
             this.postDelayed(this.o, l);
          }
       }
       return;
    }
    public void d(String p0,boolean p1){
       if (PatchProxy.isSupport(LiveAudienceGiftBoxVipGradeBarView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveAudienceGiftBoxVipGradeBarView.class, "4")) {
          return;
       }
       b.d0(LiveLogTag.LIVE_VIP_GRADE, "updateUserRightsInfoView", "shouldShowRedDot", Boolean.valueOf(p1), "mLiveUserRightsCenterView.text ", p0);
       this.l.a(p1);
       this.l.b(p0);
       this.l.setVisibility(0);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveAudienceGiftBoxVipGradeBarView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveAudienceGiftBoxVipGradeBarView.class, "22")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = (this.j.getMeasuredWidth() - this.j.getPaddingStart()) - this.j.getPaddingEnd();
       if (this.p == null) {
          p0 = Math.min(a1.d(R.dimen.arg_RES_7f07028f), p0);
       }
       this.k.measure(View$MeasureSpec.makeMeasureSpec(p0, 0x40000000), View$MeasureSpec.makeMeasureSpec(this.k.getMeasuredHeight(), 0x40000000));
       return;
    }
    public void setContentText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBoxVipGradeBarView.class, "7")) {
          return;
       }
       this.m = p0;
       if (this.n == null) {
          this.d.setText(p0);
       }
       return;
    }
    public void setIsLandscape(boolean p0){
       this.p = p0;
    }
    public void setLevelIcon(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBoxVipGradeBarView.class, "11")) {
          return;
       }
       this.f.setText(p0);
       return;
    }
    public void setLiveUserRightsOnClickListener(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBoxVipGradeBarView.class, "5")) {
          return;
       }
       this.l.setOnClickListener(p0);
       return;
    }
    public void setPredictedScoreProgress(int p0){
       if (PatchProxy.isSupport(LiveAudienceGiftBoxVipGradeBarView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAudienceGiftBoxVipGradeBarView.class, "15")) {
          return;
       }
       this.i.setProgress(p0);
       return;
    }
    public void setPredictedScoreProgressBarVisibility(int p0){
       if (PatchProxy.isSupport(LiveAudienceGiftBoxVipGradeBarView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAudienceGiftBoxVipGradeBarView.class, "16")) {
          return;
       }
       this.i.setVisibility(p0);
       return;
    }
    public void setPredictedScoreProgressMax(int p0){
       if (PatchProxy.isSupport(LiveAudienceGiftBoxVipGradeBarView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAudienceGiftBoxVipGradeBarView.class, "14")) {
          return;
       }
       this.i.setMax(p0);
       return;
    }
    public void setScoreProgress(int p0){
       if (PatchProxy.isSupport(LiveAudienceGiftBoxVipGradeBarView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAudienceGiftBoxVipGradeBarView.class, "13")) {
          return;
       }
       this.e.setProgress(p0);
       return;
    }
    public void setScoreProgressColors(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBoxVipGradeBarView.class, "17")) {
          return;
       }
       int i = 2;
       if (p0 == null || p0.length < i) {
          p0 = LiveAudienceGiftBoxVipGradeBarView.t;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0[0])};
       objArray = new Object[]{Integer.valueOf(p0[1])};
       b.d0(LiveLogTag.LIVE_VIP_GRADE, "V-setScoreProgressColors", "c0", String.format("0x%08X", objArray), "c1", String.format("0x%08X", objArray));
       int[] ointArray = new int[i];
       ointArray[0] = a1.a(0x7f062057);
       ointArray[1] = a1.a(0x7f062057);
       LiveAudienceGiftBoxVipGradeBarView$a uoa = new LiveAudienceGiftBoxVipGradeBarView$a(this, GradientDrawable$Orientation.LEFT_RIGHT, ointArray);
       float f = (float)a1.d(0x7f07031b);
       uoa.setCornerRadius(f);
       GradientDrawable gradientDraw = new GradientDrawable(GradientDrawable$Orientation.LEFT_RIGHT, p0);
       gradientDraw.setCornerRadius(f);
       Drawable[] uDrawableArr = new Drawable[i];
       uDrawableArr[0] = uoa;
       uDrawableArr[1] = new ClipDrawable(new ScaleDrawable(gradientDraw, 3, 0x3f800000, 0xbf800000), 3, 1);
       LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr);
       layerDrawabl.setId(0, 0x1020000);
       layerDrawabl.setId(1, 0x102000d);
       this.e.setProgressDrawable(layerDrawabl);
       return;
    }
    public void setScoreProgressMax(int p0){
       if (PatchProxy.isSupport(LiveAudienceGiftBoxVipGradeBarView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAudienceGiftBoxVipGradeBarView.class, "12")) {
          return;
       }
       this.e.setMax(p0);
       return;
    }
    public void setUserRightsId(String p0){
       this.r = p0;
    }
    public void setVipGradeOnClickListener(LiveAudienceGiftBoxVipGradeBarView$b p0){
       this.s = p0;
    }
}
