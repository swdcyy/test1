package com.yxcorp.gifshow.hotspot.utils.a;
import androidx.recyclerview.widget.p;
import android.view.animation.Interpolator;
import c2.a;
import com.yxcorp.gifshow.hotspot.utils.a$a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.RecyclerView$x;
import com.yxcorp.gifshow.hotspot.utils.a$b;
import android.content.Context;
import android.view.ViewGroup;
import java.lang.Number;
import java.lang.Math;

public class a extends p	// class@0018f2
{
    public boolean f;
    public a$c g;
    public s h;
    public s i;
    public RecyclerView j;
    public int k;
    public boolean l;
    public float m;
    public Interpolator n;
    public RecyclerView$r o;

    public void a(){
       super();
       this.m = 0x3f000000;
       this.n = a.b(0.41f, 0, 0x3f1eb852, 0x3f6b851f);
       this.o = new a$a(this);
    }
    public void b(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.b(p0);
       this.j = p0;
       if (p0 != null) {
          p0.removeOnScrollListener(this.o);
          this.j.addOnScrollListener(this.o);
       }
       return;
    }
    public int[] c(RecyclerView$LayoutManager p0,View p1){
       int[] obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[2]{0,0};
       if (p0.canScrollHorizontally()) {
          obj[0] = this.s(p1, this.q(p0)) + this.k;
       }
       if (p0.canScrollVertically()) {
          obj[1] = this.s(p1, this.r(p0));
       }
       return obj;
    }
    public RecyclerView$x e(RecyclerView$LayoutManager p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new a$b(this, this.j.getContext());
    }
    public View h(RecyclerView$LayoutManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = (p0.canScrollHorizontally())? this.u(p0, this.q(p0)): this.u(p0, this.r(p0));
       boolean b = (view != null)? true: false;
       this.f = b;
       return view;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a tj = this.j;
       if (tj == null) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = tj.getLayoutManager();
       if (layoutManage != null) {
          View view = this.h(layoutManage);
          if (view == null) {
             return;
          }else {
             int[] ointArray = this.c(layoutManage, view);
             int i = 0;
             int i1 = 1;
             if (ointArray[i] || ointArray[i1]) {
                this.j.smoothScrollBy(ointArray[i], ointArray[i1], this.n);
             }
          }
       }
       return;
    }
    public s q(RecyclerView$LayoutManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i == null) {
          this.i = s.a(p0);
       }
       return this.i;
    }
    public s r(RecyclerView$LayoutManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h == null) {
          this.h = s.c(p0);
       }
       return this.h;
    }
    public final int s(View p0,s p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (p1.g(p0) - p1.n());
    }
    public View t(RecyclerView$LayoutManager p0,s p1){
       View childAt;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = p1.n();
       int i1 = p1.i();
       int i2 = 0;
       while (true) {
          if (i2 >= p0.getChildCount()) {
             return null;
          }
          childAt = p0.getChildAt(i2);
          int i3 = p1.d(childAt);
          if (p1.g(childAt) < i1 && i3 > i) {
             break ;
          }else {
             i2 = i2 + 1;
          }
       }
       return childAt;
    }
    public final View u(RecyclerView$LayoutManager p0,s p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       View obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       View view = null;
       if (!p0.getChildCount()) {
          return view;
       }
       obj = this.t(p0, p1);
       if (obj == null) {
          return view;
       }
       float f = (float)p1.g(obj) / (float)p1.e(obj);
       float f1 = (float)p1.d(obj) / (float)p1.e(obj);
       if (this.l != null && (Math.abs(f) - this.m > 0 && (this.l != null || f1 - this.m < 0))) {
          View obj1 = PatchProxy.applyThreeRefs(p0, p1, obj, this, a.class, "9");
          if (obj1 != patchProxyRe) {
             view = obj1;
          }else {
             int i = p1.d(obj);
             int i1 = 0;
             while (i1 < p0.getChildCount()) {
                obj1 = p0.getChildAt(i1);
                if (i <= p1.g(obj1)) {
                   view = obj1;
                   break ;
                }
                i1 = i1 + 1;
             }
          }
          obj = view;
       }
       return obj;
    }
}
