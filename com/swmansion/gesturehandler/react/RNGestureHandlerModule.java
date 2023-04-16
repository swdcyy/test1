package com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$a;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$d;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$f;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$j;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$e;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$g;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$h;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$i;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$c;
import gn8.e;
import gn8.c;
import java.util.ArrayList;
import fn8.b;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;
import com.facebook.react.bridge.ReadableType;
import ze.p;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import gn8.g;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import java.util.List;
import android.view.ViewGroup;
import com.facebook.react.ReactRootView;
import java.util.Map;
import java.lang.Integer;
import vd.d;
import gn8.f;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import android.util.SparseArray;
import com.swmansion.gesturehandler.react.RNGestureHandlerEnabledRootView;
import java.lang.IllegalStateException;
import com.facebook.react.bridge.BaseJavaModule;
import df.c;
import gn8.i;
import z1.g;
import android.view.View;
import df.b;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import gn8.b;
import android.view.MotionEvent;
import gn8.a;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$b;
import ze.q0;

public class RNGestureHandlerModule extends ReactContextBaseJavaModule	// class@000c8d
{
    public List mEnqueuedRootViewInit;
    public i mEventListener;
    public RNGestureHandlerModule$d[] mHandlerFactories;
    public c mInteractionManager;
    public final e mRegistry;
    public List mRoots;

    public void RNGestureHandlerModule(ReactApplicationContext p0){
       super(p0);
       this.mEventListener = new RNGestureHandlerModule$a(this);
       RNGestureHandlerModule$d[] uodArray = new RNGestureHandlerModule$d[]{new RNGestureHandlerModule$f(null),new RNGestureHandlerModule$j(null),new RNGestureHandlerModule$e(null),new RNGestureHandlerModule$g(null),new RNGestureHandlerModule$h(null),new RNGestureHandlerModule$i(null),new RNGestureHandlerModule$c(null)};
       this.mHandlerFactories = uodArray;
       this.mRegistry = new e();
       this.mInteractionManager = new c();
       this.mRoots = new ArrayList();
       this.mEnqueuedRootViewInit = new ArrayList();
    }
    public static void handleHitSlopProperty(b p0,ReadableMap p1){
       float f;
       float f1;
       float f2;
       float f3;
       float f4;
       String str = "hitSlop";
       if (p1.getType(str) == ReadableType.Number) {
          f = p.b(p1.getDouble(str));
          p0.u(f, f, f, f, Float.NaN, Float.NaN);
       }else {
          p1 = p1.getMap(str);
          str = "horizontal";
          if (p1.hasKey(str)) {
             f1 = p.b(p1.getDouble(str));
             f2 = f1;
          }else {
             f1 = Float.NaN;
             f2 = Float.NaN;
          }
          String str1 = "vertical";
          if (p1.hasKey(str1)) {
             f3 = p.b(p1.getDouble(str1));
             f4 = f3;
          }else {
             f3 = Float.NaN;
             f4 = Float.NaN;
          }
          String str2 = "left";
          if (p1.hasKey(str2)) {
             f1 = p.b(p1.getDouble(str2));
          }
          f = f1;
          str = "top";
          if (p1.hasKey(str)) {
             f3 = p.b(p1.getDouble(str));
          }
          float f5 = f3;
          str = "right";
          if (p1.hasKey(str)) {
             f2 = p.b(p1.getDouble(str));
          }
          float f6 = f2;
          str = "bottom";
          if (p1.hasKey(str)) {
             f4 = p.b(p1.getDouble(str));
          }
          float f7 = f4;
          str = "width";
          float f8 = (p1.hasKey(str))? p.b(p1.getDouble(str)): Float.NaN;
          str = "height";
          float f9 = (p1.hasKey(str))? p.b(p1.getDouble(str)): Float.NaN;
          p0.u(f, f5, f6, f7, f8, f9);
       }
       return;
    }
    public void attachGestureHandler(int p0,int p1){
       this.tryInitializeHandlerForReactRootView(p1);
       if (this.mRegistry.b(p0, p1)) {
          return;
       }
       throw new JSApplicationIllegalArgumentException("Handler with tag "+p0+" does not exists");
    }
    public void createGestureHandler(String p0,int p1,ReadableMap p2){
       object oobject;
       int i = 0;
       while (true) {
          RNGestureHandlerModule tmHandlerFac = this.mHandlerFactories;
          if (i >= tmHandlerFac.length) {
             throw new JSApplicationIllegalArgumentException("Invalid handler name "+p0);
          }
          oobject = tmHandlerFac[i];
          if ((oobject.d()).equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       b uob = oobject.c(this.getReactApplicationContext());
       uob.w(p1);
       uob.s = this.mEventListener;
       this.mRegistry.e(uob);
       this.mInteractionManager.e(uob, p2);
       oobject.b(uob, p2);
       return;
    }
    public void dropGestureHandler(int p0){
       this.mInteractionManager.g(p0);
       this.mRegistry.d(p0);
    }
    public final RNGestureHandlerModule$d findFactoryForHandler(b p0){
       object oobject;
       int i = 0;
       while (true) {
          RNGestureHandlerModule tmHandlerFac = this.mHandlerFactories;
          if (i >= tmHandlerFac.length) {
             return null;
          }
          oobject = tmHandlerFac[i];
          if (oobject.e().equals(p0.getClass())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public final g findRootHelperForViewAncestor(int p0){
       g og;
       p0 = this.getReactApplicationContext().getNativeModule(UIManagerModule.class).resolveRootTagFromReactTag(p0);
       if (p0 < 1) {
          return null;
       }
       RNGestureHandlerModule tmRoots = this.mRoots;
       _monitor_enter(tmRoots);
       int i = 0;
       while (true) {
          if (i < this.mRoots.size()) {
             og = this.mRoots.get(i);
             ViewGroup viewGroup = og.b();
             if (viewGroup instanceof ReactRootView && viewGroup.getRootViewTag() == p0) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             _monitor_exit(tmRoots);
             return null;
          }
       }
       _monitor_exit(tmRoots);
       return og;
    }
    public Map getConstants(){
       Integer integer = Integer.valueOf(2);
       Integer integer1 = Integer.valueOf(4);
       Integer integer2 = Integer.valueOf(1);
       return d.e("State", d.i("UNDETERMINED", Integer.valueOf(0), "BEGAN", integer, "ACTIVE", integer1, "CANCELLED", Integer.valueOf(3), "FAILED", integer2, "END", Integer.valueOf(5)), "Direction", d.g("RIGHT", integer2, "LEFT", integer, "UP", integer1, "DOWN", Integer.valueOf(8)));
    }
    public String getName(){
       return "RNGestureHandlerModule";
    }
    public e getRegistry(){
       return this.mRegistry;
    }
    public void handleClearJSResponder(){
    }
    public void handleSetJSResponder(int p0,boolean p1){
       if (this.mRegistry != null) {
          g og = this.findRootHelperForViewAncestor(p0);
          if (og != null && p1) {
             UiThreadUtil.runOnUiThread(new f(og));
          }
       }
       return;
    }
    public void onCatalystInstanceDestroy(){
       RNGestureHandlerModule tmRegistry = this.mRegistry;
       _monitor_enter(tmRegistry);
       tmRegistry.a.clear();
       tmRegistry.b.clear();
       tmRegistry.c.clear();
       _monitor_exit(tmRegistry);
       tmRegistry = this.mInteractionManager;
       tmRegistry.a.clear();
       tmRegistry.b.clear();
       RNGestureHandlerModule tmRoots = this.mRoots;
       _monitor_enter(tmRoots);
       while (true) {
          if (!this.mRoots.isEmpty()) {
             int i = this.mRoots.size();
             g og = this.mRoots.get(0);
             ViewGroup viewGroup = og.b();
             if (viewGroup instanceof RNGestureHandlerEnabledRootView) {
                RNGestureHandlerEnabledRootView j = viewGroup.J;
                if (j != null) {
                   j.e();
                   viewGroup.J = null;
                }
             }else {
                og.e();
             }
             if (this.mRoots.size() < i) {
             }else {
                break ;
             }
          }else {
             _monitor_exit(tmRoots);
             super.onCatalystInstanceDestroy();
             return;
          }
       }
       throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
    }
    public void onStateChange(b p0,int p1,int p2){
       if (p0.l() < 0) {
          return;
       }
       RNGestureHandlerModule$d uod = this.findFactoryForHandler(p0);
       c eventDispatc = this.getReactApplicationContext().getNativeModule(UIManagerModule.class).getEventDispatcher();
       i oi = i.g.q();
       if (oi == null) {
          oi = new i();
       }
       oi.h(p0.m().getId());
       WritableMap writableMap = Arguments.createMap();
       oi.f = writableMap;
       if (uod != null) {
          uod.a(p0, writableMap);
       }
       oi.f.putInt("handlerTag", p0.l());
       oi.f.putInt("state", p1);
       oi.f.putInt("oldState", p2);
       eventDispatc.c(oi);
       return;
    }
    public void onTouchEvent(b p0,MotionEvent p1){
       if (p0.l() < 0) {
          return;
       }
       if (p0.k() == 4) {
          RNGestureHandlerModule$d uod = this.findFactoryForHandler(p0);
          c eventDispatc = this.getReactApplicationContext().getNativeModule(UIManagerModule.class).getEventDispatcher();
          a uoa = a.h.q();
          if (uoa == null) {
             uoa = new a();
          }
          uoa.h(p0.m().getId());
          WritableMap writableMap = Arguments.createMap();
          uoa.f = writableMap;
          if (uod != null) {
             uod.a(p0, writableMap);
          }
          uoa.f.putInt("handlerTag", p0.l());
          uoa.f.putInt("state", p0.k());
          uoa.g = p0.k;
          eventDispatc.c(uoa);
       }
       return;
    }
    public void registerRootHelper(g p0){
       RNGestureHandlerModule tmRoots = this.mRoots;
       _monitor_enter(tmRoots);
       if (this.mRoots.contains(p0)) {
          throw new IllegalStateException("Root helper"+p0+" already registered");
       }
       this.mRoots.add(p0);
       _monitor_exit(tmRoots);
       return;
    }
    public final void tryInitializeHandlerForReactRootView(int p0){
       UIManagerModule nativeModule = this.getReactApplicationContext().getNativeModule(UIManagerModule.class);
       int i = nativeModule.resolveRootTagFromReactTag(p0);
       if (i < 1) {
          throw new JSApplicationIllegalArgumentException("Could find root view for a given ancestor with tag "+p0);
       }
       RNGestureHandlerModule tmRoots = this.mRoots;
       _monitor_enter(tmRoots);
       p0 = 0;
       while (true) {
          if (p0 < this.mRoots.size()) {
             ViewGroup viewGroup = this.mRoots.get(p0).b();
             if (viewGroup instanceof ReactRootView && viewGroup.getRootViewTag() == i) {
                break ;
             }else {
                p0++;
             }
          }else {
             _monitor_exit(tmRoots);
             RNGestureHandlerModule tmEnqueuedRo = this.mEnqueuedRootViewInit;
             _monitor_enter(tmEnqueuedRo);
             if (this.mEnqueuedRootViewInit.contains(Integer.valueOf(i))) {
                _monitor_exit(tmEnqueuedRo);
                return;
             }else {
                this.mEnqueuedRootViewInit.add(Integer.valueOf(i));
                _monitor_exit(tmEnqueuedRo);
                nativeModule.addUIBlock(new RNGestureHandlerModule$b(this, i));
                return;
             }
          }
       }
       _monitor_exit(tmRoots);
       return;
    }
    public void unregisterRootHelper(g p0){
       RNGestureHandlerModule tmRoots = this.mRoots;
       _monitor_enter(tmRoots);
       this.mRoots.remove(p0);
       _monitor_exit(tmRoots);
    }
    public void updateGestureHandler(int p0,ReadableMap p1){
       RNGestureHandlerModule tmRegistry = this.mRegistry;
       _monitor_enter(tmRegistry);
       b uob = tmRegistry.a.get(p0);
       _monitor_exit(tmRegistry);
       if (uob != null) {
          RNGestureHandlerModule$d uod = this.findFactoryForHandler(uob);
          if (uod != null) {
             this.mInteractionManager.g(p0);
             this.mInteractionManager.e(uob, p1);
             uod.b(uob, p1);
          }
       }
       return;
    }
}
