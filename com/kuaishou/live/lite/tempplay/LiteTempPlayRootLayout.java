package com.kuaishou.live.lite.tempplay.LiteTempPlayRootLayout;
import android.widget.LinearLayout;
import com.kuaishou.live.lite.tempplay.LiteTempPlayRootLayout$a;
import nsd.u;
import android.widget.LinearLayout$LayoutParams;
import android.view.View$MeasureSpec;
import android.content.Context;
import android.util.AttributeSet;
import androidx.core.util.Pools$SimplePool;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.graphics.Paint;
import java.lang.StringBuilder;
import com.kuaishou.live.lite.tempplay.LiteTempPlayRootLayout$b;
import android.graphics.drawable.Drawable;
import usd.k;
import usd.q;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import trd.l0;
import android.view.View;
import kotlin.jvm.internal.a;
import z1.f;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import java.util.Collection;
import com.kuaishou.live.lite.tempplay.LiteTempPlayRootLayout$c;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Objects;

public final class LiteTempPlayRootLayout extends LinearLayout	// class@000b7d
{
    public final f b;
    public Paint c;
    public static final LinearLayout$LayoutParams d;
    public static final int e;
    public static final LiteTempPlayRootLayout$a f;

    static {
       LiteTempPlayRootLayout.f = new LiteTempPlayRootLayout$a(null);
       LiteTempPlayRootLayout.d = new LinearLayout$LayoutParams(-2, -2);
       LiteTempPlayRootLayout.e = View$MeasureSpec.makeMeasureSpec(0x2710, 0);
    }
    public void LiteTempPlayRootLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiteTempPlayRootLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiteTempPlayRootLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Pools$SimplePool(10);
    }
    public void LiteTempPlayRootLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final boolean a(int p0){
       if (PatchProxy.isSupport(LiteTempPlayRootLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiteTempPlayRootLayout.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = ((this.getShowDividers() & p0) == p0)? true: false;
       return b;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteTempPlayRootLayout.class, "6")) {
          return;
       }
       super.dispatchDraw(p0);
       LiteTempPlayRootLayout tc = this.c;
       if (tc != null) {
          if (p0 != null) {
             p0.drawRect(0, 0, (float)this.getWidth(), (float)this.getHeight(), tc);
          }
          if (p0 != null) {
             p0.drawText(":-"+this.getWidth(), 10.00f, 40.00f, tc);
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       int i3;
       LiteTempPlayRootLayout$b uob3;
       Object obj = this;
       LiteTempPlayRootLayout$b uob = LiteTempPlayRootLayout$b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiteTempPlayRootLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), obj, LiteTempPlayRootLayout.class, "1")) {
          return;
       }
       int size = View$MeasureSpec.getSize(p0);
       if (size <= 0) {
          super.onMeasure(p0, p1);
          return;
       }else {
          size = (size - this.getPaddingStart()) - this.getPaddingEnd();
          Drawable dividerDrawa = this.getDividerDrawable();
          int i = 0;
          int intrinsicWid = (dividerDrawa != null)? dividerDrawa.getIntrinsicWidth(): 0;
          int i1 = 1;
          if (obj.a(i1)) {
             size = size - intrinsicWid;
          }
          if (obj.a(4)) {
             size = size - intrinsicWid;
          }
          if (size <= 0) {
             this.removeAllViewsInLayout();
             super.onMeasure(p0, p1);
             return;
          }else {
             k ok = q.n1(i, this.getChildCount());
             ArrayList uArrayList = new ArrayList(u.Y(ok, 10));
             Iterator iterator = ok.iterator();
             int i2 = 0;
             while (iterator.hasNext()) {
                View childAt = obj.getChildAt(iterator.b());
                a.o(childAt, "getChildAt\(it\)");
                LiteTempPlayRootLayout$b uob1 = PatchProxy.applyOneRefs(childAt, obj, LiteTempPlayRootLayout.class, "2");
                if (uob1 != patchProxyRe) {
                }else {
                   uob1 = obj.b.q();
                   if (uob1 == null) {
                      uob1 = new LiteTempPlayRootLayout$b();
                   }
                   LiteTempPlayRootLayout$b uob2 = uob1;
                   Object obj1 = PatchProxy.applyOneRefs(childAt, obj, LiteTempPlayRootLayout.class, "4");
                   if (obj1 != patchProxyRe) {
                      i2 = obj1.intValue();
                   }else {
                      obj1 = childAt.getTag(R.id.lite_temp_play_view_biz_priority);
                      if (obj1 instanceof Integer) {
                         i2 = obj1;
                      }
                      if (i2 != null) {
                         i2 = i2.intValue();
                      }else {
                         i2 = Integer.MAX_VALUE;
                      }
                   }
                   obj1 = PatchProxy.applyOneRefs(childAt, obj, LiteTempPlayRootLayout.class, "5");
                   if (obj1 != patchProxyRe) {
                      i3 = obj1.intValue();
                   }else if(childAt.getLayoutParams() == null){
                      childAt.setLayoutParams(LiteTempPlayRootLayout.d);
                   }
                   childAt.forceLayout();
                   childAt.measure(LiteTempPlayRootLayout.e, childAt.getMeasuredHeightAndState());
                   i3 = childAt.getMeasuredWidth();
                   int i4 = i3;
                   if (PatchProxy.isSupport(uob)) {
                      i = i4;
                      uob3 = uob2;
                      if (PatchProxy.applyVoidThreeRefs(childAt, Integer.valueOf(i2), Integer.valueOf(i4), uob3, LiteTempPlayRootLayout$b.class, "3")) {
                         uob1 = uob3;
                      }
                   }else {
                      i = i4;
                      uob3 = uob2;
                   }
                   a.p(childAt, "view");
                   uob1 = uob3;
                   uob1.a = childAt;
                   uob1.b = i2;
                   uob1.c = i;
                }
                uArrayList.add(uob1);
                i = 0;
             }
             List list = CollectionsKt___CollectionsKt.G5(CollectionsKt___CollectionsKt.f5(uArrayList, new LiteTempPlayRootLayout$c()));
             List list1 = CollectionsKt___CollectionsKt.J5(list);
             int i5 = list1.isEmpty() ^ i1;
             while (i5) {
                LiteTempPlayRootLayout$b uob4 = list1.remove(0);
                size = size - uob4.c;
                if (obj.a(2)) {
                   size = size - intrinsicWid;
                }
                if (size < 0) {
                   list1.add(0, uob4);
                   break ;
                }
             }
             Iterator iterator1 = list1.iterator();
             while (iterator1.hasNext()) {
                LiteTempPlayRootLayout$b uob5 = iterator1.next();
                Objects.requireNonNull(uob5);
                LiteTempPlayRootLayout$b uob6 = PatchProxy.apply(i2, uob5, uob, "1");
                if (uob6 != patchProxyRe) {
                }else {
                   uob6 = uob5.a;
                   if (uob6 == null) {
                      a.S("view");
                   }
                }
                obj.removeViewInLayout(uob6);
             }
             Iterator iterator2 = list.iterator();
             while (iterator2.hasNext()) {
                obj.b.a(iterator2.next());
             }
             super.onMeasure(p0, p1);
             return;
          }
       }
    }
}
