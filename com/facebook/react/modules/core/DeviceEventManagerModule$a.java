package com.facebook.react.modules.core.DeviceEventManagerModule$a;
import java.lang.Runnable;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import je.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.UiThreadUtil;

public class DeviceEventManagerModule$a implements Runnable	// class@00128b
{
    public final a b;
    public final DeviceEventManagerModule c;

    public void DeviceEventManagerModule$a(DeviceEventManagerModule p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, DeviceEventManagerModule$a.class, "1")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.b.X0();
       return;
    }
}
