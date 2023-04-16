package com.facebook.react.modules.network.NetworkingModule$b;
import qe.f;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.Object;
import java.lang.System;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.String;
import qe.j;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.facebook.base.tracing.TracingManager;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;

public class NetworkingModule$b implements f	// class@0012c6
{
    public long a;
    public final DeviceEventManagerModule$RCTDeviceEventEmitter b;
    public final int c;
    public final NetworkingModule d;

    public void NetworkingModule$b(NetworkingModule p0,DeviceEventManagerModule$RCTDeviceEventEmitter p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
       this.a = System.nanoTime();
    }
    public void a(long p0,long p1,boolean p2){
       if (PatchProxy.isSupport(NetworkingModule$b.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Boolean.valueOf(p2), this, NetworkingModule$b.class, "1")) {
          return;
       }
       long l = System.nanoTime();
       if (p2 || NetworkingModule.shouldDispatch(l, this.a)) {
          NetworkingModule$b tb = this.b;
          NetworkingModule$b tc = this.c;
          if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidFourRefs(tb, Integer.valueOf(tc), Long.valueOf(p0), Long.valueOf(p1), null, j.class, "1")) {
             TracingManager.a("sendRequest"+tc);
             WritableArray writableArra = Arguments.createArray();
             writableArra.pushInt(tc);
             writableArra.pushInt((int)p0);
             writableArra.pushInt((int)p1);
             if (tb != null) {
                tb.emit("didSendNetworkData", writableArra);
             }
          }
          this.a = l;
       }
       return;
    }
}
