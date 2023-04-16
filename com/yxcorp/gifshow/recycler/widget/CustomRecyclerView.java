package com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import o17.c;
import androidx.recyclerview.widget.SafeRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView;
import l17.a;
import android.view.ViewGroup;
import android.view.View;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.view.ViewParent;
import java.lang.Exception;
import com.yxcorp.utility.Log;
import java.lang.RuntimeException;
import java.lang.Throwable;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView$a;
import java.lang.Math;
import android.view.View$MeasureSpec;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import y8c.g;

public class CustomRecyclerView extends SafeRecyclerView implements c	// class@0017b2
{
    public Rect c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public CustomRecyclerView$a i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;

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
       this.l = true;
       this.m = 0;
       this.p = false;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.m0);
       this.e = typedArray.getDimensionPixelOffset(0, 0);
       this.f = ViewConfiguration.get(p0).getScaledTouchSlop();
       typedArray.recycle();
    }
    public final void A(int p0,int p1,int p2){
       if (PatchProxy.isSupport(CustomRecyclerView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, CustomRecyclerView.class, "6")) {
          return;
       }
       a uoa = a.a(this);
       while (true) {
          int i = uoa.c();
          int i1 = uoa.e();
          CustomRecyclerView uCustomRecyc = -1;
          if (i == uCustomRecyc || i1 == uCustomRecyc) {
             return;
          }
          if (this.g == Integer.MIN_VALUE || this.h == null) {
             int[] ointArray = new int[2];
             this.getLocationOnScreen(ointArray);
             this.g = ointArray[1];
          }
          int i2 = 0;
          if (p0 >= i && p0 <= i1) {
             p0 = p0 - i;
             if (this.getChildCount() > p0) {
                int[] ointArray1 = new int[2];
                this.getChildAt(p0).getLocationOnScreen(ointArray1);
                this.scrollBy(i2, ((ointArray1[1] - this.g) - p2));
                break ;
             }
             break ;
          }else if(p0 > i1){
             this.scrollBy(i2, p1);
          }else {
             i = - p1;
             this.scrollBy(i2, i);
          }
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, CustomRecyclerView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.k != null) {
          return false;
       }
       try{
          return super.dispatchTouchEvent(p0);
       }catch(java.lang.Exception e8){
          obj = "VIEW INFO:"+this.getClass().getSimpleName()+", ids: ";
          View view = this;
       label_003a :
          if (view != null) {
             String resourceName = ((long)view.getId() - -1)? this.getResources().getResourceName(view.getId()): "NO_ID";
             obj = obj+resourceName+", ";
             view = view.getParent();
             if (view instanceof ViewGroup) {
                goto label_003a ;
             }else {
                view = null;
                goto label_003a ;
             }
          }else {
             Log.d("CustomRecyclerView", obj+"\n EXCEPTION: "+e8.getMessage());
             throw new RuntimeException(obj, e8);
          }
       }
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, CustomRecyclerView.class, "12")) {
          return;
       }
       super.onDetachedFromWindow();
       this.x();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomRecyclerView.class, "1")) {
          return;
       }
       if (this.d != null) {
          this.y();
          CustomRecyclerView tc = this.c;
          if (tc != null && !tc.isEmpty()) {
             p0.save();
             p0.clipRect(this.c);
             p0.drawColor(this.d);
             p0.restore();
          }
       }
       super.onDraw(p0);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CustomRecyclerView obj = PatchProxy.applyOneRefs(p0, this, CustomRecyclerView.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.j != null) {
          return false;
       }
       if (!p0.getAction() && this.p != null) {
          this.stopScroll();
       }
       obj = this.i;
       if (obj != null && obj.a(p0)) {
          return false;
       }else {
          Object obj1 = PatchProxy.applyOneRefs(p0, this, CustomRecyclerView.class, "9");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             b = p0.getActionMasked();
             if (b) {
                if (b == 2) {
                   b = (int)Math.abs((p0.getX() - (float)this.n));
                   int i = (int)Math.abs((p0.getY() - (float)this.o));
                   CustomRecyclerView tf = this.f;
                   if (b > tf && i > tf) {
                      tf = this.m;
                      if (tf == 1 && (b > i || (tf == 2 && b < i))) {
                         b = true;
                      }
                   }
                }
             }else {
                this.n = (int)p0.getX();
                this.o = (int)p0.getY();
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
       if (PatchProxy.isSupport(CustomRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CustomRecyclerView.class, "11")) {
          return;
       }
       int size = View$MeasureSpec.getSize(p1);
       CustomRecyclerView te = this.e;
       if (te > null && te < size) {
          p1 = View$MeasureSpec.makeMeasureSpec(this.e, View$MeasureSpec.getMode(p1));
       }
       super.onMeasure(p0, p1);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CustomRecyclerView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.j != null) {
          return false;
       }
       return super.onTouchEvent(p0);
    }
    public boolean r(){
       return this.l;
    }
    public void setCanPullToRefresh(boolean p0){
       this.l = p0;
    }
    public void setDisableScroll(boolean p0){
       this.j = p0;
    }
    public void setDisableTouchEvent(boolean p0){
       this.k = p0;
    }
    public void setDistanceToScreenTopUseCache(boolean p0){
       this.h = p0;
    }
    public void setDownStop(boolean p0){
       this.p = p0;
    }
    public void setFixScrollConflictDirection(int p0){
       this.m = p0;
    }
    public void setIgnoreTouchSwipeHandler(CustomRecyclerView$a p0){
       this.i = p0;
    }
    public void setMaxHeight(int p0){
       this.e = p0;
    }
    public void setPadding(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(CustomRecyclerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, CustomRecyclerView.class, "14")) {
          return;
       }
       super.setPadding(p0, p1, p2, p3);
       return;
    }
    public void setUnderneathColor(int p0){
       if (PatchProxy.isSupport(CustomRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CustomRecyclerView.class, "2")) {
          return;
       }
       this.d = p0;
       this.y();
       this.invalidate();
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, CustomRecyclerView.class, "13")) {
          return;
       }
       RecyclerView$Adapter adapter = this.getAdapter();
       if (adapter instanceof g) {
          adapter.Z0();
       }
       return;
    }
    public final void y(){
       if (PatchProxy.applyVoid(null, this, CustomRecyclerView.class, "3")) {
          return;
       }
       CustomRecyclerView tc = this.c;
       if (tc == null) {
          this.c = new Rect();
       }else {
          tc.setEmpty();
       }
       int childCount = this.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          if (!childAt.getVisibility()) {
             this.c.union(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
          }
          i = i + 1;
       }
       return;
    }
    public void z(int p0,int p1){
       if (PatchProxy.isSupport(CustomRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CustomRecyclerView.class, "5")) {
          return;
       }
       this.A(p0, this.getHeight(), p1);
       return;
    }
}
