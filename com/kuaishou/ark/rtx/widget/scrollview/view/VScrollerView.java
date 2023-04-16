package com.kuaishou.ark.rtx.widget.scrollview.view.VScrollerView;
import or.a;
import androidx.core.widget.NestedScrollView;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.ark.rtx.widget.scrollview.view.VScrollerView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewTreeObserver;
import pr.b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import android.view.ViewGroup;
import java.lang.Boolean;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import or.b;
import android.view.View;
import android.os.Handler;
import android.view.MotionEvent;
import or.c;
import or.d;

public class VScrollerView extends NestedScrollView implements a	// class@000fa4
{
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public VScrollerView$a i;
    public d j;
    public c k;
    public b l;
    public WeakReference m;
    public int n;
    public static final int o;

    public void VScrollerView(Context p0){
       super(p0, null);
    }
    public void VScrollerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VScrollerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       boolean b = false;
       this.b = b;
       this.c = true;
       this.d = b;
       this.e = b;
       this.f = b;
       this.i = new VScrollerView$a(this);
       this.j = null;
       this.k = null;
       this.l = null;
       if (PatchProxy.applyVoidOneRefs(p0, this, VScrollerView.class, "1")) {
       }else {
          this.setOverScrollMode(2);
          this.setClipToPadding(b);
          this.setImportantForAccessibility(2);
          this.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
          this.getViewTreeObserver().addOnGlobalLayoutListener(new b(this));
       }
       return;
    }
    public void a(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VScrollerView.class, "16")) {
          return;
       }
       this.m = new WeakReference(p0);
       if (p0 != null) {
          int[] ointArray = new int[2];
          p0.getLocationOnScreen(ointArray);
          this.h = ointArray[1];
       }
       return;
    }
    public void c(boolean p0){
       if (PatchProxy.isSupport(VScrollerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VScrollerView.class, "15")) {
          return;
       }
       this.setNestedScrollingEnabled((p0 ^ 0x01));
       return;
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport(VScrollerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VScrollerView.class, "11")) {
          return;
       }
       this.setVerticalScrollBarEnabled(p0);
       return;
    }
    public boolean dispatchNestedPreFling(float p0,float p1){
       if (PatchProxy.isSupport(VScrollerView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, VScrollerView.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = (int)(0x3f000000 * p1);
       this.e = i;
       this.f = i;
       this.k();
       return super.dispatchNestedPreFling(p0, p1);
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3,int p4){
       RecyclerView obj;
       if (PatchProxy.isSupport(VScrollerView.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),p2,p3,Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, VScrollerView.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.j()) {
          obj = this.m.get();
          VScrollerView vScrollerVie = -1;
          if (obj.getLayoutManager() instanceof LinearLayoutManager) {
             vScrollerVie = this.m.get().getLayoutManager().h();
          }else if(obj.getLayoutManager() instanceof GridLayoutManager){
             vScrollerVie = this.m.get().getLayoutManager().h();
          }
          if (vScrollerVie && (!obj.isNestedScrollingEnabled() && (p1 < 0 && obj.computeVerticalScrollOffset() > 0))) {
             obj.scrollBy(0, p1);
             this.scrollBy(0, (- p1));
          }
       }
    label_0094 :
       return super.dispatchNestedPreScroll(p0, p1, p2, p3, p4);
    }
    public void dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4,int p5,int[] p6){
       if (PatchProxy.isSupport(VScrollerView.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4,Integer.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, this, VScrollerView.class, "9")) {
             return;
          }
       }
       super.dispatchNestedScroll(p0, p1, p2, p3, p4, p5, p6);
       if (p3 > 0 && this.j()) {
          this.m.get().scrollBy(p2, p3);
       }
       return;
    }
    public void e(b p0){
       this.l = p0;
    }
    public void f(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VScrollerView.class, "12")) {
          return;
       }
       this.addView(p0);
       return;
    }
    public void g(boolean p0){
       if (PatchProxy.isSupport(VScrollerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VScrollerView.class, "14")) {
          return;
       }
       this.setClipChildren(p0);
       return;
    }
    public FrameLayout getView(){
       return this;
    }
    public void h(boolean p0){
       if (PatchProxy.isSupport(VScrollerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VScrollerView.class, "13")) {
          return;
       }
       this.setFillViewport(p0);
       return;
    }
    public void i(boolean p0){
       if (PatchProxy.isSupport(VScrollerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VScrollerView.class, "10")) {
          return;
       }
       this.setHorizontalScrollBarEnabled(p0);
       return;
    }
    public final boolean j(){
       VScrollerView obj = PatchProxy.apply(null, this, VScrollerView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.m;
       boolean b = false;
       if (obj != null && obj.get() != null) {
          b = true;
       }
       return b;
    }
    public final void k(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VScrollerView.class, "19")) {
          return;
       }
       this.i.removeCallbacksAndMessages(objArray);
       this.i.sendEmptyMessageDelayed(1, 200);
       return;
    }
    public void l(){
       this.e = 0;
       this.f = 0;
    }
    public final void m(boolean p0){
       if (PatchProxy.isSupport(VScrollerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VScrollerView.class, "18")) {
          return;
       }
       if (this.j()) {
          this.m.get().setNestedScrollingEnabled(p0);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, VScrollerView.class, "20")) {
          return;
       }
       super.onDetachedFromWindow();
       this.i.removeCallbacksAndMessages(null);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VScrollerView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.getAction()) {
          this.b = false;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       VScrollerView tk;
       if (PatchProxy.isSupport(VScrollerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, VScrollerView.class, "4")) {
          return;
       }
       super.onOverScrolled(p0, p1, p2, p3);
       if (p3) {
          if (this.b == null) {
             this.b = true;
             if (p1 > 0) {
                tk = this.k;
                if (tk != null) {
                   tk.a();
                }
             }else {
                tk = this.j;
                if (tk != null) {
                   tk.e();
                }
             }
          }
       }else {
          this.b = false;
       }
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(VScrollerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, VScrollerView.class, "3")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       this.k();
       VScrollerView tl = this.l;
       if (tl != null) {
          tl.onScrollChange(p0, p1, p2, p3);
       }
       if (!this.j()) {
          return;
       }else {
          p0 = 0;
          if (!p1) {
             this.e = p0;
          }
          p2 = this.h - this.g;
          VScrollerView td = this.d;
          if (td == null && p1 >= p2) {
             this.d = true;
             this.m(true);
             if (this.e != null) {
                if (this.j()) {
                   this.m.get().fling(p0, this.e);
                }
                this.e = p0;
             }
          }else if(td != null && p1 < p2){
             this.d = p0;
             this.m(p0);
             VScrollerView tf = this.f;
             if (tf != null) {
                this.fling(tf);
                this.f = p0;
             }else {
                this.fling(-200);
             }
          }
          return;
       }
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VScrollerView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.c == null) {
          return true;
       }
       if (!p0.getAction()) {
          this.l();
       }
       return super.onTouchEvent(p0);
    }
    public void setOnScrollToBottomListener(c p0){
       this.k = p0;
    }
    public void setOnScrollToTopListener(d p0){
       this.j = p0;
    }
    public void setScrollEnabled(boolean p0){
       this.c = p0;
    }
}
