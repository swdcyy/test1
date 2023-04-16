package com.facebook.react.ReactRootView$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.facebook.react.ReactRootView;
import java.lang.Object;
import android.util.DisplayMetrics;
import android.content.Context;
import android.widget.FrameLayout;
import ze.c;
import android.graphics.Rect;
import ze.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.facebook.react.bridge.WritableMap;
import java.lang.Double;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Integer;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.a;
import cb.a;
import android.view.View;
import android.view.WindowManager;
import android.view.Display;
import java.lang.StringBuilder;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.bridge.NativeModule;
import android.view.ViewParent;
import android.view.ViewGroup;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;

public class ReactRootView$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@00116b
{
    public final Rect b;
    public final int c;
    public int d;
    public int e;
    public DisplayMetrics f;
    public DisplayMetrics g;
    public Rect h;
    public final ReactRootView i;

    public void ReactRootView$b(ReactRootView p0){
       this.i = p0;
       super();
       this.d = 0;
       this.e = 0;
       this.f = new DisplayMetrics();
       this.g = new DisplayMetrics();
       c.g(p0.getContext().getApplicationContext());
       this.b = new Rect();
       this.c = (int)p.c(60.00f);
    }
    public final boolean a(DisplayMetrics p0,DisplayMetrics p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ReactRootView$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.equals(p1);
    }
    public final WritableMap b(double p0,double p1,double p2,double p3){
       WritableMap obj;
       if (PatchProxy.isSupport(ReactRootView$b.class)) {
          obj = PatchProxy.applyFourRefs(Double.valueOf(p0), Double.valueOf(p1), Double.valueOf(p2), Double.valueOf(p3), this, ReactRootView$b.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = Arguments.createMap();
       WritableMap writableMap = Arguments.createMap();
       writableMap.putDouble("height", p3);
       writableMap.putDouble("screenX", p1);
       writableMap.putDouble("width", p2);
       writableMap.putDouble("screenY", p0);
       obj.putMap("endCoordinates", writableMap);
       obj.putString("easing", "keyboard");
       obj.putDouble("duration", 0);
       return obj;
    }
    public final void c(int p0){
       String str;
       double d;
       if (PatchProxy.isSupport(ReactRootView$b.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactRootView$b.class, "7")) {
          return;
       }
       boolean b = false;
       int i = 1;
       if (p0) {
          if (p0 != i) {
             if (p0 != 2) {
                if (p0 != 3) {
                   return;
                }else {
                   str = "landscape-secondary";
                }
             }else {
                d = 180.00f;
                str = "portrait-secondary";
             }
          }else {
             d = -90.00f;
             str = "landscape-primary";
          }
          b = true;
       }else {
          d = 0;
          str = "portrait-primary";
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("name", str);
       writableMap.putDouble("rotationDegrees", 90.00f);
       writableMap.putBoolean("isLandscape", b);
       this.i.k("namedOrientationDidChange", writableMap);
       return;
    }
    public void onGlobalLayout(){
       ViewParent parent;
       Rect rect;
       ReactContext reactContext;
       WritableMap writableMap;
       DeviceInfoModule uDeviceInfoM;
       int rotation;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReactRootView$b.class, "1")) {
          return;
       }
       ReactRootView$b ti = this.i;
       if (ti.b == null || (ti.j != null && this.i.b.n() != null)) {
          if (!PatchProxy.applyVoid(objArray, this, ReactRootView$b.class, "2")) {
             ti = this.i;
             if (ti.D != null) {
                a.k("ReactRootView", "enable custom keyboard listener");
             }else {
                ti.getDecorView().getWindowVisibleDisplayFrame(this.b);
                ReactRootView$b tb = this.b;
                Rect bottom = tb.bottom;
                rotation = c.e().heightPixels - bottom;
                ReactRootView$b td = this.d;
                int i = 1;
                double d = 0;
                int i1 = (td != rotation && rotation > this.c)? 1: 0;
                if (i1) {
                   this.d = rotation;
                   this.i.k("keyboardDidShow", this.b((double)p.a((float)bottom), (double)p.a((float)this.b.left), (double)p.a((float)this.b.width()), (double)p.a((float)this.d)));
                }else if(td != null && rotation <= this.c){
                   i = 0;
                }
                if (i) {
                   this.d = d;
                   this.i.k("keyboardDidHide", this.b((double)p.a((float)tb.height()), 0, (double)p.a((float)this.b.width()), 0));
                }
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, ReactRootView$b.class, "3")) {
             try{
                rotation = this.i.getContext().getSystemService("window").getDefaultDisplay().getRotation();
                if (this.e != rotation) {
                   this.e = rotation;
                   this.c(rotation);
                }
             }catch(java.lang.RuntimeException e0){
                a.x("ReactNative", "checkForDeviceOrientationChanges ex:"+e0);
             }
          }
       }
    label_0213 :
       return;
    }
}
