package com.facebook.react.bridge.CatalystInstanceImpl$PendingJSCall;
import java.lang.String;
import com.facebook.react.bridge.NativeArray;
import java.lang.Object;
import com.facebook.react.bridge.CatalystInstanceImpl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.WritableNativeArray;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class CatalystInstanceImpl$PendingJSCall	// class@0011b2
{
    public NativeArray mArguments;
    public String mMethod;
    public String mModule;

    public void CatalystInstanceImpl$PendingJSCall(String p0,String p1,NativeArray p2){
       super();
       this.mModule = p0;
       this.mMethod = p1;
       this.mArguments = p2;
    }
    public void call(CatalystInstanceImpl p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl$PendingJSCall.class, "1")) {
          return;
       }
       CatalystInstanceImpl$PendingJSCall tmArguments = this.mArguments;
       if (tmArguments == null) {
          tmArguments = new WritableNativeArray();
       }
       p0.jniCallJSFunction(this.mModule, this.mMethod, tmArguments);
       return;
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, CatalystInstanceImpl$PendingJSCall.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mModule+"."+this.mMethod+"\(";
       CatalystInstanceImpl$PendingJSCall tmArguments = this.mArguments;
       String str = (tmArguments == null)? "": tmArguments.toString();
       return obj+str+"\)";
    }
}
