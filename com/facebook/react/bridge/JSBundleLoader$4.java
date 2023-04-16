package com.facebook.react.bridge.JSBundleLoader$4;
import com.facebook.react.bridge.JSBundleLoader;
import java.lang.String;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JSBundleLoader$4 extends JSBundleLoader	// class@0011d1
{
    public final String val$assetUrl;
    public final String val$cacheKey;
    public final String val$fileName;
    public final boolean val$loadSynchronously;

    public void JSBundleLoader$4(String p0,String p1,boolean p2,String p3){
       this.val$fileName = p0;
       this.val$assetUrl = p1;
       this.val$loadSynchronously = p2;
       this.val$cacheKey = p3;
       super();
    }
    public String loadScript(JSBundleLoaderDelegate p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JSBundleLoader$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.loadScriptFromFile(this.val$fileName, this.val$assetUrl, this.val$loadSynchronously, this.val$cacheKey);
       return this.val$fileName;
    }
}
