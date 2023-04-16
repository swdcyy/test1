package com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$OPPO;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels;
import java.lang.String;
import nsd.u;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import trd.d1;

public final class PadRawDeviceModels$OPPO extends PadRawDeviceModels	// class@00119b
{

    public void PadRawDeviceModels$OPPO(String p0,int p1){
       super(p0, p1, null);
    }
    public Set getDeviceModels(){
       String[] obj = PatchProxy.apply(null, this, PadRawDeviceModels$OPPO.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"OPD2101","OPD2102","OPD2201"};
       return d1.u(obj);
    }
}
