package com.kuaishou.live.lite.anchorinfo.widget.LiteAnchorInfoRootLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout$LayoutParams;
import android.view.View$MeasureSpec;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import qrd.l1;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Math;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Canvas;
import android.view.ViewGroup;
import w83.a;
import msd.a;
import ec3.r;

public class LiteAnchorInfoRootLayout extends LinearLayout	// class@001e78
{
    public final float b;
    public int c;
    public Paint d;
    public static final LinearLayout$LayoutParams e;
    public static final int f;

    static {
       LiteAnchorInfoRootLayout.e = new LinearLayout$LayoutParams(-2, -2);
       LiteAnchorInfoRootLayout.f = View$MeasureSpec.makeMeasureSpec(0x2710, 0);
    }
    public void LiteAnchorInfoRootLayout(Context p0){
       super(p0, null);
    }
    public void LiteAnchorInfoRootLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiteAnchorInfoRootLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = c.c(this.getResources()).density;
    }
    public static l1 a(LiteAnchorInfoRootLayout p0,int p1,int p2){
       l1 a;
       int showDividers;
       View childAt;
       Objects.requireNonNull(p0);
       int size = View$MeasureSpec.getSize(p1);
       p0.c = size;
       if (size <= 0) {
          super.onMeasure(p1, p2);
          a = l1.a;
       }else {
          int i = 0;
          if (!PatchProxy.applyVoid(null, p0, LiteAnchorInfoRootLayout.class, "5") && p0.getChildCount() > 0) {
             View childAt2 = p0.getChildAt(i);
             showDividers = -2;
             childAt2.getLayoutParams().width = showDividers;
             childAt2 = p0.c(childAt2);
             if (childAt2 != null) {
                childAt2.getLayoutParams().width = showDividers;
             }
          }
          int i1 = 2;
          if (p0.getChildCount() >= i1) {
             size = (p0.c - p0.getPaddingStart()) - p0.getPaddingEnd();
             if (size > 0) {
                showDividers = p0.getShowDividers();
                Drawable dividerDrawa = p0.getDividerDrawable();
                int i2 = 1;
                if (dividerDrawa != null && (showDividers & 0x01) == i2) {
                   size = size - dividerDrawa.getIntrinsicWidth();
                }
                if (dividerDrawa != null && (showDividers & 0x04) == 4) {
                   size = size - dividerDrawa.getIntrinsicWidth();
                }
                i1 = (dividerDrawa != null && (showDividers & i1) == i1)? 1: 0;
                showDividers = p0.getChildCount();
                int i3 = showDividers - 1;
                while (i2 < i3) {
                   childAt = p0.getChildAt(i2);
                   p0.b(childAt);
                   size = size - p0.d(childAt);
                   if (i1) {
                      size = size - dividerDrawa.getIntrinsicWidth();
                   }
                   i2 = i2 + 1;
                }
                if (i1) {
                   size = size - dividerDrawa.getIntrinsicWidth();
                }
                View childAt1 = p0.getChildAt(i);
                View view = p0.c(childAt1);
                if (view == null) {
                   p0.e(showDividers);
                }else {
                   p0.b(view);
                   int i4 = p0.d(view);
                   p0.b(childAt1);
                   i2 = p0.d(childAt1);
                   int i5 = i2 - p0.d(view);
                   childAt = p0.getChildAt(i3);
                   p0.b(childAt);
                   i3 = p0.d(childAt);
                   if (size < (i2 + i3)) {
                      Object obj = PatchProxy.applyOneRefs(view, p0, LiteAnchorInfoRootLayout.class, "4");
                      i2 = (obj != PatchProxyResult.class)? obj.intValue(): (int)((double)((float)view.getTag(0x7f0a17c7).intValue() * p0.b) + 0x3fe0000000000000);
                      i3 = size - i3;
                      if ((i3 - (i2 + i5)) >= 0) {
                         i3 = i3 - i5;
                         view.getLayoutParams().width = i3;
                         childAt1.getLayoutParams().width = i3 + i5;
                      }else {
                         p0.e(showDividers);
                         size = Math.min(i4, (size - i5));
                         view.getLayoutParams().width = size;
                         childAt1.getLayoutParams().width = size + i5;
                      }
                   }
                }
             }
          }
          super.onMeasure(p1, p2);
          a = l1.a;
       }
       return a;
    }
    public final void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteAnchorInfoRootLayout.class, "6")) {
          return;
       }
       if (p0.getLayoutParams() == null) {
          p0.setLayoutParams(LiteAnchorInfoRootLayout.e);
       }
       p0.forceLayout();
       p0.measure(LiteAnchorInfoRootLayout.f, p0.getMeasuredHeightAndState());
       return;
    }
    public final View c(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiteAnchorInfoRootLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewWithTag("compressible-view");
    }
    public final int d(View p0){
       ViewGroup$MarginLayoutParams obj = PatchProxy.applyOneRefs(p0, this, LiteAnchorInfoRootLayout.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = p0.getLayoutParams();
       return ((p0.getMeasuredWidth() + obj.leftMargin) + obj.rightMargin);
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteAnchorInfoRootLayout.class, "8")) {
          return;
       }
       super.dispatchDraw(p0);
       return;
    }
    public final void e(int p0){
       if (PatchProxy.isSupport(LiteAnchorInfoRootLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiteAnchorInfoRootLayout.class, "2")) {
          return;
       }
       p0--;
       this.removeViewAt(p0);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiteAnchorInfoRootLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiteAnchorInfoRootLayout.class, "1")) {
          return;
       }
       r.a("LiteAnchorInfoRootLayout.onMeasure", new a(this, p0, p1));
       return;
    }
}
