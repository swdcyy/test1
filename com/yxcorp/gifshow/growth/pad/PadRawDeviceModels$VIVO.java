package com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$VIVO;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels;
import java.lang.String;
import nsd.u;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import trd.d1;

public final class PadRawDeviceModels$VIVO extends PadRawDeviceModels	// class@00146b
{

    public void PadRawDeviceModels$VIVO(String p0,int p1){
       super(p0, p1, null);
    }
    public Set getDeviceModels(){
       String[] obj = PatchProxy.apply(null, this, PadRawDeviceModels$VIVO.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"PA2170","PA2373"};
       return d1.u(obj);
    }
}
