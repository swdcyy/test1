package com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.CatalystInstance;
import java.util.Map;
import java.util.HashMap;
import od.a;

public class SourceCodeModule extends NativeSourceCodeSpec	// class@0012a7
{

    public void SourceCodeModule(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "SourceCode";
    }
    public String getSourceUrl(){
       Object obj = PatchProxy.apply(null, this, SourceCodeModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.getReactApplicationContext().hasCatalystInstance()) {
          return "";
       }
       return this.getReactApplicationContext().getCatalystInstance().getSourceFilePath();
    }
    public Map getTypedExportedConstants(){
       HashMap obj = PatchProxy.apply(null, this, SourceCodeModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       String sourceURL = this.getReactApplicationContext().getCatalystInstance().getSourceURL();
       a.d(sourceURL, "No source URL loaded, have you initialised the instance?");
       obj.put("scriptURL", sourceURL);
       return obj;
    }
}
