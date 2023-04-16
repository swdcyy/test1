package com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotBaseView;
import android.content.Context;
import android.util.AttributeSet;
import vj1.a;
import com.kuaishou.live.common.core.component.gift.domain.slot.config.slotqueue.LiveGiftSlotQueueConfig;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.RelativeLayout;
import com.kuaishou.live.core.basic.widget.LiveGradientBackgroundView;
import com.kuaishou.live.core.basic.widget.LiveGradientBorderView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.core.basic.widget.LiveGradientTextView;
import com.kuaishou.live.common.core.component.gift.domain.slot.springnaming.LiveGiftSlotSpringNamingView;
import lnc.a1;
import d61.j0;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.animation.Animator;
import fk1.a;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import d61.c0;
import com.kuaishou.live.core.show.gift.LiveGiftResourcePathConstant;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import hk1.b;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.AnimatorSet;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView$a;
import com.kuaishou.live.common.core.basic.degrade.LiveDegradeBiz;
import android.view.ViewGroup;

public class LiveGiftSlotItemView extends LiveGiftSlotBaseView	// class@00127c
{
    public Animator m;
    public Animator n;
    public Animator o;
    public AnimatorSet p;
    public View q;
    public LiveGiftSlotSpringNamingView r;
    public a s;
    public static final int t;

    public void LiveGiftSlotItemView(Context p0){
       super(p0, null);
    }
    public void LiveGiftSlotItemView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.s = new a(null, 1, null);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveGiftSlotItemView.class, "13")) {
          return;
       }
       this.j = this.findViewById(0x7f0a10b6);
       this.k = this.findViewById(0x7f0a10b7);
       this.l = this.findViewById(0x7f0a1095);
       this.c = this.findViewById(0x7f0a1d77);
       this.d = this.findViewById(0x7f0a1d73);
       this.g = this.findViewById(0x7f0a1d6b);
       this.e = this.findViewById(0x7f0a1d70);
       this.f = this.findViewById(0x7f0a1d72);
       this.h = this.findViewById(0x7f0a1d74);
       View view = this.findViewById(R.id.live_gift_slot_bg_container);
       this.q = this.findViewById(0x7f0a10b9);
       this.r = this.findViewById(0x7f0a20f7);
       this.i = this.findViewById(0x7f0a1d6d);
       j0.a(view, (float)a1.d(R.dimen.arg_RES_7f0702a4));
       return;
    }
    public void d(int p0){
       if (PatchProxy.isSupport(LiveGiftSlotItemView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftSlotItemView.class, "10")) {
          return;
       }
       if (p0 <= 1) {
          this.f.setVisibility(8);
          return;
       }else {
          this.f.setVisibility(0);
          this.f.setText("x"+p0);
          return;
       }
    }
    public void e(int p0){
       SpannableString spannableStr;
       if (PatchProxy.isSupport(LiveGiftSlotItemView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftSlotItemView.class, "6")) {
          return;
       }
       LiveGiftSlotBaseView te = this.e;
       if (PatchProxy.isSupport(LiveGiftSlotItemView.class)) {
          spannableStr = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveGiftSlotItemView.class, "7");
          if (spannableStr != PatchProxyResult.class) {
          label_0063 :
             te.setText(spannableStr);
             return;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       spannableStr = new SpannableString(String.format("x%d ", objArray));
       spannableStr.setSpan(new AbsoluteSizeSpan(14, 1), 0, 1, 17);
       spannableStr.setSpan(new AbsoluteSizeSpan(20, 1), 1, spannableStr.length(), 17);
       goto label_0063 ;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveGiftSlotItemView.class, "14")) {
          return;
       }
       a.e(this.m);
       this.l.clearAnimation();
       this.f.setVisibility(8);
       this.i.setImageDrawable(null);
       a.e(this.o);
       a.e(this.n);
       a.e(this.p);
       return;
    }
    public void g(int p0,int p1,int p2,boolean p3){
       if (PatchProxy.isSupport(LiveGiftSlotItemView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, LiveGiftSlotItemView.class, "8")) {
          return;
       }
       if (!this.s.e()) {
          return;
       }
       LiveGiftSlotItemView ts = this.s;
       if (!(p2 % ts.q) && (p3 && p0 < ts.p)) {
          String str = c0.a.b(LiveGiftResourcePathConstant.LIVEPAGE_GIFTSLOT_COMBO_STAR_BACKGROUND.getResourcePath());
          if (!PatchProxy.applyVoidOneRefs(str, this, LiveGiftSlotItemView.class, "11")) {
             this.l.setVisibility(0);
             this.l.setAlpha(0x3f800000);
             this.l.setTranslationX(0);
             this.l.L(str);
             this.l.clearAnimation();
             float f = (float)this.getWidth() * this.s.l();
             a.e(this.m);
             float[] uofloatArray = new float[]{0xbf800000 * f,f * this.s.l()};
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.l, View.TRANSLATION_X, uofloatArray);
             this.m = objectAnimat;
             objectAnimat.setDuration((long)this.s.m());
             this.m.setInterpolator(new LinearInterpolator());
             this.m.addListener(new b(this));
             this.m.start();
          }
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0b45;
    }
    public void h(int p0){
       if (PatchProxy.isSupport(LiveGiftSlotItemView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftSlotItemView.class, "5")) {
          return;
       }
       if (!this.s.e()) {
          return;
       }
       int i = 3;
       if (p0 >= i && this.l.getVisibility()) {
          this.l.setVisibility(0);
          this.l.setAlpha(0x3f800000);
          this.l.setTranslationX(0);
          if (p0 == i) {
             this.l.L(c0.a.b(LiveGiftResourcePathConstant.LIVE_GIFT_SLOT_GRADE_3_HALO.getResourcePath()));
          }else {
             this.l.L(c0.a.b(LiveGiftResourcePathConstant.LIVE_GIFT_SLOT_GRADE_4_HALO.getResourcePath()));
          }
          a.e(this.o);
          a.e(this.n);
          a.e(this.p);
          LiveGiftSlotBaseView tl = this.l;
          float[] uofloatArray = new float[]{(float)tl.getWidth() * 0xbf800000,(float)this.getWidth()};
          this.n = ObjectAnimator.ofFloat(tl, View.TRANSLATION_X, uofloatArray);
          this.o = j.a(this.l, new float[2]{0x3f800000,0});
          AnimatorSet uAnimatorSet = new AnimatorSet();
          this.p = uAnimatorSet;
          uAnimatorSet.setDuration((long)this.s.m());
          this.p.addListener(new LiveGiftSlotItemView$a(this));
          Animator[] uAnimatorArr = new Animator[]{this.o,this.n};
          this.p.playTogether(uAnimatorArr);
          j.g(this.p, LiveDegradeBiz.GiftSlot);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGiftSlotItemView.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       this.f();
       return;
    }
    public void setConfig(a p0){
       this.s = p0;
    }
}
