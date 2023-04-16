package com.yxcorp.gifshow.gamecenter.krn.base.ZtGameKrnBaseBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Callback;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;

public abstract class ZtGameKrnBaseBridge extends KrnBridge	// class@0012b0
{

    public void ZtGameKrnBaseBridge(ReactApplicationContext p0){
       super(p0);
    }
    public void errorCallbackToJS(Callback p0,int p1,String p2){
       if (PatchProxy.isSupport(ZtGameKrnBaseBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ZtGameKrnBaseBridge.class, "1")) {
          return;
       }
       if (this.needCancelInvoke(p0)) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putInt("code", p1);
       writableMap.putString("message", p2);
       Object[] objArray = new Object[]{writableMap};
       p0.invoke(objArray);
       return;
    }
    public final boolean needCancelInvoke(Callback p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ZtGameKrnBaseBridge.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getCurrentActivity() == null || this.getCurrentActivity().isFinishing()) {
          return true;
       }
       if (p0 == null) {
          return true;
       }
       return false;
    }
    public void successCallbackToJS(Callback p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ZtGameKrnBaseBridge.class, "2")) {
          return;
       }
       if (this.needCancelInvoke(p0)) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putInt("code", 1);
       if (p1 != null) {
          Object[] objArray = new Object[]{writableMap,this.convertObjToNativeMap(p1)};
          p0.invoke(objArray);
       }else {
          p1 = new Object[]{writableMap};
          p0.invoke(p1);
       }
       return;
    }
}
