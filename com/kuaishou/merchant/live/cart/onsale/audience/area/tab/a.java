package com.kuaishou.merchant.live.cart.onsale.audience.area.tab.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import l54.c;
import m34.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.cart.onsale.audience.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.CommodityListGuestResponse;
import java.util.Collection;
import ekd.q;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import lnc.a1;
import android.widget.HorizontalScrollView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.merchant.live.cart.onsale.audience.model.TabInfo;
import java.lang.Integer;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.content.Context;
import xm4.a;
import ekd.m1;
import com.kuaishou.merchant.live.cart.onsale.widget.TabIconifyTextViewNew;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import m34.f;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import ds3.a;
import java.util.Set;
import com.kwai.library.widget.textview.KwaiIconifyTextViewNew;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.StringBuilder;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.LiveAudienceCommodityFragment;
import android.os.Bundle;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import k2b.e0;
import e34.b;
import m34.b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.viewpager.tabstrip.a;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.a$a;
import androidx.viewpager.widget.ViewPager$i;
import m34.d;
import com.google.android.material.appbar.AppBarLayout$c;
import com.google.android.material.appbar.AppBarLayout;
import m34.e;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.a$b;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.a$c;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.a$d;
import o34.e;
import o34.f;
import java.util.Objects;
import crd.b;
import lnc.b9;
import java.lang.Boolean;
import com.kuaishou.merchant.live.cart.onsale.audience.model.TabInfo$Icon;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextPaint;
import android.graphics.drawable.Drawable;

public class a extends PresenterV2	// class@00192a
{
    public LiveMerchantBaseContext A;
    public a B;
    public final AppBarLayout$c C;
    public PagerSlidingTabStrip p;
    public ViewPager q;
    public View r;
    public AppBarLayout s;
    public View t;
    public final c u;
    public e v;
    public e w;
    public e x;
    public CommodityListGuestResponse y;
    public Fragment z;

    public void a(){
       super();
       this.u = new c();
       this.C = new c(this);
    }
    public void E8(){
       int i;
       Object[] objArray1;
       int i2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       a g = this.B.g;
       this.y = g;
       if (g == null) {
          return;
       }
       if (q.f(g.mTabInfos)) {
          return;
       }
       int b = false;
       this.p.v(b);
       this.p.setTabPadding(a1.d(R.dimen.arg_RES_7f07033f));
       if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          if (this.S8()) {
             i = 8;
             this.p.setVisibility(i);
             this.t.setVisibility(i);
          }else {
             this.p.setVisibility(b);
             this.t.setVisibility(b);
          }
       }
       ArrayList uArrayList = new ArrayList();
       i = 0;
       int i1 = 0;
       while (i < this.y.mTabInfos.size()) {
          TabInfo tabInfo = this.y.mTabInfos.get(i);
          if (PatchProxy.isSupport(uoa)) {
             objArray1 = PatchProxy.applyTwoRefs(tabInfo, Integer.valueOf(i), this, uoa, "10");
             if (objArray1 != patchProxyRe) {
             }else if(tabInfo == null){
                objArray1 = objArray;
             }else {
                View view = a.a(this.getContext(), R.layout.arg_RES_7f0d0691);
                TabIconifyTextViewNew tabIconifyTe = m1.f(view, R.id.shop_tab_text);
                tabIconifyTe.setTag(R.id.live_merchant_audience_shop_tab_id, tabInfo.mTabId);
                View view1 = m1.f(view, R.id.shop_tab_bg_container);
                if (!TextUtils.x(tabInfo.mMarkImg)) {
                   a.e(tabInfo.mMarkImg, new f(this, tabIconifyTe));
                   if (this.B.b.m.contains(tabInfo.mTabId)) {
                      tabIconifyTe.b();
                   }else {
                      tabIconifyTe.h();
                   }
                }else {
                   tabIconifyTe.b();
                }
                tabIconifyTe.setContentText(tabInfo.mTabDesc);
                this.R8(tabIconifyTe, view1, tabInfo.mCurrent);
                this.P8(tabInfo, m1.f(view, R.id.shop_tab_img), tabInfo.mCurrent);
                PagerSlidingTabStrip$d uod = new PagerSlidingTabStrip$d(tabInfo.mTabId+tabInfo.mTabType, view);
                uod.g(true);
                objArray1 = uod;
             }
          }else {
             goto label_0089 ;
          }
          uArrayList.add(new b(objArray1, LiveAudienceCommodityFragment.class, new Bundle()));
          b.m(this.A, tabInfo.mTabDesc, this.B.n);
          if (tabInfo.mCurrent != null) {
             i1 = i;
          }
          i = i + 1;
       }
       a ty = this.y;
       b uob = new b(this.getContext(), this.z.getChildFragmentManager(), this.B, ty, ty.mTabInfos);
       objArray.D(uArrayList);
       this.q.setAdapter(objArray);
       this.q.setCurrentItem(i1, b);
       g = this.q;
       b = objArray.j();
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(b), this, uoa, "9");
          if (obj != patchProxyRe) {
             i2 = obj.intValue();
          }else {
          label_0176 :
             i2 = a.t().a("merchantCartTabOffScreenPageSize", -1);
             if (i2 == -1 || i2 >= b) {
                i2 = b - 1;
             }
          }
       }else {
          goto label_0176 ;
       }
       g.setOffscreenPageLimit(i2);
       this.p.setViewPager(this.q);
       this.p.setOnPageChangeListener(new a$a(this));
       this.B.l = new d(objArray);
       this.s.c(this.C);
       k1.p(new e(this), this);
       this.v = new a$b(this, objArray);
       this.w = new a$c(this, objArray);
       this.x = new a$d(this);
       this.B.m.d(this.v);
       this.B.m.d(this.w);
       this.B.m.d(this.x);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "15")) {
          return;
       }
       k1.n(this);
       a tu = this.u;
       Objects.requireNonNull(tu);
       if (!PatchProxy.applyVoid(objArray, tu, c.class, "6")) {
          tu.a();
          b9.a(tu.a);
       }
       this.s.o(this.C);
       this.B.m.c(this.v);
       this.B.m.c(this.w);
       this.B.m.c(this.x);
       return;
    }
    public void P8(TabInfo p0,KwaiImageView p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "12")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       TabInfo mIcon = p0.mIcon;
       if (mIcon == null || !mIcon.isValid()) {
          p1.setVisibility(8);
          return;
       }else {
          int i = 0;
          p1.setVisibility(i);
          if (p2) {
             p1.L(p0.mIcon.mSelectedUrl);
          }else {
             p1.L(p0.mIcon.mNormalUrl);
          }
          ViewGroup$LayoutParams layoutParams = p1.getLayoutParams();
          if (TextUtils.x(p0.mTabDesc)) {
             ViewGroup$MarginLayoutParams layoutParams1 = p1.getLayoutParams();
             layoutParams1.setMargins(i, i, a1.e(0), i);
             p1.setLayoutParams(layoutParams1);
          }
          layoutParams.height = a1.e((float)p0.mIcon.mHeight);
          layoutParams.width = a1.e((float)p0.mIcon.mWidth);
          p1.setLayoutParams(layoutParams);
          return;
       }
    }
    public void R8(TabIconifyTextViewNew p0,View p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "11")) {
          return;
       }
       if (p2) {
          p0.getContentTextPaint().setFakeBoldText(true);
          p0.setContentTextColor(a1.a(R.color.arg_RES_7f061df6));
          if (p1 != null) {
             p1.setBackground(a1.f(R.drawable.arg_RES_7f080376));
          }
       }else {
          p0.getContentTextPaint().setFakeBoldText(false);
          p0.setContentTextColor(a1.a(R.color.arg_RES_7f061d96));
          if (p1 != null) {
             p1.setBackground(a1.f(R.drawable.arg_RES_7f080377));
          }
       }
       return;
    }
    public final boolean S8(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (this.y.mTabInfos.size() == 1 && this.y.mTabInfos.get(i).mIsDummy != null) {
          i = true;
       }
       return i;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3c8b);
       this.q = m1.f(p0, 0x7f0a08db);
       this.r = m1.f(p0, 0x7f0a256a);
       this.s = m1.f(p0, 0x7f0a2561);
       this.t = m1.f(p0, 0x7f0a2562);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.z = this.r8("MERCHANT_FRAGMENT");
       this.A = this.r8("LIVE_BASE_CONTEXT");
       this.B = this.s8(a.class);
       return;
    }
}
