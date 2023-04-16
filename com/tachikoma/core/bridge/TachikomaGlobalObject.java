package com.tachikoma.core.bridge.TachikomaGlobalObject;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import iq8.q;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.content.pm.ApplicationInfo;
import java.lang.CharSequence;
import java.lang.Exception;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;
import android.util.DisplayMetrics;
import iq8.n;
import java.lang.Double;
import java.util.Map;
import tx4.w;
import java.lang.Integer;
import com.tkruntime.v8.V8ObjectProxy;
import com.tachikoma.core.bridge.TachikomaGlobalObject$a;
import com.tachikoma.core.bridge.c;
import com.tkruntime.v8.V8;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8Value;
import gx4.c;
import com.tachikoma.core.component.e;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.JsValueRef;
import android.text.TextUtils;
import com.tachikoma.core.debug.c;
import com.google.gson.Gson;
import com.tachikoma.core.manager.bundle.inner.InnerBundleInfo;
import java.lang.reflect.Method;
import java.lang.Boolean;
import no8.e;
import oo8.t;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import no8.a;
import java.lang.StringBuilder;
import tx4.y;
import op8.a;
import android.view.View;
import android.graphics.Bitmap$Config;
import iq8.b;
import android.graphics.Bitmap;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import com.tachikoma.core.bridge.TachikomaGlobalObject$b;
import java.lang.Runnable;
import iq8.o;

public class TachikomaGlobalObject extends TKBaseNativeModule	// class@000d3b
{
    public JsValueRef f;
    public final Map g;
    public V8ObjectProxy h;
    public float i;
    public static DisplayMetrics j;
    public static String sAppName;
    public static String sAppVersion;

    public void TachikomaGlobalObject(f p0){
       super(p0);
       this.f = null;
       this.g = new HashMap();
       this.i = 0xbf800000;
    }
    public static float getAppFontScale(){
       Resources obj = PatchProxy.apply(null, null, TachikomaGlobalObject.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = q.a().getResources();
       Configuration fontScale = (obj != null)? obj.getConfiguration().fontScale: 0x3f800000;
       return fontScale;
    }
    public static String getApplicationName(Context p0){
       ApplicationInfo obj = PatchProxy.applyOneRefs(p0, null, TachikomaGlobalObject.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = p0.getApplicationInfo();
          ApplicationInfo labelRes = obj.labelRes;
          String str = (labelRes == null)? obj.nonLocalizedLabel.toString(): p0.getString(labelRes);
          return str;
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          return obj.name;
       }
    }
    public static String getApplicationVersion(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TachikomaGlobalObject.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PackageInfo versionName = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0).versionName;
       return versionName;
    }
    public static void preLoad(){
       if (PatchProxy.applyVoid(null, null, TachikomaGlobalObject.class, "1")) {
          return;
       }
       if (TachikomaGlobalObject.sAppName == null) {
          TachikomaGlobalObject.sAppName = TachikomaGlobalObject.getApplicationName(q.a());
       }
       if (TachikomaGlobalObject.sAppVersion == null) {
          TachikomaGlobalObject.sAppVersion = TachikomaGlobalObject.getApplicationVersion(q.a());
       }
       n.c();
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, TachikomaGlobalObject.class, "15")) {
          return;
       }
       if (!this.i - 0xbf800000) {
          this.i = n.c().density;
       }
       return;
    }
    public double dp2Px(double p0){
       TachikomaGlobalObject tachikomaGlo = TachikomaGlobalObject.class;
       if (PatchProxy.isSupport(tachikomaGlo)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, tachikomaGlo, "4");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       this.d();
       return (double)(int)(((double)this.i * p0) + 0x3fe0000000000000);
    }
    public Map getBundleInfo(){
       HashMap obj = PatchProxy.apply(null, this, TachikomaGlobalObject.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       w ow = this.getTKJSContext().i();
       if (ow != null) {
          obj.put("bundleId", ow.b);
          obj.put("versionCode", Integer.valueOf(ow.d));
          obj.put("taskId", String.valueOf(ow.f));
       }
       return obj;
    }
    public V8ObjectProxy getEnv(){
       Object obj = PatchProxy.apply(null, this, TachikomaGlobalObject.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h == null) {
          this.h = new TachikomaGlobalObject$a(this, this.getJSContext().g(), "Tachikoma-env");
          if (this.getJsObj() != null) {
             this.getJsObj().add("env", this.h);
          }
       }
       return this.h;
    }
    public V8Object getRootView(V8Object p0){
       e obj = PatchProxy.applyOneRefs(p0, this, TachikomaGlobalObject.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e nativeModule = this.getNativeModule(p0);
       if (nativeModule == null) {
          return null;
       }
       obj = nativeModule.getParent();
       while (obj != null) {
          nativeModule = obj;
       }
       return nativeModule.getJsObj();
    }
    public V8Function getViewFactory(){
       Object[] objArray = null;
       TachikomaGlobalObject obj = PatchProxy.apply(objArray, this, TachikomaGlobalObject.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj != null) {
          objArray = obj.get();
       }
       return objArray;
    }
    public V8Function getViewFactory(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TachikomaGlobalObject.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       JsValueRef jsValueRef = this.g.get(p0);
       if (jsValueRef == null) {
          return null;
       }
       return jsValueRef.get();
    }
    public void hotReload(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TachikomaGlobalObject.class, "9")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, c.class, "18") && c.i != null) {
          Object[] objArray = new Object[]{new Gson().h(p0, InnerBundleInfo.class)};
          c.i.invoke(null, objArray);
       }
    label_003f :
       return;
    }
    public boolean isDark(){
       Object obj = PatchProxy.apply(null, this, TachikomaGlobalObject.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.b().a().a();
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TachikomaGlobalObject tachikomaGlo = TachikomaGlobalObject.class;
       if (PatchProxy.isSupport(tachikomaGlo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tachikomaGlo, "2")) {
          return;
       }
       super.onDestroy(p0, p1);
       this.g.clear();
       return;
    }
    public double px2Dp(double p0){
       TachikomaGlobalObject tachikomaGlo = TachikomaGlobalObject.class;
       if (PatchProxy.isSupport(tachikomaGlo)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, tachikomaGlo, "3");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       this.d();
       return (p0 / (double)this.i);
    }
    public void registerView(String p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TachikomaGlobalObject.class, "6")) {
          return;
       }
       if (a.c.booleanValue() && p1 != null) {
          p1.setFunctionName("registerView_"+p0);
       }
       JsValueRef jsValueRef = y.b(p1, this);
       if (this.g.containsKey(p0)) {
          y.c(this.g.remove(p0));
       }
       this.g.put(p0, jsValueRef);
       return;
    }
    public void registerViewFactory(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TachikomaGlobalObject.class, "8")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("registerViewFactory");
       }
       y.c(this.f);
       this.f = y.b(p0, this);
       return;
    }
    public void render(V8Object p0){
       this.getTKJSContext().k(p0);
       if (a.c.booleanValue()) {
          a.n().g(this.getTKJSContext().b().h(), "render", p0);
       }
       return;
    }
    public void rootViewToImage(V8Object p0,V8Function p1){
       Bitmap uBitmap;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TachikomaGlobalObject.class, "18")) {
          return;
       }
       e nativeModule = this.getNativeModule(p0);
       int i = 0;
       if (nativeModule == null || nativeModule.getView() == null) {
          Object[] objArray = new Object[i];
          p1.call(null, objArray);
          return;
       }else {
          JsValueRef jsValueRef = y.b(p1, this);
          View view = nativeModule.getView();
          int measuredWidt = view.getMeasuredWidth();
          int measuredHeig = view.getMeasuredHeight();
          Bitmap$Config aRGB_8888 = Bitmap$Config.ARGB_8888;
          if (PatchProxy.isSupport(b.class)) {
             uBitmap = PatchProxy.applyFourRefs(view, Integer.valueOf(measuredWidt), Integer.valueOf(measuredHeig), aRGB_8888, null, b.class, "6");
             if (uBitmap != PatchProxyResult.class) {
             label_008d :
                o.a(new TachikomaGlobalObject$b(this, uBitmap, jsValueRef));
                return;
             }
          }
          view.setDrawingCacheEnabled(true);
          if (measuredWidt <= 0 || measuredHeig <= 0) {
             view.measure(View$MeasureSpec.makeMeasureSpec(i, i), View$MeasureSpec.makeMeasureSpec(i, i));
          }else {
             view.measure(View$MeasureSpec.makeMeasureSpec(measuredWidt, 0x40000000), View$MeasureSpec.makeMeasureSpec(measuredHeig, 0x40000000));
          }
          Bitmap drawingCache = view.getDrawingCache();
          if (drawingCache == null) {
             drawingCache = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), aRGB_8888);
             view.draw(new Canvas(drawingCache));
          }
          uBitmap = drawingCache;
          goto label_008d ;
       }
    }
}
