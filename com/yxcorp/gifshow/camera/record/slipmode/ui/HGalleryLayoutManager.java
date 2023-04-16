package com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import lnc.a1;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$b;
import android.graphics.PointF;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.IllegalArgumentException;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Long;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import com.yxcorp.gifshow.camera.record.slipmode.ui.AssistantItemFrameLayout;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$d;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$f;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$e;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$g;
import androidx.recyclerview.widget.p;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$c;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;

public class HGalleryLayoutManager extends RecyclerView$LayoutManager implements RecyclerView$x$b	// class@000f2b
{
    public float b;
    public int c;
    public Long d;
    public int e;
    public int f;
    public float g;
    public int h;
    public View i;
    public HGalleryLayoutManager$g j;
    public HGalleryLayoutManager$e k;
    public p l;
    public HGalleryLayoutManager$b m;
    public RecyclerView n;
    public final PointF o;
    public HGalleryLayoutManager$f p;
    public HGalleryLayoutManager$d q;
    public boolean r;
    public static final float s;

    static {
       HGalleryLayoutManager.s = (float)a1.e(15.00f);
    }
    public void HGalleryLayoutManager(){
       super();
       this.b = 0xbf800000;
       this.d = null;
       this.e = 0;
       this.f = 0;
       this.h = -1;
       this.m = new HGalleryLayoutManager$b(this);
       this.o = new PointF();
       this.r = false;
       this.g = HGalleryLayoutManager.s;
       this.l = new HGalleryLayoutManager$a(this);
    }
    public void N(RecyclerView p0,int p1){
       HGalleryLayoutManager hGalleryLayo = HGalleryLayoutManager.class;
       if (PatchProxy.isSupport(hGalleryLayo) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, hGalleryLayo, "2")) {
          return;
       }
       if (p0 == null) {
          throw new IllegalArgumentException("The attach RecycleView must not null!!");
       }
       p0.setLayoutManager(this);
       if (this.n != p0 && p0.getOnFlingListener() != null) {
          p0.setOnFlingListener(null);
       }
       this.n = p0;
       this.l.b(p0);
       p0.addOnScrollListener(this.m);
       this.scrollToPosition(p1);
       return;
    }
    public final float O(int p0,float p1){
       HGalleryLayoutManager hGalleryLayo = HGalleryLayoutManager.class;
       if (PatchProxy.isSupport(hGalleryLayo)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, hGalleryLayo, "11");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return (((((float)this.f / 2.00f) - p1) + (float)p0) - ((float)this.getWidth() / 2.00f));
    }
    public final int P(RecyclerView$t p0,RecyclerView$y p1,int p2){
       HGalleryLayoutManager obj1;
       int i1;
       float f;
       int i2;
       View obj2;
       int i4;
       HGalleryLayoutManager hGalleryLayo;
       View view1;
       float f1;
       int i6;
       HGalleryLayoutManager hGalleryLayo3;
       HGalleryLayoutManager obj3;
       float f4;
       int i10;
       float f5;
       float f6;
       float f7;
       Long longx = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(HGalleryLayoutManager.class)) {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, HGalleryLayoutManager.class, "6");
          if (obj1 != patchProxyRe) {
             return obj1.intValue();
          }
       }
       int i = 0;
       if (PatchProxy.isSupport(HGalleryLayoutManager.class)) {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, HGalleryLayoutManager.class, "9");
          if (obj1 != patchProxyRe) {
             i1 = obj1.intValue();
          label_029b :
             if (!PatchProxy.applyVoidOneRefs(obj, longx, HGalleryLayoutManager.class, "10")) {
                List list = p0.k();
                for (i = 0; i < list.size(); i = i + 1) {
                   longx.removeAndRecycleView(list.get(i).itemView, obj);
                }
             }
             return i1;
          }
       }
       if (p2 < 0) {
          long l = 0;
          if (this.T() - l < 0) {
             longx.d = Long.valueOf(l);
             f = 0;
          label_0062 :
             if (f > 0 && (float)this.T() - this.S() >= 0) {
                longx.d = Long.valueOf((long)this.S());
                i2 = 0;
             }else {
                f5 = f;
             }
             this.detachAndScrapAttachedViews(p0);
             int i3 = 0;
             if (!longx.b - 0xbf800000) {
                obj1 = longx.c;
                View view = obj.o(obj1);
                longx.measureChildWithMargins(view, i, i);
                obj2 = PatchProxy.applyOneRefs(view, longx, HGalleryLayoutManager.class, "14");
                if (obj2 != patchProxyRe) {
                   i4 = obj2.intValue();
                }else {
                   RecyclerView$LayoutParams layoutParams = view.getLayoutParams();
                   i4 = layoutParams.rightMargin + (longx.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin);
                }
                longx.f = i4;
                hGalleryLayo = obj1;
                view1 = view;
             }else {
                i6 = i3;
                hGalleryLayo = -1;
             }
             i1 = (this.getWidth() / 2) + (longx.f / 2);
             long l1 = (long)i1;
             if (this.T() - l1 >= 0) {
                longx.b = (float)longx.f;
                longx.c = (int)Math.floor((double)((float)Math.abs((this.T() - l1)) / longx.b)) + 1;
                HGalleryLayoutManager b = longx.b;
                f = (float)Math.abs((this.T() - l1)) % b;
                f = f / (b * 0x3f800000);
                f1 = 0;
             }else {
                longx.c = i;
                Object obj4 = PatchProxy.apply(i3, longx, HGalleryLayoutManager.class, "8");
                if (obj4 != patchProxyRe) {
                   f1 = obj4.floatValue();
                }else if(longx.f == null){
                   f1 = 0;
                }else {
                   f1 = (float)(this.getWidth() - longx.f) / 2.00f;
                }
                longx.b = (float)i1;
                obj3 = longx.b;
                f = (float)Math.abs(this.T()) % obj3;
                f = f / (obj3 * 0x3f800000);
             }
             int i5 = this.getItemCount() - 1;
             float f2 = longx.b * f;
             HGalleryLayoutManager hGalleryLayo1 = longx.c;
             obj1 = null;
             while (hGalleryLayo1 <= i5) {
                obj2 = (hGalleryLayo1 == hGalleryLayo && view1 != null)? view1: obj.o(hGalleryLayo1);
                HGalleryLayoutManager hGalleryLayo2 = hGalleryLayo;
                View view2 = view1;
                l = Math.abs(this.T()) / (long)longx.f;
                if (hGalleryLayo1 <= (int)l) {
                   longx.addView(obj2);
                   i = 0;
                }else {
                   i = 0;
                   longx.addView(obj2, i);
                }
                longx.measureChildWithMargins(obj2, i, i);
                if (obj1 == null) {
                   f1 = f1 - f2;
                   hGalleryLayo = 1;
                }else {
                   hGalleryLayo = obj1;
                }
                i6 = (int)f1;
                int i7 = i6 + longx.f;
                i3 = this.getHeight() - this.getPaddingBottom();
                i3 = i3 - this.getPaddingTop();
                i3 = i3 - longx.R(obj2);
                float f3 = (float)i3 / 2.00f;
                f = (float)this.getPaddingTop() + f3;
                int i8 = (int)f;
                int i9 = i8 + longx.R(obj2);
                f = (float)i2;
                if (PatchProxy.isSupport(HGalleryLayoutManager.class)) {
                   hGalleryLayo3 = hGalleryLayo1;
                   obj3 = PatchProxy.applyTwoRefs(Integer.valueOf(i6), Float.valueOf(f), longx, HGalleryLayoutManager.class, "12");
                   if (obj3 != patchProxyRe) {
                      f3 = obj3.floatValue();
                   }else {
                   label_01c2 :
                      f3 = longx.O(i6, f);
                      hGalleryLayo1 = longx.f;
                      i = - hGalleryLayo1;
                      if (f3 - (float)i >= 0) {
                         f7 = (float)hGalleryLayo1;
                         if (f3 - f7 <= 0) {
                            if (f3 <= 0) {
                               f3 = f3 + f7;
                               f3 = f3 / f7;
                            }else {
                               f3 = f3 - f7;
                               f3 = f3 / f7;
                               f3 = - f3;
                            }
                         }
                      }
                      f4 = 0;
                   label_01e1 :
                      if (PatchProxy.isSupport(HGalleryLayoutManager.class)) {
                         i10 = i2;
                         obj3 = PatchProxy.applyTwoRefs(Integer.valueOf(i6), Float.valueOf(f), longx, HGalleryLayoutManager.class, "13");
                         if (obj3 != patchProxyRe) {
                            f = obj3.floatValue();
                         }else {
                         label_0202 :
                            f = longx.O(i6, f);
                            if (f >= 0) {
                               f3 = (float)longx.f;
                               if (f - f3 < 0) {
                                  f = f - f3;
                                  f = - f;
                                  f = f / f3;
                               }
                            }
                            if (f < 0) {
                               i3 = - longx.f;
                               f3 = (float)i3 - longx.g;
                               if (f - f3 >= 0) {
                                  f = 0x3f800000;
                               }
                            }
                            obj3 = longx.f;
                            int i11 = - obj3;
                            f7 = (float)i11;
                            HGalleryLayoutManager g = longx.g;
                            f6 = f7 - g;
                            if (f - f6 < 0) {
                               f7 = f7 * 2.00f;
                               f7 = f7 - g;
                               if (f - f7 > 0) {
                                  f3 = (float)obj3;
                                  f = f + f3;
                                  f = f + g;
                                  f = f / f3;
                                  f = f + 0x3f800000;
                               }
                            }
                            f = 0;
                         }
                      }else {
                         i10 = i2;
                         goto label_0202 ;
                      }
                      f5 = longx.g * f;
                      f = (float)longx.f + f5;
                      f6 = f1 + f;
                      PatchProxyResult patchProxyRe1 = patchProxyRe;
                      HGalleryLayoutManager hGalleryLayo4 = hGalleryLayo3;
                      hGalleryLayo3 = hGalleryLayo;
                      View view3 = obj2;
                      this.layoutDecoratedWithMargins(obj2, i6, i8, i7, i9);
                      if (view3 instanceof AssistantItemFrameLayout) {
                         obj2 = view3;
                         f5 = f5 * f4;
                         obj2.setPartitionTranslationX(f5);
                         obj2.setFraction(f4);
                         obj1 = longx.q;
                         if (obj1 != null) {
                            obj1.a(view3, f4);
                         }
                      }
                      if (longx.p != null && (i6 >= 0 && i6 < this.getWidth())) {
                         longx.p.a(hGalleryLayo4);
                      }
                   label_0286 :
                      hGalleryLayo1 = hGalleryLayo4 + 1;
                      hGalleryLayo = hGalleryLayo2;
                      view1 = view2;
                      patchProxyRe = patchProxyRe1;
                      obj1 = hGalleryLayo3;
                      i2 = i10;
                      f1 = f6;
                      HGalleryLayoutManager hGalleryLayo5 = null;
                   }
                }else {
                   hGalleryLayo3 = hGalleryLayo1;
                   goto label_01c2 ;
                }
                f4 = f3;
                goto label_01e1 ;
             }
             i1 = i2;
             goto label_029b ;
          }
       }
       f = p2;
       goto label_0062 ;
    }
    public int Q(){
       return this.h;
    }
    public int R(View p0){
       RecyclerView$LayoutParams obj = PatchProxy.applyOneRefs(p0, this, HGalleryLayoutManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = p0.getLayoutParams();
       return ((this.getDecoratedMeasuredHeight(p0) + obj.topMargin) + obj.bottomMargin);
    }
    public final float S(){
       Object obj = PatchProxy.apply(null, this, HGalleryLayoutManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.f == null || !this.getItemCount()) {
          return 0;
       }
       return ((float)(this.f * (this.getItemCount() - 1)) + (this.g * 0x3f800000));
    }
    public final long T(){
       HGalleryLayoutManager obj = PatchProxy.apply(null, this, HGalleryLayoutManager.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.d;
       if (obj != null) {
          return obj.longValue();
       }
       obj = this.e;
       if (obj == null) {
          this.d = Long.valueOf(0);
          return 0;
       }else {
          Long longx = Long.valueOf((long)((float)(this.f * obj) + this.g));
          this.d = longx;
          return longx.longValue();
       }
    }
    public void U(int p0){
       HGalleryLayoutManager hGalleryLayo = HGalleryLayoutManager.class;
       if (PatchProxy.isSupport(hGalleryLayo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, hGalleryLayo, "3")) {
          return;
       }
       this.c = 0;
       this.d = (!p0)? Long.valueOf(0): null;
       this.e = p0;
       this.h = -1;
       return;
    }
    public void V(HGalleryLayoutManager$d p0){
       this.q = p0;
    }
    public void W(HGalleryLayoutManager$e p0){
       this.k = p0;
    }
    public void X(HGalleryLayoutManager$g p0){
       this.j = p0;
    }
    public void Y(HGalleryLayoutManager$f p0){
       this.p = p0;
    }
    public boolean canScrollHorizontally(){
       return true;
    }
    public PointF computeScrollVectorForPosition(int p0){
       HGalleryLayoutManager hGalleryLayo = HGalleryLayoutManager.class;
       if (PatchProxy.isSupport(hGalleryLayo)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, hGalleryLayo, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.getChildCount()) {
          return null;
       }else if(p0 < this.getPosition(this.getChildAt(0))){
          p0 = -1;
       }else {
          p0 = 1;
       }
       this.o.set((float)p0, 0);
       return this.o;
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, HGalleryLayoutManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecyclerView$LayoutParams(-2, -2);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HGalleryLayoutManager.class, "4")) {
          return;
       }
       if (!p1.c()) {
          this.removeAndRecycleAllViews(p0);
          return;
       }else {
          this.b = 0xbf800000;
          this.detachAndScrapAttachedViews(p0);
          this.P(p0, p1, 0);
          return;
       }
    }
    public int scrollHorizontallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (PatchProxy.isSupport(HGalleryLayoutManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, HGalleryLayoutManager.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p0 || !this.getChildCount()) {
          return 0;
       }else {
          this.d = Long.valueOf((this.T() + (long)p0));
          return this.P(p1, p2, p0);
       }
    }
    public void scrollToPosition(int p0){
       HGalleryLayoutManager hGalleryLayo = HGalleryLayoutManager.class;
       if (PatchProxy.isSupport(hGalleryLayo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, hGalleryLayo, "16")) {
          return;
       }
       this.d = (!p0)? Long.valueOf(0): Long.valueOf((long)((float)(this.f * p0) + this.g));
       this.requestLayout();
       if (this.T() - (long)this.getWidth() < 0) {
          hGalleryLayo = this.k;
          if (hGalleryLayo != null) {
             this.h = p0;
             HGalleryLayoutManager tn = this.n;
             hGalleryLayo.a(tn, this.l.h(tn.getLayoutManager()), p0);
          }
       }
       return;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(HGalleryLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, HGalleryLayoutManager.class, "17")) {
          return;
       }
       HGalleryLayoutManager$c uoc = new HGalleryLayoutManager$c(p0.getContext());
       uoc.p(p2);
       this.startSmoothScroll(uoc);
       return;
    }
}
