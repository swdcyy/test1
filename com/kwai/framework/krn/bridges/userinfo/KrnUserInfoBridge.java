package com.kwai.framework.krn.bridges.userinfo.KrnUserInfoBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import n86.a;
import com.facebook.react.bridge.WritableMap;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableNativeMap;

public class KrnUserInfoBridge extends KrnBridge	// class@0015db
{

    public void KrnUserInfoBridge(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "KSUserInfo";
    }
    public void getUserInfo(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnUserInfoBridge.class, "1")) {
          return;
       }
       this.callbackToJS(p0, a.a());
       return;
    }
    public WritableMap getUserInfoSync(){
       Object obj = PatchProxy.apply(null, this, KrnUserInfoBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.convertObjToNativeMap(a.a());
    }
}
