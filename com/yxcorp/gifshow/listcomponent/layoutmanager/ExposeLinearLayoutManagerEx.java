package com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import java.lang.Object;
import x0b.c;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$a;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Boolean;
import java.lang.NoSuchMethodException;
import java.lang.RuntimeException;
import java.lang.Throwable;
import androidx.recyclerview.widget.RecyclerView$t;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.View;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$c;
import w0b.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.IllegalAccessException;
import androidx.recyclerview.widget.RecyclerView$y;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import i1b.d;
import java.lang.StringBuilder;
import q87.c;
import android.view.ViewGroup;
import java.util.List;
import android.graphics.PointF;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$d;
import java.lang.Exception;
import android.os.Bundle;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.os.Parcelable;

public class ExposeLinearLayoutManagerEx extends LinearLayoutManager	// class@001a72
{
    public final Method A;
    public int B;
    public Object C;
    public Method D;
    public RecyclerView E;
    public final Object[] F;
    public final c G;
    public ExposeLinearLayoutManagerEx$c r;
    public f s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public Bundle x;
    public final ExposeLinearLayoutManagerEx$a y;
    public final ExposeLinearLayoutManagerEx$b z;
    public static Field H;
    public static Method I;
    public static Class J;

    public void ExposeLinearLayoutManagerEx(Context p0){
       super(p0, 1, false);
    }
    public void ExposeLinearLayoutManagerEx(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
       this.u = false;
       this.v = -1;
       this.w = Integer.MIN_VALUE;
       this.x = null;
       Object[] objArray = new Object[false];
       this.F = objArray;
       this.G = new c();
       this.y = new ExposeLinearLayoutManagerEx$a(this);
       this.setOrientation(p1);
       this.setReverseLayout(p2);
       ExposeLinearLayoutManagerEx$b uob = new ExposeLinearLayoutManagerEx$b(this, this);
       try{
          this.z = uob;
          Class[] uClassArray = new Class[false];
          Method declaredMeth = LinearLayoutManager.class.getDeclaredMethod("ensureLayoutState", uClassArray);
          this.A = declaredMeth;
          p2 = true;
          try{
             declaredMeth.setAccessible(p2);
             Class[] uClassArray1 = new Class[p2];
             uClassArray1[0] = Boolean.TYPE;
             declaredMeth = RecyclerView$LayoutManager.class.getDeclaredMethod("setItemPrefetchEnabled", uClassArray1);
             if (declaredMeth != null) {
                Object[] objArray1 = new Object[p2];
                objArray1[0] = Boolean.FALSE;
                declaredMeth.invoke(this, objArray1);
             }
          label_0058 :
             return;
          }catch(java.lang.NoSuchMethodException e0){
          }catch(java.lang.reflect.InvocationTargetException e0){
          }catch(java.lang.IllegalAccessException e0){
          }
       }catch(java.lang.NoSuchMethodException e4){
          e4.printStackTrace();
          throw new RuntimeException(e4);
       }
    }
    public void H0(RecyclerView$t p0,int p1,int p2){
       if (PatchProxy.isSupport(ExposeLinearLayoutManagerEx.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ExposeLinearLayoutManagerEx.class, "35")) {
          return;
       }
       if (p1 == p2) {
          return;
       }
       if (p2 > p1) {
          for (p2--; p2 >= p1; p2--) {
             this.removeAndRecycleViewAt(p2, p0);
          }
       }else {
          while (p1 > p2) {
             this.removeAndRecycleViewAt(p1, p0);
             p1--;
          }
       }
       return;
    }
    public int W0(View p0,boolean p1,boolean p2){
       return 0;
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, ExposeLinearLayoutManagerEx.class, "27")) {
          return;
       }
       if (this.r == null) {
          this.r = new ExposeLinearLayoutManagerEx$c();
       }
       if (this.s == null) {
          this.s = f.a(this, this.getOrientation());
       }
       try{
          this.A.invoke(this, this.F);
       }catch(java.lang.IllegalAccessException e0){
          e0.printStackTrace();
       }catch(java.lang.reflect.InvocationTargetException e0){
          e0.printStackTrace();
       }
       return;
    }
    public int Y0(RecyclerView$t p0,ExposeLinearLayoutManagerEx$c p1,RecyclerView$y p2,boolean p3){
       ExposeLinearLayoutManagerEx$c obj;
       int i4;
       if (PatchProxy.isSupport(ExposeLinearLayoutManagerEx.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, ExposeLinearLayoutManagerEx.class, "39");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = p1.e;
       ExposeLinearLayoutManagerEx$c i = p1.i;
       if (i != Integer.MIN_VALUE) {
          if (obj < null) {
             p1.i = i + obj;
          }
          this.l1(p0, p1);
       }
       int i1 = (p1.e + p1.j) + this.B;
       while (i1 > 0 && p1.a(p2)) {
          ExposeLinearLayoutManagerEx tG = this.G;
          tG.a = 0;
          tG.b = false;
          tG.c = false;
          tG.d = false;
          this.e1(p0, p2, p1, tG);
          tG = this.G;
          if (tG.b != null) {
             break ;
          }else {
             int i2 = tG.a * p1.h;
             int i3 = p1.d + i2;
             p1.d = i3;
             if (tG.c != null && (this.r.m != null || !p2.g())) {
                c a = this.G.a;
                i4 = p1.e - a;
                p1.e = i4;
                i1 = i1 - a;
             }
             ExposeLinearLayoutManagerEx$c i5 = p1.i;
             if (i5 != Integer.MIN_VALUE) {
                i4 = i5 + this.G.a;
                p1.i = i4;
                ExposeLinearLayoutManagerEx$c e = p1.e;
                if (e < null) {
                   i4 = i4 + e;
                   p1.i = i4;
                }
                this.l1(p0, p1);
             }
             if (p3 && this.G.d != null) {
                break ;
             }
          }
       }
       return (obj - p1.e);
    }
    public final View Z0(int p0,int p1,int p2){
       int this;
       if (PatchProxy.isSupport(ExposeLinearLayoutManagerEx.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, ExposeLinearLayoutManagerEx.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.X0();
       int i = this.s.i();
       int i1 = this.s.g();
       int i2 = (p1 > p0)? 1: -1;
       View view = null;
       this = view;
       while (true) {
          if (p0 != p1) {
             View childAt = this.getChildAt(p0);
             int position = this.getPosition(childAt);
             if (position >= 0 && position < p2) {
                if (childAt.getLayoutParams().isItemRemoved()) {
                   if (this == null) {
                      this = childAt;
                   }
                }else if(this.s.e(childAt) < i1 && this.s.b(childAt) >= i){
                   return childAt;
                }else if(view == null){
                   view = childAt;
                }
             }
             p0 = p0 + i2;
          }else if(view != null){
             view = this;
             break ;
          }
          break ;
       }
       return view;
    }
    public final int a1(int p0,RecyclerView$t p1,RecyclerView$y p2,boolean p3){
       if (PatchProxy.isSupport(ExposeLinearLayoutManagerEx.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, ExposeLinearLayoutManagerEx.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = this.s.g() - p0;
       if (i > 0) {
          int i1 = - this.m1((- i), p1, p2);
          p0 = p0 + i1;
          if (p3) {
             int i2 = this.s.g() - p0;
             if (i2 > 0) {
                this.s.m(i2);
                return (i2 + i1);
             }
          }
          return i1;
       }else {
          return 0;
       }
    }
    public void assertNotInLayoutOrScroll(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExposeLinearLayoutManagerEx.class, "34")) {
          return;
       }
       if (this.x == null) {
          super.assertNotInLayoutOrScroll(p0);
       }
       return;
    }
    public final int b1(int p0,RecyclerView$t p1,RecyclerView$y p2,boolean p3){
       if (PatchProxy.isSupport(ExposeLinearLayoutManagerEx.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, ExposeLinearLayoutManagerEx.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = p0 - this.s.i();
       if (i > 0) {
          int i1 = - this.m1(i, p1, p2);
          p0 = p0 + i1;
          if (p3) {
             p0 = p0 - this.s.i();
             if (p0 > 0) {
                this.s.m((- p0));
                i1 = i1 - p0;
             }
          }
          return i1;
       }else {
          return 0;
       }
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, ExposeLinearLayoutManagerEx.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          this.X0();
          return super.c();
       }catch(java.lang.Exception e0){
          int childCount = this.getChildCount();
          Object[] objArray = new Object[0];
          d.C().t("Expose-Last", "itemCount: "+this.getItemCount(), objArray);
          objArray = new Object[0];
          d.C().t("Expose-Last", "childCount: "+childCount, objArray);
          if (this.E != null) {
             objArray = new Object[0];
             d.C().t("Expose-Last", "RV childCount: "+this.E.getChildCount(), objArray);
          }
          ExposeLinearLayoutManagerEx tz = this.z;
          if (tz != null && tz.k != null) {
             objArray = new Object[0];
             d.C().t("Expose-Last", "RV hiddenViewCount: "+this.z.k.size(), objArray);
          }
          if (this.E != null) {
             int i = 0;
          label_00ae :
             if (i < childCount) {
                Object[] objArray1 = new Object[0];
                d.C().t("Expose-Last", "child: pos- "+i+" val- "+this.E.getChildAt(i), objArray1);
                i = i + 1;
                goto label_00ae ;
             }
          }
          return super.c();
       }
    }
    public final View c1(){
       Object obj = PatchProxy.apply(null, this, ExposeLinearLayoutManagerEx.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (this.u != null)? 0: this.getChildCount() - 1;
       return this.getChildAt(i);
    }
    public PointF computeScrollVectorForPosition(int p0){
       ExposeLinearLayoutManagerEx uExposeLinea = ExposeLinearLayoutManagerEx.class;
       if (PatchProxy.isSupport(uExposeLinea)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uExposeLinea, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.getChildCount()) {
          return null;
       }else {
          int i = 0;
          int i1 = 1;
          if (p0 < this.getPosition(this.getChildAt(i))) {
             i = 1;
          }
          if (i != this.u) {
             i1 = -1;
          }
          if (!this.getOrientation()) {
             return new PointF((float)i1, 0);
          }else {
             return new PointF(0, (float)i1);
          }
       }
    }
    public final View d1(){
       Object obj = PatchProxy.apply(null, this, ExposeLinearLayoutManagerEx.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (this.u != null)? this.getChildCount() - 1: 0;
       return this.getChildAt(i);
    }
    public void e1(RecyclerView$t p0,RecyclerView$y p1,ExposeLinearLayoutManagerEx$c p2,c p3){
       ExposeLinearLayoutManagerEx tu;
       ExposeLinearLayoutManagerEx$c uoc1;
       int i1;
       int i2;
       int i3;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ExposeLinearLayoutManagerEx.class, "40")) {
          return;
       }
       View view = p2.b(p0);
       if (view == null) {
          p3.b = true;
          return;
       }else {
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          c uoc = -1;
          int i = 0;
          if (p2.m == null) {
             tu = this.u;
             uoc1 = (p2.h == uoc)? 1: null;
             if (tu == uoc1) {
                this.addView(view);
             }else {
                this.addView(view, i);
             }
          }else {
             tu = this.u;
             uoc1 = (p2.h == uoc)? 1: null;
             if (tu == uoc1) {
                this.addDisappearingView(view);
             }else {
                this.addDisappearingView(view, i);
             }
          }
          this.measureChildWithMargins(view, i, i);
          p3.a = this.s.c(view);
          if (this.getOrientation() == 1) {
             if (this.isLayoutRTL()) {
                i1 = this.getWidth() - this.getPaddingRight();
                i = i1 - this.s.d(view);
             }else {
                i = this.getPaddingLeft();
                i1 = this.s.d(view) + i;
             }
             if (p2.h == uoc) {
                p2 = p2.d;
                i2 = p2 - p3.a;
             }else {
                i2 = p2.d;
                i3 = p3.a + i2;
             }
          }else {
             i1 = this.getPaddingTop();
             i = this.s.d(view) + i1;
             if (p2.h == uoc) {
                p2 = p2.d;
                i2 = p2 - p3.a;
                i1 = p2;
                i3 = i;
                i = i2;
                i2 = i1;
             }else {
                p2 = p2.d;
                i2 = p3.a + p2;
                ExposeLinearLayoutManagerEx$c uoc2 = p2;
                i3 = i;
                int i4 = i2;
                i2 = i1;
                i1 = i4;
             }
          }
          this.layoutDecorated(view, (i + layoutParams.leftMargin), (layoutParams.topMargin + i2), (i1 - layoutParams.rightMargin), (p2 - layoutParams.bottomMargin));
          if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
             p3.c = true;
          }
          p3.d = view.isFocusable();
          return;
       }
    }
    public final View f1(int p0){
       ExposeLinearLayoutManagerEx uExposeLinea = ExposeLinearLayoutManagerEx.class;
       if (PatchProxy.isSupport(uExposeLinea)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uExposeLinea, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.Z0(0, this.getChildCount(), p0);
    }
    public final View g1(int p0){
       ExposeLinearLayoutManagerEx uExposeLinea = ExposeLinearLayoutManagerEx.class;
       if (PatchProxy.isSupport(uExposeLinea)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uExposeLinea, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.Z0((this.getChildCount() - 1), -1, p0);
    }
    public final View h1(RecyclerView$y p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExposeLinearLayoutManagerEx.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = (this.u != null)? this.f1(p0.c()): this.g1(p0.c());
       return view;
    }
    public int i0(){
       Object obj = PatchProxy.apply(null, this, ExposeLinearLayoutManagerEx.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          this.X0();
          return super.i0();
       }catch(java.lang.Exception e0){
          int childCount = this.getChildCount();
          Object[] objArray = new Object[0];
          d.C().t("Expose-First", "itemCount: "+this.getItemCount(), objArray);
          objArray = new Object[0];
          d.C().t("Expose-First", "childCount: "+childCount, objArray);
          if (this.E != null) {
             objArray = new Object[0];
             d.C().t("Expose-First", "RV childCount: "+this.E.getChildCount(), objArray);
          }
          ExposeLinearLayoutManagerEx tz = this.z;
          if (tz != null && tz.k != null) {
             objArray = new Object[0];
             d.C().t("Expose-First", "RV hiddenViewCount: "+this.z.k.size(), objArray);
          }
          if (this.E != null) {
             int i = 0;
          label_00af :
             if (i < childCount) {
                Object[] objArray1 = new Object[0];
                d.C().t("Expose-First", "child: pos- "+i+" val- "+this.E.getChildAt(i), objArray1);
                i = i + 1;
                goto label_00af ;
             }
          }
          throw e0;
       }
    }
    public final View i1(RecyclerView$y p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExposeLinearLayoutManagerEx.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = (this.u != null)? this.g1(p0.c()): this.f1(p0.c());
       return view;
    }
    public final void j1(){
       if (PatchProxy.applyVoid(null, this, ExposeLinearLayoutManagerEx.class, "4")) {
          return;
       }
       this.u = (this.getOrientation() == 1 || !this.isLayoutRTL())? this.getReverseLayout(): this.getReverseLayout() ^ 1;
       return;
    }
    public void k1(RecyclerView$y p0,ExposeLinearLayoutManagerEx$a p1){
    }
    public final void l1(RecyclerView$t p0,ExposeLinearLayoutManagerEx$c p1){
       int childCount;
       int i1;
       int i2;
       int i3;
       ExposeLinearLayoutManagerEx uExposeLinea = ExposeLinearLayoutManagerEx.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uExposeLinea, "38")) {
          return;
       }
       if (p1.c == null) {
          return;
       }
       View view = -1;
       int i = 0;
       if (p1.h == view) {
          p1 = p1.i;
          if (!PatchProxy.isSupport(uExposeLinea) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uExposeLinea, "37")) {
             childCount = this.getChildCount();
             if (p1 >= null) {
                i1 = this.s.f() - p1;
                if (this.u != null) {
                   i2 = 0;
                   while (i2 < childCount) {
                      i3 = this.s.e(this.getChildAt(i2)) - this.B;
                      if (i3 < i1) {
                         this.H0(p0, i, i2);
                         break ;
                      }
                      i2++;
                   }
                }else {
                   childCount = childCount + view;
                   i2 = childCount;
                   while (i2 >= 0) {
                      i3 = this.s.e(this.getChildAt(i2)) - this.B;
                      if (i3 < i1) {
                         this.H0(p0, childCount, i2);
                         break ;
                      }
                      i2--;
                   }
                }
             }
          }
       }else {
          p1 = p1.i;
          if (!PatchProxy.isSupport(uExposeLinea) || (!PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uExposeLinea, "36") && p1 >= null)) {
             childCount = this.getChildCount();
             if (this.u != null) {
                childCount = childCount + view;
                i1 = childCount;
                while (i1 >= 0) {
                   i3 = this.s.b(this.getChildAt(i1)) + this.B;
                   if (i3 > p1) {
                      this.H0(p0, childCount, i1);
                      break ;
                   }
                   i1 = i1 - 1;
                }
             }else {
                i1 = 0;
                while (i1 < childCount) {
                   i3 = this.s.b(this.getChildAt(i1)) + this.B;
                   if (i3 > p1) {
                      this.H0(p0, i, i1);
                      break ;
                   }
                   i1 = i1 + 1;
                }
             }
          }
       }
       return;
    }
    public int m1(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (PatchProxy.isSupport(ExposeLinearLayoutManagerEx.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, ExposeLinearLayoutManagerEx.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!this.getChildCount() || !p0) {
          return 0;
       }else {
          boolean b = true;
          this.r.c = b;
          this.X0();
          int i = (p0 > 0)? 1: -1;
          int i1 = Math.abs(p0);
          this.n1(i, i1, b, p2);
          ExposeLinearLayoutManagerEx tr = this.r;
          tr.b = false;
          int i2 = tr.i + this.Y0(p1, tr, p2, 0);
          if (i2 < 0) {
             return 0;
          }else if(i1 > i2){
             p0 = i * i2;
          }
          this.s.m((- p0));
          return p0;
       }
    }
    public void n1(int p0,int p1,boolean p2,RecyclerView$y p3){
       View view;
       if (PatchProxy.isSupport(ExposeLinearLayoutManagerEx.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), p3, this, ExposeLinearLayoutManagerEx.class, "30")) {
          return;
       }
       this.r.j = this.e0(p3);
       ExposeLinearLayoutManagerEx tr = this.r;
       tr.h = p0;
       int i = -1;
       int i1 = 1;
       if (p0 == i1) {
          tr.j = tr.j + this.s.h();
          view = this.c1();
          tr = this.r;
          if (this.u == null) {
             i = 1;
          }
          tr.g = i;
          ExposeLinearLayoutManagerEx tr1 = this.r;
          tr.f = this.getPosition(view) + tr1.g;
          tr1.d = this.s.b(view) + this.W0(view, i1, false);
          view = this.r.d - this.s.g();
       }else {
          view = this.d1();
          tr = this.r;
          tr.j = tr.j + this.s.i();
          tr = this.r;
          if (this.u != null) {
             i = 1;
          }
          tr.g = i;
          ExposeLinearLayoutManagerEx tr2 = this.r;
          tr.f = this.getPosition(view) + tr2.g;
          tr2.d = this.s.e(view) + this.W0(view, false, false);
          view = (- this.r.d) + this.s.i();
       }
       tr = this.r;
       tr.e = p1;
       if (p2) {
          tr.e = p1 - view;
       }
       tr.i = view;
       return;
    }
    public final void o1(int p0,int p1){
       ExposeLinearLayoutManagerEx uExposeLinea = ExposeLinearLayoutManagerEx.class;
       if (PatchProxy.isSupport(uExposeLinea) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uExposeLinea, "24")) {
          return;
       }
       this.r.e = this.s.g() - p1;
       uExposeLinea = this.r;
       int i = (this.u != null)? -1: 1;
       uExposeLinea.g = i;
       uExposeLinea.f = p0;
       uExposeLinea.h = 1;
       uExposeLinea.d = p1;
       uExposeLinea.i = Integer.MIN_VALUE;
       return;
    }
    public void onAttachedToWindow(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExposeLinearLayoutManagerEx.class, "8")) {
          return;
       }
       super.onAttachedToWindow(p0);
       if (p0 != this.E) {
          this.E = p0;
          boolean b = true;
          try{
             Field declaredFiel = RecyclerView.class.getDeclaredField("mViewInfoStore");
             declaredFiel.setAccessible(b);
             Method obj = declaredFiel.get(this.E);
             this.C = obj;
             Class[] uClassArray = new Class[0];
             obj.getClass().getDeclaredConstructor(uClassArray).setAccessible(b);
             declaredFiel = this.C.getClass().getDeclaredField("mLayoutHolderMap");
             declaredFiel.setAccessible(b);
             declaredFiel.set(this.C, new ExposeLinearLayoutManagerEx$d(this));
             Class[] uClassArray1 = new Class[0];
             obj = Class.forName(this.C.getClass().getName()+"$InfoRecord").getDeclaredMethod("obtain", uClassArray1);
             this.D = obj;
             obj.setAccessible(b);
          }catch(java.lang.Exception e1){
             Object[] objArray = new Object[b];
             objArray[0] = e1.toString();
             d.C().t("Expose", "fix viewInfoStore error", objArray);
          }
       }
    }
    public void onDetachedFromWindow(RecyclerView p0,RecyclerView$t p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExposeLinearLayoutManagerEx.class, "9")) {
          return;
       }
       super.onDetachedFromWindow(p0, p1);
       this.E = null;
       return;
    }
    public View onFocusSearchFailed(View p0,int p1,RecyclerView$t p2,RecyclerView$y p3){
       int i;
       View view;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ExposeLinearLayoutManagerEx uExposeLinea = ExposeLinearLayoutManagerEx.class;
       if (PatchProxy.isSupport(uExposeLinea)) {
          p0 = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, ExposeLinearLayoutManagerEx.class, "44");
          if (p0 != patchProxyRe) {
             return p0;
          }
       }
       this.j1();
       if (!this.getChildCount()) {
          return null;
       }else if(PatchProxy.isSupport(uExposeLinea)){
          p0 = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, uExposeLinea, "41");
          if (p0 != patchProxyRe) {
             i = p0.intValue();
          }else {
          label_0047 :
             i = this.getOrientation();
             if (p1 != 1) {
                if (p1 != 2) {
                   if (p1 != 17) {
                      if (p1 != 33) {
                         if (p1 != 66) {
                            if (p1 != 130 || i != 1) {
                            }
                         }else if(!i){
                         }
                      }else if(i == 1){
                      }
                   }else if(!i){
                   }
                }
             label_0063 :
                i = 1;
             }
          label_006d :
             i = -1;
          }
       }else {
          goto label_0047 ;
       }
       if (i == Integer.MIN_VALUE) {
          return null;
       }else if(i == -1){
          view = this.i1(p3);
       }else {
          view = this.h1(p3);
       }
       if (view == null) {
          return null;
       }else {
          this.X0();
          this.n1(i, (int)((float)this.s.j() * 0x3ea8f5c3), false, p3);
          ExposeLinearLayoutManagerEx tr = this.r;
          tr.i = Integer.MIN_VALUE;
          tr.c = false;
          tr.b = false;
          this.Y0(p2, tr, p3, true);
          i = (i == -1)? this.d1(): this.c1();
          if (i == view || !i.isFocusable()) {
             return null;
          }else {
             return i;
          }
       }
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       boolean i3;
       ExposeLinearLayoutManagerEx v;
       View view;
       int i4;
       ExposeLinearLayoutManagerEx$c d;
       ExposeLinearLayoutManagerEx$c e;
       int i5;
       ExposeLinearLayoutManagerEx$c uoc2;
       ExposeLinearLayoutManagerEx r;
       View obj3;
       ExposeLinearLayoutManagerEx$a uoa;
       int i = this;
       Object obj = p0;
       Object obj1 = p1;
       ExposeLinearLayoutManagerEx uExposeLinea = ExposeLinearLayoutManagerEx.class;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, i, uExposeLinea, "6")) {
          return;
       }
       ExposeLinearLayoutManagerEx x = i.x;
       String str = "AnchorPosition";
       if (x != null && x.getInt(str) >= 0) {
          i.v = i.x.getInt(str);
       }
       this.X0();
       i.r.c = false;
       this.j1();
       x = i.y;
       x.a = -1;
       int i1 = Integer.MIN_VALUE;
       x.b = i1;
       x.c = false;
       x.c = i.u ^ this.g0();
       x = i.y;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       boolean b = true;
       if (!PatchProxy.applyVoidTwoRefs(obj1, x, i, uExposeLinea, "18")) {
          ExposeLinearLayoutManagerEx obj2 = PatchProxy.applyTwoRefs(obj1, x, i, uExposeLinea, "20");
          if (obj2 != patchProxyRe) {
             i3 = obj2.booleanValue();
          }else if(!p1.g()){
             obj2 = i.v;
             if (obj2 != -1) {
                if (obj2 < null || obj2 >= p1.c()) {
                   i.v = -1;
                   i.w = i1;
                }else {
                   x.a = i.v;
                   obj2 = i.x;
                   if (obj2 != null && obj2.getInt(str) >= 0) {
                      i3 = i.x.getBoolean("AnchorLayoutFromEnd");
                      x.c = i3;
                      String str3 = "AnchorOffset";
                      if (i3) {
                         x.b = i.s.g() - i.x.getInt(str3);
                      }else {
                         x.b = i.s.i() + i.x.getInt(str3);
                      }
                   }else if(i.w == i1){
                      obj3 = i.findViewByPosition(i.v);
                      if (obj3 != null) {
                         if (i.s.c(obj3) > i.s.j()) {
                            x.a();
                         }else if((i.s.e(obj3) - i.s.i()) < 0){
                            x.b = i.s.i();
                            x.c = false;
                         }else if((i.s.g() - i.s.b(obj3)) < 0){
                            x.b = i.s.g();
                            x.c = b;
                         }else if(x.c != null){
                            i3 = i.s.b(obj3) + i.s.k();
                         }else {
                            i3 = i.s.e(obj3);
                         }
                         x.b = i3;
                      }else if(this.getChildCount() > 0){
                         uoa = (i.v < i.getPosition(i.getChildAt(false)))? 1: 0;
                         i3 = (uoa == i.u)? true: false;
                         x.c = i3;
                      }
                      x.a();
                   }else {
                      r = i.u;
                      x.c = r;
                      x.b = (r != null)? i.s.g() - i.w: i.s.i() + i.w;
                   }
                   i3 = true;
                }
             }
          }
          i3 = false;
          if (!i3) {
             obj3 = PatchProxy.applyTwoRefs(obj1, x, i, uExposeLinea, "19");
             if (obj3 != patchProxyRe) {
                i3 = obj3.booleanValue();
             }else if(!this.getChildCount()){
                obj3 = this.getFocusedChild();
                if (obj3 != null) {
                   Objects.requireNonNull(x);
                   obj2 = PatchProxy.applyTwoRefs(obj3, obj1, x, ExposeLinearLayoutManagerEx$a.class, "3");
                   if (obj2 != patchProxyRe) {
                      i3 = obj2.booleanValue();
                   }else {
                      RecyclerView$LayoutParams layoutParams = obj3.getLayoutParams();
                      if (!layoutParams.isItemRemoved() && (layoutParams.getViewPosition() >= 0 && layoutParams.getViewPosition() < p1.c())) {
                         x.b(obj3);
                         i3 = true;
                      }else {
                         i3 = false;
                      }
                   }
                   if (!i3) {
                   label_01c7 :
                      if (i.t == this.g0()) {
                         obj3 = (x.c != null)? i.h1(obj1): i.i1(obj1);
                         if (obj3 != null) {
                            x.b(obj3);
                            if (!p1.g() && this.supportsPredictiveItemAnimations()) {
                               uoa = (i.s.e(obj3) >= i.s.g() || i.s.b(obj3) < i.s.i())? 1: null;
                               if (uoa) {
                                  i3 = (x.c != null)? i.s.g(): i.s.i();
                                  x.b = i3;
                               }
                            }
                         }
                      }
                   }
                }else {
                   goto label_01c7 ;
                }
             label_0223 :
                i3 = true;
             }
          label_0225 :
             i3 = false;
             if (!i3) {
                x.a();
                i3 = (this.g0())? p1.c() - 1: 0;
                x.a = i3;
             }
          }
       }
    label_023b :
       int i2 = i.e0(obj1);
       i3 = (p1.d() < i.y.a)? 1: 0;
       if (i3 == i.u) {
          i3 = i2;
          i2 = 0;
       }else {
          i3 = 0;
       }
       i2 = i2 + i.s.i();
       i3 = i3 + i.s.h();
       if (p1.g()) {
          v = i.v;
          if (v != -1 && i.w != i1) {
             view = i.findViewByPosition(v);
             if (view != null) {
                if (i.u != null) {
                   i4 = i.s.g() - i.s.b(view);
                   v = i.w;
                }else {
                   i5 = i.s.e(view) - i.s.i();
                   i4 = i.w;
                }
                i4 = i4 - v;
                if (i4 > 0) {
                   i2 = i2 + i4;
                }else {
                   i3 = i3 - i4;
                }
             }
          }
       }
       try{
          i.k1(obj1, i.y);
          this.detachAndScrapAttachedViews(p0);
          if (!PatchProxy.applyVoid(null, i, uExposeLinea, "7") && !this.getChildCount()) {
             view = i.getChildAt(false);
             if (view != null && i.getPosition(view) == -1) {
                d uod = d.C();
                Object[] objArray = new Object[false];
                String str1 = "Expose";
                String str2 = "fix child view problem";
                uod.t(str1, str2, objArray);
                v = i.z;
                Object[] objArray1 = new Object[false];
                v.i.invoke(v.a, objArray1);
             }
          }
       label_02db :
          i.r.l = p1.g();
          i.r.b = b;
          v = i.y;
          if (v.c != null) {
             i.r1(v);
             v = i.r;
             v.j = i2;
             i.Y0(obj, v, obj1, false);
             x = i.r;
             d = x.d;
             e = x.e;
             if (e > null) {
                i3 = i3 + e;
             }
             i.p1(i.y);
             x = i.r;
             x.j = i3;
             x.f = x.f + x.g;
             i.Y0(obj, x, obj1, false);
             e = i.r.d;
          }else {
             i.p1(v);
             v = i.r;
             v.j = i3;
             i.Y0(obj, v, obj1, false);
             r = i.r;
             d = r.d;
             ExposeLinearLayoutManagerEx$c e1 = r.e;
             if (e1 > null) {
                i2 = i2 + e1;
             }
             i.r1(i.y);
             r = i.r;
             r.j = i2;
             r.f = r.f + r.g;
             i.Y0(obj, r, obj1, false);
             d = i.r.d;
             e = d;
          }
          if (this.getChildCount() > 0) {
             if (i.u ^ this.g0()) {
                i3 = i.a1(e, obj, obj1, b);
                i5 = d + i3;
                i2 = e + i3;
                i3 = i.b1(i5, obj, obj1, false);
             }else {
                i3 = i.b1(d, obj, obj1, b);
                i5 = d + i3;
                i2 = e + i3;
                i3 = i.a1(i2, obj, obj1, false);
             }
             i5 = i5 + i3;
             i2 = i2 + i3;
          }
          ExposeLinearLayoutManagerEx$c uoc = i2;
          ExposeLinearLayoutManagerEx$c uoc1 = i5;
          if (PatchProxy.isSupport(uExposeLinea)) {
             uoc2 = uoc1;
             if (!PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(uoc1), Integer.valueOf(uoc), this, ExposeLinearLayoutManagerEx.class, "17")) {
             label_0393 :
                if (!p1.i() || (!this.getChildCount() || (!p1.g() && this.supportsPredictiveItemAnimations()))) {
                   List list = p0.k();
                   i2 = list.size();
                   i3 = i.getPosition(i.getChildAt(false));
                   i5 = 0;
                   i4 = 0;
                   int i6 = 0;
                   while (i5 < i2) {
                      RecyclerView$ViewHolder viewHolder = list.get(i5);
                      int i7 = (viewHolder.getPosition() < i3)? 1: 0;
                      ExposeLinearLayoutManagerEx uExposeLinea1 = (i7 != i.u)? -1: 1;
                      if (uExposeLinea1 == -1) {
                         i4 = i4 + i.s.c(viewHolder.itemView);
                      }else {
                         i6 = i6 + i.s.c(viewHolder.itemView);
                      }
                      i5 = i5 + 1;
                      i7 = 0;
                   }
                   i.r.m = list;
                   if (i4 > 0) {
                      i.q1(i.getPosition(this.d1()), uoc2);
                      uExposeLinea = i.r;
                      uExposeLinea.j = i4;
                      uExposeLinea.e = 0;
                      e = uExposeLinea.f;
                      i3 = (i.u != null)? 1: -1;
                      uExposeLinea.f = e + i3;
                      uExposeLinea.b = true;
                      i.Y0(obj, uExposeLinea, obj1, false);
                   }
                   if (i6 > 0) {
                      i.o1(i.getPosition(this.c1()), uoc);
                      uExposeLinea = i.r;
                      uExposeLinea.j = i6;
                      uExposeLinea.e = 0;
                      e = uExposeLinea.f;
                      i3 = (i.u != null)? -1: 1;
                      uExposeLinea.f = e + i3;
                      uExposeLinea.b = true;
                      i.Y0(obj, uExposeLinea, obj1, false);
                   }
                   i.r.m = null;
                }
             }
          }else {
             uoc2 = uoc1;
             goto label_0393 ;
          }
          if (!p1.g()) {
             i.v = -1;
             i.w = Integer.MIN_VALUE;
             uExposeLinea = i.s;
             Objects.requireNonNull(uExposeLinea);
             if (!PatchProxy.applyVoid(null, uExposeLinea, f.class, "1")) {
                uExposeLinea.b = uExposeLinea.j();
             }
          }
          i.t = this.g0();
          i.x = null;
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExposeLinearLayoutManagerEx.class, "2")) {
          return;
       }
       if (p0 instanceof Bundle) {
          this.x = p0;
          this.requestLayout();
       }
       return;
    }
    public Parcelable onSaveInstanceState(){
       View view;
       Bundle obj = PatchProxy.apply(null, this, ExposeLinearLayoutManagerEx.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.x != null) {
          return new Bundle(this.x);
       }
       obj = new Bundle();
       String str = "AnchorPosition";
       if (this.getChildCount() > 0) {
          int i = this.t ^ this.u;
          obj.putBoolean("AnchorLayoutFromEnd", i);
          if (i) {
             view = this.c1();
             obj.putInt("AnchorOffset", (this.s.g() - this.s.b(view)));
             obj.putInt(str, this.getPosition(view));
          }else {
             view = this.d1();
             obj.putInt(str, this.getPosition(view));
             obj.putInt("AnchorOffset", (this.s.e(view) - this.s.i()));
          }
       }else {
          obj.putInt(str, -1);
       }
       return obj;
    }
    public final void p1(ExposeLinearLayoutManagerEx$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExposeLinearLayoutManagerEx.class, "23")) {
          return;
       }
       this.o1(p0.a, p0.b);
       return;
    }
    public final void q1(int p0,int p1){
       ExposeLinearLayoutManagerEx uExposeLinea = ExposeLinearLayoutManagerEx.class;
       if (PatchProxy.isSupport(uExposeLinea) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uExposeLinea, "26")) {
          return;
       }
       this.r.e = p1 - this.s.i();
       uExposeLinea = this.r;
       uExposeLinea.f = p0;
       p0 = (this.u != null)? 1: -1;
       uExposeLinea.g = p0;
       uExposeLinea.h = -1;
       uExposeLinea.d = p1;
       uExposeLinea.i = Integer.MIN_VALUE;
       return;
    }
    public final void r1(ExposeLinearLayoutManagerEx$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExposeLinearLayoutManagerEx.class, "25")) {
          return;
       }
       this.q1(p0.a, p0.b);
       return;
    }
    public int scrollHorizontallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (PatchProxy.isSupport(ExposeLinearLayoutManagerEx.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, ExposeLinearLayoutManagerEx.class, "31");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.getOrientation() == 1) {
          return 0;
       }else {
          return this.m1(p0, p1, p2);
       }
    }
    public void scrollToPosition(int p0){
       ExposeLinearLayoutManagerEx uExposeLinea = ExposeLinearLayoutManagerEx.class;
       if (PatchProxy.isSupport(uExposeLinea) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uExposeLinea, "28")) {
          return;
       }
       this.v = p0;
       this.w = Integer.MIN_VALUE;
       ExposeLinearLayoutManagerEx tx = this.x;
       if (tx != null) {
          tx.putInt("AnchorPosition", -1);
       }
       this.requestLayout();
       return;
    }
    public void scrollToPositionWithOffset(int p0,int p1){
       ExposeLinearLayoutManagerEx uExposeLinea = ExposeLinearLayoutManagerEx.class;
       if (PatchProxy.isSupport(uExposeLinea) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uExposeLinea, "29")) {
          return;
       }
       this.v = p0;
       this.w = p1;
       ExposeLinearLayoutManagerEx tx = this.x;
       if (tx != null) {
          tx.putInt("AnchorPosition", -1);
       }
       this.requestLayout();
       return;
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (PatchProxy.isSupport(ExposeLinearLayoutManagerEx.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, ExposeLinearLayoutManagerEx.class, "32");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!this.getOrientation()) {
          return 0;
       }else {
          return this.m1(p0, p1, p2);
       }
    }
    public void setOrientation(int p0){
       ExposeLinearLayoutManagerEx uExposeLinea = ExposeLinearLayoutManagerEx.class;
       if (PatchProxy.isSupport(uExposeLinea) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uExposeLinea, "3")) {
          return;
       }
       super.setOrientation(p0);
       this.s = null;
       return;
    }
    public boolean supportsPredictiveItemAnimations(){
       Object obj = PatchProxy.apply(null, this, ExposeLinearLayoutManagerEx.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.x == null && this.t == this.g0())? true: false;
       return b;
    }
    public boolean v0(){
       return false;
    }
}
