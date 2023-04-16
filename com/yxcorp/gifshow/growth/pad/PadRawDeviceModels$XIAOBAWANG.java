package com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$XIAOBAWANG;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels;
import java.lang.String;
import nsd.u;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import trd.c1;

public final class PadRawDeviceModels$XIAOBAWANG extends PadRawDeviceModels	// class@00146c
{

    public void PadRawDeviceModels$XIAOBAWANG(String p0,int p1){
       super(p0, p1, null);
    }
    public Set getDeviceModels(){
       Object obj = PatchProxy.apply(null, this, PadRawDeviceModels$XIAOBAWANG.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c1.f("M80");
    }
}
