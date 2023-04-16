package com.facebook.react.views.modal.ReactModalHostView$DialogRootViewGroup;
import ze.h0;
import com.facebook.react.views.view.ReactViewGroup;
import android.content.Context;
import ze.h;
import android.view.ViewGroup;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactContext;
import java.lang.RuntimeException;
import java.lang.Exception;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.lang.Integer;
import android.view.MotionEvent;
import df.c;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import java.lang.Boolean;
import com.facebook.react.bridge.CatalystInstance;
import ze.m0;
import com.facebook.react.views.modal.ReactModalHostView$DialogRootViewGroup$a;
import java.lang.Runnable;
import com.facebook.react.bridge.WritableNativeMap;
import ze.p;
import com.facebook.react.bridge.WritableMap;

public class ReactModalHostView$DialogRootViewGroup extends ReactViewGroup implements h0	// class@0013cb
{
    public boolean b;
    public int c;
    public int d;
    public m0 e;
    public final h f;

    public void ReactModalHostView$DialogRootViewGroup(Context p0){
       super(p0);
       this.b = false;
       this.f = new h(this);
    }
    public void C(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactModalHostView$DialogRootViewGroup.class, "5")) {
          return;
       }
       this.getReactContext().handleException(new RuntimeException(p0));
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (PatchProxy.isSupport(ReactModalHostView$DialogRootViewGroup.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactModalHostView$DialogRootViewGroup.class, "4")) {
          return;
       }
       super.addView(p0, p1, p2);
       if (this.b != null) {
          this.i();
       }
       return;
    }
    public void f(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactModalHostView$DialogRootViewGroup.class, "10")) {
          return;
       }
       this.f.d(p0, this.getEventDispatcher());
       return;
    }
    public final c getEventDispatcher(){
       Object obj = PatchProxy.apply(null, this, ReactModalHostView$DialogRootViewGroup.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getReactContext().getNativeModule(UIManagerModule.class).getEventDispatcher();
    }
    public ReactContext getReactContext(){
       Object obj = PatchProxy.apply(null, this, ReactModalHostView$DialogRootViewGroup.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getContext();
    }
    public final boolean h(){
       Object obj = PatchProxy.apply(null, this, ReactModalHostView$DialogRootViewGroup.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getReactContext().hasCatalystInstance()) {
          return this.getReactContext().getCatalystInstance().getMultiReactRootViewDispatcherFilter();
       }
       return false;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, ReactModalHostView$DialogRootViewGroup.class, "2")) {
          return;
       }
       if (this.getChildCount() > 0) {
          this.b = false;
          int id = this.getChildAt(false).getId();
          ReactModalHostView$DialogRootViewGroup te = this.e;
          if (te != null) {
             this.j(te, this.c, this.d);
          }else {
             ReactContext reactContext = this.getReactContext();
             reactContext.runOnNativeModulesQueueThread(new ReactModalHostView$DialogRootViewGroup$a(this, reactContext, id));
          }
       }else {
          this.b = true;
       }
       return;
    }
    public void j(m0 p0,int p1,int p2){
       if (PatchProxy.isSupport(ReactModalHostView$DialogRootViewGroup.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ReactModalHostView$DialogRootViewGroup.class, "3")) {
          return;
       }
       this.e = p0;
       WritableNativeMap writableNati = new WritableNativeMap();
       writableNati.putDouble("screenWidth", (double)p.a((float)p1));
       writableNati.putDouble("screenHeight", (double)p.a((float)p2));
       p0.a(writableNati);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactModalHostView$DialogRootViewGroup.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.f.c(p0, this.getEventDispatcher(), this.h());
       return super.onInterceptTouchEvent(p0);
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ReactModalHostView$DialogRootViewGroup.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReactModalHostView$DialogRootViewGroup.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.c = p0;
       this.d = p1;
       this.i();
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactModalHostView$DialogRootViewGroup.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.f.c(p0, this.getEventDispatcher(), this.h());
       super.onTouchEvent(p0);
       return true;
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
    }
}
