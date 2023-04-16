package com.tachikoma.component.viewpager.TKViewPager;
import jo8.a;
import android.view.View$OnAttachStateChangeListener;
import com.tachikoma.core.component.e;
import gx4.f;
import android.view.View;
import android.content.Context;
import com.tachikoma.component.viewpager.widget.RecyclerViewPager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import io8.a;
import gx4.e;
import com.tachikoma.core.component.TKBaseNativeModule;
import com.tachikoma.core.bridge.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$r;
import jo8.b;
import java.util.ArrayList;
import java.util.Iterator;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import java.util.List;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Boolean;
import com.tachikoma.component.viewpager.TKViewPager$a;
import java.lang.Runnable;
import iq8.x;
import java.lang.Integer;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;
import java.lang.Float;
import java.lang.System;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.V8Array;
import gx4.c;
import java.util.Collection;

public class TKViewPager extends e implements a, View$OnAttachStateChangeListener	// class@000d30
{
    public boolean horizontal;
    public int initialPage;
    public V8Function onPageScrollCallback;
    public JsValueRef onPageScrollCallbackRef;
    public V8Function onPageScrollStateChangedCallback;
    public JsValueRef onPageScrollStateChangedCallbackRef;
    public V8Function onPageSelectedCallback;
    public JsValueRef onPageSelectedCallbackRef;
    public boolean scrollEnabled;
    public long scrollEventThrottle;
    public a v;
    public long w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void TKViewPager(f p0){
       super(p0);
       this.x = false;
       this.y = false;
       this.z = false;
       this.initialPage = -1;
       this.scrollEventThrottle = 400;
       this.scrollEnabled = true;
       this.getView();
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public RecyclerViewPager createViewInstance(Context p0){
       RecyclerViewPager obj = PatchProxy.applyOneRefs(p0, this, TKViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RecyclerViewPager(p0);
       obj.setDirection(0);
       a uoa = new a(this.getTKContext(), this.getJSContext());
       this.v = uoa;
       obj.setAdapter(uoa);
       obj.setOnPageListener(this);
       obj.addOnAttachStateChangeListener(this);
       return obj;
    }
    public void destroyOnMainThread(){
       if (PatchProxy.applyVoid(null, this, TKViewPager.class, "14")) {
          return;
       }
       if (this.isTargetViewExist()) {
          this.getView().removeOnAttachStateChangeListener(this);
          RecyclerViewPager view = this.getView();
          Objects.requireNonNull(view);
          if (!PatchProxy.applyVoid(null, view, RecyclerViewPager.class, "12")) {
             view.y();
             RecyclerViewPager c = view.c;
             if (c != null) {
                view.removeOnScrollListener(c);
                c = view.c;
                c.k = true;
                c.b = null;
                c.c = null;
                view.c = null;
             }
          }
       }
       TKViewPager tv = this.v;
       if (tv != null) {
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoid(null, tv, a.class, "6")) {
             tv.J0();
             tv.e.clear();
             tv.k0();
             Iterator iterator = tv.f.iterator();
             while (iterator.hasNext()) {
                y.c(iterator.next());
             }
             tv.f.clear();
             tv.g = null;
             tv.h = null;
          }
       }
       return;
    }
    public List getChildren(){
       TKViewPager obj = PatchProxy.apply(null, this, TKViewPager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       a e = (obj != null)? obj.e: new ArrayList();
       return e;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       if (PatchProxy.isSupport(TKViewPager.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, TKViewPager.class, "13")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (this.isTargetViewExist()) {
          this.getView().y();
       }
       TKViewPager tv = this.v;
       if (tv != null) {
          tv.J0();
       }
       if (p1) {
          this.destroyOnMainThread();
       }else {
          x.f(new TKViewPager$a(this));
       }
       return;
    }
    public void onPageScrollStateChanged(int p0){
       String str;
       if (PatchProxy.isSupport(TKViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKViewPager.class, "12")) {
          return;
       }
       if (!y.a(this.onPageScrollStateChangedCallback)) {
          return;
       }
       int i = 1;
       if (p0 != i) {
          str = (p0 != 2)? "idle": "settling";
       }else {
          str = "dragging";
       }
       Object[] objArray = new Object[i];
       objArray[0] = str;
       this.onPageScrollStateChangedCallback.call(null, objArray);
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(TKViewPager.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, TKViewPager.class, "11")) {
          return;
       }
       if (!y.a(this.onPageScrollCallback)) {
          return;
       }
       long l = System.currentTimeMillis();
       if (p1 && (p1 - 0x3f800000 && (l - this.w) - this.scrollEventThrottle <= 0)) {
          return;
       }
       this.w = l;
       Object[] objArray = new Object[]{Integer.valueOf(p0),Float.valueOf(p1)};
       this.onPageScrollCallback.call(null, objArray);
       return;
    }
    public void onPageSelected(int p0){
       if (PatchProxy.isSupport(TKViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKViewPager.class, "10")) {
          return;
       }
       if (!y.a(this.onPageSelectedCallback)) {
          return;
       }
       this.z = true;
       Object[] objArray = new Object[true];
       objArray[0] = Integer.valueOf(p0);
       this.onPageSelectedCallback.call(null, objArray);
       return;
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager.class, "15")) {
          return;
       }
       this.y = true;
       if (this.x != null && this.z == null) {
          this.onPageSelected(this.getView().getCurrentItem());
       }
       return;
    }
    public void onViewDetachedFromWindow(View p0){
    }
    public void setCurrentPageIndex(int p0,boolean p1){
       if (PatchProxy.isSupport(TKViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, TKViewPager.class, "8")) {
          return;
       }
       this.getView().x(p0, p1);
       return;
    }
    public void setHorizontal(boolean p0){
       if (PatchProxy.isSupport(TKViewPager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKViewPager.class, "3")) {
          return;
       }
       this.horizontal = p0;
       this.getView().setDirection((p0 ^ 0x01));
       return;
    }
    public void setInitialPage(int p0){
       this.initialPage = p0;
    }
    public void setOnPageScroll(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager.class, "5")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.onPageScrollCallbackRef);
       this.onPageScrollCallbackRef = jsValueRef;
       this.onPageScrollCallback = jsValueRef.get();
       return;
    }
    public void setOnPageScrollStateChanged(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager.class, "6")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.onPageScrollStateChangedCallbackRef);
       this.onPageScrollStateChangedCallbackRef = jsValueRef;
       this.onPageScrollStateChangedCallback = jsValueRef.get();
       this.onPageScrollStateChanged(this.getView().getScrollState());
       return;
    }
    public void setOnPageSelectedCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager.class, "4")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.onPageSelectedCallbackRef);
       this.onPageSelectedCallbackRef = jsValueRef;
       this.onPageSelectedCallback = jsValueRef.get();
       if (this.x != null && this.y != null) {
          this.onPageSelected(this.getView().getCurrentItem());
       }
       return;
    }
    public void setPages(V8Array p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewPager.class, "7")) {
          return;
       }
       if (p0 != null) {
          ArrayList uArrayList = new ArrayList();
          int i = 0;
          int i1 = p0.length();
          while (i < i1) {
             e nativeModule = this.getNativeModule(p0.getObject(i));
             if (nativeModule != null) {
                uArrayList.add(nativeModule);
                this.isAttachedToRoot();
             }
             i = i + 1;
          }
          this.x = true;
          TKViewPager tv = this.v;
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoidOneRefs(uArrayList, tv, a.class, "4")) {
             Iterator iterator = tv.f.iterator();
             while (iterator.hasNext()) {
                y.c(iterator.next());
             }
             tv.f.clear();
             tv.e.clear();
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                tv.f.add(y.b(iterator.next().getJsObj(), tv));
             }
             tv.e.addAll(uArrayList);
             tv.k0();
          }
          if (this.initialPage >= null) {
             this.getView().setCurrent(this.initialPage);
             this.initialPage = -1;
          }
       }
       return;
    }
    public void setScrollEnabled(boolean p0){
       if (PatchProxy.isSupport(TKViewPager.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKViewPager.class, "2")) {
          return;
       }
       this.scrollEnabled = p0;
       this.getView().setScrollEnable(p0);
       return;
    }
    public void setScrollEventThrottle(long p0){
       this.scrollEventThrottle = p0;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKViewPager.class, "9")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.onPageSelectedCallbackRef);
       y.c(this.onPageScrollCallbackRef);
       y.c(this.onPageScrollStateChangedCallbackRef);
       return;
    }
}
