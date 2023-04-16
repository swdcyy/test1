package com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingCouponView;
import at3.b;
import ys3.a;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import android.widget.TextView;
import android.widget.ImageView;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentCouponInfo;
import kotlin.jvm.internal.a;
import android.text.SpannableStringBuilder;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import y17.a;
import android.text.style.ReplacementSpan;
import com.yxcorp.gifshow.util.span.SpannableStringBuilderUtils;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTimer;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTimer$a;
import zs3.e;
import at3.a;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewParent;
import java.util.Objects;
import com.kuaishou.merchant.base.rmc.RMCLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import android.os.CountDownTimer;
import ot3.u0;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingCouponView$a;
import nsd.u;
import qrd.l1;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextStyle;
import vr3.a;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;

public final class ShopItemMarketingCouponView extends FrameLayout implements b, a	// class@00158e
{
    public TextView b;
    public TextView c;
    public ImageView d;
    public ImageView e;
    public ShopItemMarketingCouponView$a f;
    public ShopItemMarketingComponentCouponInfo g;
    public boolean h;
    public final Drawable i;
    public HashMap j;

    public void ShopItemMarketingCouponView(Context p0){
       super(p0, null);
    }
    public void ShopItemMarketingCouponView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ShopItemMarketingCouponView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = a1.f(0x7f080df9);
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingCouponView.class, "1")) {
       }else {
          this.b = a.b(this.getContext(), 0x7f0d08ab, this).findViewById(0x7f0a4137);
          this.c = this.findViewById(0x7f0a4133);
          this.d = this.findViewById(0x7f0a170f);
          this.e = this.findViewById(0x7f0a363a);
       }
       return;
    }
    public static final ShopItemMarketingComponentCouponInfo a(ShopItemMarketingCouponView p0){
       p0 = p0.g;
       if (p0 == null) {
          a.S("mInfo");
       }
       return p0;
    }
    public static final TextView b(ShopItemMarketingCouponView p0){
       p0 = p0.c;
       if (p0 == null) {
          a.S("tvCouponContent");
       }
       return p0;
    }
    public final SpannableStringBuilder c(ShopItemMarketingComponentCouponInfo p0,long p1){
       SpannableStringBuilder obj;
       if (PatchProxy.isSupport(ShopItemMarketingCouponView.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, ShopItemMarketingCouponView.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new SpannableStringBuilder(p0.getMContent());
       a uoa = new a(this.i, "");
       uoa.c(this.i.getIntrinsicWidth(), this.i.getIntrinsicHeight());
       SpannableStringBuilderUtils.g(obj, uoa);
       if (p1 - null > 0) {
          obj.append(ShopItemMarketingComponentTimer.Companion.a(p1));
       }else {
          obj.append("00:00");
       }
       obj.append(p0.getMTimeSuffix());
       return obj;
    }
    public e getItemMarketingViewModel(){
       return a.a(this);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 4;
       if (PatchProxy.isSupport(ShopItemMarketingCouponView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ShopItemMarketingCouponView.class, "7")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          ViewParent parent = this.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          int measuredWidt = parent.getMeasuredWidth();
          a.s(RMCLogBiz.RMC, "ShopItemMarketingCouponView", "right: "+p3+", parent "+"width:"+' '+measuredWidt);
          if (p3 < measuredWidt) {
             i = 0;
          }
          this.setVisibility(i);
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingCouponView.class, "4")) {
          return;
       }
       ShopItemMarketingCouponView tf = this.f;
       if (tf != null) {
          tf.cancel();
       }
       return;
    }
    public void setBusinessType(int p0){
       a.b(this, p0);
    }
    public final void setCouponInfo(ShopItemMarketingComponentCouponInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingCouponView.class, "2")) {
          return;
       }
       this.g = p0;
       ShopItemMarketingCouponView tb = this.b;
       if (tb == null) {
          a.S("tvCouponType");
       }
       ShopItemMarketingCouponView tg = this.g;
       String str = "mInfo";
       if (tg == null) {
          a.S(str);
       }
       tb.setText(tg.getMPrefix());
       tb = this.g;
       if (tb == null) {
          a.S(str);
       }
       long l = 0;
       if (tb.getMTime() - l > 0) {
          tb = this.g;
          if (tb == null) {
             a.S(str);
          }
          if ((tb.getMTime() - u0.b()) - l > 0) {
             tb = this.g;
             if (tb == null) {
                a.S(str);
             }
             l = tb.getMTime() - u0.b();
          }
          tb = this.c;
          if (tb == null) {
             a.S("tvCouponContent");
          }
          tg = this.g;
          if (tg == null) {
             a.S(str);
          }
          tb.setText(this.c(tg, l));
          ShopItemMarketingCouponView$a uoa = new ShopItemMarketingCouponView$a(this, l, 0, 2, 0);
          v10.start();
          this.f = v10;
       }else {
          tb = this.c;
          if (tb == null) {
             a.S("tvCouponContent");
          }
          tg = this.g;
          if (tg == null) {
             a.S(str);
          }
          SpannableStringBuilder spannableStr = PatchProxy.applyOneRefs(tg, this, ShopItemMarketingCouponView.class, "5");
          if (spannableStr != PatchProxyResult.class) {
          }else {
             spannableStr = new SpannableStringBuilder(tg.getMContent());
          }
          tb.setText(spannableStr);
       }
       ShopItemMarketingComponentTextStyle style = p0.getStyle();
       Integer integer = (style != null)? Integer.valueOf(style.getMFontSize()): null;
       if (integer != null && integer.intValue() > 0) {
          ShopItemMarketingCouponView tb1 = this.b;
          if (tb1 == null) {
             a.S("tvCouponType");
          }
          tb1.setTextSize(1, ((float)integer.intValue() * 0x3f800000));
          tb1 = this.c;
          if (tb1 == null) {
             a.S("tvCouponContent");
          }
          tb1.setTextSize(1, ((float)integer.intValue() * 0x3f800000));
          if (integer.intValue() != 11) {
             this.setTextHeight(-2);
          }
       }
    label_00fc :
       style = p0.getStyle();
       if (style != null) {
          int i = Integer.valueOf(style.getMHeight()).intValue();
          if (i) {
             this.setTextHeight(a1.e(((float)i * 0x3f800000)));
          }
       }
       return;
    }
    public void setEnableNewStyle(boolean p0){
       if (PatchProxy.isSupport(ShopItemMarketingCouponView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ShopItemMarketingCouponView.class, "8")) {
          return;
       }
       this.h = p0;
       if (p0) {
          ShopItemMarketingCouponView td = this.d;
          if (td == null) {
             a.S("ivLeftBg");
          }
          td.setBackground(a1.f(R.drawable.arg_RES_7f080344));
          td = this.e;
          if (td == null) {
             a.S("ivRightBg");
          }
          td.setBackground(a1.f(R.drawable.arg_RES_7f080346));
          td = this.b;
          if (td == null) {
             a.S("tvCouponType");
          }
          td.setTextSize(1, 11.00f);
          td = this.c;
          if (td == null) {
             a.S("tvCouponContent");
          }
          td.setTextSize(1, 11.00f);
          this.setTextHeight(a1.e(16.00f));
       }
       return;
    }
    public void setItemMarketingViewModel(e p0){
       a.c(this, p0);
    }
    public void setRowIndex(int p0){
       a.d(this, p0);
    }
    public void setShopItemMarketingComponentInfo(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingCouponView.class, "3")) {
          return;
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentCouponInfo");
       this.setCouponInfo(p0);
       return;
    }
    public final void setTextHeight(int p0){
       if (PatchProxy.isSupport(ShopItemMarketingCouponView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ShopItemMarketingCouponView.class, "9")) {
          return;
       }
       ShopItemMarketingCouponView tb = this.b;
       String str = "tvCouponType";
       if (tb == null) {
          a.S(str);
       }
       ViewGroup$LayoutParams layoutParams = tb.getLayoutParams();
       layoutParams.height = p0;
       ShopItemMarketingCouponView tb1 = this.b;
       if (tb1 == null) {
          a.S(str);
       }
       tb1.setLayoutParams(layoutParams);
       tb = this.c;
       if (tb == null) {
          a.S("tvCouponContent");
       }
       layoutParams = tb.getLayoutParams();
       layoutParams.height = p0;
       ShopItemMarketingCouponView tc = this.c;
       if (tc == null) {
          a.S("tvCouponContent");
       }
       tc.setLayoutParams(layoutParams);
       return;
    }
}
