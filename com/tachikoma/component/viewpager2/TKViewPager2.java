package com.tachikoma.component.viewpager2.TKViewPager2;
import ko8.a;
import android.view.View$OnAttachStateChangeListener;
import ko8.b;
import com.tachikoma.core.component.e;
import gx4.f;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2$j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.viewpager2.widget.b;
import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Boolean;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import java.util.Objects;
import ko8.c;
import ko8.d;
import java.util.List;
import yn8.a;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Number;
import ko8.e;
import com.tachikoma.core.bridge.d;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import lo8.a;
import com.tachikoma.component.viewpager2.TKViewPager2$a;
import java.lang.Runnable;
import iq8.x;
import androidx.viewpager2.widget.ViewPager2$h;
import java.lang.Math;
import com.tkruntime.v8.V8Function;
import no8.a;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.V8Array;
import java.lang.Throwable;
import zp8.a;
import lo8.c;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import mo8.b;
import java.lang.Float;
import iq8.n;
import lo8.b;
import androidx.viewpager2.widget.c;
import java.lang.Long;

public class TKViewPager2 extends e implements a, View$OnAttachStateChangeListener, b	// class@000d35
{
    public e A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public JsValueRef G;
    public JsValueRef H;
    public JsValueRef I;
    public c J;
    public V8Function bindDataFun;
    public boolean clipChildren;
    public V8Function createViewFun;
    public V8Function getItemsTypeFun;
    public int initialPage;
    public int offscreenPageLimit;
    public V8Function onPageScrollFun;
    public V8Function onPageScrollStateChangedFun;
    public V8Function onPageSelectedFun;
    public int pageMargin;
    public V8Function pageTransformer;
    public boolean scrollEnabled;
    public long scrollEventThrottle;
    public c v;
    public ViewPager2$j w;
    public b x;
    public a y;
    public d z;

    public void TKViewPager2(f p0){
       super(p0);
       this.C = false;
       this.D = false;
       this.E = false;
       this.F = false;
       this.initialPage = -1;
       this.scrollEventThrottle = 400;
       this.offscreenPageLimit = 1;
       this.scrollEnabled = true;
       this.clipChildren = true;
       this.getView();
    }
    public void addPageTransformer(ViewPager2$j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager2.class, "20")) {
          return;
       }
       this.n();
       this.x.b(p0);
       return;
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public ViewPager2 createViewInstance(Context p0){
       f obj = PatchProxy.applyOneRefs(p0, this, TKViewPager2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mInitParams.b;
       int i = 0;
       if (obj != null) {
          if (obj.length > 0 && obj[i] instanceof Boolean) {
             this.C = obj[i].booleanValue();
          }
          if (obj.length > 1 && obj[1] instanceof Boolean) {
             this.B = obj[1].booleanValue();
          }
       }
    label_003d :
       ViewPager2 viewPager2 = new ViewPager2(p0);
       viewPager2.setOffscreenPageLimit(1);
       viewPager2.setClipToPadding(i);
       viewPager2.setOrientation((this.C ^ 1));
       if (viewPager2.getChildCount() > 0) {
          View childAt = viewPager2.getChildAt(i);
          if (childAt instanceof RecyclerView) {
             childAt.setItemAnimator(null);
          }
       }
       viewPager2.addOnAttachStateChangeListener(this);
       return viewPager2;
    }
    public void destroyOnMainThread(){
       if (PatchProxy.applyVoid(null, this, TKViewPager2.class, "32")) {
          return;
       }
       TKViewPager2 tv = this.v;
       if (tv != null) {
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoid(null, tv, c.class, "8")) {
             tv.e();
             tv.d = null;
             tv.e = null;
             tv.g = null;
          }
       }
       tv = this.z;
       if (tv != null) {
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoid(null, tv, d.class, "4")) {
             tv.c();
             tv.a();
             tv.c = null;
          }
       }
       this.getView().removeOnAttachStateChangeListener(this);
       return;
    }
    public List getChildren(){
       TKViewPager2 obj = PatchProxy.apply(null, this, TKViewPager2.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       List list = (obj != null)? obj.K0(): new ArrayList();
       return list;
    }
    public int getRealPosition(int p0){
       if (PatchProxy.isSupport(TKViewPager2.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, TKViewPager2.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.m();
       return this.A.W0(p0);
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, TKViewPager2.class, "25")) {
          return;
       }
       if (this.A != null) {
          return;
       }
       this.A = new e(this.getTKJSContext(), this.B);
       this.getView().setAdapter(this.A);
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, TKViewPager2.class, "24")) {
          return;
       }
       if (this.x != null) {
          return;
       }
       this.x = new b();
       this.getView().setPageTransformer(this.x);
       return;
    }
    public void notifyDataSetChanged(int p0){
       if (PatchProxy.isSupport(TKViewPager2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKViewPager2.class, "18")) {
          return;
       }
       this.m();
       int i = this.A.W0(this.getView().getCurrentItem());
       this.A.J0(p0);
       this.D = true;
       TKViewPager2 tinitialPage = this.initialPage;
       if (tinitialPage > null) {
          this.q(tinitialPage, false, false, false);
          this.initialPage = -1;
       }else {
          this.q(i, false, false, false);
       }
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, TKViewPager2.class, "22")) {
          return;
       }
       if (this.z != null) {
          return;
       }
       this.z = new d(this.getView());
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       if (PatchProxy.isSupport(TKViewPager2.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, TKViewPager2.class, "31")) {
          return;
       }
       super.onDestroy(p0, p1);
       TKViewPager2 ty = this.y;
       if (ty != null) {
          ty.a = true;
          ty.c = null;
       }
       ty = this.v;
       if (ty != null) {
          ty.e();
       }
       ty = this.A;
       if (ty != null) {
          ty.onDestroy();
       }
       ty = this.z;
       if (ty != null) {
          ty.c();
       }
       if (p1) {
          this.destroyOnMainThread();
       }else {
          x.f(new TKViewPager2$a(this));
       }
       return;
    }
    public void onPageScrollStateChanged(int p0){
       if (PatchProxy.isSupport(TKViewPager2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKViewPager2.class, "28")) {
          return;
       }
       TKViewPager2 tv = this.v;
       if (tv != null) {
          tv.j = this.getView().f();
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       if (this.F != null) {
          return;
       }
       boolean b = (this.onPageSelectedFun != null)? true: false;
       this.F = b;
       return;
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager2.class, "29")) {
          return;
       }
       this.E = true;
       TKViewPager2 tv = this.v;
       if (tv != null && (this.F == null && this.D != null)) {
          tv.c(this.getView().getCurrentItem());
       }
    label_0027 :
       return;
    }
    public void onViewDetachedFromWindow(View p0){
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, TKViewPager2.class, "23")) {
          return;
       }
       if (this.v != null) {
          return;
       }
       c uoc = new c(this, this.getTKJSContext());
       this.v = uoc;
       uoc.e = this;
       uoc.f(this.scrollEventThrottle);
       this.getView().j(this.v);
       return;
    }
    public final void q(int p0,boolean p1,int p2,boolean p3){
       if (PatchProxy.isSupport(TKViewPager2.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, TKViewPager2.class, "16")) {
          return;
       }
       this.m();
       p0 = Math.min((this.A.V0() - 1), Math.max(p0, 0));
       if (this.A.X0()) {
          int currentItem = this.getView().getCurrentItem();
          if (!p1 && currentItem < 0x2710) {
             currentItem = this.A.getItemCount() / 2;
             currentItem = currentItem - this.A.W0(currentItem);
          }else {
             p0 = p0 - this.A.W0(currentItem);
          }
          p0 = currentItem + p0;
       }
       this.o();
       this.z.b(p0, p1, (long)p2, p3);
       return;
    }
    public void removeTransformer(ViewPager2$j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager2.class, "21")) {
          return;
       }
       this.n();
       this.x.c(p0);
       return;
    }
    public void scrollPageBy(int p0,boolean p1,int p2,boolean p3){
       if (PatchProxy.isSupport(TKViewPager2.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, TKViewPager2.class, "17")) {
          return;
       }
       this.m();
       int currentItem = this.getView().getCurrentItem();
       int i = Math.min((this.A.getItemCount() - 1), Math.max((p0 + currentItem), 0));
       if (currentItem != i) {
          this.o();
          this.z.b(i, p1, (long)p2, p3);
       }
       return;
    }
    public void setBindDataFun(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager2.class, "10")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ViewPager_bindData");
       }
       y.c(this.I);
       JsValueRef jsValueRef = y.b(p0, this);
       this.I = jsValueRef;
       this.bindDataFun = jsValueRef.get();
       this.m();
       this.A.R0(this.I);
       return;
    }
    public void setClipChildren(boolean p0){
       if (PatchProxy.isSupport(TKViewPager2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKViewPager2.class, "12")) {
          return;
       }
       this.clipChildren = p0;
       this.getView().setClipChildren(p0);
       return;
    }
    public void setCreateViewFun(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager2.class, "9")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ViewPager_createView");
       }
       y.c(this.H);
       JsValueRef jsValueRef = y.b(p0, this);
       this.H = jsValueRef;
       this.createViewFun = jsValueRef.get();
       this.m();
       this.A.S0(this.H);
       return;
    }
    public void setCurrentPageIndex(int p0,boolean p1,int p2,boolean p3){
       if (PatchProxy.isSupport(TKViewPager2.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, TKViewPager2.class, "14")) {
          return;
       }
       this.q(p0, p1, p2, p3);
       return;
    }
    public void setGetItemsTypeFun(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager2.class, "8")) {
          return;
       }
       y.c(this.G);
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ViewPager_getItemsType");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       this.G = jsValueRef;
       this.getItemsTypeFun = jsValueRef.get();
       this.m();
       this.A.Q0(this.G);
       return;
    }
    public void setInitialPage(int p0){
       this.initialPage = p0;
    }
    public void setKeyFramePageTransformer(V8Array p0){
       List list;
       float f;
       Object obj2;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager2.class, "15")) {
          return;
       }
       if (p0 != null && p0.length()) {
          Object obj = null;
          try{
             list = p0.getList();
          }catch(java.lang.Exception e10){
             a.g("ViewPager2 setKeyFramePageTransformer error", e10);
             list = obj;
          }
          if (list != null && !list.isEmpty()) {
             HashMap obj1 = PatchProxy.applyOneRefs(list, obj, c.class, "2");
             if (obj1 != PatchProxyResult.class) {
                obj = obj1;
             }else if(list.isEmpty()){
                obj1 = new HashMap();
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   Map map = iterator.next();
                   if (map == null || map.isEmpty()) {
                      continue ;
                   }else {
                      String str = "position";
                      if (map.containsKey(str)) {
                         f = c.b(map.get(str));
                         obj2 = PatchProxy.applyOneRefs(map, obj, c.class, "3");
                         if (obj2 != PatchProxyResult.class) {
                         }else if(map.isEmpty()){
                            obj2 = obj;
                         }else {
                            obj2 = new b();
                            String str1 = "scaleX";
                            if (map.containsKey(str1)) {
                               obj2.a = Float.valueOf(c.b(map.get(str1)));
                            }
                            str1 = "scaleY";
                            if (map.containsKey(str1)) {
                               obj2.b = Float.valueOf(c.b(map.get(str1)));
                            }
                            str1 = "translateX";
                            if (map.containsKey(str1)) {
                               obj2.c = Float.valueOf((float)n.a(c.b(map.get(str1))));
                            }
                            str1 = "translateY";
                            if (map.containsKey(str1)) {
                               obj2.d = Float.valueOf((float)n.a(c.b(map.get(str1))));
                            }
                            str1 = "translateZ";
                            if (map.containsKey(str1)) {
                               obj2.e = Float.valueOf((float)n.a(c.b(map.get(str1))));
                            }
                            str1 = "rotateX";
                            if (map.containsKey(str1)) {
                               obj2.f = Float.valueOf(c.b(map.get(str1)));
                            }
                            str1 = "rotateY";
                            if (map.containsKey(str1)) {
                               obj2.g = Float.valueOf(c.b(map.get(str1)));
                            }
                            str1 = "rotate";
                            if (map.containsKey(str1)) {
                               obj2.h = Float.valueOf(c.b(map.get(str1)));
                            }
                            str1 = "pivotX";
                            if (map.containsKey(str1)) {
                               obj2.i = Float.valueOf((float)n.a(c.b(map.get(str1))));
                            }
                            str1 = "pivotY";
                            if (map.containsKey(str1)) {
                               obj2.j = Float.valueOf((float)n.a(c.b(map.get(str1))));
                            }
                            str1 = "alpha";
                            if (map.containsKey(str1)) {
                               obj2.k = Float.valueOf(c.b(map.get(str1)));
                            }
                         }
                         if (obj2 == null) {
                            continue ;
                         }
                      }
                   }
                   obj1.put(Float.valueOf(f), obj2);
                }
                obj = obj1;
             }
             if (obj != null && !obj.isEmpty()) {
                TKViewPager2 tw = this.w;
                if (tw != null) {
                   this.removeTransformer(tw);
                }
                b uob = new b(obj);
                this.addPageTransformer(uob);
                this.w = uob;
             }
          }
       }
    label_01c0 :
       return;
    }
    public void setOffscreenPageLimit(int p0){
       if (PatchProxy.isSupport(TKViewPager2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKViewPager2.class, "3")) {
          return;
       }
       if (p0 < 1 && p0 != -1) {
          return;
       }
       this.offscreenPageLimit = p0;
       this.getView().setOffscreenPageLimit(this.offscreenPageLimit);
       return;
    }
    public void setOnPageScroll(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager2.class, "6")) {
          return;
       }
       this.p();
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ViewPager_onPageScroll");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       TKViewPager2 tv = this.v;
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoidOneRefs(jsValueRef, tv, c.class, "1")) {
          y.c(tv.b);
          tv.b = jsValueRef;
       }
       this.onPageScrollFun = p0;
       return;
    }
    public void setOnPageScrollStateChanged(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager2.class, "7")) {
          return;
       }
       this.p();
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ViewPager_onPageScrollStateChanged");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       TKViewPager2 tv = this.v;
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoidOneRefs(jsValueRef, tv, c.class, "3")) {
          y.c(tv.c);
          tv.c = jsValueRef;
       }
       this.onPageScrollStateChangedFun = p0;
       this.v.a(this.getView().getScrollState());
       return;
    }
    public void setOnPageSelectedCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager2.class, "5")) {
          return;
       }
       this.p();
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ViewPager_onPageSelected");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       TKViewPager2 tv = this.v;
       Objects.requireNonNull(tv);
       if (!PatchProxy.applyVoidOneRefs(jsValueRef, tv, c.class, "2")) {
          y.c(tv.a);
          tv.a = jsValueRef;
       }
       this.onPageSelectedFun = p0;
       if (this.D != null && this.E != null) {
          this.v.c(this.getView().getCurrentItem());
       }
       return;
    }
    public void setPageMargin(int p0){
       if (PatchProxy.isSupport(TKViewPager2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKViewPager2.class, "11")) {
          return;
       }
       this.pageMargin = p0;
       this.n();
       TKViewPager2 tJ = this.J;
       if (tJ != null) {
          this.x.c(tJ);
       }
       c uoc = new c(n.b(p0));
       this.J = uoc;
       this.x.b(uoc);
       return;
    }
    public void setPageTransformer(V8Function p0){
       TKViewPager2 ty;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager2.class, "13")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ViewPager_pageTransformer");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       this.pageTransformer = p0;
       if (!PatchProxy.applyVoid(null, this, TKViewPager2.class, "26")) {
          if (this.y == null) {
             this.y = new a(this.getTKJSContext());
          }
          ty = this.w;
          if (ty != this.y) {
             this.removeTransformer(ty);
             this.addPageTransformer(this.y);
             this.w = this.y;
          }
       }
       ty = this.y;
       Objects.requireNonNull(ty);
       if (!PatchProxy.applyVoidOneRefs(jsValueRef, ty, a.class, "1")) {
          y.c(ty.b);
          ty.b = jsValueRef;
       }
       return;
    }
    public void setScrollEnabled(boolean p0){
       if (PatchProxy.isSupport(TKViewPager2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKViewPager2.class, "4")) {
          return;
       }
       this.scrollEnabled = p0;
       this.getView().setUserInputEnabled(p0);
       return;
    }
    public void setScrollEventThrottle(long p0){
       if (PatchProxy.isSupport(TKViewPager2.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, TKViewPager2.class, "2")) {
          return;
       }
       this.scrollEventThrottle = p0;
       TKViewPager2 tv = this.v;
       if (tv != null) {
          tv.f(p0);
       }
       return;
    }
    public void stopScroll(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKViewPager2.class, "19")) {
          return;
       }
       TKViewPager2 tz = this.z;
       if (tz == null) {
          this.getView().b();
          return;
       }else {
          Objects.requireNonNull(tz);
          if (!PatchProxy.applyVoid(objArray, tz, d.class, "3")) {
             d c = tz.c;
             if (c != null) {
                c.b();
             }
             tz.a();
          }
          return;
       }
    }
    public void unRetainAllJsObj(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKViewPager2.class, "30")) {
          return;
       }
       super.unRetainAllJsObj();
       TKViewPager2 tv = this.v;
       if (tv != null) {
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoid(objArray, tv, c.class, "9")) {
             y.c(tv.a);
             y.c(tv.b);
             y.c(tv.c);
          }
       }
       tv = this.A;
       if (tv != null) {
          tv.P0();
       }
       tv = this.y;
       if (tv != null) {
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoid(objArray, tv, a.class, "3")) {
             y.c(tv.b);
          }
       }
       return;
    }
}
