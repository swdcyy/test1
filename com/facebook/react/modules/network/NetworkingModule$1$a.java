package com.facebook.react.modules.network.NetworkingModule$1$a;
import qe.f;
import com.facebook.react.modules.network.NetworkingModule$1;
import java.lang.Object;
import java.lang.System;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.String;
import com.facebook.react.modules.network.NetworkingModule;
import qe.j;
import java.lang.Integer;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;

public class NetworkingModule$1$a implements f	// class@0012c3
{
    public long a;
    public final NetworkingModule$1 b;

    public void NetworkingModule$1$a(NetworkingModule$1 p0){
       this.b = p0;
       super();
       this.a = System.nanoTime();
    }
    public void a(long p0,long p1,boolean p2){
       if (PatchProxy.isSupport(NetworkingModule$1$a.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Boolean.valueOf(p2), this, NetworkingModule$1$a.class, "1")) {
          return;
       }
       long l = System.nanoTime();
       if (!p2 && !NetworkingModule.shouldDispatch(l, this.a)) {
          return;
       }
       if ((this.b.a).equals("text")) {
          return;
       }
       NetworkingModule$1$a tb = this.b;
       NetworkingModule$1 b = tb.b;
       NetworkingModule$1 c = tb.c;
       if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidFourRefs(b, Integer.valueOf(c), Long.valueOf(p0), Long.valueOf(p1), null, j.class, "3")) {
          WritableArray writableArra = Arguments.createArray();
          writableArra.pushInt(c);
          writableArra.pushInt((int)p0);
          writableArra.pushInt((int)p1);
          if (b != null) {
             b.emit("didReceiveNetworkDataProgress", writableArra);
          }
       }
       this.a = l;
       return;
    }
}
