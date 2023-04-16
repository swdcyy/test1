package com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingCombView;
import at3.b;
import zs3.c;
import ys3.a;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import lnc.a1;
import android.content.Context;
import java.util.ArrayList;
import com.kuaishou.merchant.base.rmc.a;
import android.widget.LinearLayout;
import zs3.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import com.kuaishou.merchant.base.rmc.widget.ItemMarketingImageView;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingTextView;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextStyle;
import vr3.a;
import android.view.View$MeasureSpec;
import java.lang.Number;
import com.kuaishou.merchant.api.core.model.live.shop.ItemMarketingComplexInfo;
import com.kuaishou.merchant.base.rmc.RMCLogBiz;
import p74.a;
import o74.a;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopComponentModel;
import java.util.List;
import android.widget.LinearLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import ekd.k1;
import crd.b;
import lnc.b9;
import java.util.Iterator;
import bld.b;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import java.lang.Float;
import bld.c;
import at3.e;
import com.yxcorp.widget.KwaiRadiusStyles;
import android.graphics.Color;
import zs3.f;
import java.util.Objects;
import ys3.f;
import ys3.g;
import zs3.b;
import at3.a;
import com.kuaishou.merchant.base.rmc.e;
import pt3.a;
import android.animation.TimeInterpolator;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import com.kuaishou.merchant.base.rmc.d;
import erd.r;
import at3.d;
import at3.c;
import erd.g;

public class ShopItemMarketingCombView extends LivePkShimmerLayout implements b, c, a	// class@00158c
{
    public ItemMarketingComplexInfo A;
    public e B;
    public b C;
    public boolean D;
    public List E;
    public final String w;
    public final String x;
    public a y;
    public f z;
    public static final int[] F;
    public static final float[] G;

    static {
       int[] ointArray = new int[]{0,a1.a(0x7f061e54),a1.a(0x7f061e5b),a1.a(0x7f061e54),0};
       ShopItemMarketingCombView.F = ointArray;
       ShopItemMarketingCombView.G = new float[5]{0x3e800000,0x3eb33333,0x3f000000,0x3f266666,0x3f400000};
    }
    public void ShopItemMarketingCombView(Context p0){
       super(p0);
       this.w = "ShopItemMarketingCombView";
       this.x = "VIEW_TAG_HAS_CONFIG";
       this.E = new ArrayList();
       this.y = new a(p0);
       this.setPadding(0, 0, a1.e(4.00f), 0);
       this.setEnablePressedAlphaEffect(0);
    }
    public e getItemMarketingViewModel(){
       return this.z;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ShopItemMarketingCombView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ShopItemMarketingCombView.class, "12")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       int i = this.getChildCount() - 1;
       ViewGroup$LayoutParams obj = null;
       p2 = obj;
       TextView textView = p2;
       p3 = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (i >= 0) {
          View childAt = this.getChildAt(i);
          View childAt1 = this.getChildAt(i);
          View view = PatchProxy.applyOneRefs(childAt1, this, ShopItemMarketingCombView.class, "13");
          if (view != PatchProxyResult.class) {
          }else if(childAt1 instanceof FrameLayout && childAt1.getChildCount() > 0){
             view = childAt1.getChildAt(0);
          }else {
             view = obj;
          }
          float f = 4.00f;
          int i4 = this.p(view) + a1.e(f);
          p3 = p3 + i4;
          if (view instanceof ItemMarketingImageView && p2 == null) {
             i3 = this.p(view);
             View view1 = childAt;
          }else if(view instanceof ShopItemMarketingTextView && textView == null){
             textView = view;
             i2 = 1;
          }else if(i2){
             int i5 = this.p(view) + a1.e(f);
             i1 = i1 + i5;
          }
          i--;
       }
       i = this.getParent().getRight();
       if (p2 != null && (textView != null && p3 > i)) {
          if (textView.getTag() instanceof String && TextUtils.n("VIEW_TAG_HAS_CONFIG", textView.getTag())) {
             return;
          }else {
             textView.setTag("VIEW_TAG_HAS_CONFIG");
             obj = textView.getLayoutParams();
             obj.width = Math.max((((i - i1) - i3) - a1.e(12.00f)), a1.e(10.00f));
             textView.setLayoutParams(obj);
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ShopItemMarketingCombView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ShopItemMarketingCombView.class, "11")) {
          return;
       }
       ShopItemMarketingCombView tA = this.A;
       if (tA != null && tA.getStyle() != null) {
          int mHeight = this.A.getStyle().getMHeight();
          if (mHeight) {
             super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(a1.e((float)mHeight), 0x40000000));
             return;
          }
       }
       super.onMeasure(p0, p1);
       return;
    }
    public final int p(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShopItemMarketingCombView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 instanceof ItemMarketingImageView) {
          if (p0.getItemMarketingViewModel() != null && (p0.getItemMarketingViewModel().d() != null && p0.getItemMarketingViewModel().d().getStyle() != null)) {
             i = a1.e((float)p0.getItemMarketingViewModel().d().getStyle().getMWidth());
          }
       }else {
          i = p0.getMeasuredWidth();
       }
       return i;
    }
    public final void q(a p0){
       FrameLayout uFrameLayout;
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingCombView.class, "6")) {
          return;
       }
       String str = "ShopItemMarketingCombView";
       if (!p0 instanceof ItemMarketingComplexInfo) {
          a.g(RMCLogBiz.RMC, str, "inflateChildren failed: not ItemMarketingComplexInfo");
          return;
       }else {
          ArrayList subs = p0.getSubs();
          if (q.f(subs)) {
             a.s(RMCLogBiz.RMC, str, "inflateChildren failed: modelArrayList is empty");
             return;
          }else {
             int i = 0;
             while (i < subs.size()) {
                LiveShopComponentModel liveShopComp = subs.get(i);
                if (PatchProxy.isSupport(ShopItemMarketingCombView.class)) {
                   uFrameLayout = PatchProxy.applyTwoRefs(liveShopComp, Integer.valueOf(i), this, ShopItemMarketingCombView.class, "7");
                   if (uFrameLayout != PatchProxyResult.class) {
                   }else {
                   label_0056 :
                      uFrameLayout = null;
                      b uob = this.y.j(liveShopComp);
                      this.E.add(uob);
                      if (uob instanceof View) {
                         uFrameLayout = new FrameLayout(this.getContext());
                         int i1 = -2;
                         int i2 = (uob instanceof ItemMarketingImageView)? this.p(uob): -2;
                         LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(i2, i1);
                         layoutParams.gravity = 17;
                         layoutParams.leftMargin = (this.D != null && !i)? 0: a1.e(4.00f);
                         uFrameLayout.setLayoutParams(layoutParams);
                         ViewGroup$LayoutParams layoutParams1 = uob.getLayoutParams();
                         if (layoutParams1 == null) {
                            layoutParams1 = new FrameLayout$LayoutParams(i1, i1);
                            layoutParams1.gravity = 16;
                         }else {
                            layoutParams1.width = i1;
                            layoutParams1.height = i1;
                         }
                         uob.setLayoutParams(layoutParams1);
                         uFrameLayout.addView(uob);
                      }
                   }
                }else {
                   goto label_0056 ;
                }
                if (uFrameLayout != null) {
                   this.addView(uFrameLayout);
                }
                i = i + 1;
             }
             return;
          }
       }
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingCombView.class, "3")) {
          return;
       }
       this.y.f();
       k1.n(this);
       b9.a(this.C);
       Iterator iterator = this.E.iterator();
       while (iterator.hasNext()) {
          iterator.next().release();
       }
       this.E.clear();
       return;
    }
    public final void setBackground(ShopItemMarketingComponentTextStyle p0){
       e uoe;
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingCombView.class, "5")) {
          return;
       }
       b uob = new b();
       uob.s(DrawableCreator$Shape.Rectangle);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Drawable uDrawable = PatchProxy.applyTwoRefs(p0, uob, this, ShopItemMarketingCombView.class, "8");
       if (uDrawable != patchProxyRe) {
       }else if(p0 == null){
          a.s(RMCLogBiz.RMC, "ShopItemMarketingCombView", "buildBackground failed: style is null");
          uDrawable = null;
       }else {
          float mBorderRadiu = p0.getMBorderRadius();
          if (PatchProxy.isSupport(ShopItemMarketingCombView.class)) {
             uoe = PatchProxy.applyOneRefs(Float.valueOf(mBorderRadiu), this, ShopItemMarketingCombView.class, "9");
             if (uoe != patchProxyRe) {
             }else if(mBorderRadiu > 0){
                uoe = new e(this, mBorderRadiu);
             }else {
                uoe = KwaiRadiusStyles.R2;
             }
          }else {
             goto label_0051 ;
          }
          uob.g(uoe);
          if (!TextUtils.x(p0.getMBackgroundColor())) {
             uob.v(Color.parseColor(p0.getMBackgroundColor()));
          }
          if (p0.getMStrokeWidth() > 0 && !TextUtils.x(p0.getMBorderColor())) {
             uob.x(p0.getMStrokeWidth());
             uob.w(Color.parseColor(p0.getMBorderColor()));
          }
          uDrawable = uob.a();
          if (p0.getMBackgroundAlpha() > 0 && (p0.getMBackgroundAlpha() - 0x3f800000 <= 0 && uDrawable != null)) {
             uDrawable.setAlpha((int)(p0.getMBackgroundAlpha() * 0x437f0000));
          }
       }
       this.setBackground(uDrawable);
       return;
    }
    public void setBusinessType(int p0){
    }
    public void setEnableNewStyle(boolean p0){
       this.D = p0;
    }
    public void setItemMarketingViewModel(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingCombView.class, "4")) {
          return;
       }
       if (p0 instanceof f) {
          this.z = p0;
       }
       ShopItemMarketingCombView tz = this.z;
       if (tz == null) {
          a.s(RMCLogBiz.RMC, "ShopItemMarketingCombView", "mComplexModel is null");
          return;
       }else {
          Objects.requireNonNull(tz);
          this.setBackground(null);
          this.removeAllViews();
          this.q(this.z.d());
          return;
       }
    }
    public void setOnComponentClickListener(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingCombView.class, "10")) {
          return;
       }
       if (p0 != null) {
          ShopItemMarketingCombView ty = this.y;
          if (ty != null) {
             ty.m(p0);
          }
       }
       return;
    }
    public void setOnComponentShowListener(g p0){
       b.a(this, p0);
    }
    public void setRowIndex(int p0){
       a.d(this, p0);
    }
    public void setShimmerManager(e p0){
       this.B = p0;
    }
    public void setShopItemMarketingComponentInfo(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingCombView.class, "1")) {
          return;
       }
       this.E.clear();
       if (!p0 instanceof ItemMarketingComplexInfo) {
          a.s(RMCLogBiz.RMC, "ShopItemMarketingCombView", "info not instance of ItemMarketingComplexInfo");
          return;
       }else {
          this.A = p0;
          this.setBackground(p0.getStyle());
          this.setGradientColors(ShopItemMarketingCombView.F);
          this.setGradientPosition(ShopItemMarketingCombView.G);
          this.setTimeInterpolator(new a(0x3ef5c28f, 0.04f, 0x3f051eb8, 0x3f75c28f));
          this.removeAllViews();
          this.q(this.A);
          if (this.B != null && (this.A.getStyle() != null && this.A.getStyle().getMSweepLightCount() > 0)) {
             ShopItemMarketingComponentTextStyle style = this.A.getStyle();
             e uoe = e.class;
             if (!PatchProxy.applyVoidOneRefs(style, this, ShopItemMarketingCombView.class, "2")) {
                b9.a(this.C);
                ShopItemMarketingCombView tB = this.B;
                long sweepLightPe = style.getSweepLightPeriodMillis();
                if (!sweepLightPe - null) {
                   sweepLightPe = 2000;
                }
                tB.d = sweepLightPe;
                tB = this.B;
                int mSweepLightC = style.getMSweepLightCount();
                Objects.requireNonNull(tB);
                if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mSweepLightC), tB, uoe, "3")) {
                   e b = tB.b;
                   if (b != null && !b.isDisposed()) {
                      tB.a.onNext(Integer.valueOf(mSweepLightC));
                   }
                }
                tB = this.B;
                Objects.requireNonNull(tB);
                t ot = PatchProxy.apply(null, tB, uoe, "4");
                if (ot != PatchProxyResult.class) {
                }else {
                   ot = tB.a.filter(d.b);
                }
                this.C = ot.filter(new d(style)).subscribe(new c(this, style));
             }
          }
          return;
       }
    }
}
