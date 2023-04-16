package com.yxcorp.plugin.search.utils.a;
import androidx.recyclerview.widget.RecyclerView$r;
import android.view.ViewGroup;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import java.lang.Math;
import android.view.ViewPropertyAnimator;
import th0.c;
import android.animation.TimeInterpolator;
import uy5.b;
import java.lang.Runnable;
import nfd.d;
import nfd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewParent;
import sy5.a;
import com.google.gson.JsonObject;
import ecd.d;
import java.lang.StringBuilder;
import com.yxcorp.utility.SystemUtil;
import java.lang.IllegalArgumentException;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class a extends RecyclerView$r	// class@00078d
{
    public int[] a;
    public final int[] b;
    public final int[] c;
    public ViewGroup d;
    public View e;
    public int[] f;
    public final ViewGroup g;
    public final int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public Runnable m;
    public boolean n;

    public void a(ViewGroup p0){
       super();
       int[] ointArray = new int[2];
       this.b = ointArray;
       int[] ointArray1 = new int[2];
       this.c = ointArray1;
       this.d = null;
       this.e = null;
       this.i = 1;
       this.j = 0;
       this.k = 0;
       this.l = 1;
       this.n = false;
       this.g = p0;
       this.h = ViewConfiguration.get(p0.getContext()).getScaledTouchSlop();
    }
    public void a(RecyclerView p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "5")) {
          return;
       }
       if (!p1) {
          this.k = 0;
          this.j = 0;
          this.l = 1;
       }else if(p1 == 1){
          this.n = true;
          this.d(p0);
          if (!PatchProxy.applyVoid(null, this, uoa, "16") && this.f == null) {
             View view = this.e();
             if (view != null) {
                int[] ointArray = new int[2];
                this.g.getLocationOnScreen(ointArray);
                view.getLocationOnScreen(this.c);
                int[] ointArray1 = new int[]{Math.max(0, (this.c[0] - ointArray[0])),Math.max(0, ((ointArray[0] + this.g.getWidth()) - (this.c[0] + view.getWidth())))};
                this.f = ointArray1;
             }
          }
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       ViewPropertyAnimator viewProperty;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "1")) {
          return;
       }
       if (this.d == null) {
          if (this.n != null) {
             this.d(p0);
          }
          if (this.d == null) {
             return;
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "13") && this.a == null) {
          int[] ointArray = new int[2];
          this.a = ointArray;
          p0.getLocationOnScreen(ointArray);
       }
       a td = this.d;
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(td, this, uoa, "15")) {
          if (!this.f(td)) {
             td = this.b;
             p1 = -1;
             td[1] = p1;
             td[i] = p1;
          }else {
             td.getLocationOnScreen(this.b);
          }
       }
       td = this.b;
       if (td[1] > 0) {
          this.c(this.d, p2);
       }else if(p2 >= td[1] && (p2 > 0 && this.f(this.d))){
          td[1] = (this.a[1] - 1) - this.d.getHeight();
          this.c(this.d, p2);
       }
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), this, uoa, "4")) {
          if (this.i != 2) {
             this.l = 1;
          }else {
             View view = this.e();
             if (view != null) {
                if (p2 > 0) {
                   this.k = this.k + p2;
                   this.j = i;
                }else if(p2 < 0){
                   this.j = this.j + p2;
                   this.k = i;
                }
                p1 = view.getHeight();
                if (p2 > 0 && (view.getTranslationY() >= 0 && (Math.abs(this.k) >= this.h && this.l != 3))) {
                   this.l = 3;
                   viewProperty = view.animate();
                   viewProperty.cancel();
                   viewProperty.translationY((float)(- p1)).setDuration(100).setInterpolator(new c()).start();
                }else if(p2 < 0 && (view.getTranslationY() - (float)(- p1) <= 0 && (Math.abs(this.j) >= this.h && this.l != 2))){
                   this.l = 2;
                   viewProperty = view.animate();
                   viewProperty.cancel();
                   viewProperty.translationY(0).setDuration(100).setInterpolator(new c()).start();
                }
             }
          }
       }
       return;
    }
    public final void c(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "8")) {
          return;
       }
       String str = "CommodityFilterTabLocationHelper";
       if (p0 == null) {
          b.c(str, "dispatchUpdateFilterTabStatus, filterContainer is null");
          return;
       }else {
          int i = this.b[1] + p0.getHeight();
          if (i <= this.a[1] && this.i == 1) {
             if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "9")) {
                View view = this.e();
                if (view == null) {
                   b.c(str, "updateFilterTabStatusSetContentView, filterTab is null");
                }else {
                   this.g.removeCallbacks(this.m);
                   d uod = new d(this, view, p0);
                   this.m = uod;
                   this.g.post(uod);
                }
             }
          }else if(this.i != 2 || (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(i), Integer.valueOf(p1), this, a.class, "10"))){
             View view1 = this.e();
             if (view1 == null) {
                b.c(str, "updateFilterTabStatusSetRecyclerView, filterTab is null");
             }else {
                view1.getLocationOnScreen(this.c);
                if (i >= (this.c[1] + view1.getHeight())) {
                   view1.animate().cancel();
                   if (!p1) {
                      view1.setTranslationY((view1.getTranslationY() + (float)Math.max(0, (this.b[1] - this.c[1]))));
                   }
                   this.g.removeCallbacks(this.m);
                   c uoc = new c(this, view1, p0);
                   this.m = uoc;
                   this.g.post(uoc);
                }
             }
          }
          return;
       }
    }
    public final void d(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       if (this.d == null) {
          this.d = p0.findViewById(0x7f0a0e69);
       }
       return;
    }
    public final View e(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj != null) {
          return obj;
       }
       obj = this.d;
       if (obj != null) {
          this.e = obj.findViewById(0x7f0a0e8e);
       }
       if (this.e == null) {
          this.e = this.g.findViewById(0x7f0a0e8e);
       }
       return this.e;
    }
    public final boolean f(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (!p0.getVisibility() && (p0.getWidth() && p0.getHeight())))? true: false;
       return b;
    }
    public final void g(View p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "11")) {
          return;
       }
       p0.setTranslationY(0);
       this.h(this.g, p1, p0);
       this.j(p0, Integer.MIN_VALUE, 0, 0);
       this.j(p1, -2, Integer.MIN_VALUE, Integer.MIN_VALUE);
       return;
    }
    public final void h(ViewGroup p0,ViewGroup p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "12")) {
          return;
       }
       p0.removeView(p2);
       ViewParent parent = p2.getParent();
       if (parent == null) {
          p1.addView(p2);
       }else if(parent != p1 && parent instanceof ViewGroup){
          parent.removeView(p2);
          p1.addView(p2);
       }
       d.d("commodity", "moveView has parent", "", a.k().e("parent", parent.toString()).j());
       String str = "moveView has parent parent = "+parent;
       b.c("CommodityFilterTabLocationHelper", str);
       if (SystemUtil.I()) {
          throw new IllegalArgumentException(str);
       }
       return;
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "7")) {
          return;
       }
       View view = this.e();
       if (view == null) {
          return;
       }
       if (view.getParent() == this.g) {
          a td = this.d;
          if (td != null) {
             this.i = 1;
             this.g(view, td);
          }
       }
       this.d = objArray;
       this.n = false;
       view.animate().cancel();
       return;
    }
    public final void j(View p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "17")) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       if (p1 != Integer.MIN_VALUE) {
          layoutParams.height = p1;
       }
       if (p2 != Integer.MIN_VALUE) {
          layoutParams.leftMargin = p2;
       }
       if (p3 != Integer.MIN_VALUE) {
          layoutParams.rightMargin = p3;
       }
       p0.setLayoutParams(layoutParams);
       return;
    }
}
