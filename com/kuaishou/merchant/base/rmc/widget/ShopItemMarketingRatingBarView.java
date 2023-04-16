package com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingRatingBarView;
import at3.b;
import android.widget.LinearLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import ekd.m1;
import android.widget.TextView;
import com.kuaishou.merchant.basic.widget.PaddingRatingBar;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextContent;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.base.rmc.RMCLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextStyle;
import vr3.a;
import android.graphics.Color;
import zs3.e;
import crd.b;
import lnc.b9;
import at3.a;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentRatingBar;
import android.widget.RatingBar;
import com.kuaishou.merchant.api.core.model.live.shop.ScoreStarPic;
import java.util.HashMap;
import com.kuaishou.merchant.basic.util.MerchantRatingHelper;
import lnc.a1;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.util.ArrayMap;
import z1.a;
import bld.b;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;

public class ShopItemMarketingRatingBarView extends LinearLayout implements b	// class@001595
{
    public SelectShapeLinearLayout b;
    public TextView c;
    public PaddingRatingBar d;
    public TextView e;
    public b f;

    public void ShopItemMarketingRatingBarView(Context p0){
       super(p0);
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingRatingBarView.class, "1")) {
       }else {
          a.b(p0, R.layout.arg_RES_7f0d08ae, this);
          this.c = m1.f(this, 0x7f0a3424);
          this.d = m1.f(this, 0x7f0a3420);
          this.e = m1.f(this, 0x7f0a3423);
          this.b = m1.f(this, 0x7f0a3421);
          this.setGravity(16);
       }
       return;
    }
    public final void a(TextView p0,ShopItemMarketingComponentTextContent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShopItemMarketingRatingBarView.class, "3")) {
          return;
       }
       if (p1 == null || TextUtils.x(p1.getMContent())) {
          p0.setVisibility(8);
          a.s(RMCLogBiz.RMC, "ShopItemMarketingRatingBarView", "rating text param not valid!");
       }
       p0.setText(p1.getMContent());
       if (p1.getStyle() != null) {
          ShopItemMarketingComponentTextStyle style = p1.getStyle();
          int mFontSize = style.getMFontSize();
          if (mFontSize > 0) {
             this.e.setTextSize(1, ((float)mFontSize * 0x3f800000));
          }
          if (!TextUtils.x(style.getMTextColor())) {
             p0.setTextColor(Color.parseColor(style.getMTextColor()));
          }
       }
       return;
    }
    public e getItemMarketingViewModel(){
       return null;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingRatingBarView.class, "4")) {
          return;
       }
       b9.a(this.f);
       return;
    }
    public void setBusinessType(int p0){
       a.b(this, p0);
    }
    public void setItemMarketingViewModel(e p0){
    }
    public void setRowIndex(int p0){
       a.d(this, p0);
    }
    public void setShopItemMarketingComponentInfo(a p0){
       b uob;
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingRatingBarView.class, "2")) {
          return;
       }
       if (p0 instanceof ShopItemMarketingComponentRatingBar) {
          ShopItemMarketingComponentRatingBar mCompScoreSt = p0.mCompScoreStars;
          String str = null;
          if (!mCompScoreSt - str) {
             this.setVisibility(8);
             a.s(RMCLogBiz.RMC, "ShopItemMarketingRatingBarView", "rating param not valid!");
             return;
          }else {
             this.d.setRating(mCompScoreSt);
             b9.a(this.f);
             ShopItemMarketingRatingBarView td = this.d;
             HashMap hashMap = MerchantRatingHelper.b(p0.mScoreStarPic);
             int i = a1.d(R.dimen.arg_RES_7f07025d);
             if (PatchProxy.isSupport(MerchantRatingHelper.class)) {
                uob = PatchProxy.applyThreeRefs(td, hashMap, Integer.valueOf(i), null, MerchantRatingHelper.class, "2");
                if (uob != PatchProxyResult.class) {
                label_0063 :
                   this.f = uob;
                   this.a(this.c, p0.mPrefixInfo);
                   if (!TextUtils.x(p0.mBackgroundColor)) {
                      b uob1 = new b();
                      uob1.s(DrawableCreator$Shape.Rectangle);
                      uob1.g(KwaiRadiusStyles.R2);
                      uob1.v(Color.parseColor(p0.mBackgroundColor));
                      Drawable uDrawable = uob1.a();
                      ShopItemMarketingComponentRatingBar mBackgroundA = p0.mBackgroundAlpha;
                      if (mBackgroundA - str > 0 && mBackgroundA - 0x3f800000 <= 0) {
                         uDrawable.setAlpha((int)(mBackgroundA * 0x437f0000));
                      }
                      this.b.setBackground(uDrawable);
                   }
                   this.a(this.e, p0.mScoreStarInfo);
                }
             }
             uob = MerchantRatingHelper.g(td, hashMap, null, null, i);
             goto label_0063 ;
          }
       }
       return;
    }
}
