package com.tachikoma.core.component.recyclerview.view.CustomRecyclerView;
import o17.c;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.tachikoma.core.component.recyclerview.view.CustomRecyclerView$a;
import java.lang.Math;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import fp8.a;
import java.util.Objects;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;

public class CustomRecyclerView extends RecyclerView implements c	// class@000d86
{
    public Rect b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public boolean h;
    public CustomRecyclerView$a i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public boolean o;

    public void CustomRecyclerView(Context p0){
       super(p0, null);
    }
    public void CustomRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CustomRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = Integer.MIN_VALUE;
       this.h = true;
       this.k = true;
       this.l = 0;
       this.o = false;
       this.e = ViewConfiguration.get(p0).getScaledTouchSlop();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, CustomRecyclerView.class, "11")) {
          return;
       }
       super.onDetachedFromWindow();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomRecyclerView.class, "1")) {
          return;
       }
       if (this.c != null) {
          this.x();
          CustomRecyclerView tb = this.b;
          if (tb != null && !tb.isEmpty()) {
             p0.save();
             p0.clipRect(this.b);
             p0.drawColor(this.c);
             p0.restore();
          }
       }
       super.onDraw(p0);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CustomRecyclerView obj = PatchProxy.applyOneRefs(p0, this, CustomRecyclerView.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.j != null) {
          return false;
       }
       if (!p0.getAction() && this.o != null) {
          this.stopScroll();
       }
       obj = this.i;
       if (obj != null && obj.a(p0)) {
          return false;
       }else {
          Object obj1 = PatchProxy.applyOneRefs(p0, this, CustomRecyclerView.class, "8");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             b = p0.getActionMasked();
             if (b) {
                if (b == 2) {
                   b = (int)Math.abs((p0.getX() - (float)this.m));
                   int i = (int)Math.abs((p0.getY() - (float)this.n));
                   CustomRecyclerView te = this.e;
                   if (b > te && i > te) {
                      te = this.l;
                      if (te == 1 && (b > i || (te == 2 && b < i))) {
                         b = true;
                      }
                   }
                }
             }else {
                this.m = (int)p0.getX();
                this.n = (int)p0.getY();
             }
             b = false;
          }
          if (b) {
             return false;
          }else {
             return super.onInterceptTouchEvent(p0);
          }
       }
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(CustomRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CustomRecyclerView.class, "10")) {
          return;
       }
       int size = View$MeasureSpec.getSize(p1);
       CustomRecyclerView td = this.d;
       if (td > null && td < size) {
          p1 = View$MeasureSpec.makeMeasureSpec(this.d, View$MeasureSpec.getMode(p1));
       }
       super.onMeasure(p0, p1);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CustomRecyclerView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.j != null) {
          return false;
       }
       return super.onTouchEvent(p0);
    }
    public boolean r(){
       return this.k;
    }
    public void scrollToPosition(int p0){
       CustomRecyclerView this;
       int i1;
       int i2;
       if (PatchProxy.isSupport(CustomRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CustomRecyclerView.class, "4")) {
          return;
       }
       if (this.f != null) {
          int i = this.getHeight() * 2;
          i = i / 3;
          if (!PatchProxy.isSupport(CustomRecyclerView.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(i), Integer.valueOf(0), this, CustomRecyclerView.class, "6")) {
             a uoa = PatchProxy.applyOneRefs(this, null, a.class, "1");
             if (uoa != PatchProxyResult.class) {
             }else {
                uoa = new a(this);
             }
             while (true) {
                Objects.requireNonNull(uoa);
                View obj = PatchProxy.apply(null, uoa, a.class, "4");
                this = -1;
                if (obj != PatchProxyResult.class) {
                   i1 = obj.intValue();
                label_0081 :
                   View obj1 = PatchProxy.apply(null, uoa, a.class, "6");
                   if (obj1 != PatchProxyResult.class) {
                      i2 = obj1.intValue();
                   }else {
                      i2 = uoa.b.getChildCount() - 1;
                      obj1 = uoa.a(i2, this, 0, 1);
                      i2 = (obj1 == null)? -1: uoa.a.getChildAdapterPosition(obj1);
                   }
                   if (i1 != this && i2 != this) {
                      if (this.g == Integer.MIN_VALUE || this.h == null) {
                         int[] ointArray = new int[2];
                         this.getLocationOnScreen(ointArray);
                         this.g = ointArray[1];
                      }
                      if (p0 >= i1 && p0 <= i2) {
                         p0 = p0 - i1;
                         if (this.getChildCount() > p0) {
                            int[] ointArray1 = new int[2];
                            this.getChildAt(p0).getLocationOnScreen(ointArray1);
                            this.scrollBy(0, ((ointArray1[1] - this.g) - 0));
                            break ;
                         }
                      }else if(p0 > i2){
                         this.scrollBy(0, i);
                      }else {
                         i1 = - i;
                         this.scrollBy(0, i1);
                      }
                   }
                }else {
                   obj = uoa.a(0, uoa.b.getChildCount(), 0, 1);
                   if (obj == null) {
                      i1 = -1;
                      goto label_0081 ;
                   }else {
                      i1 = uoa.a.getChildAdapterPosition(obj);
                      goto label_0081 ;
                   }
                }
             }
          }
       }else {
          super.scrollToPosition(p0);
       }
       return;
    }
    public void setCanPullToRefresh(boolean p0){
       this.k = p0;
    }
    public void setDisableScroll(boolean p0){
       this.j = p0;
    }
    public void setDistanceToScreenTopUseCache(boolean p0){
       this.h = p0;
    }
    public void setDownStop(boolean p0){
       this.o = p0;
    }
    public void setFixScrollConflictDirection(int p0){
       this.l = p0;
    }
    public void setIgnoreTouchSwipeHandler(CustomRecyclerView$a p0){
       this.i = p0;
    }
    public void setMaxHeight(int p0){
       this.d = p0;
    }
    public void setUnderneathColor(int p0){
       if (PatchProxy.isSupport(CustomRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CustomRecyclerView.class, "2")) {
          return;
       }
       this.c = p0;
       this.x();
       this.invalidate();
       return;
    }
    public void setUseCustomScrollToPosition(boolean p0){
       this.f = p0;
    }
    public final void x(){
       if (PatchProxy.applyVoid(null, this, CustomRecyclerView.class, "3")) {
          return;
       }
       CustomRecyclerView tb = this.b;
       if (tb == null) {
          this.b = new Rect();
       }else {
          tb.setEmpty();
       }
       int childCount = this.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          if (!childAt.getVisibility()) {
             this.b.union(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
          }
          i = i + 1;
       }
       return;
    }
}
