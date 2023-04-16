package com.facebook.react.bridge.JSBundleLoader$5;
import com.facebook.react.bridge.JSBundleLoader;
import java.lang.String;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Exception;
import java.lang.Throwable;
import com.facebook.react.common.DebugServerException;

public final class JSBundleLoader$5 extends JSBundleLoader	// class@0011d2
{
    public final String val$cachedFileLocation;
    public final String val$sourceURL;

    public void JSBundleLoader$5(String p0,String p1){
       this.val$cachedFileLocation = p0;
       this.val$sourceURL = p1;
       super();
    }
    public String loadScript(JSBundleLoaderDelegate p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JSBundleLoader$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          p0.loadScriptFromFile(this.val$cachedFileLocation, this.val$sourceURL, false);
          return this.val$sourceURL;
       }catch(java.lang.Exception e4){
          throw DebugServerException.makeGeneric(this.val$sourceURL, e4.getMessage(), e4);
       }
    }
}
