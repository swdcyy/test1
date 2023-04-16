package com.facebook.react.ReactRootView;
import ze.b0;
import ze.h0;
import ze.v;
import android.widget.FrameLayout;
import android.content.Context;
import rd.l;
import android.view.View$MeasureSpec;
import java.util.concurrent.CopyOnWriteArraySet;
import com.facebook.react.common.LifecycleState;
import android.util.AttributeSet;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.a;
import com.facebook.react.uimanager.IllegalViewOperationException;
import android.view.View;
import java.lang.Exception;
import java.lang.RuntimeException;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMarker;
import od.a;
import com.facebook.react.bridge.UIManager;
import ze.t0;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.turbomodule.core.TurboModuleManager;
import com.facebook.react.bridge.WritableNativeMap;
import android.os.Bundle;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.NativeArray;
import android.view.ViewGroup$LayoutParams;
import java.lang.Integer;
import ze.b1;
import android.view.ViewGroup;
import ze.h;
import com.facebook.react.ReactRootView$d;
import yd.e;
import com.facebook.react.uimanager.a;
import rd.f0;
import com.facebook.react.bridge.InputEventListener;
import hg.a;
import java.lang.Enum;
import gf.d;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Set;
import javax.inject.Provider;
import java.lang.Boolean;
import java.lang.StringBuilder;
import cb.a;
import android.view.ViewTreeObserver;
import com.facebook.react.ReactRootView$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.graphics.Canvas;
import android.view.KeyEvent;
import java.util.Objects;
import java.util.Map;
import android.view.MotionEvent;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import df.c;
import java.lang.Number;
import android.app.Activity;
import android.view.Window;
import ukd.a$a;
import ukd.a;
import ae.a;
import me.a$a;
import me.a;
import com.facebook.react.bridge.FragmentLifecycleEventListener;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.ref.WeakReference;
import com.facebook.react.ReactRootView$c;
import android.graphics.Rect;
import java.lang.Math;
import com.facebook.base.tracing.TracingManager;
import gf.c;
import android.view.ViewParent;

public class ReactRootView extends FrameLayout implements b0, h0, v	// class@00116e
{
    public a A;
    public a B;
    public long C;
    public boolean D;
    public InputEventListener E;
    public final CopyOnWriteArraySet F;
    public LifecycleState G;
    public Object H;
    public a b;
    public String c;
    public Bundle d;
    public String e;
    public ReactRootView$b f;
    public ReactRootView$d g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public h l;
    public final l m;
    public boolean n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public final boolean u;
    public boolean v;
    public int w;
    public b1 x;
    public ReactRootView$c y;
    public a z;

    public void ReactRootView(Context p0){
       super(p0);
       this.i = -3;
       this.m = new l(this);
       this.n = false;
       this.o = View$MeasureSpec.makeMeasureSpec(false, false);
       this.p = View$MeasureSpec.makeMeasureSpec(false, false);
       this.q = false;
       this.r = 0;
       this.s = 0;
       this.t = 1;
       this.z = null;
       this.A = null;
       this.B = null;
       this.C = 0;
       this.D = false;
       this.E = null;
       this.F = new CopyOnWriteArraySet();
       this.G = LifecycleState.BEFORE_CREATE;
       this.H = null;
       this.u = false;
       this.h();
    }
    public void ReactRootView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.i = -3;
       this.m = new l(this);
       this.n = false;
       this.o = View$MeasureSpec.makeMeasureSpec(false, false);
       this.p = View$MeasureSpec.makeMeasureSpec(false, false);
       this.q = false;
       this.r = 0;
       this.s = 0;
       this.t = 1;
       this.z = null;
       this.A = null;
       this.B = null;
       this.C = 0;
       this.D = false;
       this.E = null;
       this.F = new CopyOnWriteArraySet();
       this.G = LifecycleState.BEFORE_CREATE;
       this.H = null;
       this.u = false;
       this.h();
    }
    public void ReactRootView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = -3;
       this.m = new l(this);
       this.n = false;
       this.o = View$MeasureSpec.makeMeasureSpec(false, false);
       this.p = View$MeasureSpec.makeMeasureSpec(false, false);
       this.q = false;
       this.r = 0;
       this.s = 0;
       this.t = 1;
       this.z = null;
       this.A = null;
       this.B = null;
       this.C = 0;
       this.D = false;
       this.E = null;
       this.F = new CopyOnWriteArraySet();
       this.G = LifecycleState.BEFORE_CREATE;
       this.H = null;
       this.u = false;
       this.h();
    }
    public void C(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactRootView.class, "37")) {
          return;
       }
       ReactRootView tb = this.b;
       if (tb == null || tb.n() == null) {
          throw new RuntimeException(p0);
       }
       this.b.n().handleException(new IllegalViewOperationException(p0.getMessage(), this, p0));
       return;
    }
    public void a(ReactContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactRootView.class, "30")) {
          return;
       }
       ReactMarker.logMarker(ReactMarkerConstants.LOAD_FIRST_PAGE_START);
       a.c(p0);
       if (this.b == null || this.j == null) {
          ReactMarker.logMarker(ReactMarkerConstants.LOAD_FIRST_PAGE_END);
          return;
       }else if(this.u != null){
          if (this.n != null) {
             t0.a(p0, this.getUIManagerType()).updateRootLayoutSpecs(this.getRootViewTag(), this.o, this.p);
          }
          a.c(p0);
          TurboModuleManager jSIModule = p0.getCatalystInstance().getJSIModule(JSIModuleType.TurboModuleManager);
          WritableNativeMap writableNati = new WritableNativeMap();
          writableNati.putDouble("rootTag", (double)this.getRootViewTag());
          Bundle appPropertie = this.getAppProperties();
          if (appPropertie != null) {
             writableNati.putMap("initialProps", Arguments.fromBundle(appPropertie));
          }
          WritableNativeArray writableNati1 = new WritableNativeArray();
          writableNati1.pushMap(writableNati);
          this.k = true;
          jSIModule.callFunction("runFirstPage", writableNati1);
       }
       ReactMarker.logMarker(ReactMarkerConstants.LOAD_FIRST_PAGE_END);
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (PatchProxy.isSupport(ReactRootView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactRootView.class, "39")) {
          return;
       }
       this.x.b(p0);
       this.setChildrenDrawingOrderEnabled(this.x.d());
       super.addView(p0, p1, p2);
       return;
    }
    public void b(int p0){
       if (PatchProxy.isSupport(ReactRootView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactRootView.class, "26")) {
          return;
       }
       if (p0 == 101 && !PatchProxy.applyVoid(null, this, ReactRootView.class, "27")) {
          this.l = new h(this);
          ReactRootView tg = this.g;
          if (tg != null) {
             tg.a(this);
          }
          if (e.u && this.getLcpDetector() != null) {
             tg = this.b;
             if (tg != null) {
                ReactContext reactContext = tg.n();
                if (reactContext != null) {
                   if (this.E == null) {
                      this.E = new f0(this);
                   }
                   reactContext.addInputEventListener(this.E);
                }
             }
          }
       }
    label_005a :
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReactRootView.class, "31")) {
          return;
       }
       String str = "ReactRootView.runApplication";
       a.a(0, str);
       ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.RUN_APPLICATION_START.name(), "", this.w);
       if (this.b != null && this.j != null) {
          ReactContext reactContext = this.b.n();
          if (reactContext != null) {
             CatalystInstance catalystInst = reactContext.getCatalystInstance();
             String jSModuleName = this.getJSModuleName();
             if (e.u) {
                Bundle appPropertie = this.getAppProperties();
                d uod = PatchProxy.applyOneRefs(appPropertie, objArray, d.class, "1");
                if (uod != PatchProxyResult.class) {
                }else {
                   uod = new d();
                   if (appPropertie != null) {
                      String str1 = "KDS-LCPConfig";
                      if (appPropertie.containsKey(str1)) {
                         appPropertie = appPropertie.getBundle(str1);
                         if (appPropertie.containsKey("LCPConfigDetectViewClassName")) {
                            uod.a = appPropertie.getStringArrayList("LCPConfigDetectViewClassName");
                         }
                      }
                   }
                }
                this.z = new a(this, uod, this.w);
             }
             if (this.u == null) {
                if (this.n != null) {
                   this.n(this.o, this.p);
                }
                WritableNativeMap writableNati = new WritableNativeMap();
                writableNati.putDouble("rootTag", (double)this.getRootViewTag());
                Bundle appPropertie1 = this.getAppProperties();
                if (appPropertie1 != null) {
                   writableNati.putMap("initialProps", Arguments.fromBundle(appPropertie1));
                }
                this.k = true;
                catalystInst.getJSModule(AppRegistry.class).runApplication(jSModuleName, writableNati);
             }
             a.c(0, str);
             ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.RUN_APPLICATION_END.name(), "", this.w);
             return;
          }
       }
       a.c(0, str);
       ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.RUN_APPLICATION_END.name(), "", this.w);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, ReactRootView.class, "35")) {
          return;
       }
       a.a(0, "attachToReactInstanceManager");
       if (this.j != null) {
          return;
       }
       boolean b = true;
       this.j = b;
       ReactRootView tb = this.b;
       a.c(tb);
       if (!PatchProxy.applyVoidOneRefs(this, tb, a.class, "31")) {
          UiThreadUtil.assertOnUiThread();
          tb.a.add(this);
          tb.g(this);
          if (this.getAppProperties() == null || !this.getAppProperties().getBoolean("REACT_NATIVE_DELAY_RUN_APPLICATION")) {
             b = false;
          }
          ReactContext reactContext = tb.n();
          if (tb.d == null && (reactContext != null && !b)) {
             tb.d(this);
          }
       }
    label_005c :
       if (e.p.get().booleanValue()) {
          a.x("ReactNative", "addOnGlobalLayoutListener attachToReactInstanceManager "+this);
          this.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.getCustomGlobalLayoutListener());
       }else {
          this.getViewTreeObserver().addOnGlobalLayoutListener(this.getCustomGlobalLayoutListener());
       }
       a.c(0, "attachToReactInstanceManager");
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactRootView.class, "6")) {
          return;
       }
       try{
          super.dispatchDraw(p0);
       }catch(java.lang.StackOverflowError e3){
          this.C(e3);
       }
       return;
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       ReactRootView obj = PatchProxy.applyOneRefs(p0, this, ReactRootView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b != null && (this.j == null || this.b.n() == null)) {
          a.x("ReactNative", "Unable to handle key event as the catalyst instance has not been attached");
          return super.dispatchKeyEvent(p0);
       }else {
          obj = this.m;
          Objects.requireNonNull(obj);
          int keyCode = p0.getKeyCode();
          int action = p0.getAction();
          if (action == 1 || !action) {
             Map c = l.c;
             if (c.containsKey(Integer.valueOf(keyCode))) {
                obj.b(c.get(Integer.valueOf(keyCode)), obj.a, action);
             }
          }
          return super.dispatchKeyEvent(p0);
       }
    }
    public final void e(int p0){
       if (PatchProxy.isSupport(ReactRootView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactRootView.class, "34")) {
          return;
       }
       if (this.j != null && this.getAttachType() == 1) {
          a.c(this.b);
          this.setAttachType(p0);
          if (this.b.t()) {
             this.b.d(this);
          }
       }else {
          this.d();
       }
       return;
    }
    public void f(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactRootView.class, "3")) {
          return;
       }
       String str = "ReactNative";
       if (this.b != null && (this.j == null || this.b.n() == null)) {
          a.x(str, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
          return;
       }else if(this.l == null){
          a.x(str, "Unable to dispatch touch to JS before the dispatcher is available");
          return;
       }else {
          this.l.d(p0, this.b.n().getNativeModule(UIManagerModule.class).getEventDispatcher());
          return;
       }
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, ReactRootView.class, "36")) {
          return;
       }
       super.finalize();
       a.b((this.j ^ 0x01), "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy\(\) of your hosting Activity or in the onDestroyView\(\) of your hosting Fragment.");
       return;
    }
    public final void g(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactRootView.class, "10")) {
          return;
       }
       String str = "ReactNative";
       if (this.b != null && (this.j == null || this.b.n() == null)) {
          a.x(str, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
          return;
       }else if(this.l == null){
          a.x(str, "Unable to dispatch touch to JS before the dispatcher is available");
          return;
       }else {
          ReactContext reactContext = this.b.n();
          if (!reactContext.hasActiveCatalystInstance()) {
             a.x(str, "Unable to dispatch touch to JS after catalyst is destroyed");
             return;
          }else {
             c eventDispatc = reactContext.getNativeModule(UIManagerModule.class).getEventDispatcher();
             boolean b = false;
             if (reactContext.hasCatalystInstance()) {
                b = reactContext.getCatalystInstance().getMultiReactRootViewDispatcherFilter();
             }
             this.l.c(p0, eventDispatc, b);
             return;
          }
       }
    }
    public Bundle getAppProperties(){
       return this.d;
    }
    public int getAttachType(){
       return this.i;
    }
    public int getChildDrawingOrder(int p0,int p1){
       if (PatchProxy.isSupport(ReactRootView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ReactRootView.class, "42");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.x.a(p0, p1);
    }
    public final ReactRootView$b getCustomGlobalLayoutListener(){
       Object obj = PatchProxy.apply(null, this, ReactRootView.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          this.f = new ReactRootView$b(this);
       }
       return this.f;
    }
    public View getDecorView(){
       Object obj = PatchProxy.apply(null, this, ReactRootView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getContext() instanceof Activity) {
          return this.getContext().getWindow().getDecorView();
       }
       return this.getRootView();
    }
    public long getFirstOnAttachTime(){
       return this.C;
    }
    public int getHeightMeasureSpec(){
       return this.p;
    }
    public String getInitialUITemplate(){
       return this.e;
    }
    public boolean getIsAttachedToInstance(){
       return this.j;
    }
    public String getJSModuleName(){
       ReactRootView obj = PatchProxy.apply(null, this, ReactRootView.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       a.c(obj);
       return obj;
    }
    public a getLcpDetector(){
       return this.z;
    }
    public a getReactInstanceManager(){
       return this.b;
    }
    public ViewGroup getRootViewGroup(){
       return this;
    }
    public int getRootViewTag(){
       return this.h;
    }
    public String getSurfaceID(){
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, ReactRootView.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getAppProperties();
       if (obj != null) {
          objArray = obj.getString("surfaceID");
       }
       return objArray;
    }
    public int getUIManagerType(){
       return this.t;
    }
    public int getWidthMeasureSpec(){
       return this.o;
    }
    public int getZIndexMappedChildIndex(int p0){
       if (PatchProxy.isSupport(ReactRootView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ReactRootView.class, "43");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.x.d()) {
          p0 = this.x.a(this.getChildCount(), p0);
       }
       return p0;
    }
    public final void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReactRootView.class, "1")) {
          return;
       }
       this.x = new b1(this);
       boolean b = false;
       this.setClipChildren(b);
       if (e.t) {
          int i = 1;
          try{
             Object[] objArray1 = new Object[i];
             objArray1[b] = new a$a(Context.class, this.getContext());
             this.B = a.k(Class.forName("com.facebook.react.devsupport.DebugOverlayController"), objArray1);
          }catch(java.lang.ClassNotFoundException e4){
             a.y("ReactNative", "create DebugOverlayController failed", e4);
          }
          try{
             objArray = new Object[]{new a$a(Context.class, this.getContext()),new a$a(a$a.class, objArray)};
             this.A = a.k(Class.forName("com.facebook.react.devsupport.DevInternalSettings"), objArray);
          }catch(java.lang.ClassNotFoundException e1){
             a.y("ReactNative", "create DevInternalSettings failed", e1);
          }
       }
    }
    public void i(FragmentLifecycleEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactRootView.class, "48")) {
          return;
       }
       this.F.remove(p0);
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, ReactRootView.class, "15")) {
          return;
       }
       this.getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.getCustomGlobalLayoutListener());
       return;
    }
    public void k(String p0,WritableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactRootView.class, "38")) {
          return;
       }
       ReactRootView tb = this.b;
       if (tb != null) {
          tb.n().getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit(p0, p1);
       }
       return;
    }
    public void l(a p0,String p1,Bundle p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactRootView.class, "20")) {
          return;
       }
       if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, null, this, ReactRootView.class, "21")) {
          a.a(0, "startReactApplication");
          UiThreadUtil.assertOnUiThread();
          boolean b = (this.b == null || this.v != null)? true: false;
          a.b(b, "This root view has already been attached to a catalyst instance manager");
          this.b = p0;
          this.c = p1;
          this.d = p2;
          this.e = null;
          p0.i();
          this.e(2);
          a.c(0, "startReactApplication");
       }
       return;
    }
    public void m(){
       ReactRootView tb;
       a a;
       if (PatchProxy.applyVoid(null, this, ReactRootView.class, "25")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       if (e.u && this.getLcpDetector() != null) {
          tb = this.b;
          if (tb != null) {
             ReactContext reactContext = tb.n();
             if (reactContext != null) {
                ReactRootView tE = this.E;
                if (tE != null) {
                   reactContext.removeInputEventListener(tE);
                   this.E = null;
                }
             }
          }
       }
       a.x("ReactNativeDestroy", "ReactRootView::unmountReactApplication "+this);
       if (this.b != null && this.j != null) {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(this, tb, a.class, "33")) {
             UiThreadUtil.assertOnUiThread();
             a = tb.a;
             _monitor_enter(a);
             if (tb.a.contains(this)) {
                ReactContext reactContext1 = tb.n();
                tb.a.remove(this);
                if (reactContext1 != null && reactContext1.hasActiveCatalystInstance()) {
                   tb.l(this, reactContext1.getCatalystInstance());
                }
             }
             _monitor_exit(a);
          }
          this.j = false;
       }
       a.x("ReactNative", "removeOnGlobalLayoutListener unmountReactApplication "+this+":"+e.p.get());
       if (e.p.get().booleanValue()) {
          this.j();
       }
       this.F.clear();
       this.b = null;
       this.k = false;
       this.i = -3;
       return;
    }
    public final void n(int p0,int p1){
       if (PatchProxy.isSupport(ReactRootView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ReactRootView.class, "23")) {
          return;
       }
       ReactRootView tb = this.b;
       if (tb == null) {
          a.x("ReactNative", "Unable to update root layout specs for uninitialized ReactInstanceManager");
          return;
       }else {
          ReactContext reactContext = tb.n();
          if (reactContext != null && t0.a(reactContext, this.getUIManagerType()) != null) {
             t0.a(reactContext, this.getUIManagerType()).updateRootLayoutSpecs(this.getRootViewTag(), p0, p1);
          }
          return;
       }
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, ReactRootView.class, "13")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.j != null) {
          this.j();
          a.x("ReactNative", "addOnGlobalLayoutListener onAttachedToWindow "+this);
          this.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.getCustomGlobalLayoutListener());
       }
       ReactRootView tA = this.A;
       if (tA != null && tA.e()) {
          this.B.b(true, this);
       }
       if (e.u && !this.C) {
          this.C = a.c();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, ReactRootView.class, "14")) {
          return;
       }
       super.onDetachedFromWindow();
       a.x("ReactNative", "removeOnGlobalLayoutListener onDetachedFromWindow "+this+":"+this.j);
       if (this.j != null) {
          this.j();
       }
       ReactRootView ty = this.y;
       if (ty != null) {
          ty.a(this, new WeakReference(this.b));
       }
       ty = this.A;
       if (ty != null && ty.e()) {
          this.B.b(false, this);
       }
       return;
    }
    public void onFocusChanged(boolean p0,int p1,Rect p2){
       l a;
       if (PatchProxy.isSupport(ReactRootView.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, ReactRootView.class, "8")) {
          return;
       }
       if (this.b != null && (this.j == null || this.b.n() == null)) {
          a.x("ReactNative", "Unable to handle focus changed event as the catalyst instance has not been attached");
          super.onFocusChanged(p0, p1, p2);
          return;
       }else {
          ReactRootView tm = this.m;
          a = tm.a;
          if (a != -1) {
             tm.a("blur", a);
          }
          tm.a = -1;
          super.onFocusChanged(p0, p1, p2);
          return;
       }
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactRootView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.g(p0);
       if (e.u && this.getLcpDetector() != null) {
          this.getLcpDetector().onTouchEvent(p0);
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ReactRootView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ReactRootView.class, "12")) {
             return;
          }
       }
       if (this.j != null) {
          int i = p3 - p1;
          int i1 = p4 - p2;
          int mode = View$MeasureSpec.getMode(this.o);
          int i2 = View$MeasureSpec.makeMeasureSpec(i, mode);
          if (mode == Integer.MIN_VALUE || !mode) {
             i2 = this.o;
          }
          mode = View$MeasureSpec.getMode(this.p);
          int i3 = View$MeasureSpec.makeMeasureSpec(i1, mode);
          if (mode == Integer.MIN_VALUE || !mode) {
             i3 = this.p;
          }
          if (this.q == null && (this.r != i || this.s != i1)) {
             this.n(i2, i3);
          }
          this.r = i;
          this.s = i1;
       }
       if (this.u != null) {
          super.onLayout(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ReactRootView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ReactRootView.class, "2")) {
          return;
       }
       boolean b = false;
       this.setAllowImmediateUIOperationExecution(b);
       if (this.u != null) {
          super.onMeasure(p0, p1);
          this.setAllowImmediateUIOperationExecution(true);
          return;
       }else {
          a.a(0, "ReactRootView.onMeasure");
          int b1 = (p0 != this.o || p1 != this.p)? true: false;
          this.q = b1;
          this.o = p0;
          this.p = p1;
          b1 = View$MeasureSpec.getMode(p0);
          int i = Integer.MIN_VALUE;
          if (b1 == i || !b1) {
             p0 = 0;
             for (b1 = 0; b1 < this.getChildCount(); b1 = b1 + 1) {
                View childAt = this.getChildAt(b1);
                int i1 = childAt.getLeft() + childAt.getMeasuredWidth();
                i1 = i1 + childAt.getPaddingLeft();
                i1 = i1 + childAt.getPaddingRight();
                p0 = Math.max(p0, i1);
             }
          }else {
             p0 = View$MeasureSpec.getSize(p0);
          }
          b1 = View$MeasureSpec.getMode(p1);
          if (b1 == i || !b1) {
             p1 = 0;
             for (; b < this.getChildCount(); b = b + 1) {
                View childAt1 = this.getChildAt(b);
                i = childAt1.getTop() + childAt1.getMeasuredHeight();
                i = i + childAt1.getPaddingTop();
                i = i + childAt1.getPaddingBottom();
                p1 = Math.max(p1, i);
             }
          }else {
             p1 = View$MeasureSpec.getSize(p1);
          }
          this.setMeasuredDimension(p0, p1);
          this.n = true;
          if (this.b != null && this.j == null) {
             this.d();
          }
          this.setAllowImmediateUIOperationExecution(true);
          a.c(0, "ReactRootView.onMeasure");
          return;
       }
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactRootView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.g(p0);
       if (e.u && this.getLcpDetector() != null) {
          this.getLcpDetector().onTouchEvent(p0);
       }
       super.onTouchEvent(p0);
       return true;
    }
    public void onViewAdded(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactRootView.class, "17")) {
          return;
       }
       super.onViewAdded(p0);
       TracingManager.e("CONTENT_APPEARED");
       if (this.k != null) {
          this.k = false;
          ReactRootView tc = this.c;
          if (tc != null) {
             ReactMarkerConstants cONTENT_APPE = ReactMarkerConstants.CONTENT_APPEARED;
             ReactMarker.logMarker(cONTENT_APPE, tc, this.h);
             ReactMarker.directionalLogMarker(cONTENT_APPE, this.c, this.w);
             if (e.u && this.getLcpDetector() != null) {
                a lcpDetector = this.getLcpDetector();
                Objects.requireNonNull(lcpDetector);
                if (!PatchProxy.applyVoid(null, lcpDetector, a.class, "3")) {
                   lcpDetector.f.b(a.c());
                }
             }
          }
       }
       return;
    }
    public void removeView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactRootView.class, "40")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.x.c(p0);
       this.setChildrenDrawingOrderEnabled(this.x.d());
       super.removeView(p0);
       return;
    }
    public void removeViewAt(int p0){
       if (PatchProxy.isSupport(ReactRootView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactRootView.class, "41")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.x.c(this.getChildAt(p0));
       this.setChildrenDrawingOrderEnabled(this.x.d());
       super.removeViewAt(p0);
       return;
    }
    public void requestChildFocus(View p0,View p1){
       l a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactRootView.class, "9")) {
          return;
       }
       if (this.b != null && (this.j == null || this.b.n() == null)) {
          a.x("ReactNative", "Unable to handle child focus changed event as the catalyst instance has not been attached");
          super.requestChildFocus(p0, p1);
          return;
       }else {
          ReactRootView tm = this.m;
          if (tm.a != p1.getId()) {
             a = tm.a;
             if (a != -1) {
                tm.a("blur", a);
             }
             tm.a = p1.getId();
             tm.a("focus", p1.getId());
          }
          super.requestChildFocus(p0, p1);
          return;
       }
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       if (PatchProxy.isSupport(ReactRootView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactRootView.class, "11")) {
          return;
       }
       if (this.getParent() != null) {
          this.getParent().requestDisallowInterceptTouchEvent(p0);
       }
       return;
    }
    public final void setAllowImmediateUIOperationExecution(boolean p0){
       if (PatchProxy.isSupport(ReactRootView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactRootView.class, "24")) {
          return;
       }
       ReactRootView tb = this.b;
       if (tb == null) {
          return;
       }
       ReactContext reactContext = tb.n();
       if (reactContext == null) {
          return;
       }
       UIManager uIManager = t0.a(reactContext, this.getUIManagerType());
       if (uIManager == null) {
          return;
       }
       uIManager.setAllowImmediateUIOperationExecution(p0);
       return;
    }
    public void setAppProperties(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactRootView.class, "29")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.d = p0;
       if (this.getRootViewTag()) {
          this.c();
       }
       return;
    }
    public void setAttachType(int p0){
       this.i = p0;
    }
    public void setEventListener(ReactRootView$d p0){
       this.g = p0;
    }
    public void setIsFabric(boolean p0){
       int i = (p0)? 2: 1;
       this.t = i;
       return;
    }
    public void setOnDetachListener(ReactRootView$c p0){
       this.y = p0;
    }
    public void setRootViewTag(int p0){
       this.h = p0;
    }
    public void setShouldLogContentAppeared(boolean p0){
       this.k = p0;
    }
    public void setUniqueId(int p0){
       this.w = p0;
    }
    public void updateDrawingOrder(){
       if (PatchProxy.applyVoid(null, this, ReactRootView.class, "44")) {
          return;
       }
       this.x.e();
       this.setChildrenDrawingOrderEnabled(this.x.d());
       this.invalidate();
       return;
    }
}
