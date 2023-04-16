package com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingTextView;
import at3.b;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import zs3.e;
import at3.a;
import java.lang.Boolean;
import java.lang.Integer;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.ViewParent;
import java.util.Objects;
import android.view.ViewGroup;
import com.kuaishou.merchant.base.rmc.RMCLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextStyle;
import vr3.a;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextContent;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.text.StringsKt__StringsKt;
import android.text.TextPaint;
import android.text.SpannableStringBuilder;
import bld.b;
import android.graphics.drawable.Drawable;
import java.lang.Float;
import bld.c;
import at3.g;
import com.yxcorp.widget.KwaiRadiusStyles;
import android.graphics.Color;
import android.graphics.Typeface;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Exception;

public final class ShopItemMarketingTextView extends SelectShapeTextView implements b	// class@001596
{
    public int g;
    public boolean h;
    public Runnable i;
    public ShopItemMarketingComponentTextContent j;
    public HashMap k;

    public void ShopItemMarketingTextView(Context p0){
       super(p0);
       this.g = -1;
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingTextView.class, "1")) {
       }else {
          this.setItemTextSize(11.00f);
          this.setMaxLines(1);
          this.setEllipsize(TextUtils$TruncateAt.END);
          this.setGravity(16);
       }
       return;
    }
    public e getItemMarketingViewModel(){
       return a.a(this);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ShopItemMarketingTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ShopItemMarketingTextView.class, "11")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          ViewParent parent = this.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          int measuredWidt = parent.getMeasuredWidth();
          a.s(RMCLogBiz.RMC, "ShopItemMarketingCouponView", "right: "+p3+','+" parent width: "+measuredWidt);
          measuredWidt = (p3 >= measuredWidt && (!this.getMinimumWidth() && this.h != null))? 8: 0;
          this.setVisibility(measuredWidt);
          ShopItemMarketingTextView tj = this.j;
          if (tj != null) {
             ShopItemMarketingComponentTextStyle style = tj.getStyle();
             if (style != null && style.getTextRemainLength() > 0) {
                ShopItemMarketingTextView tj1 = this.j;
                String mContent = (tj1 != null)? tj1.getMContent(): null;
                measuredWidt = style.getTextRemainLength();
                if (!PatchProxy.isSupport(ShopItemMarketingTextView.class) || (PatchProxy.applyVoidTwoRefs(mContent, Integer.valueOf(measuredWidt), this, ShopItemMarketingTextView.class, "3") || (mContent != null && measuredWidt < mContent.length()))) {
                   String str = mContent.substring((mContent.length() - measuredWidt), mContent.length());
                   a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                   float f = this.r(str);
                   if (this.r(mContent) - (float)this.getWidth() > 0 && f - (float)this.getWidth() <= 0) {
                      p4 = -1;
                      if (TextUtils.isEmpty(mContent)) {
                         p2 = -1;
                      }else {
                         Object obj = PatchProxy.applyTwoRefs(mContent, str, this, ShopItemMarketingTextView.class, "5");
                         obj = (obj != PatchProxyResult.class)? obj.intValue(): StringsKt__StringsKt.w3(mContent, str, 0, false, 6, null);
                      }
                      if (p2 > p4) {
                         SpannableStringBuilder spannableStr = new SpannableStringBuilder();
                         spannableStr.append(TextUtils.ellipsize(mContent.subSequence(0, p2), this.getPaint(), ((float)this.getWidth() - f), TextUtils$TruncateAt.END));
                         spannableStr.append(str);
                         this.setText(spannableStr);
                      }
                   }
                }
             }
          }
       }
    label_013d :
       return;
    }
    public final Drawable q(ShopItemMarketingComponentTextStyle p0,b p1){
       g og;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ShopItemMarketingTextView.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       float mBorderRadiu = p0.getMBorderRadius();
       if (PatchProxy.isSupport(ShopItemMarketingTextView.class)) {
          og = PatchProxy.applyOneRefs(Float.valueOf(mBorderRadiu), this, ShopItemMarketingTextView.class, "9");
          if (og != patchProxyRe) {
          }else if(mBorderRadiu - (float)0 > 0){
             og = new g(mBorderRadiu);
          }else {
             og = KwaiRadiusStyles.R2;
          }
       }else {
          goto label_002d ;
       }
       p1.g(og);
       p1.v(Color.parseColor(p0.getMBackgroundColor()));
       Drawable uDrawable = p1.a();
       if (p0.getMBackgroundAlpha() - (float)0 > 0 && p0.getMBackgroundAlpha() - (float)1 <= 0) {
          uDrawable.setAlpha((int)(p0.getMBackgroundAlpha() * (float)255));
       }
       return uDrawable;
    }
    public final float r(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShopItemMarketingTextView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = (TextUtils.isEmpty(p0))? 0: this.getPaint().measureText(p0.toString());
       return f;
    }
    public void release(){
       PatchProxy.applyVoid(null, this, ShopItemMarketingTextView.class, "12");
    }
    public final boolean s(ShopItemMarketingComponentTextStyle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShopItemMarketingTextView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0.getMBackgroundColor())) {
          return false;
       }
       return true;
    }
    public void setBusinessType(int p0){
       this.g = p0;
    }
    public void setItemMarketingViewModel(e p0){
       a.c(this, p0);
    }
    public final void setItemTextSize(float p0){
       if (PatchProxy.isSupport(ShopItemMarketingTextView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ShopItemMarketingTextView.class, "6")) {
          return;
       }
       if (p0 - (float)0 > 0) {
          this.setTextSize(1, p0);
       }
       return;
    }
    public final void setNeedGoneWhenNoSpace(boolean p0){
       this.h = p0;
    }
    public void setRowIndex(int p0){
       a.d(this, p0);
    }
    public void setShopItemMarketingComponentInfo(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingTextView.class, "10")) {
          return;
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextContent");
       this.setTextContent(p0);
       return;
    }
    public final void setTextContent(ShopItemMarketingComponentTextContent p0){
       b uob;
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingTextView.class, "2")) {
          return;
       }
       this.j = p0;
       this.setText(p0.getMContent());
       ShopItemMarketingComponentTextStyle style = p0.getStyle();
       if (style != null) {
          try{
             this.setTextColor(Color.parseColor(style.getMTextColor()));
             if (style.getMMinWidth()) {
                this.setMinWidth((int)style.getMMinWidth());
                this.setMinimumWidth((int)style.getMMinWidth());
             }
             boolean b = true;
             if (style.getMFontType() == b) {
                this.setTypeface(Typeface.DEFAULT_BOLD);
             }
             float f = 0x3f800000;
             int i = 2;
             if (p0.getType() == i) {
                this.setIncludeFontPadding(b);
                float f1 = (style.getMFontSize() > 0)? (float)style.getMFontSize() * f: 10.00f;
                this.setItemTextSize(f1);
                uob = new b();
                uob.s(DrawableCreator$Shape.Rectangle);
                uob.g(KwaiRadiusStyles.R2);
                uob.w(Color.parseColor(style.getMBorderColor()));
                if (style.getMStrokeWidth() - (float)0 > 0) {
                   uob.x(style.getMStrokeWidth());
                }else {
                   uob.x(0x3f19999a);
                }
                Drawable uDrawable = (this.s(style))? this.q(style, uob): uob.a();
                this.setBackground(uDrawable);
                n.T(this, 4);
                n.U(this, 4);
                n.S(this, b);
             }else {
                this.setItemTextSize(((float)style.getMFontSize() * f));
                if (this.s(style)) {
                   this.setIncludeFontPadding(b);
                   uob = new b();
                   uob.s(DrawableCreator$Shape.Rectangle);
                   this.setBackground(this.q(style, uob));
                   n.T(this, 3);
                   n.U(this, 3);
                   n.S(this, i);
                   this.setPadding(this.getPaddingLeft(), n.c(this.getContext(), (float)b), this.getPaddingRight(), this.getPaddingBottom());
                }
             }
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
          }
       }
    }
}
