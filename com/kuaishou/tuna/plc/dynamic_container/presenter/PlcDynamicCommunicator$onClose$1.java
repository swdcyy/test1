package com.kuaishou.tuna.plc.dynamic_container.presenter.PlcDynamicCommunicator$onClose$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import lnc.i3;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class PlcDynamicCommunicator$onClose$1 extends Lambda implements a	// class@000fef
{
    public final i3 $jsonBuilder;

    public void PlcDynamicCommunicator$onClose$1(i3 p0){
       this.$jsonBuilder = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicCommunicator$onClose$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "dispatch onClose for biz container: "+this.$jsonBuilder;
    }
}
