package com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import x64.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import java.lang.Runnable;
import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView$c;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView$a;
import android.view.View$OnClickListener;
import ekd.m1;
import com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView$b;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View$MeasureSpec;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView$d;
import java.lang.Integer;
import java.lang.StringBuilder;
import lnc.a1;
import java.lang.CharSequence;

public class LiveMerchantAnchorAskInterpretPendantView extends FrameLayout implements d	// class@001aae
{
    public View b;
    public View c;
    public TextView d;
    public boolean e;
    public int f;
    public ValueAnimator g;
    public Runnable h;
    public m i;
    public m j;
    public LiveMerchantAnchorAskInterpretPendantView$d k;
    public static final int l;

    public void LiveMerchantAnchorAskInterpretPendantView(Context p0){
       super(p0, null);
    }
    public void LiveMerchantAnchorAskInterpretPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveMerchantAnchorAskInterpretPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = new b(this);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAnchorAskInterpretPendantView.class, "2")) {
       }else if(p0 == null){
          a.b(p0, R.layout.arg_RES_7f0d0c89, this);
          this.doBindView(this);
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantAnchorAskInterpretPendantView.class, "12")) {
          return;
       }
       this.removeCallbacks(this.h);
       LiveMerchantAnchorAskInterpretPendantView tg = this.g;
       if (tg != null) {
          tg.cancel();
          this.g = null;
       }
       this.c.animate().cancel();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantAnchorAskInterpretPendantView.class, "9")) {
          return;
       }
       this.e = false;
       ViewPropertyAnimator viewProperty = this.c.animate();
       viewProperty.cancel();
       this.c.setTranslationX(0);
       this.c.setAlpha(0x3f800000);
       viewProperty.alpha(0).translationX((float)this.getAnimatePendantWidth()).setDuration(500).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new LiveMerchantAnchorAskInterpretPendantView$c(this));
       viewProperty.start();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAnchorAskInterpretPendantView.class, "1")) {
          return;
       }
       m1.a(p0, new LiveMerchantAnchorAskInterpretPendantView$a(this), R.id.view_normal_pendant);
       this.b = m1.f(p0, 0x7f0a34e6);
       View view = m1.f(p0, R.id.view_animate_pendant);
       this.c = view;
       view.setOnClickListener(new LiveMerchantAnchorAskInterpretPendantView$b(this));
       this.d = m1.f(p0, 0x7f0a4205);
       return;
    }
    public final int getAnimatePendantWidth(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantAnchorAskInterpretPendantView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.c.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
       return this.c.getMeasuredWidth();
    }
    public void setAnimatePendantClickListener(m p0){
       this.j = p0;
    }
    public void setAskInterpretPendantViewChangedListener(LiveMerchantAnchorAskInterpretPendantView$d p0){
       this.k = p0;
    }
    public void setNormalPendantClickListener(m p0){
       this.i = p0;
    }
    public final void setPersonNumViewText(int p0){
       if (PatchProxy.isSupport(LiveMerchantAnchorAskInterpretPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveMerchantAnchorAskInterpretPendantView.class, "11")) {
          return;
       }
       String str = ((long)p0 - 0xf4240 < 0)? String.valueOf(p0): (p0 / 10000)+"w+";
       this.d.setText(a1.r(R.string.arg_RES_7f103bd8, str));
       return;
    }
    public void setRedDotViewVisibility(int p0){
       if (PatchProxy.isSupport(LiveMerchantAnchorAskInterpretPendantView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveMerchantAnchorAskInterpretPendantView.class, "3")) {
          return;
       }
       this.b.setVisibility(p0);
       return;
    }
}
