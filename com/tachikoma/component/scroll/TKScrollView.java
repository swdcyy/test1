package com.tachikoma.component.scroll.TKScrollView;
import on8.b;
import on8.a;
import android.view.View$OnAttachStateChangeListener;
import com.tachikoma.core.component.e;
import gx4.f;
import com.tachikoma.component.scroll.constants.OverScrollMode;
import java.lang.String;
import java.lang.Enum;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.tkruntime.v8.V8ObjectProxy;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import com.tkruntime.v8.V8;
import com.tachikoma.core.component.view.TKView;
import gx4.f$a;
import gx4.e;
import com.tkruntime.v8.V8Object;
import java.util.HashMap;
import do8.a;
import android.content.Context;
import android.widget.FrameLayout;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.component.scroll.TKHorizontalScrollView;
import com.tachikoma.component.scroll.TKVerticalScrollView;
import java.util.List;
import java.util.ArrayList;
import java.lang.Number;
import iq8.n;
import java.lang.Integer;
import tx4.y;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import java.lang.Long;
import gx4.c;
import ln8.a;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import on8.c;

public class TKScrollView extends e implements b, a, View$OnAttachStateChangeListener	// class@000d1f
{
    public JsValueRef A;
    public JsValueRef B;
    public JsValueRef C;
    public JsValueRef D;
    public JsValueRef E;
    public int offsetX;
    public int offsetY;
    public V8Function onBeginDrag;
    public V8Function onContentSizeChange;
    public V8Function onEndDrag;
    public V8Function onMomentumScrollBegin;
    public JsValueRef onMomentumScrollBeginRef;
    public V8Function onMomentumScrollEnd;
    public V8Function onReachEnd;
    public V8Function onReachStart;
    public V8Function onScrollCallback;
    public JsValueRef onScrollCallbackRef;
    public V8Function onScrollStateChangedCallback;
    public JsValueRef onScrollStateChangedCallbackRef;
    public String overScrollMode;
    public boolean pagingEnabled;
    public boolean scrollEnabled;
    public long scrollEventThrottle;
    public boolean showScrollIndicator;
    public boolean v;
    public TKView w;
    public V8Object x;
    public a y;
    public JsValueRef z;

    public void TKScrollView(f p0){
       HashMap hashMap;
       super(p0);
       this.scrollEnabled = true;
       this.pagingEnabled = false;
       this.showScrollIndicator = false;
       this.overScrollMode = OverScrollMode.never.name();
       this.getView();
       TKScrollView tv = this.v;
       if (!PatchProxy.isSupport(TKScrollView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tv), this, TKScrollView.class, "2")) {
          V8ObjectProxy v8ObjectProx = new V8ObjectProxy(this.getJSContext().g(), "TKScrollView-container");
          TKView tKView = new TKView(new f$a(this.getTKContext(), v8ObjectProx).a());
          this.w = tKView;
          v8ObjectProx.setNativeObject(tKView);
          this.x = v8ObjectProx;
          String str = "hidden";
          Object[] objArray = null;
          if (tv != null) {
             if (!PatchProxy.applyVoid(objArray, this, TKScrollView.class, "32")) {
                hashMap = new HashMap();
                hashMap.put("flexDirection", "row");
                hashMap.put("overflow", str);
                this.w.setStyle(hashMap);
             }
          }else if(PatchProxy.applyVoid(objArray, this, TKScrollView.class, "33")){
             hashMap = new HashMap();
             hashMap.put("flexDirection", "column");
             hashMap.put("overflow", str);
             this.w.setStyle(hashMap);
          }
          this.y.setContainerView(this.w.getView());
       }
       return;
    }
    public void add(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKScrollView.class, "25")) {
          return;
       }
       this.w.add(p0);
       return;
    }
    public void attachToRoot(){
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public FrameLayout createViewInstance(Context p0){
       p0 = PatchProxy.applyOneRefs(p0, this, TKScrollView.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       f b = this.mInitParams.b;
       if (b != null && (b.length > 0 && b[0] instanceof Boolean)) {
          this.v = b[0].booleanValue();
       }
    label_0029 :
       this.y = (this.v != null)? new TKHorizontalScrollView(this.getContext()): new TKVerticalScrollView(this.getContext());
       this.y.a(0);
       this.y.j(this);
       this.y.c(this);
       FrameLayout view = this.y.getView();
       view.addOnAttachStateChangeListener(this);
       return view;
    }
    public void detachToRoot(){
       if (PatchProxy.applyVoid(null, this, TKScrollView.class, "45")) {
          return;
       }
       TKScrollView tw = this.w;
       if (tw != null) {
          tw.mAttachToRoot = false;
       }
       super.detachToRoot();
       return;
    }
    public List getChildren(){
       TKScrollView obj = PatchProxy.apply(null, this, TKScrollView.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w;
       if (obj != null) {
          return obj.getChildren();
       }
       return new ArrayList();
    }
    public int getOffsetX(){
       TKScrollView obj = PatchProxy.apply(null, this, TKScrollView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       if (obj == null) {
          return 0;
       }
       return n.f(obj.getOffsetX());
    }
    public int getOffsetY(){
       TKScrollView obj = PatchProxy.apply(null, this, TKScrollView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       if (obj == null) {
          return 0;
       }
       return n.f(obj.getOffsetY());
    }
    public V8Object getSubview(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKScrollView.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w.getSubview(p0);
    }
    public void insertBefore(V8Object p0,V8Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKScrollView.class, "28")) {
          return;
       }
       this.w.insertBefore(p0, p1);
       return;
    }
    public void layout(){
       if (PatchProxy.applyVoid(null, this, TKScrollView.class, "30")) {
          return;
       }
       this.w.layout();
       return;
    }
    public final int[] m(e p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, TKScrollView.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       int i = 2;
       int[] ointArray = new int[i];
       View view = p0.getView();
       if (p0.getParent() == this.w) {
          ointArray[0] = view.getLeft();
          ointArray[1] = view.getTop();
       }else {
          int[] ointArray1 = new int[i];
          view.getLocationOnScreen(ointArray1);
          obj = new int[i];
          this.getView().getLocationOnScreen(obj);
          ointArray[0] = this.y.getOffsetX() + (ointArray1[0] - obj[0]);
          ointArray[1] = this.y.getOffsetY() + (ointArray1[1] - obj[1]);
       }
       return ointArray;
    }
    public void onContentSizeChanged(int p0,int p1){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TKScrollView.class, "44")) {
          return;
       }
       if (!y.a(this.onContentSizeChange)) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(n.f(p0)),Integer.valueOf(n.f(p1))};
       this.onContentSizeChange.call(null, objArray);
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, TKScrollView.class, "35")) {
          return;
       }
       super.onDestroy(p0, p1);
       TKScrollView ty = this.y;
       if (ty != null) {
          ty.e(p1);
          this.y = null;
       }
       return;
    }
    public void onMomentumScrollBegin(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TKScrollView.class, "39")) {
          return;
       }
       if (!y.a(this.onMomentumScrollBegin)) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(n.f(p0)),Integer.valueOf(n.f(p1)),Integer.valueOf(n.f(p2)),Integer.valueOf(n.f(p3))};
       this.onMomentumScrollBegin.call(null, objArray);
       return;
    }
    public void onMomentumScrollEnd(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TKScrollView.class, "40")) {
          return;
       }
       if (!y.a(this.onMomentumScrollEnd)) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(n.f(p0)),Integer.valueOf(n.f(p1)),Integer.valueOf(n.f(p2)),Integer.valueOf(n.f(p3))};
       this.onMomentumScrollEnd.call(null, objArray);
       return;
    }
    public void onReachEnd(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TKScrollView.class, "42")) {
          return;
       }
       if (!y.a(this.onReachEnd)) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(n.f(p0)),Integer.valueOf(n.f(p1)),Integer.valueOf(n.f(p2)),Integer.valueOf(n.f(p3))};
       this.onReachEnd.call(null, objArray);
       return;
    }
    public void onReachStart(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TKScrollView.class, "41")) {
          return;
       }
       if (!y.a(this.onReachStart)) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(n.f(p0)),Integer.valueOf(n.f(p1)),Integer.valueOf(n.f(p2)),Integer.valueOf(n.f(p3))};
       this.onReachStart.call(null, objArray);
       return;
    }
    public void onScroll(int p0,int p1){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TKScrollView.class, "36")) {
          return;
       }
       if (!y.a(this.onScrollCallback)) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(n.f(p0)),Integer.valueOf(n.f(p1))};
       this.onScrollCallback.call(null, objArray);
       return;
    }
    public void onScrollBeginDrag(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TKScrollView.class, "37")) {
          return;
       }
       if (!y.a(this.onBeginDrag)) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(n.f(p0)),Integer.valueOf(n.f(p1)),Integer.valueOf(n.f(p2)),Integer.valueOf(n.f(p3))};
       this.onBeginDrag.call(null, objArray);
       return;
    }
    public void onScrollEndDrag(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TKScrollView.class, "38")) {
          return;
       }
       if (!y.a(this.onEndDrag)) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(n.f(p0)),Integer.valueOf(n.f(p1)),Integer.valueOf(n.f(p2)),Integer.valueOf(n.f(p3))};
       this.onEndDrag.call(null, objArray);
       return;
    }
    public void onScrollStateChanged(int p0){
       String str;
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKScrollView.class, "43")) {
          return;
       }
       if (!y.a(this.onScrollStateChangedCallback)) {
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
       this.onScrollStateChangedCallback.call(null, objArray);
       return;
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKScrollView.class, "46")) {
          return;
       }
       TKScrollView ty = this.y;
       if (ty != null) {
          this.onScrollStateChanged(ty.getScrollState());
       }
       return;
    }
    public void onViewDetachedFromWindow(View p0){
    }
    public void remove(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKScrollView.class, "26")) {
          return;
       }
       this.w.remove(p0);
       return;
    }
    public void removeAll(){
       if (PatchProxy.applyVoid(null, this, TKScrollView.class, "27")) {
          return;
       }
       this.w.removeAll();
       return;
    }
    public void replace(V8Object p0,V8Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKScrollView.class, "29")) {
          return;
       }
       this.w.replace(p0, p1);
       return;
    }
    public void scrollElementToCenter(V8Object p0,long p1){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, TKScrollView.class, "22")) {
          return;
       }
       if (p0 != null && this.y != null) {
          try{
             e nativeModule = this.getNativeModule(p0);
             int[] ointArray = this.m(nativeModule);
             if (ointArray == null || ointArray.length < 2) {
                return;
             }else {
                int i = ointArray[0];
                int i1 = ointArray[1];
                View view = nativeModule.getView();
                if (this.v != null) {
                   i = (int)((float)i + ((float)(int)((float)view.getWidth() / 2.00f) - ((float)this.getView().getWidth() / 2.00f)));
                }else {
                   i1 = (int)((float)i1 + ((float)(int)((float)view.getHeight() / 2.00f) - ((float)this.getView().getHeight() / 2.00f)));
                }
                this.y.g(i, i1, p1);
             }
          }catch(java.lang.Exception e5){
             a.b(e5, this.getTKJSContext().hashCode());
          }
       }
    }
    public void scrollTo(int p0,int p1,long p2){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, TKScrollView.class, "20")) {
          return;
       }
       if (this.y != null) {
          this.y.g(n.b(p0), n.b(p1), p2);
       }
       return;
    }
    public void scrollToElement(V8Object p0,int p1,int p2,long p3){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Long.valueOf(p3), this, TKScrollView.class, "21")) {
          return;
       }
       if (p0 != null && this.y != null) {
          p1 = n.b(p1);
          p2 = n.b(p2);
          try{
             e nativeModule = this.getNativeModule(p0);
             int[] ointArray = this.m(nativeModule);
             if (ointArray == null || ointArray.length < 2) {
                return;
             }else {
                int i = 0;
                int i1 = ointArray[i];
                int i2 = ointArray[1];
                View view = nativeModule.getView();
                if (this.v != null) {
                   if (p1 >= 0) {
                      i1 = i1 - p1;
                   }else if(p2 >= 0){
                      i1 = ((i1 - this.getView().getWidth()) + view.getWidth()) + p2;
                   }
                   i = i1;
                   i2 = 0;
                }else if(p1 >= 0){
                   i2 = i2 - p1;
                }else if(p2 >= 0){
                   i2 = ((i2 - this.getView().getHeight()) + view.getHeight()) + p2;
                }
                this.y.g(i, i2, p3);
             }
          }catch(java.lang.Exception e9){
             a.b(e9, this.getTKJSContext().hashCode());
          }
       }
    }
    public void setOnBeginDrag(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKScrollView.class, "14")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ScrollView_onBeginDrag");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.C);
       this.C = jsValueRef;
       this.onBeginDrag = jsValueRef.get();
       return;
    }
    public void setOnContentSizeChange(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKScrollView.class, "17")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ScrollView_onContentSizeChange");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.E);
       this.E = jsValueRef;
       this.onContentSizeChange = jsValueRef.get();
       return;
    }
    public void setOnEndDrag(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKScrollView.class, "15")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ScrollView_onEndDrag");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.D);
       this.D = jsValueRef;
       this.onEndDrag = jsValueRef.get();
       return;
    }
    public void setOnMomentumScrollBegin(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKScrollView.class, "10")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ScrollView_onMomentumScrollBegin");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.onMomentumScrollBeginRef);
       this.onMomentumScrollBeginRef = jsValueRef;
       this.onMomentumScrollBegin = jsValueRef.get();
       return;
    }
    public void setOnMomentumScrollEnd(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKScrollView.class, "11")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ScrollView_onMomentumScrollEnd");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.z);
       this.z = jsValueRef;
       this.onMomentumScrollEnd = jsValueRef.get();
       return;
    }
    public void setOnReachEnd(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKScrollView.class, "13")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ScrollView_onReachEnd");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.B);
       this.B = jsValueRef;
       this.onReachEnd = jsValueRef.get();
       return;
    }
    public void setOnReachStart(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKScrollView.class, "12")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ScrollView_onReachStart");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.A);
       this.A = jsValueRef;
       this.onReachStart = jsValueRef.get();
       return;
    }
    public void setOnScrollCallback(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKScrollView.class, "9")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ScrollView_onScroll");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.onScrollCallbackRef);
       this.onScrollCallbackRef = jsValueRef;
       this.onScrollCallback = jsValueRef.get();
       TKScrollView ty = this.y;
       if (ty != null) {
          ty.f();
       }
       return;
    }
    public void setOnScrollStateChanged(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKScrollView.class, "16")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("ScrollView_onScrollStateChanged");
       }
       JsValueRef jsValueRef = y.b(p0, this);
       y.c(this.onScrollStateChangedCallbackRef);
       this.onScrollStateChangedCallbackRef = jsValueRef;
       this.onScrollStateChangedCallback = jsValueRef.get();
       return;
    }
    public void setOverScrollMode(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKScrollView.class, "6")) {
          return;
       }
       OverScrollMode overScrollMo = OverScrollMode.valueOf(p0);
       this.overScrollMode = overScrollMo.name();
       TKScrollView ty = this.y;
       if (ty != null) {
          ty.d(overScrollMo.mode);
       }
       return;
    }
    public void setPagingEnable(boolean p0){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKScrollView.class, "4")) {
          return;
       }
       this.pagingEnabled = p0;
       TKScrollView ty = this.y;
       if (ty != null) {
          ty.b(p0);
       }
       return;
    }
    public void setScrollEnabled(boolean p0){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKScrollView.class, "3")) {
          return;
       }
       this.scrollEnabled = p0;
       TKScrollView ty = this.y;
       if (ty != null) {
          ty.h(p0);
       }
       return;
    }
    public void setScrollEventThrottle(long p0){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, TKScrollView.class, "7")) {
          return;
       }
       this.scrollEventThrottle = p0;
       TKScrollView ty = this.y;
       if (ty != null) {
          ty.i(p0);
       }
       return;
    }
    public void setShowScrollIndicator(boolean p0){
       if (PatchProxy.isSupport(TKScrollView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKScrollView.class, "5")) {
          return;
       }
       this.showScrollIndicator = p0;
       TKScrollView ty = this.y;
       if (ty != null) {
          ty.a(p0);
       }
       return;
    }
    public void setStyle(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKScrollView.class, "8")) {
          return;
       }
       String str = "overflow";
       if (p0.containsKey(str)) {
          p0.remove(str);
       }
       HashMap hashMap = new HashMap();
       String[] a = c.a;
       int len = a.length;
       int i = 0;
       while (i < len) {
          object oobject = a[i];
          if (p0.containsKey(oobject)) {
             hashMap.put(oobject, p0.get(oobject));
             p0.remove(oobject);
          }
          i = i + 1;
       }
       super.setStyle(p0);
       this.w.setStyle(hashMap);
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKScrollView.class, "34")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.onScrollCallbackRef);
       y.c(this.onMomentumScrollBeginRef);
       y.c(this.z);
       y.c(this.A);
       y.c(this.B);
       y.c(this.C);
       y.c(this.D);
       y.c(this.E);
       y.c(this.onScrollStateChangedCallbackRef);
       TKScrollView tx = this.x;
       if (tx != null && !tx.isReleased()) {
          this.x.setWeak();
       }
    label_0054 :
       return;
    }
}
