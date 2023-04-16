package com.yxcorp.gifshow.gamecenter.krn.bridge.ZtGameKrnDownloadBridge$a;
import yka.c;
import com.yxcorp.gifshow.gamecenter.krn.bridge.ZtGameKrnDownloadBridge;
import java.lang.Object;
import yka.b;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContext;

public class ZtGameKrnDownloadBridge$a implements c	// class@0012b2
{
    public final ZtGameKrnDownloadBridge a;

    public void ZtGameKrnDownloadBridge$a(ZtGameKrnDownloadBridge p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return b.b(this);
    }
    public boolean b(){
       return false;
    }
    public void c(GameCenterDownloadParams$DownloadInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ZtGameKrnDownloadBridge$a.class, "1")) {
          return;
       }
       ReactApplicationContext reactApplica = this.a.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putString("downloadInfo", this.a.convertBeanToJson(p0));
          reactApplica.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("updateDownloadProgress", writableMap);
       }
       return;
    }
}
