package com.kwai.component.misc.collector.DeviceInfoInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.d;
import wkd.b;
import qc5.a;
import android.app.Application;
import o56.a;
import android.content.Context;

public class DeviceInfoInitModule extends TTIInitModule	// class@0009c5
{

    public void DeviceInfoInitModule(){
       super();
    }
    public int f0(){
       return 9;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DeviceInfoInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, DeviceInfoInitModule.class, "2") && d.i) {
          b.a(-515139006).d(a.b());
       }
       return;
    }
}
