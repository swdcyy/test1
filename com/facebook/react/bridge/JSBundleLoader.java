package com.facebook.react.bridge.JSBundleLoader;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.JSBundleLoader$1;
import com.facebook.react.bridge.JSBundleLoader$2;
import com.facebook.react.bridge.JSBundleLoader$5;
import com.facebook.react.bridge.JSBundleLoader$3;
import com.facebook.react.bridge.JSBundleLoader$4;
import com.facebook.react.bridge.JSBundleLoader$6;
import com.facebook.react.bridge.JSBundleLoaderDelegate;

public abstract class JSBundleLoader	// class@0011d4
{

    public void JSBundleLoader(){
       super();
    }
    public static JSBundleLoader createAssetLoader(Context p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(JSBundleLoader.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, JSBundleLoader.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JSBundleLoader$1(p0, p1, p2, p3);
    }
    public static JSBundleLoader createAssetLoaderWithCacheKey(Context p0,String p1,boolean p2,String p3){
       if (PatchProxy.isSupport(JSBundleLoader.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, JSBundleLoader.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JSBundleLoader$2(p0, p1, p2, p3);
    }
    public static JSBundleLoader createCachedBundleFromNetworkLoader(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, JSBundleLoader.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JSBundleLoader$5(p1, p0);
    }
    public static JSBundleLoader createFileLoader(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JSBundleLoader.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JSBundleLoader.createFileLoader(p0, p0, false);
    }
    public static JSBundleLoader createFileLoader(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(JSBundleLoader.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, JSBundleLoader.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JSBundleLoader$3(p0, p1, p2);
    }
    public static JSBundleLoader createFileLoader(String p0,String p1,boolean p2,String p3){
       if (PatchProxy.isSupport(JSBundleLoader.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, JSBundleLoader.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new JSBundleLoader$4(p0, p1, p2, p3);
    }
    public static JSBundleLoader createRemoteDebuggerBundleLoader(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, JSBundleLoader.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JSBundleLoader$6(p1, p0);
    }
    public abstract String loadScript(JSBundleLoaderDelegate p0);
    public boolean useCodeCache(String p0){
       return true;
    }
}
