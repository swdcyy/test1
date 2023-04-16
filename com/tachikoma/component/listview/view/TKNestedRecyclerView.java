package com.tachikoma.component.listview.view.TKNestedRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.ViewConfiguration;
import java.lang.Integer;
import ao8.a;
import java.lang.Boolean;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import zn8.a;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Math;
import xn8.a;
import java.lang.System;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.LinearLayoutManager;

public class TKNestedRecyclerView extends RecyclerView	// class@000d14
{
    public long b;
    public long c;
    public boolean d;
    public boolean e;
    public float f;
    public float g;
    public int h;
    public int i;
    public RecyclerView$LayoutManager j;
    public a k;
    public LinearInterpolator l;
    public a m;
    public int[] n;

    public void TKNestedRecyclerView(Context p0){
       super(p0);
       this.b = 400;
       this.c = -1;
       this.d = true;
       this.e = false;
       this.i = 0;
       this.A(p0);
    }
    public void TKNestedRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 400;
       this.c = -1;
       this.d = true;
       this.e = false;
       this.i = 0;
       this.A(p0);
    }
    public void TKNestedRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 400;
       this.c = -1;
       this.d = true;
       this.e = false;
       this.i = 0;
       this.A(p0);
    }
    public final void A(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNestedRecyclerView.class, "1")) {
          return;
       }
       this.setOverScrollMode(2);
       this.setClipToPadding(false);
       this.h = ViewConfiguration.get(p0).getScaledTouchSlop();
       return;
    }
    public void B(int p0,int p1){
       if (PatchProxy.isSupport(TKNestedRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TKNestedRecyclerView.class, "12")) {
          return;
       }
       this.stopScroll();
       TKNestedRecyclerView tj = this.j;
       if (tj instanceof a) {
          tj.scrollToPositionWithOffset(p0, (p1 - this.z(p0)));
          this.awakenScrollBars();
       }
       return;
    }
    public void C(int p0,int p1,int p2,boolean p3){
       if (PatchProxy.isSupport(TKNestedRecyclerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, TKNestedRecyclerView.class, "16")) {
          return;
       }
       this.stopScroll();
       if (p3 && this.l == null) {
          this.l = new LinearInterpolator();
       }
       TKNestedRecyclerView tKNestedRecy = null;
       if (p3) {
          tKNestedRecy = this.l;
       }
       if (p2 > 0) {
          super.smoothScrollBy(p0, p1, tKNestedRecy, p2);
       }else {
          super.smoothScrollBy(p0, p1, tKNestedRecy);
       }
       return;
    }
    public void D(int p0,int p1){
       int i1;
       if (PatchProxy.isSupport(TKNestedRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TKNestedRecyclerView.class, "15")) {
          return;
       }
       if (this.j instanceof a) {
          int i = this.z(p0);
          if (PatchProxy.isSupport(TKNestedRecyclerView.class)) {
             Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, TKNestedRecyclerView.class, "10");
             if (obj != PatchProxyResult.class) {
                i1 = obj.intValue();
             }else {
             label_0044 :
                i1 = null;
                if (this.getItemDecoration() != null) {
                   i1 = this.getItemDecoration().f(this, p0);
                }
             }
          }else {
             goto label_0044 ;
          }
          this.j.x((- ((i - i1) / 2)));
          this.j.i();
          this.j.f(p1);
       }
       super.smoothScrollToPosition(p0);
       return;
    }
    public void E(int p0,int p1,int p2){
       if (PatchProxy.isSupport(TKNestedRecyclerView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, TKNestedRecyclerView.class, "14")) {
          return;
       }
       TKNestedRecyclerView tj = this.j;
       if (tj instanceof a) {
          tj.x((p1 - this.z(p0)));
          this.j.f(p2);
       }
       super.smoothScrollToPosition(p0);
       return;
    }
    public a getItemDecoration(){
       return this.m;
    }
    public int getScrollState(){
       return this.i;
    }
    public final int[] getTempVisibleArray(){
       Object[] objArray = null;
       TKNestedRecyclerView obj = PatchProxy.apply(objArray, this, TKNestedRecyclerView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (!obj instanceof StaggeredGridLayoutManager) {
          return objArray;
       }
       int spanCount = obj.getSpanCount();
       TKNestedRecyclerView tn = this.n;
       if (tn == null || tn.length != spanCount) {
          int[] ointArray = new int[spanCount];
          this.n = ointArray;
       }
       return this.n;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       TKNestedRecyclerView obj = PatchProxy.applyOneRefs(p0, this, TKNestedRecyclerView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d == null) {
          return false;
       }
       obj = this.j;
       if (obj != null && obj.canScrollVertically()) {
          int action = p0.getAction();
          float y = p0.getY();
          float x = p0.getX();
          if (action) {
             if (action == 2 && ((Math.abs((x - this.g)) / Math.abs((y - this.f))) - 0x3f800000 > 0 && Math.abs((x - this.g)) - (float)this.h > 0)) {
                return false;
             }
          }else {
             this.f = y;
             this.g = x;
          }
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(TKNestedRecyclerView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, TKNestedRecyclerView.class, "8")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.x();
       return;
    }
    public void onScrollStateChanged(int p0){
       if (PatchProxy.isSupport(TKNestedRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKNestedRecyclerView.class, "5")) {
          return;
       }
       super.onScrollStateChanged(p0);
       this.i = p0;
       if (!p0) {
          this.x();
       }
       TKNestedRecyclerView tk = this.k;
       if (tk != null) {
          tk.onScrollStateChanged(p0);
       }
       if (!p0 && (this.j instanceof StaggeredGridLayoutManager && (this.y() - 3) < this.j.getSpanCount())) {
          this.j.invalidateSpanAssignments();
       }
    label_0047 :
       return;
    }
    public void onScrolled(int p0,int p1){
       if (PatchProxy.isSupport(TKNestedRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TKNestedRecyclerView.class, "4")) {
          return;
       }
       if (this.e != null && this.k != null) {
          long l = System.currentTimeMillis();
          if ((l - this.c) - this.b >= 0) {
             this.x();
             this.c = l;
          }
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKNestedRecyclerView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d == null) {
          return false;
       }
       return super.onTouchEvent(p0);
    }
    public void scrollToPosition(int p0){
       if (PatchProxy.isSupport(TKNestedRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKNestedRecyclerView.class, "11")) {
          return;
       }
       this.B(p0, 0);
       return;
    }
    public void setItemDecoration(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNestedRecyclerView.class, "3")) {
          return;
       }
       TKNestedRecyclerView tm = this.m;
       if (tm != null) {
          this.removeItemDecoration(tm);
       }
       this.m = p0;
       if (p0 != null) {
          this.addItemDecoration(p0);
       }
       return;
    }
    public void setLayoutManager(RecyclerView$LayoutManager p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNestedRecyclerView.class, "2")) {
          return;
       }
       super.setLayoutManager(p0);
       this.j = p0;
       return;
    }
    public void setOnProgressUpdatedEventEnable(boolean p0){
       this.e = p0;
    }
    public void setScrollEnable(boolean p0){
       this.d = p0;
    }
    public void setScrollEventThrottle(long p0){
       this.b = p0;
    }
    public void setScrollListener(a p0){
       this.k = p0;
    }
    public final void x(){
       float f1;
       int i;
       int width;
       float f2;
       if (PatchProxy.applyVoid(null, this, TKNestedRecyclerView.class, "17")) {
          return;
       }
       if (this.e != null && this.k != null) {
          TKNestedRecyclerView tj = this.j;
          if (tj == null) {
             return;
          }else {
             float f = 0;
             if (tj.canScrollHorizontally()) {
                f1 = (float)this.computeHorizontalScrollOffset();
                i = this.computeHorizontalScrollRange();
                width = this.getWidth();
             }else if(this.j.canScrollVertically()){
                f1 = (float)this.computeVerticalScrollOffset();
                i = this.computeVerticalScrollRange();
                width = this.getHeight();
             }else {
                f1 = 0;
                f2 = 0;
             label_0049 :
                f1 = (!f2 - f)? 0: f1 / f2;
                this.k.onProgressUpdated(Math.min(0x3f800000, Math.max(f, f1)));
             }
             f2 = (float)(i - width);
             goto label_0049 ;
          }
       }
       return;
    }
    public int y(){
       int i;
       TKNestedRecyclerView obj = PatchProxy.apply(null, this, TKNestedRecyclerView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.j;
       if (obj == null) {
          return -1;
       }
       if (obj instanceof LinearLayoutManager) {
          i = obj.i0();
       }else if(obj instanceof StaggeredGridLayoutManager){
          int[] ointArray = obj.findFirstVisibleItemPositions(this.getTempVisibleArray());
          int len = ointArray.length;
          int i1 = -1;
          int i2 = 0;
          while (i2 < len) {
             int i3 = ointArray[i2];
             if (i1 == -1 || (i3 >= 0 && i3 < i1)) {
                i1 = i3;
             }
             i2 = i2 + 1;
          }
          i = i1;
       }else {
          return -1;
       }
       return i;
    }
    public final int z(int p0){
       a obj;
       int i;
       if (PatchProxy.isSupport(TKNestedRecyclerView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, TKNestedRecyclerView.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = null;
       if (this.getItemDecoration() != null) {
          i = this.getItemDecoration().g(this, p0);
       }
       return i;
    }
}
