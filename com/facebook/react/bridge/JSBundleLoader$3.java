package com.facebook.react.bridge.JSBundleLoader$3;
import com.facebook.react.bridge.JSBundleLoader;
import java.lang.String;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JSBundleLoader$3 extends JSBundleLoader	// class@0011d0
{
    public final String val$assetUrl;
    public final String val$fileName;
    public final boolean val$loadSynchronously;

    public void JSBundleLoader$3(String p0,String p1,boolean p2){
       this.val$fileName = p0;
       this.val$assetUrl = p1;
       this.val$loadSynchronously = p2;
       super();
    }
    public String loadScript(JSBundleLoaderDelegate p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JSBundleLoader$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.loadScriptFromFile(this.val$fileName, this.val$assetUrl, this.val$loadSynchronously);
       return this.val$fileName;
    }
}
