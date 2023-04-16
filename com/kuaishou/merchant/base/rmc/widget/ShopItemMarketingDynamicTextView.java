package com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingDynamicTextView;
import at3.b;
import ys3.b;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zs3.e;
import at3.a;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewParent;
import java.util.Objects;
import android.view.ViewGroup;
import com.kuaishou.merchant.base.rmc.RMCLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentDynamicText;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentDynamicText$a;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Arrays;
import java.lang.CharSequence;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextStyle;
import vr3.a;
import android.graphics.Color;
import android.graphics.Typeface;
import bld.b;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import java.lang.Float;
import bld.c;
import at3.f;
import com.yxcorp.widget.KwaiRadiusStyles;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Exception;

public final class ShopItemMarketingDynamicTextView extends AppCompatTextView implements b, b	// class@00158f
{
    public ShopItemMarketingComponentDynamicText f;
    public boolean g;
    public boolean h;
    public HashMap i;

    public void ShopItemMarketingDynamicTextView(Context p0){
       super(p0);
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingDynamicTextView.class, "1")) {
       }else {
          this.setTextSize(1, 11.00f);
       }
       return;
    }
    public b c(boolean p0){
       this.g = p0;
       return this;
    }
    public e getItemMarketingViewModel(){
       return a.a(this);
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingDynamicTextView.class, "2")) {
          return;
       }
       if (this.g != null) {
          this.setSingleLine(true);
          this.setEllipsize(TextUtils$TruncateAt.END);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(ShopItemMarketingDynamicTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ShopItemMarketingDynamicTextView.class, "6")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          ViewParent parent = this.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          int measuredWidt = parent.getMeasuredWidth();
          a.s(RMCLogBiz.RMC, "ShopItemMarketingCouponView", "right: "+p3+','+" parent width: "+measuredWidt);
          if (p3 >= measuredWidt && (!this.getMinimumWidth() && this.h != null)) {
             i = 8;
          }
       label_0080 :
          this.setVisibility(i);
       }
       return;
    }
    public void release(){
       PatchProxy.applyVoid(null, this, ShopItemMarketingDynamicTextView.class, "7");
    }
    public void setBusinessType(int p0){
       a.b(this, p0);
    }
    public final void setDynamicText(ShopItemMarketingComponentDynamicText p0){
       f uof;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingDynamicTextView.class, "3")) {
          return;
       }
       this.f = p0;
       ShopItemMarketingComponentDynamicText$a companion = ShopItemMarketingComponentDynamicText.Companion;
       String mPattern = p0.getMPattern();
       List mValue = p0.getMValue();
       Objects.requireNonNull(companion);
       String str = PatchProxy.applyTwoRefs(mPattern, mValue, companion, ShopItemMarketingComponentDynamicText$a.class, "2");
       int i = 1;
       if (str != patchProxyRe) {
       }else {
          a.p(mPattern, "format");
          a.p(mValue, "args");
          int i1 = mValue.size();
          Object[] objArray = new Object[i1];
          for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
             objArray[i2] = Integer.valueOf(i2);
          }
          Iterator iterator = mValue.iterator();
          i2 = 0;
          while (iterator.hasNext()) {
             objArray[i2] = iterator.next();
             i2 = i2 + i;
          }
          str = companion.a(mPattern, Arrays.copyOf(objArray, i1));
       }
       this.setText(str);
       ShopItemMarketingComponentTextStyle style = p0.getStyle();
       if (style != null) {
          try{
             this.setTextColor(Color.parseColor(style.getMTextColor()));
             float f = (style.getMFontSize() > 0)? (float)style.getMFontSize() * 0x3f800000: 10.00f;
             this.setTextSize(i, f);
             if (style.getMFontType() == i) {
                this.setTypeface(Typeface.DEFAULT_BOLD);
             }
             if (p0.getMType() == 2) {
                b uob = new b();
                uob.s(DrawableCreator$Shape.Rectangle);
                f = style.getMBorderRadius();
                if (PatchProxy.isSupport(ShopItemMarketingDynamicTextView.class)) {
                   uof = PatchProxy.applyOneRefs(Float.valueOf(f), this, ShopItemMarketingDynamicTextView.class, "5");
                   if (uof != patchProxyRe) {
                   }else if(f - (float)0 > 0){
                      uof = new f(f);
                   }else {
                      uof = KwaiRadiusStyles.R2;
                   }
                }else {
                   goto label_00c5 ;
                }
                uob.g(uof);
                float mStrokeWidth = (style.getMStrokeWidth() - (float)0 > 0)? style.getMStrokeWidth(): 0x3f19999a;
                uob.x(mStrokeWidth);
                uob.w(Color.parseColor(style.getMBorderColor()));
                this.setBackground(uob.a());
                n.T(this, 4);
                n.U(this, 4);
             }
          }catch(java.lang.Exception e11){
             e11.printStackTrace();
          }
       }
    }
    public void setItemMarketingViewModel(e p0){
       a.c(this, p0);
    }
    public final void setNeedGoneWhenNoSpace(boolean p0){
       this.h = p0;
    }
    public void setRowIndex(int p0){
       a.d(this, p0);
    }
    public void setShopItemMarketingComponentInfo(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingDynamicTextView.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, ShopItemMarketingDynamicTextView.class, "2") && this.g != null) {
          this.setSingleLine(true);
          this.setEllipsize(TextUtils$TruncateAt.END);
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentDynamicText");
       this.setDynamicText(p0);
       return;
    }
}
