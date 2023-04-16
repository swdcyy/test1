package com.yxcorp.gifshow.camerasdk.recorder.DeviceStatusCollector$1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.j0;
import com.yxcorp.gifshow.camerasdk.recorder.DeviceStatusCollector;

public class DeviceStatusCollector$1 extends BroadcastReceiver	// class@001040
{

    public void DeviceStatusCollector$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DeviceStatusCollector$1.class, "1")) {
          return;
       }
       int i = 0;
       DeviceStatusCollector.b = j0.b(p1, "temperature", i);
       DeviceStatusCollector.a = j0.b(p1, "level", i);
       int i1 = j0.b(p1, "status", -1);
       if (i1 == 2 || i1 == 5) {
          i = true;
       }
       DeviceStatusCollector.c = i;
       return;
    }
}
