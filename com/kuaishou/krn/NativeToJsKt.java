package com.kuaishou.krn.NativeToJsKt;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Float;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Long;
import java.lang.Byte;
import java.lang.Short;
import java.lang.Number;
import com.facebook.react.bridge.Arguments;
import java.util.Map;
import android.os.Bundle;
import com.kuaishou.krn.c;
import kotlin.jvm.internal.a;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import ek0.d;
import android.view.View;
import msd.l;
import android.view.ViewGroup;
import com.facebook.react.ReactRootView;
import com.facebook.react.a;
import com.kuaishou.krn.NativeToJsKt$notifyEventToJs$reactRootView$1;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import android.os.Build$VERSION;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.JavaScriptModule;

public final class NativeToJsKt	// class@0007aa
{

    public static final Object a(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NativeToJsKt nativeToJsKt = NativeToJsKt.class;
       Object obj = null;
       Class[] obj1 = PatchProxy.applyOneRefs(p0, obj, nativeToJsKt, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new Class[]{Boolean.TYPE,Integer.TYPE,Double.TYPE,Float.TYPE,String.class,WritableNativeMap.class,WritableNativeArray.class};
       if (CollectionsKt__CollectionsKt.L(obj1).contains(p0.getClass())) {
          return p0;
       }
       Double uDouble = PatchProxy.applyOneRefs(p0, obj, nativeToJsKt, "3");
       if (uDouble == patchProxyRe) {
          if (p0 instanceof Float || (p0 instanceof Long || (p0 instanceof Byte || p0 instanceof Short))) {
             p0 = Double.valueOf(p0.doubleValue());
          }else if(p0 instanceof Object[]){
             p0 = Arguments.makeNativeArray(p0);
          }else if(p0 instanceof List){
             p0 = Arguments.makeNativeArray(p0);
          }else if(p0 instanceof Map){
             p0 = Arguments.makeNativeMap(p0);
          }else if(p0 instanceof Bundle){
             p0 = Arguments.makeNativeMap(p0);
          }else if(p0 instanceof String){
             c uoc = c.b();
             a.o(uoc, "KrnManager.get\(\)");
             String str = uoc.e().q(p0);
             d.e("convert "+p0+" to json str "+str);
             p0 = str;
          }
          uDouble = p0;
       }
       return uDouble;
    }
    public static final View b(View p0,l p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, NativeToJsKt.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       if (p1.invoke(p0).booleanValue()) {
          return p0;
       }
       if (p0 instanceof ViewGroup) {
          int i = 0;
          int childCount = p0.getChildCount();
          while (i < childCount) {
             View view = NativeToJsKt.b(p0.getChildAt(i), p1);
             if (view != null) {
                return view;
             }
             i = i + 1;
          }
       }
       return null;
    }
    public static final void c(View p0,String p1,Object p2){
       a reactInstanc;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, NativeToJsKt.class, "5")) {
          return;
       }
       a.p(p1, "eventName");
       if (p0 instanceof ReactRootView) {
          reactInstanc = p0.getReactInstanceManager();
          if (reactInstanc != null) {
             NativeToJsKt.d(reactInstanc, p1, p2);
          }
       }else {
          p0 = NativeToJsKt.b(p0, NativeToJsKt$notifyEventToJs$reactRootView$1.INSTANCE);
          if (!p0 instanceof ReactRootView) {
             p0 = null;
          }
          if (p0 != null) {
             reactInstanc = p0.getReactInstanceManager();
             if (reactInstanc != null) {
                NativeToJsKt.d(reactInstanc, p1, p2);
             }
          }
       }
    label_003c :
       return;
    }
    public static final void d(a p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, NativeToJsKt.class, "4")) {
          return;
       }
       a.p(p1, "eventName");
       ReactContext reactContext = p0.n();
       if (reactContext != null) {
          NativeToJsKt.e(reactContext, p1, p2);
       }
       return;
    }
    public static final void e(ReactContext p0,String p1,Object p2){
       DeviceEventManagerModule$RCTDeviceEventEmitter rCTDeviceEve = DeviceEventManagerModule$RCTDeviceEventEmitter.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, NativeToJsKt.class, "1")) {
          return;
       }
       a.p(p0, "$this$notifyEventToJs");
       a.p(p1, "eventName");
       if (!p0.hasActiveCatalystInstance()) {
          return;
       }
       if (23 == Build$VERSION.SDK_INT) {
          Object[] objArray = new Object[]{p1,NativeToJsKt.a(p2)};
          p0.getCatalystInstance().callFunction(rCTDeviceEve.getSimpleName(), "emit", Arguments.fromJavaArgs(objArray));
       }else {
          p0.getJSModule(rCTDeviceEve).emit(p1, NativeToJsKt.a(p2));
       }
       return;
    }
}
