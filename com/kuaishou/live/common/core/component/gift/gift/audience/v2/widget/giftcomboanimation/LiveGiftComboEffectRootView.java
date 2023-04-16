package com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.giftcomboanimation.LiveGiftComboEffectRootView;
import androidx.constraintlayout.widget.ConstraintLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import nl1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils$a;
import android.graphics.BitmapFactory;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.basic.tools.l;
import android.widget.TextView;
import java.lang.Boolean;
import java.lang.Math;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.giftcomboanimation.c;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.giftcomboanimation.c$a;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import d61.l;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.giftcomboanimation.a;
import java.lang.Runnable;
import msd.l;
import android.view.ViewGroup$LayoutParams;
import ekd.m1;
import com.kwai.sdk.switchconfig.a;
import io7.c;

public class LiveGiftComboEffectRootView extends ConstraintLayout	// class@001298
{
    public final SparseArray B;
    public KwaiImageView C;
    public TextView D;
    public LinearLayout E;
    public KwaiImageView F;
    public boolean G;
    public AnimatorSet H;
    public AnimatorSet I;
    public Animator J;
    public final Runnable K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int O;
    public static final int P;

    static {
       LiveGiftComboEffectRootView.L = a1.e(0x41f00000);
       LiveGiftComboEffectRootView.M = a1.e(7.00f);
       LiveGiftComboEffectRootView.N = a1.e(20.00f);
       LiveGiftComboEffectRootView.O = a1.e(100.00f);
       LiveGiftComboEffectRootView.P = a1.e(18.00f);
    }
    public void LiveGiftComboEffectRootView(Context p0){
       super(p0, null);
    }
    public void LiveGiftComboEffectRootView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGiftComboEffectRootView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.B = new SparseArray(12);
       this.G = false;
       this.K = new a(this);
    }
    public final void L(int p0,int p1){
       Bitmap uBitmap;
       if (PatchProxy.isSupport(LiveGiftComboEffectRootView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveGiftComboEffectRootView.class, "10")) {
          return;
       }
       int childCount = this.E.getChildCount();
       int i = p1 + 1;
       while (childCount < i) {
          this.E.addView(new ImageView(this.getContext()), -2, LiveGiftComboEffectRootView.L);
          childCount = childCount + 1;
       }
       i = 0;
       while (i < this.E.getChildCount()) {
          int i1 = 8;
          if (i > p1) {
             this.E.getChildAt(i).setVisibility(i1);
          }else if(i == p1){
             View childAt = this.E.getChildAt(i);
             int m = (this.O(p0))? LiveGiftComboEffectRootView.M: 0;
             int m1 = (this.O(p0))? LiveGiftComboEffectRootView.M: 0;
             childAt.setPadding(m, 0, m1, 0);
             childAt.setVisibility(0);
             if (childAt instanceof ImageView) {
                if (PatchProxy.isSupport(LiveGiftComboEffectRootView.class)) {
                   uBitmap = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveGiftComboEffectRootView.class, "16");
                   if (uBitmap != PatchProxyResult.class) {
                   }else {
                   label_0094 :
                      uBitmap = this.B.get(p0);
                      if (uBitmap == null) {
                         m = (this.O(p0))? LiveGiftComboEffectRootView.P: LiveGiftComboEffectRootView.L;
                         LiveGiftComboButtonAnimationUtils$a h = LiveGiftComboButtonAnimationUtils.h;
                         String str = (this.O(p0))? "comment_combo_n_slash": "comment_combo_n_"+p0;
                         Bitmap uBitmap1 = BitmapFactory.decodeFile(h.a(str));
                         if (uBitmap1 == null) {
                            b.S(LiveLogTag.GIFT.appendTag("LiveGiftComboEffectRootView"), "getComboNumberBitmap bitmap is null", " number is ", Integer.valueOf(p0));
                            uBitmap = null;
                         }else if(uBitmap1.getHeight() == m || !uBitmap1.getHeight()){
                            int i2 = uBitmap1.getWidth() * m;
                            float f = (float)i2 * 0x3f800000;
                            f = f / (float)uBitmap1.getHeight();
                            uBitmap1 = BitmapUtil.U(uBitmap1, (int)f, m, Bitmap$Config.ARGB_8888, 0);
                         }
                         this.B.put(p0, uBitmap1);
                         uBitmap = uBitmap1;
                      }
                   }
                }else {
                   goto label_0094 ;
                }
                if (uBitmap != null) {
                   childAt.setImageBitmap(uBitmap);
                }else {
                   this.E.setVisibility(i1);
                   break ;
                }
             }
          }
          i = i + 1;
       }
       return;
    }
    public void M(){
       if (PatchProxy.applyVoid(null, this, LiveGiftComboEffectRootView.class, "14")) {
          return;
       }
       LiveGiftComboEffectRootView tC = this.C;
       if (tC != null) {
          if (!tC.getVisibility()) {
             l.j(this.C);
          }
          this.C.setVisibility(8);
       }
       return;
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, LiveGiftComboEffectRootView.class, "11")) {
          return;
       }
       this.D.setVisibility(8);
       this.E.setVisibility(8);
       return;
    }
    public final boolean O(int p0){
       boolean b = (p0 == 10)? true: false;
       return b;
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, LiveGiftComboEffectRootView.class, "12")) {
          return;
       }
       LiveGiftComboEffectRootView tF = this.F;
       if (tF != null) {
          l.j(tF);
       }
       return;
    }
    public void Q(int p0,boolean p1){
       String obj;
       int i1;
       int i3;
       int i4;
       int i5;
       ObjectAnimator objectAnimat1;
       SparseArray a;
       AnimatorSet uAnimatorSet = this;
       if (PatchProxy.isSupport(LiveGiftComboEffectRootView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), uAnimatorSet, LiveGiftComboEffectRootView.class, "5")) {
          return;
       }
       int i = Math.min(p0, 0x1869f);
       uAnimatorSet.setVisibility(0);
       c$a b = c.b;
       Objects.requireNonNull(b);
       c$a uoa = c$a.class;
       String str = -1;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(i), b, uoa, "1");
          if (obj != PatchProxyResult.class) {
             i1 = obj.intValue();
          }else {
          label_004d :
             b.b();
             i1 = c.a.size();
             i4 = 0;
             while (true) {
                if (i4 < i1) {
                   int i8 = c.a.keyAt(i4);
                   if (i <= i8) {
                      i1 = i8;
                   }else {
                      i4 = i4 + 1;
                   }
                }else {
                   a = c.a;
                   i4 = a.size() + str;
                   i1 = a.keyAt(i4);
                }
             }
          }
       }else {
          goto label_004d ;
       }
       LiveGiftComboEffectRootView liveGiftComb = 0x3f800000;
       Object[] objArray = null;
       int i2 = 1;
       if (!PatchProxy.isSupport(LiveGiftComboEffectRootView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), uAnimatorSet, LiveGiftComboEffectRootView.class, "6")) {
          uoa = c.b;
          if (uoa.c(i1)) {
             uAnimatorSet.D.setVisibility(8);
          }else {
             CharSequence text = uAnimatorSet.D.getText();
             obj = uoa.a(i);
             int i6 = TextUtils.n(obj, uAnimatorSet.D.getText()) ^ i2;
             float f = 0;
             if (uoa.d(i)) {
                if (!PatchProxy.applyVoid(objArray, uAnimatorSet, LiveGiftComboEffectRootView.class, "3")) {
                   if (uAnimatorSet.I == null) {
                      ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(uAnimatorSet.D, View.SCALE_X, new float[2]{0x3f99999a,0x3f800000}).setDuration(120);
                      objectAnimat1 = ObjectAnimator.ofFloat(uAnimatorSet.D, View.SCALE_Y, new float[2]{0x3f99999a,0x3f800000}).setDuration(120);
                      objectAnimat.setStartDelay(120);
                      objectAnimat1.setStartDelay(120);
                      AnimatorSet uAnimatorSet1 = new AnimatorSet();
                      uAnimatorSet.I = uAnimatorSet1;
                      uAnimatorSet1.setInterpolator(new l(0x3ea8f5c3, f, 0x3f2b851f, liveGiftComb));
                      Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(uAnimatorSet.D, View.SCALE_X, new float[2]{0x3f800000,0x3f99999a}).setDuration(120),ObjectAnimator.ofFloat(uAnimatorSet.D, View.SCALE_Y, new float[2]{0x3f800000,0x3f99999a}).setDuration(120),objectAnimat,objectAnimat1};
                      uAnimatorSet.I.playTogether(uAnimatorArr);
                   }
                   uAnimatorSet.I.start();
                }
             }else if(i6 && (TextUtils.x(text) || PatchProxy.applyVoid(null, uAnimatorSet, LiveGiftComboEffectRootView.class, "2"))){
                if (uAnimatorSet.H == null) {
                   float[] uofloatArray = new float[]{(float)a1.e(39.00f),(float)a1.e(-8.00f)};
                   float[] uofloatArray1 = new float[]{(float)a1.e(-8.00f),f};
                   ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(uAnimatorSet.D, View.TRANSLATION_Y, uofloatArray1).setDuration(180);
                   objectAnimat1 = ObjectAnimator.ofFloat(uAnimatorSet.D, View.SCALE_X, new float[2]{0x3f8a3d71,0x3f800000}).setDuration(180);
                   ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(uAnimatorSet.D, View.SCALE_Y, new float[2]{0x3f8a3d71,0x3f800000}).setDuration(180);
                   objectAnimat2.setStartDelay(180);
                   objectAnimat1.setStartDelay(180);
                   objectAnimat3.setStartDelay(180);
                   AnimatorSet uAnimatorSet2 = new AnimatorSet();
                   uAnimatorSet.H = uAnimatorSet2;
                   Animator[] uAnimatorArr1 = new Animator[]{ObjectAnimator.ofFloat(uAnimatorSet.D, View.TRANSLATION_Y, uofloatArray).setDuration(180),ObjectAnimator.ofFloat(uAnimatorSet.D, View.SCALE_X, new float[2]{0,0x3f8a3d71}).setDuration(180),ObjectAnimator.ofFloat(uAnimatorSet.D, View.SCALE_Y, new float[2]{0,0x3f8a3d71}).setDuration(180),objectAnimat2,objectAnimat1,objectAnimat3};
                   uAnimatorSet2.playTogether(uAnimatorArr1);
                }
                LiveGiftComboEffectRootView i7 = uAnimatorSet.I;
                if (i7 != null && i7.isRunning()) {
                   uAnimatorSet.I.cancel();
                }
                uAnimatorSet.H.start();
             }
             uAnimatorSet.D.setVisibility(0);
             if (i6) {
                uAnimatorSet.D.setText(obj);
             }
          }
       }
       if (!PatchProxy.isSupport(LiveGiftComboEffectRootView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), uAnimatorSet, LiveGiftComboEffectRootView.class, "7")) {
          uAnimatorSet.E.setVisibility(0);
          if (!c.b.c(i1)) {
             uAnimatorSet.R(-1, LiveGiftComboEffectRootView.N, 0x800003);
             i3 = 0;
             while (i1 > 0) {
                i4 = i1 % 10;
                uAnimatorSet.L(i4, i3);
                i3 = i3 + 1;
                i1 = i1 / 10;
             }
             uAnimatorSet.L(10, i3);
             i1 = 1;
             i5 = i3 + i1;
          }else {
             i1 = 1;
             uAnimatorSet.R(LiveGiftComboEffectRootView.O, 0, 17);
             i5 = 0;
          }
          while (i > 0) {
             i3 = i % 10;
             uAnimatorSet.L(i3, i5);
             i5 = i5 + i1;
             i = i / 10;
             i1 = 1;
          }
       }
       if (p1 && uAnimatorSet.G == null) {
          if (!PatchProxy.applyVoid(null, uAnimatorSet, LiveGiftComboEffectRootView.class, "9")) {
             LiveGiftComboEffectRootView j = uAnimatorSet.J;
             if (j != null && j.isRunning()) {
                uAnimatorSet.J.end();
             }
             if (uAnimatorSet.F.getVisibility()) {
                uAnimatorSet.F.setAlpha(0x3f800000);
                uAnimatorSet.F.setVisibility(0);
             }
             if (!l.i(uAnimatorSet.F)) {
                l.b(uAnimatorSet.F, LiveGiftComboButtonAnimationUtils.h.a("live_combo_press_atmosphere"), true, null, a.b);
             }
          }
          uAnimatorSet.F.removeCallbacks(uAnimatorSet.K);
          uAnimatorSet.F.postDelayed(uAnimatorSet.K, 200);
       }
       return;
    }
    public final void R(int p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveGiftComboEffectRootView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, LiveGiftComboEffectRootView.class, "8")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.E.getLayoutParams();
       if (layoutParams.width != p0) {
          layoutParams.width = p0;
          this.E.setPadding(0, 0, p1, 0);
          this.E.setGravity(p2);
          this.E.setLayoutParams(layoutParams);
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveGiftComboEffectRootView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.D = m1.f(this, 0x7f0a0842);
       this.E = m1.f(this, 0x7f0a0843);
       this.G = a.t().u("SOURCE_LIVE").d("isLiveGiftLinkLowPhone", false);
       return;
    }
}
