package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import e93.f;
import android.view.ViewPropertyAnimator;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import gf2.a;
import android.view.View;
import zi1.e;
import android.animation.ValueAnimator;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView$b;
import com.kuaishou.live.widget.LiveWealthGradeShimmerLayout;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView$c;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.AnimatorSet$Builder;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView$d;
import android.widget.LinearLayout;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGradientRotateButton;
import android.view.View$OnClickListener;
import ekd.m1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveAudienceGiftBoxHandleView extends FrameLayout	// class@000b43
{
    public AnimatorSet b;
    public LiveGradientRotateButton c;
    public LiveWealthGradeTopCoolShimmerLayout d;
    public static final int e;

    static {
       LiveAudienceGiftBoxHandleView.e = a1.d(0x7f07032e);
    }
    public void LiveAudienceGiftBoxHandleView(Context p0){
       super(p0, null, 0);
    }
    public void LiveAudienceGiftBoxHandleView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceGiftBoxHandleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceGiftBoxHandleView.class, "8")) {
          return;
       }
       this.d();
       LiveAudienceGiftBoxHandleView tb = this.b;
       if (tb != null) {
          tb.end();
       }
       this.b = null;
       f.g(this);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceGiftBoxHandleView.class, "10")) {
          return;
       }
       this.animate().cancel();
       this.setAlpha(0x3f800000);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceGiftBoxHandleView.class, "9")) {
          return;
       }
       this.a();
       this.b = new AnimatorSet();
       ViewGroup$LayoutParams width = this.c.getLayoutParams().width;
       a uoa = new a(this.c);
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0x3f943958});
       valueAnimato.addUpdateListener(new LiveAudienceGiftBoxHandleView$a(this, width));
       valueAnimato.setDuration(200);
       valueAnimato.setInterpolator(new e(0x3ea8f5c3, 0, 0x3f2b851f, 0x3f800000));
       ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[3]{0x3f943958,0x3f6b851f,0x3f800000});
       valueAnimato1.addUpdateListener(new LiveAudienceGiftBoxHandleView$b(this, width));
       valueAnimato1.setInterpolator(new e(0.17f, 0, 0x3f2b851f, 0x3f800000));
       valueAnimato1.setDuration(400);
       ValueAnimator valueAnimato2 = this.d.a();
       valueAnimato2.addListener(new LiveAudienceGiftBoxHandleView$c(this));
       valueAnimato2.setDuration(993).setStartDelay(199);
       this.b.play(valueAnimato).before(valueAnimato1);
       this.b.play(valueAnimato2).with(j.a(this.d, new float[2]{0,0x3f800000}).setDuration(499)).after(valueAnimato1);
       this.b.addListener(new LiveAudienceGiftBoxHandleView$d(this));
       this.b.start();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceGiftBoxHandleView.class, "11")) {
          return;
       }
       this.c.setTranslationX(0);
       this.c.getLayoutParams().width = LiveAudienceGiftBoxHandleView.e;
       this.c.requestLayout();
       this.d.setVisibility(8);
       return;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(LiveAudienceGiftBoxHandleView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAudienceGiftBoxHandleView.class, "4")) {
          return;
       }
       super.setEnabled(p0);
       LiveAudienceGiftBoxHandleView tc = this.c;
       int i = (p0)? 0x7f061c32: 0x7f061c3b;
       tc.setTextColor(a1.a(i));
       this.c.setEnabled(p0);
       return;
    }
    public void setHandleButtonClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBoxHandleView.class, "7")) {
          return;
       }
       m1.a(this, p0, R.id.gift_box_send_button_view);
       return;
    }
    public void setHandleButtonText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBoxHandleView.class, "1")) {
          return;
       }
       this.c.setText(p0);
       int i = (TextUtils.x(p0))? 4: 0;
       this.setVisibility(i);
       return;
    }
}
