package com.kwai.library.widget.viewpager.tabstrip.MerchantOrderPagerSlidingTabStrip;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import bm4.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.widget.HorizontalScrollView;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.utility.n;
import android.view.View;
import java.lang.Number;
import com.kuaishou.merchant.transaction.order.orderlist.widget.OrderRedDotView;
import android.widget.TextView;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import java.lang.StringBuilder;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;

public class MerchantOrderPagerSlidingTabStrip extends PagerSlidingTabStrip	// class@000a87
{
    public int A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public boolean F1;
    public RectF w1;
    public Paint x1;
    public int y1;
    public int z1;
    public static final int G1;

    static {
       MerchantOrderPagerSlidingTabStrip.G1 = a1.d(0x7f07031b);
    }
    public void MerchantOrderPagerSlidingTabStrip(Context p0){
       super(p0, null);
    }
    public void MerchantOrderPagerSlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void MerchantOrderPagerSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       boolean b;
       super(p0, p1, p2);
       this.A1 = a1.a(0x7f061d77);
       this.B1 = 8;
       this.D1 = a1.d(0x7f07029e);
       this.E1 = a1.d(0x7f070295);
       p0 = PatchProxy.apply(null, null, b.class, "2");
       b = (p0 != PatchProxyResult.class)? p0.booleanValue(): a.t().d("IS_MERCHANT_ORDER_LIST_TAG_WIDTH_AVERAGE", 0);
       this.F1 = b;
       if (!PatchProxy.applyVoidOneRefs(p1, this, MerchantOrderPagerSlidingTabStrip.class, "5")) {
          this.w1 = new RectF();
          Paint paint = new Paint();
          this.x1 = paint;
          paint.setAntiAlias(true);
          this.x1.setStyle(Paint$Style.FILL);
          if (!PatchProxy.applyVoidOneRefs(p1, this, MerchantOrderPagerSlidingTabStrip.class, "6") && p1 != null) {
             TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.O3);
             this.y1 = typedArray.getDimensionPixelSize(22, 0);
             this.z1 = typedArray.getDimensionPixelSize(16, 0);
             this.B1 = typedArray.getDimensionPixelSize(15, this.B1);
             this.A1 = typedArray.getColor(13, this.A1);
             this.C1 = typedArray.getDimensionPixelSize(14, n.c(this.getContext(), 15.00f));
             typedArray.recycle();
             this.y(this.y1);
             this.x(this.z1);
          }
          this.w(0);
          this.setShouldExpand(this.F1);
       }
       return;
    }
    public final int E(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantOrderPagerSlidingTabStrip.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!p0 instanceof OrderRedDotView) {
          return 0;
       }
       return (p0.b.getRight() - p0.c.getRight());
    }
    public void onDraw(Canvas p0){
       float f3;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantOrderPagerSlidingTabStrip.class, "3")) {
          return;
       }
       super.onDraw(p0);
       if (!this.isInEditMode()) {
          PagerSlidingTabStrip ti = this.i;
          if (ti != null) {
             PagerSlidingTabStrip tj = this.j;
             if (tj < ti) {
                View childAt = this.g.getChildAt(tj);
                float f = this.r((float)childAt.getLeft());
                float f1 = this.r((float)childAt.getRight());
                int i = this.E(childAt);
                double d = 2.00f;
                if (i > 0) {
                   double d1 = (double)i / d;
                   f1 = (float)((double)f1 - d1);
                   f = (float)((double)f - d1);
                }
                float f2 = 0x3f800000;
                if (this.k - null > 0) {
                   ti = this.j;
                   if (ti < (this.i - 1)) {
                      childAt = this.g.getChildAt((ti + 1));
                      f3 = this.r((float)childAt.getLeft());
                      float f4 = this.r((float)childAt.getRight());
                      i = this.E(childAt);
                      if (i > 0) {
                         double d2 = (double)i / d;
                         f3 = (float)((double)f3 - d2);
                         f4 = (float)((double)f4 - d2);
                      }
                      ti = this.k;
                      f = (f3 * ti) + ((f2 - ti) * f);
                      f4 = f4 * ti;
                      f1 = f4 + ((f2 - ti) * f1);
                   }
                }
                i = this.getHeight();
                this.w1.setEmpty();
                int i1 = (int)(((f1 - f) - (float)this.y1) / 2.00f);
                this.y = i1;
                PagerSlidingTabStrip tk = this.k;
                f3 = 3.00f;
                f2 = ((double)tk - 0x3fe0000000000000 < 0)? ((float)i1 * tk) / f3: ((float)i1 * (f2 - tk)) / f3;
                i = i - 1;
                MerchantOrderPagerSlidingTabStrip tz1 = this.z1;
                this.w1.set(((f + (float)i1) - f2), (float)((i - this.B1) - tz1), ((f1 - (float)i1) + f2), (float)(i - tz1));
                this.x1.setColor(this.A1);
                MerchantOrderPagerSlidingTabStrip tC1 = this.C1;
                f1 = (float)tC1;
                p0.drawRoundRect(this.w1, f1, (float)tC1, this.x1);
             }
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MerchantOrderPagerSlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MerchantOrderPagerSlidingTabStrip.class, "2")) {
          return;
       }
       int i = 0;
       if (this.F1 == null) {
          this.measureChildren(View$MeasureSpec.makeMeasureSpec(i, i), View$MeasureSpec.makeMeasureSpec(i, i));
          if (!PatchProxy.isSupport(MerchantOrderPagerSlidingTabStrip.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MerchantOrderPagerSlidingTabStrip.class, "7")) {
             if (this.i <= null) {
                a.s(MerchantTransactionLogBiz.ORDER, "MerchantOrderPagerSlidingTabStrip", "resetChildSize:tabcount<=0");
             }else {
                int i1 = ((View$MeasureSpec.getSize(p0) - this.getPaddingStart()) - this.getPaddingEnd()) / 5;
                a.s(MerchantTransactionLogBiz.ORDER, "MerchantOrderPagerSlidingTabStrip", "resetChildSize:tabExpectWidth="+i1);
                int i2 = 0;
                while (i2 < this.i) {
                   View childAt = this.g.getChildAt(i2);
                   if (!PatchProxy.isSupport(MerchantOrderPagerSlidingTabStrip.class) || !PatchProxy.applyVoidTwoRefs(childAt, Integer.valueOf(i1), this, MerchantOrderPagerSlidingTabStrip.class, "8")) {
                      if (childAt == null || i1 <= 0) {
                         a.s(MerchantTransactionLogBiz.ORDER, "MerchantOrderPagerSlidingTabStrip", "setChildSize:child null");
                      }else {
                         LinearLayout$LayoutParams layoutParams = childAt.getLayoutParams();
                         a.s(MerchantTransactionLogBiz.ORDER, "MerchantOrderPagerSlidingTabStrip", "setChildSize:tabWidthBefore="+childAt.getMeasuredWidth());
                         if (childAt.getMeasuredWidth() <= i1) {
                            layoutParams.width = i1;
                         }else {
                            int i3 = MerchantOrderPagerSlidingTabStrip.G1 * 2;
                            int i4 = childAt.getMeasuredWidth() + i3;
                            layoutParams.width = i4;
                         }
                         layoutParams.weight = 0;
                         childAt.setLayoutParams(layoutParams);
                      }
                   }
                   i2 = i2 + 1;
                }
             }
          }
       }
       super.onMeasure(p0, p1);
       if (this.F1 == null) {
          a.s(MerchantTransactionLogBiz.ORDER, "MerchantOrderPagerSlidingTabStrip", "onMeasure:parentSpecWidth="+View$MeasureSpec.getSize(p0));
          for (; i < this.getChildCount(); i = i + 1) {
             a.s(MerchantTransactionLogBiz.ORDER, "MerchantOrderPagerSlidingTabStrip", "onMeasure:linearLytWidth="+this.getChildAt(i).getMeasuredWidth());
          }
       }
       return;
    }
    public void setTabPadding(int p0){
       if (PatchProxy.isSupport(MerchantOrderPagerSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MerchantOrderPagerSlidingTabStrip.class, "1")) {
          return;
       }
       super.setTabPadding(0);
       return;
    }
    public void u(int p0){
       if (PatchProxy.isSupport(MerchantOrderPagerSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MerchantOrderPagerSlidingTabStrip.class, "9")) {
          return;
       }
       super.u(p0);
       int i = 0;
       while (i < this.g.getChildCount()) {
          View childAt = this.g.getChildAt(i);
          if (childAt instanceof OrderRedDotView) {
             MerchantOrderPagerSlidingTabStrip tD1 = (p0 == i)? this.D1: this.E1;
             childAt.setBottomTextSize(tD1);
          }
          i = i + 1;
       }
       return;
    }
}
