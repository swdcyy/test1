package com.kuaishou.merchant.marketing.platform.skyfallcoupon.widget.CouponDisplayTitleView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Integer;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.merchant.marketing.base.widget.MerchantKwaiImageViewEx;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import android.text.TextPaint;
import android.graphics.Paint;
import android.animation.AnimatorSet;
import com.airbnb.lottie.ex.LottieAnimationView;

public final class CouponDisplayTitleView extends FrameLayout	// class@001b60
{
    public final String b;
    public MerchantKwaiImageViewEx c;
    public MerchantKwaiImageViewEx d;
    public FrameLayout e;
    public FrameLayout f;
    public TextView g;
    public TextView h;
    public View i;
    public Context j;
    public Integer k;
    public String l;
    public Integer m;
    public AnimatorSet n;
    public CDNUrl[] o;
    public LottieAnimationView p;
    public HashMap q;

    public void CouponDisplayTitleView(Context p0){
       super(p0);
       this.b = "img_7.png";
       this.l = "";
       this.m = Integer.valueOf(0);
       this.a(p0);
    }
    public void CouponDisplayTitleView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = "img_7.png";
       this.l = "";
       this.m = Integer.valueOf(0);
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CouponDisplayTitleView.class, "1")) {
          return;
       }
       boolean b = false;
       this.setClipChildren(b);
       this.setClipToPadding(b);
       this.j = p0;
       if (p0 != null) {
          LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d166c, this);
          this.c = this.findViewById(0x7f0a14f1);
          this.d = this.findViewById(0x7f0a1550);
          this.h = this.findViewById(0x7f0a4160);
          this.e = this.findViewById(0x7f0a0ed2);
          this.f = this.findViewById(0x7f0a0efb);
          this.i = this.findViewById(0x7f0a43ae);
          this.g = this.findViewById(0x7f0a4161);
          CouponDisplayTitleView ti = this.i;
          if (ti != null) {
             ti.setVisibility(8);
          }
       }
       return;
    }
    public final String getM_CONTAINER_IMAGE_LAYER(){
       return this.b;
    }
    public final int getTextAnimateWidth(){
       Object[] objArray = null;
       CouponDisplayTitleView obj = PatchProxy.apply(objArray, this, CouponDisplayTitleView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.f;
       if (obj != null) {
          objArray = Integer.valueOf(obj.getWidth());
       }
       if (objArray != null && objArray.intValue() > 0) {
          return objArray.intValue();
       }else {
          obj = this.g;
          String str = "tvDisplayTitlePlace";
          if (obj == null) {
             a.S(str);
          }
          float f = obj.getPaint().measureText(this.l);
          CouponDisplayTitleView tg = this.g;
          if (tg == null) {
             a.S(str);
          }
          return (int)(f + (float)(tg.getPaddingLeft() * 2));
       }
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, CouponDisplayTitleView.class, "10")) {
          return;
       }
       super.onDetachedFromWindow();
       if (!PatchProxy.applyVoid(null, this, CouponDisplayTitleView.class, "5")) {
          CouponDisplayTitleView tn = this.n;
          if (tn != null) {
             tn.removeAllListeners();
             tn.cancel();
          }
          this.n = null;
       }
       return;
    }
    public final void setAttachLottieView(LottieAnimationView p0){
       this.p = p0;
    }
}
