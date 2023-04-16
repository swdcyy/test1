package com.kuaishou.live.bridge.rn.LiveRnChannelHandler$a;
import o63.h;
import java.lang.String;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import kotlin.jvm.internal.a;
import o63.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;

public final class LiveRnChannelHandler$a implements h	// class@000e30
{
    public final String a;
    public final ReactContext b;

    public void LiveRnChannelHandler$a(String p0,ReactContext p1){
       a.p(p0, "channelName");
       a.p(p1, "reactContext");
       super();
       this.a = p0;
       this.b = p1;
    }
    public q a(){
       return q.c;
    }
    public void b(String p0){
       LiveRnChannelHandler$a uoa = LiveRnChannelHandler$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       LiveRnChannelHandler$a ta = this.a;
       if (!PatchProxy.applyVoidTwoRefs(ta, p0, this, uoa, "2")) {
          LiveJsBridgeLogTag rN = LiveJsBridgeLogTag.RN;
          b.Z(rN, "publish to "+ta+": "+p0);
          if (this.b.hasActiveCatalystInstance()) {
             this.b.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit(ta, p0);
          }else {
             b.Z(rN, this.b+" has been destroyed!");
          }
       }
       return;
    }
}
