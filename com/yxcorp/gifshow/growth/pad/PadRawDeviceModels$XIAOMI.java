package com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$XIAOMI;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels;
import java.lang.String;
import nsd.u;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import trd.d1;

public final class PadRawDeviceModels$XIAOMI extends PadRawDeviceModels	// class@0011a0
{

    public void PadRawDeviceModels$XIAOMI(String p0,int p1){
       super(p0, p1, null);
    }
    public Set getDeviceModels(){
       String[] obj = PatchProxy.apply(null, this, PadRawDeviceModels$XIAOMI.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"MI PAD 4","MI PAD 4","MI PAD 4 PLUS","21051182C","22081281AC","22081283C","M2105K81C","M2105K81AC","21051181C"};
       return d1.u(obj);
    }
}
