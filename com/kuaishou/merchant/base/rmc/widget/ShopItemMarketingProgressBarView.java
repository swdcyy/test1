package com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingProgressBarView;
import at3.b;
import ys3.b;
import ys3.a;
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
import com.kuaishou.merchant.basic.widget.MerchantProgressBar;
import zs3.e;
import at3.a;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Boolean;
import lnc.a1;
import android.graphics.drawable.Drawable;
import java.lang.Float;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentProgressBarInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentDynamicText;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentDynamicText$a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Objects;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextStyle;
import vr3.a;

public final class ShopItemMarketingProgressBarView extends FrameLayout implements b, b, a	// class@001594
{
    public MerchantProgressBar b;
    public ShopItemMarketingComponentProgressBarInfo c;
    public boolean d;
    public boolean e;
    public HashMap f;

    public void ShopItemMarketingProgressBarView(Context p0){
       super(p0, null);
    }
    public void ShopItemMarketingProgressBarView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ShopItemMarketingProgressBarView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingProgressBarView.class, "1")) {
       }else {
          a.b(this.getContext(), R.layout.arg_RES_7f0d08ad, this);
          this.b = this.findViewById(0x7f0a32db);
       }
       return;
    }
    public b c(boolean p0){
       this.d = p0;
       return this;
    }
    public e getItemMarketingViewModel(){
       return a.a(this);
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingProgressBarView.class, "2")) {
          return;
       }
       ShopItemMarketingProgressBarView tb = this.b;
       if (tb == null) {
          a.S("mProgressBar");
       }
       tb.setEnableAdapterLargeFonts(this.d);
       return;
    }
    public void release(){
       PatchProxy.applyVoid(null, this, ShopItemMarketingProgressBarView.class, "14");
    }
    public final void setBgColor(int p0){
       if (PatchProxy.isSupport(ShopItemMarketingProgressBarView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ShopItemMarketingProgressBarView.class, "8")) {
          return;
       }
       ShopItemMarketingProgressBarView tb = this.b;
       if (tb == null) {
          a.S("mProgressBar");
       }
       tb.setBgColor(p0);
       return;
    }
    public void setBusinessType(int p0){
       a.b(this, p0);
    }
    public void setEnableNewStyle(boolean p0){
       if (PatchProxy.isSupport(ShopItemMarketingProgressBarView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ShopItemMarketingProgressBarView.class, "5")) {
          return;
       }
       this.e = p0;
       ShopItemMarketingProgressBarView tb = this.b;
       if (tb == null) {
          a.S("mProgressBar");
       }
       tb.setEnableNewStyle(p0);
       if (p0) {
          ShopItemMarketingProgressBarView tb1 = this.b;
          if (tb1 == null) {
             a.S("mProgressBar");
          }
          tb1.setBgColor(a1.a(R.color.arg_RES_7f06157d));
          tb1 = this.b;
          if (tb1 == null) {
             a.S("mProgressBar");
          }
          tb1.setStartColor(a1.a(R.color.arg_RES_7f06157f));
          tb1 = this.b;
          if (tb1 == null) {
             a.S("mProgressBar");
          }
          tb1.setEndColor(a1.a(R.color.arg_RES_7f06157e));
          tb1 = this.b;
          if (tb1 == null) {
             a.S("mProgressBar");
          }
          tb1.setTextColor(a1.a(R.color.arg_RES_7f061e52));
          tb1 = this.b;
          if (tb1 == null) {
             a.S("mProgressBar");
          }
          tb1.setCurrentProgressEndIsRounded(true);
          tb1 = this.b;
          if (tb1 == null) {
             a.S("mProgressBar");
          }
          tb1.setRadius(a1.d(R.dimen.arg_RES_7f07030a));
       }
       return;
    }
    public final void setIconDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingProgressBarView.class, "13")) {
          return;
       }
       ShopItemMarketingProgressBarView tb = this.b;
       if (tb == null) {
          a.S("mProgressBar");
       }
       tb.setIconDrawable(p0);
       return;
    }
    public void setItemMarketingViewModel(e p0){
       a.c(this, p0);
    }
    public final void setLeftColor(int p0){
       if (PatchProxy.isSupport(ShopItemMarketingProgressBarView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ShopItemMarketingProgressBarView.class, "6")) {
          return;
       }
       ShopItemMarketingProgressBarView tb = this.b;
       if (tb == null) {
          a.S("mProgressBar");
       }
       tb.setStartColor(p0);
       return;
    }
    public final void setPaddingVertical(float p0){
       if (PatchProxy.isSupport(ShopItemMarketingProgressBarView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ShopItemMarketingProgressBarView.class, "10")) {
          return;
       }
       ShopItemMarketingProgressBarView tb = this.b;
       if (tb == null) {
          a.S("mProgressBar");
       }
       tb.setPaddingVertical(p0);
       return;
    }
    public final void setProgressBarInfo(ShopItemMarketingComponentProgressBarInfo p0){
       String text;
       ShopItemMarketingProgressBarView tb1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingProgressBarView.class, "3")) {
          return;
       }
       String str = "2";
       if (!PatchProxy.applyVoid(null, this, ShopItemMarketingProgressBarView.class, str)) {
          tb1 = this.b;
          if (tb1 == null) {
             a.S("mProgressBar");
          }
          tb1.setEnableAdapterLargeFonts(this.d);
       }
       this.c = p0;
       int i = 0;
       if (!TextUtils.isEmpty(p0.getText())) {
          text = p0.getText();
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0.getCurrent()),Integer.valueOf(p0.getTotal())};
          text = ShopItemMarketingComponentDynamicText.Companion.a(p0.getPattern(), objArray);
       }
       if (q.f(p0.getProgressTexts())) {
          ShopItemMarketingProgressBarView tb = this.b;
          if (tb == null) {
             a.S("mProgressBar");
          }
          tb.b(p0.getCurrent(), p0.getTotal(), text);
       }else {
          tb1 = this.b;
          if (tb1 == null) {
             a.S("mProgressBar");
          }
          tb1.c(p0.getCurrent(), p0.getTotal(), p0.getProgressTexts());
       }
       tb1 = this.b;
       if (tb1 == null) {
          a.S("mProgressBar");
       }
       String rightText = p0.getRightText();
       Objects.requireNonNull(tb1);
       if (!PatchProxy.applyVoidOneRefs(rightText, tb1, MerchantProgressBar.class, str)) {
          if (TextUtils.isEmpty(rightText)) {
             tb1.c.setVisibility(8);
          }else {
             tb1.c.setVisibility(i);
             tb1.c.setText(rightText);
          }
       }
       tb1 = this.b;
       if (tb1 == null) {
          a.S("mProgressBar");
       }
       ViewGroup$LayoutParams layoutParams = tb1.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
       ShopItemMarketingComponentTextStyle style = p0.getStyle();
       if (style != null) {
          int mWidth = style.getMWidth();
          i = -2;
          if (mWidth != i) {
             i = -1;
             if (mWidth != i) {
                if (mWidth) {
                   layoutParams.width = (style.getMWidth() > 0)? a1.e((float)style.getMWidth()): a1.e(0x42f00000);
                }else {
                   layoutParams.width = a1.e(0x42f00000);
                }
             }else {
                layoutParams.width = i;
             }
          }else {
             layoutParams.width = i;
          }
       }
       ShopItemMarketingProgressBarView tb2 = this.b;
       if (tb2 == null) {
          a.S("mProgressBar");
       }
       tb2.setLayoutParams(layoutParams);
       return;
    }
    public final void setProgressTextStyle(int p0){
       if (PatchProxy.isSupport(ShopItemMarketingProgressBarView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ShopItemMarketingProgressBarView.class, "11")) {
          return;
       }
       ShopItemMarketingProgressBarView tb = this.b;
       if (tb == null) {
          a.S("mProgressBar");
       }
       tb.setProgressTextStyle(p0);
       return;
    }
    public final void setRightColor(int p0){
       if (PatchProxy.isSupport(ShopItemMarketingProgressBarView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ShopItemMarketingProgressBarView.class, "7")) {
          return;
       }
       ShopItemMarketingProgressBarView tb = this.b;
       if (tb == null) {
          a.S("mProgressBar");
       }
       tb.setEndColor(p0);
       return;
    }
    public void setRowIndex(int p0){
       a.d(this, p0);
    }
    public void setShopItemMarketingComponentInfo(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingProgressBarView.class, "4")) {
          return;
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentProgressBarInfo");
       this.setProgressBarInfo(p0);
       return;
    }
    public final void setTextSize(float p0){
       if (PatchProxy.isSupport(ShopItemMarketingProgressBarView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ShopItemMarketingProgressBarView.class, "9")) {
          return;
       }
       ShopItemMarketingProgressBarView tb = this.b;
       if (tb == null) {
          a.S("mProgressBar");
       }
       tb.setTextSizeDpSp(p0);
       return;
    }
}
