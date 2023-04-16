package com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingTimerView;
import at3.b;
import ys3.b;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import java.util.Objects;
import android.widget.TextView;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTimer;
import java.lang.Long;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTimerPattern;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.jvm.internal.a;
import lnc.a1;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTimer$a;
import zsd.u;
import zs3.e;
import at3.a;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingTimerView$b;
import android.text.TextUtils$TruncateAt;
import android.os.CountDownTimer;
import vr3.a;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextStyle;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.System;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingTimerView$a;
import nsd.u;
import qrd.l1;

public final class ShopItemMarketingTimerView extends FrameLayout implements b, b	// class@001599
{
    public TextView b;
    public ShopItemMarketingTimerView$a c;
    public ShopItemMarketingComponentTimer d;
    public ShopItemMarketingTimerView$b e;
    public boolean f;
    public HashMap g;

    public void ShopItemMarketingTimerView(Context p0){
       super(p0);
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingTimerView.class, "1")) {
       }else {
          View view = a.b(this.getContext(), R.layout.arg_RES_7f0d08af, this).findViewById(R.id.chronometer);
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.TextView");
          this.b = view;
       }
       return;
    }
    public final void a(long p0,ShopItemMarketingComponentTimer p1){
       ShopItemMarketingTimerView tb1;
       if (PatchProxy.isSupport(ShopItemMarketingTimerView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, ShopItemMarketingTimerView.class, "6")) {
          return;
       }
       Iterator iterator = p1.getMPatterns().iterator();
       while (iterator.hasNext()) {
          ShopItemMarketingComponentTimerPattern shopItemMark = iterator.next();
          if (!TextUtils.isEmpty(shopItemMark.getMTextColor())) {
             ShopItemMarketingTimerView tb = this.b;
             if (tb == null) {
                a.S("mChronometer");
             }
             tb.setTextColor(TextUtils.J(shopItemMark.getMTextColor(), a1.a(R.color.arg_RES_7f061dfb)));
          }
          List condition = shopItemMark.getCondition();
          long l = condition.get(0).longValue() + 1;
          int i = 1;
          long l1 = condition.get(i).longValue();
          if (l - p0 <= 0 && l1 - p0 > 0) {
             if (shopItemMark.getMType() == i) {
                String str = ShopItemMarketingComponentTimer.Companion.a(p0);
                tb1 = this.b;
                if (tb1 == null) {
                   a.S("mChronometer");
                }
                tb1.setText(u.k2(shopItemMark.getMPattern(), "${0}", str, false, 4, null));
                break ;
             }else if(shopItemMark.getMType() == 2){
                tb1 = this.b;
                if (tb1 == null) {
                   a.S("mChronometer");
                }
                tb1.setText(shopItemMark.getMPattern());
                break ;
             }else {
                break ;
             }
          }
       }
       return;
    }
    public b c(boolean p0){
       this.f = p0;
       return this;
    }
    public e getItemMarketingViewModel(){
       return a.a(this);
    }
    public final ShopItemMarketingTimerView$b getMTimeOutListener(){
       return this.e;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingTimerView.class, "2")) {
          return;
       }
       ShopItemMarketingTimerView tb = this.b;
       String str = "mChronometer";
       if (tb == null) {
          a.S(str);
       }
       tb.setSingleLine(true);
       tb = this.b;
       if (tb == null) {
          a.S(str);
       }
       tb.setMaxLines(true);
       tb = this.b;
       if (tb == null) {
          a.S(str);
       }
       tb.setEllipsize(TextUtils$TruncateAt.END);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingTimerView.class, "5")) {
          return;
       }
       this.e = null;
       ShopItemMarketingTimerView tc = this.c;
       if (tc != null) {
          tc.cancel();
       }
       return;
    }
    public void setBusinessType(int p0){
       a.b(this, p0);
    }
    public void setItemMarketingViewModel(e p0){
       a.c(this, p0);
    }
    public final void setMTimeOutListener(ShopItemMarketingTimerView$b p0){
       this.e = p0;
    }
    public void setRowIndex(int p0){
       a.d(this, p0);
    }
    public void setShopItemMarketingComponentInfo(a p0){
       ShopItemMarketingTimerView tb2;
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingTimerView.class, "4")) {
          return;
       }
       int i = 1;
       String str = "mChronometer";
       if (!PatchProxy.applyVoid(null, this, ShopItemMarketingTimerView.class, "2")) {
          tb2 = this.b;
          if (tb2 == null) {
             a.S(str);
          }
          tb2.setSingleLine(i);
          tb2 = this.b;
          if (tb2 == null) {
             a.S(str);
          }
          tb2.setMaxLines(i);
          tb2 = this.b;
          if (tb2 == null) {
             a.S(str);
          }
          tb2.setEllipsize(TextUtils$TruncateAt.END);
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTimer");
       if (!PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingTimerView.class, "3")) {
          ShopItemMarketingComponentTextStyle style = p0.getStyle();
          if (style != null) {
             if (style.getMFontSize() > 0) {
                ShopItemMarketingTimerView tb = this.b;
                if (tb == null) {
                   a.S(str);
                }
                tb.setTextSize(i, ((float)style.getMFontSize() * 0x3f800000));
             }
             if (!TextUtils.isEmpty(style.getMTextColor())) {
                ShopItemMarketingTimerView tb1 = this.b;
                if (tb1 == null) {
                   a.S(str);
                }
                tb1.setTextColor(TextUtils.J(style.getMTextColor(), a1.a(R.color.arg_RES_7f061dfb)));
             }
          }
          this.d = p0;
          if (!TextUtils.isEmpty(p0.getMText())) {
             tb2 = this.b;
             if (tb2 == null) {
                a.S(str);
             }
             tb2.setText(p0.getMText());
          }else {
             Long longx = b.a(0x3b1f7b44).a();
             if (longx == null) {
                longx = Long.valueOf(System.currentTimeMillis());
             }
             long l = p0.getMTime() - longx.longValue();
             if (l - null > 0) {
                this.a(l, p0);
                ShopItemMarketingTimerView$a uoa = new ShopItemMarketingTimerView$a(this, l, 0, 2, null);
                p0.start();
                this.c = p0;
             }else {
                this.setVisibility(8);
                ShopItemMarketingTimerView te = this.e;
                if (te != null) {
                   te.a();
                }
             }
          }
       }
       return;
    }
}
