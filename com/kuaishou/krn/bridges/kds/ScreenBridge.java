package com.kuaishou.krn.bridges.kds.ScreenBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.kuaishou.krn.bridges.kds.ScreenBridge$a;
import nsd.u;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import ej0.a;
import android.view.View;
import android.content.Context;
import com.yxcorp.utility.n;
import java.util.Map;
import com.kuaishou.krn.bridges.model.KrnDeviceInfo;
import bj0.d;
import kotlin.Pair;
import java.lang.Integer;
import qrd.r0;
import trd.t0;
import ik0.m;
import com.kuaishou.krn.delegate.KrnDelegate;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import android.widget.FrameLayout;
import ze.p;

public final class ScreenBridge extends KrnBridge	// class@00081e
{
    public static final ScreenBridge$a Companion;

    static {
       ScreenBridge.Companion = new ScreenBridge$a(null);
    }
    public void ScreenBridge(ReactApplicationContext p0){
       a.p(p0, "reactContext");
       super(p0);
    }
    public final int getAvailHeight(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Activity obj = PatchProxy.apply(objArray, this, ScreenBridge.class, "3");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.getCurrentActivity();
       if (obj != null) {
          Object obj1 = PatchProxy.applyOneRefs(obj, objArray, a.class, "4");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
             a.p(obj, "activity");
             View view = a.a(obj);
             i = (view != null)? view.getHeight(): 0;
          }
       }else {
          i = n.u(this.getReactApplicationContext());
       }
       return i;
    }
    public final int getAvailWidth(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Activity obj = PatchProxy.apply(objArray, this, ScreenBridge.class, "2");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.getCurrentActivity();
       if (obj != null) {
          Object obj1 = PatchProxy.applyOneRefs(obj, objArray, a.class, "3");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
             a.p(obj, "activity");
             View view = a.a(obj);
             i = (view != null)? view.getWidth(): 0;
          }
       }else {
          i = n.y(this.getReactApplicationContext());
       }
       return i;
    }
    public Map getConstants(){
       KrnDeviceInfo obj = PatchProxy.apply(null, this, ScreenBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a();
       Pair[] pairArray = new Pair[]{r0.a("width", Integer.valueOf(obj.mScreenWidth)),r0.a("height", Integer.valueOf(obj.mScreenHeight))};
       return t0.j0(pairArray);
    }
    public String getName(){
       return "KdsScreen";
    }
    public final float getRootViewHeight(int p0){
       ScreenBridge screenBridge = ScreenBridge.class;
       if (PatchProxy.isSupport(screenBridge)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, screenBridge, "4");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       m rNView = this.getRNView(p0);
       if (rNView != null) {
          KrnDelegate krnDelegate = rNView.getKrnDelegate();
          if (krnDelegate != null) {
             KrnReactRootView krnReactRoot = krnDelegate.g();
             if (krnReactRoot != null) {
                return p.a((float)krnReactRoot.getHeight());
             }
          }
       }
       return 0;
    }
    public final float getRootViewWidth(int p0){
       ScreenBridge screenBridge = ScreenBridge.class;
       if (PatchProxy.isSupport(screenBridge)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, screenBridge, "5");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       m rNView = this.getRNView(p0);
       if (rNView != null) {
          KrnDelegate krnDelegate = rNView.getKrnDelegate();
          if (krnDelegate != null) {
             KrnReactRootView krnReactRoot = krnDelegate.g();
             if (krnReactRoot != null) {
                return p.a((float)krnReactRoot.getWidth());
             }
          }
       }
       return 0;
    }
}
