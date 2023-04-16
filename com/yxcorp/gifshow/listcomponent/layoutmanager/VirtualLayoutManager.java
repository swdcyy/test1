package com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager;
import com.yxcorp.gifshow.listcomponent.layoutmanager.b;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx;
import x0b.b;
import android.content.Context;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$a;
import java.util.HashMap;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$d;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$f;
import java.util.ArrayList;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$c;
import android.graphics.Rect;
import w0b.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import w0b.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.LinkedList;
import java.util.List;
import w0b.a;
import java.util.Iterator;
import com.yxcorp.gifshow.listcomponent.layoutmanager.a;
import android.view.View;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.IllegalArgumentException;
import i1b.d;
import q87.c;
import androidx.recyclerview.widget.RecyclerView$t;
import java.lang.Math;
import java.lang.UnsupportedOperationException;
import w0b.g;
import java.lang.Comparable;
import w0b.b;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$e;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$e;
import androidx.recyclerview.widget.RecyclerView$y;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$c;
import x0b.c;
import android.util.Pair;
import java.util.Comparator;
import java.util.Collections;
import android.util.AttributeSet;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$InflateLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.IllegalAccessException;
import java.util.Objects;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$b;
import android.view.ViewGroup;
import java.lang.Exception;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$a;
import android.os.Trace;
import java.lang.Throwable;
import android.util.Log;
import com.yxcorp.gifshow.listcomponent.layoutmanager.PerformanceMonitor;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ViewLifeCycleHelper;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import x0b.f;
import x0b.f$b;
import android.view.ViewParent;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$b;
import java.lang.Runnable;
import android.view.View$MeasureSpec;
import androidx.recyclerview.widget.RecyclerView$s;
import w0b.c;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$g;
import java.lang.reflect.Field;
import java.lang.NoSuchMethodException;
import java.lang.NoSuchFieldException;
import java.lang.System;
import x0b.a;
import java.util.Set;
import java.util.Map$Entry;
import java.util.Collection;

public class VirtualLayoutManager extends ExposeLinearLayoutManagerEx implements b	// class@001a81
{
    public f K;
    public f L;
    public RecyclerView M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public b R;
    public boolean S;
    public int T;
    public PerformanceMonitor U;
    public HashMap U0;
    public ViewLifeCycleHelper V;
    public a$a V0;
    public boolean W;
    public VirtualLayoutManager$d W0;
    public Comparator X;
    public int X0;
    public a Y;
    public VirtualLayoutManager$f Y0;
    public HashMap Z;
    public List Z0;
    public a a1;
    public c b1;
    public Rect c1;
    public boolean d1;
    public int e1;
    public boolean f1;
    public static boolean g1;
    public static a h1;

    static {
       VirtualLayoutManager.h1 = new b();
    }
    public void VirtualLayoutManager(Context p0){
       super(p0, 1);
    }
    public void VirtualLayoutManager(Context p0,int p1){
       super(p0, p1, false);
    }
    public void VirtualLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
       boolean b = false;
       this.N = b;
       this.O = b;
       this.S = b;
       this.T = -1;
       this.W = b;
       this.X = new VirtualLayoutManager$a(this);
       this.Z = new HashMap();
       this.U0 = new HashMap();
       this.W0 = new VirtualLayoutManager$d();
       this.X0 = b;
       this.Y0 = new VirtualLayoutManager$f();
       this.Z0 = new ArrayList();
       this.a1 = VirtualLayoutManager.h1;
       this.b1 = new VirtualLayoutManager$c(this);
       this.c1 = new Rect();
       this.d1 = b;
       this.e1 = b;
       this.f1 = b;
       this.K = f.a(this, p1);
       if (p1 == 1) {
       }else {
          b = 1;
       }
       this.L = f.a(this, b);
       this.Q = super.canScrollVertically();
       this.P = super.canScrollHorizontally();
       h oh = new h();
       if (!PatchProxy.applyVoidOneRefs(oh, this, VirtualLayoutManager.class, "2")) {
          LinkedList linkedList = new LinkedList();
          VirtualLayoutManager tY = this.Y;
          if (tY != null) {
             Iterator iterator = tY.d().iterator();
             while (iterator.hasNext()) {
                linkedList.add(iterator.next());
             }
          }
          this.Y = oh;
          if (linkedList.size() > 0) {
             this.Y.f(linkedList);
          }
          this.d1 = true;
       }
       return;
    }
    public void A0(View p0,boolean p1){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, virtualLayou, "54")) {
          return;
       }
       this.k0(p0);
       int i = (p1)? 0: -1;
       this.addView(p0, i);
       return;
    }
    public int B0(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(VirtualLayoutManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, VirtualLayoutManager.class, "63");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return RecyclerView$LayoutManager.getChildMeasureSpec(p0, 0, p1, p2);
    }
    public void C0(VirtualLayoutManager$f p0,View p1,int p2){
       if (PatchProxy.isSupport(VirtualLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, VirtualLayoutManager.class, "52")) {
          return;
       }
       try{
          this.k0(p1);
          if (!p0.g()) {
             this.addView(p1, p2);
          }else {
             this.addDisappearingView(p1, p2);
          }
       }catch(java.lang.IllegalArgumentException e8){
          e8.printStackTrace();
          Object[] objArray = new Object[0];
          d.C().t("VirtualLayoutManager:addChildView", e8.toString(), objArray);
       }
       return;
    }
    public void H0(RecyclerView$t p0,int p1,int p2){
       int position;
       int position1;
       int this;
       a uoa;
       if (PatchProxy.isSupport(VirtualLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VirtualLayoutManager.class, "68")) {
          return;
       }
       if (p1 == p2) {
          return;
       }
       if (VirtualLayoutManager.g1) {
          Math.abs((p1 - p2));
       }
       if (p2 > p1) {
          position = this.getPosition(this.getChildAt(p1));
          position1 = this.getPosition(this.getChildAt((p2 - 1)));
          int i = p1;
          while (p1 < p2) {
             this = this.getPosition(this.getChildAt(i));
             if (this != -1) {
                uoa = this.Y.b(this);
                if (uoa == null || uoa.r(this, position, position1, this, true)) {
                   this.removeAndRecycleViewAt(i, p0);
                }else {
                   i = i + 1;
                }
             }else {
                this.removeAndRecycleViewAt(i, p0);
             }
             p1++;
          }
       }else {
          position = this.getPosition(this.getChildAt((p2 + 1)));
          position1 = this.getPosition(this.getChildAt(p1));
          while (p1 > p2) {
             this = this.getPosition(this.getChildAt(p1));
             if (this != -1) {
                uoa = this.Y.b(this);
                if (uoa == null || uoa.r(this, position, position1, this, false)) {
                   this.removeAndRecycleViewAt(p1, p0);
                }
             }else {
                this.removeAndRecycleViewAt(p1, p0);
             }
             p1--;
          }
       }
       return;
    }
    public void N0(boolean p0){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, virtualLayou, "12")) {
          return;
       }
       if (p0) {
          throw new UnsupportedOperationException("VirtualLayoutManager does not support stack from end.");
       }
       super.N0(false);
       return;
    }
    public int W0(View p0,boolean p1,boolean p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, VirtualLayoutManager.class, "15");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       int position = this.getPosition(p0);
       if (PatchProxy.isSupport(virtualLayou)) {
          Object obj1 = PatchProxy.applyThreeRefs(Integer.valueOf(position), Boolean.valueOf(p1), Boolean.valueOf(p2), this, VirtualLayoutManager.class, "16");
          if (obj1 != patchProxyRe) {
             position = obj1.intValue();
          }else if(position != -1){
             a uoa = this.Y.b(position);
             if (uoa != null) {
                position = uoa.g((position - uoa.n().c().intValue()), p1, p2, this);
             }
          }
          position = 0;
       }else {
          goto label_004d ;
       }
       return position;
    }
    public boolean canScrollHorizontally(){
       VirtualLayoutManager obj = PatchProxy.apply(null, this, VirtualLayoutManager.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.R;
       boolean b = false;
       obj = (obj == null || obj.b())? 1: 0;
       if (this.P != null && (this.N == null && obj)) {
          b = true;
       }
    label_002f :
       return b;
    }
    public boolean canScrollVertically(){
       VirtualLayoutManager obj = PatchProxy.apply(null, this, VirtualLayoutManager.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.R;
       boolean b = false;
       obj = (obj == null || obj.a())? 1: 0;
       if (this.Q != null && (this.N == null && obj)) {
          b = true;
       }
    label_002f :
       return b;
    }
    public boolean checkLayoutParams(RecyclerView$LayoutParams p0){
       return p0 instanceof VirtualLayoutManager$LayoutParams;
    }
    public RecyclerView$ViewHolder d(View p0){
       VirtualLayoutManager obj = PatchProxy.applyOneRefs(p0, this, VirtualLayoutManager.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M;
       if (obj != null) {
          return obj.getChildViewHolder(p0);
       }
       return null;
    }
    public void detachAndScrapAttachedViews(RecyclerView$t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VirtualLayoutManager.class, "69")) {
          return;
       }
       int i = this.getChildCount() - 1;
       while (i >= 0) {
          RecyclerView$ViewHolder viewHolder = this.d(this.getChildAt(i));
          if (viewHolder instanceof VirtualLayoutManager$e && viewHolder.a()) {
             ExposeLinearLayoutManagerEx$e.a(viewHolder, 0, 6);
          }
          i = i - 1;
       }
       super.detachAndScrapAttachedViews(p0);
       return;
    }
    public void detachAndScrapView(View p0,RecyclerView$t p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VirtualLayoutManager.class, "71")) {
          return;
       }
       super.detachAndScrapView(p0, p1);
       return;
    }
    public void detachAndScrapViewAt(int p0,RecyclerView$t p1){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, virtualLayou, "70")) {
          return;
       }
       RecyclerView$ViewHolder viewHolder = this.d(this.getChildAt(p0));
       if (viewHolder instanceof VirtualLayoutManager$e && viewHolder.a()) {
          ExposeLinearLayoutManagerEx$e.a(viewHolder, 0, 4);
       }
       super.detachAndScrapViewAt(p0, p1);
       return;
    }
    public void e1(RecyclerView$t p0,RecyclerView$y p1,ExposeLinearLayoutManagerEx$c p2,c p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, VirtualLayoutManager.class, "29")) {
          return;
       }
       ExposeLinearLayoutManagerEx$c f = p2.f;
       this.Y0.a = p2;
       VirtualLayoutManager tY = this.Y;
       ExposeLinearLayoutManagerEx$c uoc = null;
       a uoa = (tY == null)? uoc: tY.b(f);
       if (uoa == null) {
          uoa = this.a1;
       }
       uoa.l(p0, p1, this.Y0, p3, this);
       p0.a = uoc;
       ExposeLinearLayoutManagerEx$c f1 = p2.f;
       boolean b = true;
       if (f1 == f) {
          if (VirtualLayoutManager.g1) {
             uoa.toString();
          }
          p3.b = b;
       }else {
          int i = f1 - p2.g;
          int i1 = (p3.c != null)? 0: p3.a;
          g og = new g(Integer.valueOf(Math.min(f, i)), Integer.valueOf(Math.max(f, i)));
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object obj = PatchProxy.applyOneRefs(og, this, VirtualLayoutManager.class, "28");
          int i2 = -1;
          if (obj != patchProxyRe) {
             i2 = obj.intValue();
          }else {
             int i3 = this.Z0.size();
             if (i3) {
                i3 = i3 - b;
                int i4 = 0;
                int i5 = -1;
                while (i4 <= i3) {
                   i5 = i4 + i3;
                   i5 = i5 / 2;
                   Pair pair1 = this.Z0.get(i5);
                   Pair first = pair1.first;
                   if (first == null) {
                      break ;
                   }else if(!first.a(og.c()) && !first.a(og.d())){
                      Object boolean obj1 = PatchProxy.applyOneRefs(first, og, g.class, "3");
                      if (obj1 != patchProxyRe) {
                         obj1 = obj1.booleanValue();
                      }else if(first.a.compareTo(og.a) >= 0){
                         obj1 = 1;
                      }else {
                         obj1 = 0;
                      }
                      String str = (first.b.compareTo(og.b) <= 0)? 1: null;
                      if (obj1 && str) {
                         obj1 = true;
                      }else {
                         obj1 = false;
                      }
                      if (!obj1) {
                         if (first.c().intValue() > og.d().intValue()) {
                            i3 = i5 - 1;
                         }else if(first.d().intValue() < og.c().intValue()){
                            i4 = i5 + 1;
                         }
                      }
                   }
                label_011c :
                   uoc = pair1;
                   break ;
                }
                if (uoc != null) {
                   i2 = i5;
                }
             }
          }
          if (i2 >= 0) {
             Pair pair = this.Z0.get(i2);
             if (pair != null && (pair.first.equals(og) && pair.second.intValue() == i1)) {
                return;
             }else {
                this.Z0.remove(i2);
             }
          }
          this.Z0.add(Pair.create(og, Integer.valueOf(i1)));
          Collections.sort(this.Z0, this.X);
       }
       return;
    }
    public View findViewByPosition(int p0){
       View obj;
       View childAt;
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, virtualLayou, "78");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = super.findViewByPosition(p0);
       if (obj != null && this.getPosition(obj) == p0) {
          return obj;
       }else {
          int i = 0;
          while (true) {
             if (i >= this.getChildCount()) {
                return null;
             }
             childAt = this.getChildAt(i);
             if (childAt != null && this.getPosition(childAt) == p0) {
                break ;
             }else {
                i = i + 1;
             }
          }
          return childAt;
       }
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, VirtualLayoutManager.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VirtualLayoutManager$LayoutParams(-2, -2);
    }
    public RecyclerView$LayoutParams generateLayoutParams(Context p0,AttributeSet p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, VirtualLayoutManager.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VirtualLayoutManager$InflateLayoutParams(p0, p1);
    }
    public RecyclerView$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VirtualLayoutManager.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof VirtualLayoutManager$LayoutParams) {
          return new VirtualLayoutManager$LayoutParams(p0);
       }
       if (p0 instanceof RecyclerView$LayoutParams) {
          return new VirtualLayoutManager$LayoutParams(p0);
       }
       if (p0 instanceof ViewGroup$MarginLayoutParams) {
          return new VirtualLayoutManager$LayoutParams(p0);
       }
       return new VirtualLayoutManager$LayoutParams(p0);
    }
    public int getContentHeight(){
       Object obj = PatchProxy.apply(null, this, VirtualLayoutManager.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.getHeight();
    }
    public int getContentWidth(){
       Object obj = PatchProxy.apply(null, this, VirtualLayoutManager.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.getWidth();
    }
    public int getOrientation(){
       Object obj = PatchProxy.apply(null, this, VirtualLayoutManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.getOrientation();
    }
    public RecyclerView h0(){
       return this.M;
    }
    public boolean j0(View p0){
       boolean b1;
       boolean b2;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, VirtualLayoutManager.class, "59");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       RecyclerView$ViewHolder viewHolder = this.d(p0);
       boolean b = false;
       if (viewHolder != null) {
          ExposeLinearLayoutManagerEx$e obj1 = PatchProxy.applyOneRefs(viewHolder, null, ExposeLinearLayoutManagerEx.class, "53");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             obj1 = new ExposeLinearLayoutManagerEx$e(viewHolder);
             ExposeLinearLayoutManagerEx$e uoe = ExposeLinearLayoutManagerEx$e.class;
             Method obj2 = PatchProxy.apply(null, obj1, uoe, "6");
             if (obj2 != patchProxyRe) {
                b1 = obj2.booleanValue();
             }else {
                obj2 = PatchProxy.apply(null, obj1, uoe, "2");
                if (obj2 != patchProxyRe) {
                   b2 = obj2.booleanValue();
                }else {
                   try{
                      obj2 = ExposeLinearLayoutManagerEx$e.c;
                      if (obj2 != null) {
                         objArray1 = new Object[b];
                         b2 = obj2.invoke(obj1.a, objArray1).booleanValue();
                      }
                   }catch(java.lang.IllegalAccessException e5){
                      e5.printStackTrace();
                   }catch(java.lang.reflect.InvocationTargetException e5){
                      e5.printStackTrace();
                   }
                   b2 = true;
                }
                if (!b2) {
                   obj2 = PatchProxy.apply(null, obj1, uoe, "3");
                   if (obj2 != patchProxyRe) {
                      b2 = obj2.booleanValue();
                   }else {
                      try{
                         obj2 = ExposeLinearLayoutManagerEx$e.d;
                         if (obj2 != null) {
                            objArray1 = new Object[b];
                            b2 = obj2.invoke(obj1.a, objArray1).booleanValue();
                         }
                      }catch(java.lang.IllegalAccessException e5){
                         e5.printStackTrace();
                      }catch(java.lang.reflect.InvocationTargetException e5){
                         e5.printStackTrace();
                      }
                      b2 = true;
                   }
                   if (!b2) {
                      uoe = PatchProxy.apply(null, obj1, uoe, "4");
                      if (uoe != patchProxyRe) {
                         b1 = uoe.booleanValue();
                      }else {
                         try{
                            Method e = ExposeLinearLayoutManagerEx$e.e;
                            if (e != null) {
                               Object[] objArray = new Object[b];
                               b1 = e.invoke(obj1.a, objArray).booleanValue();
                            }
                         }catch(java.lang.IllegalAccessException e9){
                            e9.printStackTrace();
                         }catch(java.lang.reflect.InvocationTargetException e9){
                            e9.printStackTrace();
                         }
                         b1 = true;
                      }
                      if (!b1) {
                         b1 = false;
                      }
                   }
                }
             label_00d5 :
                b1 = true;
             }
          }
          if (!b1) {
          label_00d9 :
             return b;
          }
       }
       b = true;
       goto label_00d9 ;
    }
    public void k0(View p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, VirtualLayoutManager.class, "57")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, ExposeLinearLayoutManagerEx.class, "50")) {
          try{
             ExposeLinearLayoutManagerEx tz = this.z;
             Objects.requireNonNull(tz);
             if (!PatchProxy.applyVoidOneRefs(p0, tz, ExposeLinearLayoutManagerEx$b.class, "3")) {
                i = 0;
                tz.a();
                tz.m[i] = Integer.valueOf(tz.n.E.indexOfChild(p0));
                ExposeLinearLayoutManagerEx$b h = tz.h;
                if (h != null) {
                   ExposeLinearLayoutManagerEx$b g = tz.g;
                   if (g != null) {
                      h.invoke(g, tz.m);
                   label_0055 :
                      ExposeLinearLayoutManagerEx$b k = tz.k;
                      if (k != null) {
                         k.remove(p0);
                      }
                   }
                }
                Object[] objArray1 = new Object[i];
                d.C().w("Expose", "mClearMethod is null", objArray1);
                goto label_0055 ;
             }
          }catch(java.lang.Exception e7){
             Object[] objArray = new Object[1];
             objArray[i] = e7.toString();
             d.C().t("Expose", "ChildHelperWrapper show exception: ", objArray);
          }
       }
    }
    public void k1(RecyclerView$y p0,ExposeLinearLayoutManagerEx$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VirtualLayoutManager.class, "13")) {
          return;
       }
       VirtualLayoutManager virtualLayou = 1;
       while (virtualLayou) {
          VirtualLayoutManager tW0 = this.W0;
          ExposeLinearLayoutManagerEx$a a = p1.a;
          tW0.a = a;
          tW0.b = p1.b;
          tW0.c = p1.c;
          a uoa = this.Y.b(a);
          if (uoa != null) {
             uoa.e(p0, this.W0, this);
          }
          tW0 = this.W0;
          VirtualLayoutManager$d a1 = tW0.a;
          if (a1 == p1.a) {
             virtualLayou = null;
          }else {
             p1.a = a1;
          }
          p1.b = tW0.b;
          tW0.a = -1;
       }
       virtualLayou = this.W0;
       virtualLayou.a = p1.a;
       virtualLayou.b = p1.b;
       Iterator iterator = this.Y.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().z(p0, this.W0, this);
       }
       return;
    }
    public f l0(){
       return this.L;
    }
    public void m0(View p0,int p1){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, virtualLayou, "49")) {
          return;
       }
       super.addView(p0, p1);
       return;
    }
    public int m1(int p0,RecyclerView$t p1,RecyclerView$y p2){
       Object obj;
       if (PatchProxy.isSupport(VirtualLayoutManager.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, VirtualLayoutManager.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Trace.beginSection("VLM scroll");
       this.y1(p1, p2);
       try{
          obj = 0;
          if (this.N == null) {
             p0 = super.m1(p0, p1, p2);
          }else if(!this.getChildCount() || !p0){
             this.x1(p1, p2, obj);
             return obj;
          }else {
             boolean b = true;
             this.r.c = b;
             this.X0();
             int i1 = (p0 > 0)? 1: -1;
             int i2 = Math.abs(p0);
             this.n1(i1, i2, b, p2);
             ExposeLinearLayoutManagerEx tr = this.r;
             int i3 = tr.i + this.Y0(p1, tr, p2, obj);
             if (i3 < 0) {
                this.x1(p1, p2, obj);
                return obj;
             }else if(i2 > i3){
                p0 = i1 * i3;
             }
          }
          int i = p0;
       }catch(java.lang.Exception e8){
          Log.getStackTraceString(e8);
          if (!VirtualLayoutManager.g1) {
          }else {
             throw e8;
          }
       }
       this.x1(p1, p2, obj);
       Trace.endSection();
       return obj;
    }
    public void measureChild(View p0,int p1,int p2){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VirtualLayoutManager.class, "61")) {
          return;
       }
       if (!PatchProxy.isSupport(virtualLayou) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VirtualLayoutManager.class, "75")) {
          this.calculateItemDecorationsForChild(p0, this.c1);
          virtualLayou = this.c1;
          p1 = this.updateSpecWithExtra(p1, virtualLayou.left, virtualLayou.right);
          virtualLayou = this.c1;
          p2 = this.updateSpecWithExtra(p2, virtualLayou.top, virtualLayou.bottom);
          virtualLayou = this.U;
          if (virtualLayou != null) {
             virtualLayou.recordStart("measure", p0);
          }
          p0.measure(p1, p2);
          VirtualLayoutManager tU = this.U;
          if (tU != null) {
             tU.recordEnd("measure", p0);
          }
       }
       return;
    }
    public void measureChildWithMargins(View p0,int p1,int p2){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VirtualLayoutManager.class, "62")) {
          return;
       }
       if (!PatchProxy.isSupport(virtualLayou) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VirtualLayoutManager.class, "76")) {
          this.calculateItemDecorationsForChild(p0, this.c1);
          RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
          if (this.getOrientation() == 1) {
             VirtualLayoutManager tc1 = this.c1;
             p1 = this.updateSpecWithExtra(p1, (layoutParams.leftMargin + tc1.left), (layoutParams.rightMargin + tc1.right));
          }
          if (!this.getOrientation()) {
             virtualLayou = this.c1;
             p2 = this.updateSpecWithExtra(p2, virtualLayou.top, virtualLayou.bottom);
          }
          virtualLayou = this.U;
          if (virtualLayou != null) {
             virtualLayou.recordStart("measure", p0);
          }
          p0.measure(p1, p2);
          VirtualLayoutManager tU = this.U;
          if (tU != null) {
             tU.recordEnd("measure", p0);
          }
       }
       return;
    }
    public void moveView(int p0,int p1){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, virtualLayou, "50")) {
          return;
       }
       super.moveView(p0, p1);
       return;
    }
    public void n0(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VirtualLayoutManager.class, "60")) {
          return;
       }
       this.removeView(p0);
       return;
    }
    public void o0(View p0,int p1,int p2,int p3,int p4){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, virtualLayou, "66")) {
             return;
          }
       }
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       VirtualLayoutManager tU = this.U;
       if (tU != null) {
          tU.recordStart("layout", p0);
       }
       this.layoutDecorated(p0, (p1 + layoutParams.leftMargin), (p2 + layoutParams.topMargin), (p3 - layoutParams.rightMargin), (p4 - layoutParams.bottomMargin));
       VirtualLayoutManager tU1 = this.U;
       if (tU1 != null) {
          tU1.recordEnd("layout", p0);
       }
       return;
    }
    public void offsetChildrenHorizontal(int p0){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, virtualLayou, "25")) {
          return;
       }
       super.offsetChildrenHorizontal(p0);
       Iterator iterator = this.Y.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().w(p0, this);
       }
       return;
    }
    public void offsetChildrenVertical(int p0){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, virtualLayou, "26")) {
          return;
       }
       super.offsetChildrenVertical(p0);
       Iterator iterator = this.Y.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().x(p0, this);
       }
       VirtualLayoutManager tV = this.V;
       if (tV != null) {
          tV.a();
       }
       return;
    }
    public void onAdapterChanged(RecyclerView$Adapter p0,RecyclerView$Adapter p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VirtualLayoutManager.class, "44")) {
          return;
       }
       super.onAdapterChanged(p0, p1);
       return;
    }
    public void onAttachedToWindow(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VirtualLayoutManager.class, "45")) {
          return;
       }
       super.onAttachedToWindow(p0);
       this.z1(this.t1());
       this.M = p0;
       return;
    }
    public void onDetachedFromWindow(RecyclerView p0,RecyclerView$t p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VirtualLayoutManager.class, "46")) {
          return;
       }
       super.onDetachedFromWindow(p0, p1);
       Iterator iterator = this.Y.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().f(this);
       }
       this.M = null;
       return;
    }
    public void onItemsAdded(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(VirtualLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VirtualLayoutManager.class, "35")) {
          return;
       }
       super.onItemsAdded(p0, p1, p2);
       this.u1();
       this.z1(this.t1());
       int i = 0;
       while (i < this.t1().size()) {
          a uoa = this.t1().get(i);
          if (uoa instanceof f && uoa.n().c().intValue() > p1) {
             uoa.S().e(p1, p2);
          }
          i++;
       }
       return;
    }
    public void onItemsChanged(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VirtualLayoutManager.class, "39")) {
          return;
       }
       this.z1(this.t1());
       this.u1();
       return;
    }
    public void onItemsRemoved(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(VirtualLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VirtualLayoutManager.class, "36")) {
          return;
       }
       super.onItemsRemoved(p0, p1, p2);
       this.W = true;
       this.u1();
       this.z1(this.t1());
       int i = 0;
       while (i < this.t1().size()) {
          a uoa = this.t1().get(i);
          if (uoa instanceof f) {
             int i1 = uoa.n().c().intValue() + p2;
             if (i1 > p1) {
                uoa.t(p0, p1, p2);
                uoa.S().f(p1, p2);
             }
          }
          i = i + 1;
       }
       return;
    }
    public void onItemsUpdated(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(VirtualLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VirtualLayoutManager.class, "37")) {
          return;
       }
       this.u1();
       return;
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VirtualLayoutManager.class, "22")) {
          return;
       }
       Trace.beginSection("VLM onLayoutChildren");
       if (this.N != null && p1.b()) {
          this.d1 = false;
          this.f1 = true;
       }
       this.y1(p0, p1);
       try{
          int i = Integer.MAX_VALUE;
          super.onLayoutChildren(p0, p1);
          this.x1(p0, p1, i);
          if (this.O != null || (this.N != null && this.f1 != null)) {
             this.d1 = true;
             View childAt = this.getChildAt((this.getChildCount() - true));
             if (childAt != null) {
                this.e1 = (this.getDecoratedBottom(childAt) + childAt.getLayoutParams().bottomMargin) + this.W0(childAt, true, false);
                VirtualLayoutManager tM = this.M;
                if (tM != null && this.O != null) {
                   ViewParent parent = tM.getParent();
                   if (parent instanceof View) {
                      this.e1 = Math.min(this.e1, parent.getMeasuredHeight());
                   }
                }
             }else {
                this.f1 = false;
             }
             this.f1 = false;
             if (this.M != null && this.getItemCount() > 0) {
                this.M.post(new VirtualLayoutManager$b(this));
             }
          }
       label_0090 :
          Trace.endSection();
          return;
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          throw e1;
       }
    }
    public void onMeasure(RecyclerView$t p0,RecyclerView$y p1,int p2,int p3){
       VirtualLayoutManager tT;
       if (PatchProxy.isSupport(VirtualLayoutManager.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, VirtualLayoutManager.class, "81")) {
          return;
       }
       if (this.N == null && this.O == null) {
          super.onMeasure(p0, p1, p2, p3);
          return;
       }else {
          VirtualLayoutManager tM = this.M;
          int i = 0x7ffffff;
          if (tM != null && this.O != null) {
             tT = this.T;
             if (tT <= null) {
                ViewParent parent = tM.getParent();
                if (parent instanceof View) {
                   tT = parent.getMeasuredHeight();
                }else {
                label_0049 :
                   tT = 0x7ffffff;
                }
             }
          }else {
             goto label_0049 ;
          }
          tM = this.d1;
          if (tM != null) {
             tT = this.e1;
          }
          if (this.N != null) {
             this.f1 = tM ^ 1;
             if (this.getChildCount() > 0 || this.getChildCount() != this.getItemCount()) {
                View childAt = this.getChildAt((this.getChildCount() - 1));
                VirtualLayoutManager te1 = this.e1;
                if (childAt != null) {
                   te1 = this.W0(childAt, 1, false) + (this.getDecoratedBottom(childAt) + childAt.getLayoutParams().bottomMargin);
                }
                if (this.getChildCount() != this.getItemCount() || (childAt != null && te1 != this.e1)) {
                   this.d1 = false;
                   this.f1 = true;
                }else {
                   i = tT;
                }
                tT = i;
             }else if(!this.getItemCount()){
                this.d1 = true;
                this.f1 = false;
                tT = 0;
             }
          }
          if (this.getOrientation() == 1) {
             super.onMeasure(p0, p1, p2, View$MeasureSpec.makeMeasureSpec(tT, Integer.MIN_VALUE));
          }else {
             super.onMeasure(p0, p1, View$MeasureSpec.makeMeasureSpec(tT, Integer.MIN_VALUE), p3);
          }
          return;
       }
    }
    public void onScrollStateChanged(int p0){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, virtualLayou, "24")) {
          return;
       }
       super.onScrollStateChanged(p0);
       int i = this.i0();
       int i1 = this.c();
       Iterator iterator = this.Y.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().A(p0, i, i1, this);
       }
       return;
    }
    public f p0(){
       return this.K;
    }
    public void q0(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VirtualLayoutManager.class, "79")) {
          return;
       }
       if (this.M != null) {
          ViewParent parent = p0.getParent();
          if (parent != null) {
             VirtualLayoutManager tM = this.M;
             if (parent == tM) {
                this.M.getRecycledViewPool().i(tM.getChildViewHolder(p0));
             }
          }
       }
       return;
    }
    public void r0(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VirtualLayoutManager.class, "56")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, ExposeLinearLayoutManagerEx.class, "49")) {
          this.z.b(p0);
       }
       return;
    }
    public final View s0(){
       View view;
       VirtualLayoutManager$LayoutParams layoutParams;
       Object[] objArray = null;
       VirtualLayoutManager obj = PatchProxy.apply(objArray, this, VirtualLayoutManager.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M;
       if (obj == null) {
          return objArray;
       }
       try{
          view = this.b1.a(obj.getContext());
          layoutParams = new VirtualLayoutManager$LayoutParams(-2, -2);
          VirtualLayoutManager$g og = new VirtualLayoutManager$g(view);
          if (!PatchProxy.applyVoidTwoRefs(layoutParams, og, objArray, ExposeLinearLayoutManagerEx.class, "54")) {
             if (ExposeLinearLayoutManagerEx.H == null) {
                ExposeLinearLayoutManagerEx.H = RecyclerView$LayoutParams.class.getDeclaredField("mViewHolder");
             }
             ExposeLinearLayoutManagerEx.H.setAccessible(true);
             ExposeLinearLayoutManagerEx.H.set(layoutParams, og);
             int i = 0;
             int i1 = 2;
             if (ExposeLinearLayoutManagerEx.I == null) {
                Class[] uClassArray = new Class[i1];
                Class tYPE = Integer.TYPE;
                uClassArray[i] = tYPE;
                uClassArray[1] = tYPE;
                Method declaredMeth = RecyclerView$ViewHolder.class.getDeclaredMethod("setFlags", uClassArray);
                ExposeLinearLayoutManagerEx.I = declaredMeth;
                declaredMeth.setAccessible(true);
             }
             Object[] objArray1 = new Object[i1];
             objArray1[i] = Integer.valueOf(4);
             objArray1[1] = Integer.valueOf(4);
             ExposeLinearLayoutManagerEx.I.invoke(og, objArray1);
          }
       }catch(java.lang.NoSuchFieldException e1){
          e1.printStackTrace();
       }catch(java.lang.IllegalAccessException e1){
          e1.printStackTrace();
       }catch(java.lang.NoSuchMethodException e1){
          e1.printStackTrace();
       }catch(java.lang.reflect.InvocationTargetException e1){
          e1.printStackTrace();
       }
       view.setLayoutParams(layoutParams);
       return view;
    }
    public a s1(int p0){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, virtualLayou, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.Y.b(p0);
    }
    public void scrollToPosition(int p0){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, virtualLayou, "32")) {
          return;
       }
       super.scrollToPosition(p0);
       return;
    }
    public void scrollToPositionWithOffset(int p0,int p1){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, virtualLayou, "33")) {
          return;
       }
       super.scrollToPositionWithOffset(p0, p1);
       return;
    }
    public void setOrientation(int p0){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, virtualLayou, "10")) {
          return;
       }
       this.K = f.a(this, p0);
       super.setOrientation(p0);
       return;
    }
    public void setReverseLayout(boolean p0){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, virtualLayou, "11")) {
          return;
       }
       if (p0) {
          throw new UnsupportedOperationException("VirtualLayoutManager does not support reverse layout in current version.");
       }
       super.setReverseLayout(false);
       return;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(VirtualLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, VirtualLayoutManager.class, "34")) {
          return;
       }
       super.smoothScrollToPosition(p0, p1, p2);
       return;
    }
    public boolean supportsPredictiveItemAnimations(){
       boolean b = (this.x == null)? true: false;
       return b;
    }
    public a t0(int p0){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, virtualLayou, "80");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.Y.b(p0);
    }
    public List t1(){
       Object obj = PatchProxy.apply(null, this, VirtualLayoutManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Y.d();
    }
    public void u0(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VirtualLayoutManager.class, "55")) {
          return;
       }
       this.z0(p0, false);
       return;
    }
    public void u1(){
       if (PatchProxy.applyVoid(null, this, VirtualLayoutManager.class, "40")) {
          return;
       }
       Iterator iterator = this.Y.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().s(this);
       }
       return;
    }
    public final int updateSpecWithExtra(int p0,int p1,int p2){
       if (PatchProxy.isSupport(VirtualLayoutManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, VirtualLayoutManager.class, "77");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p1 && !p2) {
          return p0;
       }else {
          int mode = View$MeasureSpec.getMode(p0);
          if (mode == Integer.MIN_VALUE || mode == 0x40000000) {
             if (((View$MeasureSpec.getSize(p0) - p1) - p2) < 0) {
                return View$MeasureSpec.makeMeasureSpec(0, mode);
             }else {
                return View$MeasureSpec.makeMeasureSpec(((View$MeasureSpec.getSize(p0) - p1) - p2), mode);
             }
          }else {
             return p0;
          }
       }
    }
    public boolean v0(){
       return this.S;
    }
    public int v1(View p0,boolean p1){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, virtualLayou, "17");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.w1(p0, p1, true);
    }
    public void w0(View p0,int p1,int p2,int p3,int p4){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, virtualLayou, "67")) {
             return;
          }
       }
       virtualLayou = this.U;
       if (virtualLayou != null) {
          virtualLayou.recordStart("layout", p0);
       }
       this.layoutDecorated(p0, p1, p2, p3, p4);
       VirtualLayoutManager tU = this.U;
       if (tU != null) {
          tU.recordEnd("layout", p0);
       }
       return;
    }
    public int w1(View p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(VirtualLayoutManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, VirtualLayoutManager.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 != null) {
          return this.W0(p0, p1, p2);
       }else {
          return 0;
       }
    }
    public boolean x0(){
       Object obj = PatchProxy.apply(null, this, VirtualLayoutManager.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.isLayoutRTL();
    }
    public final void x1(RecyclerView$t p0,RecyclerView$y p1,int p2){
       RecyclerView$y this;
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, VirtualLayoutManager.class, "20")) {
          return;
       }
       int i = this.X0 - 1;
       this.X0 = i;
       if (i <= 0) {
          this.X0 = 0;
          i = this.i0();
          int i1 = this.c();
          Iterator iterator = this.Y.d().iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             RecyclerView$t ot = p0;
             this = p1;
             int i2 = i;
             int i3 = i1;
             int i4 = p2;
             try{
                int i5 = this;
                uoa.b(ot, this, i2, i3, i4, i5);
             }catch(java.lang.Exception e3){
                if (!VirtualLayoutManager.g1) {
                   goto label_0037 ;
                }else {
                   throw e3;
                }
             }
          }
          VirtualLayoutManager tV = this.V;
          if (tV != null) {
             tV.a();
          }
       }
       if (this.W != null) {
          if (!PatchProxy.applyVoid(null, this, virtualLayou, "21")) {
             int i6 = this.i0();
             p2 = this.c();
             List list = this.Y.d();
             int i7 = list.indexOf(this.Y.b(i6));
             int i8 = list.indexOf(this.Y.b(p2));
             int i9 = -1;
             if (i8 == i9) {
                i8 = list.size() + i9;
             }
             while (i7 <= i8) {
                try{
                   list.get(i7).a(i6, p2, this);
                }catch(java.lang.Exception e3){
                   if (!VirtualLayoutManager.g1) {
                   }else {
                      throw e3;
                   }
                }
                i7++;
             }
          }
          this.W = false;
       }
       return;
    }
    public void y0(VirtualLayoutManager$f p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VirtualLayoutManager.class, "51")) {
          return;
       }
       int i = (p0.a.g == 1)? -1: 0;
       this.C0(p0, p1, i);
       return;
    }
    public final void y1(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VirtualLayoutManager.class, "19")) {
          return;
       }
       if (this.X0 == null) {
          Iterator iterator = this.Y.e().iterator();
          while (iterator.hasNext()) {
             iterator.next().c(p0, p1, this);
          }
       }
       this.X0 = this.X0 + 1;
       return;
    }
    public void z0(View p0,boolean p1){
       VirtualLayoutManager virtualLayou = VirtualLayoutManager.class;
       if (PatchProxy.isSupport(virtualLayou) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, virtualLayou, "53")) {
          return;
       }
       this.k0(p0);
       ExposeLinearLayoutManagerEx uExposeLinea = ExposeLinearLayoutManagerEx.class;
       if (!PatchProxy.isSupport(uExposeLinea) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uExposeLinea, "48")) {
          int i = (p1)? 0: -1;
          this.addView(p0, i);
          this.z.b(p0);
       }
       return;
    }
    public void z1(List p0){
       a uoa;
       if (PatchProxy.applyVoidOneRefs(p0, this, VirtualLayoutManager.class, "3")) {
          return;
       }
       Iterator iterator = this.Y.d().iterator();
       while (iterator.hasNext()) {
          uoa = iterator.next();
          this.U0.put(Integer.valueOf(System.identityHashCode(uoa)), uoa);
       }
       if (p0 != null) {
          Iterator iterator1 = p0.iterator();
          int i = 0;
          while (iterator1.hasNext()) {
             a uoa1 = iterator1.next();
             if (uoa1 instanceof a) {
                VirtualLayoutManager tV0 = this.V0;
                if (tV0 != null) {
                   uoa1.u = tV0;
                }
             }
             if (uoa1.m() > 0) {
                int i1 = uoa1.m() + i;
                i1 = i1 - 1;
                uoa1.D(i, i1);
             }else {
                uoa1.D(-1, -1);
             }
             i = i + uoa1.m();
          }
       }
       this.Y.f(p0);
       Iterator iterator2 = this.Y.d().iterator();
       while (iterator2.hasNext()) {
          uoa = iterator2.next();
          this.Z.put(Integer.valueOf(System.identityHashCode(uoa)), uoa);
       }
       iterator2 = this.U0.entrySet().iterator();
       while (iterator2.hasNext()) {
          Integer key = iterator2.next().getKey();
          if (this.Z.containsKey(key)) {
             this.Z.remove(key);
             iterator2.remove();
          }
       }
       iterator2 = this.U0.values().iterator();
       while (iterator2.hasNext()) {
          iterator2.next().f(this);
       }
       if (!this.U0.isEmpty() || !this.Z.isEmpty()) {
          this.d1 = false;
       }
       this.U0.clear();
       this.Z.clear();
       return;
    }
}
