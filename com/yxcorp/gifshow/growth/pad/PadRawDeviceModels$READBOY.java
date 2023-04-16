package com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$READBOY;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels;
import java.lang.String;
import nsd.u;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import trd.d1;

public final class PadRawDeviceModels$READBOY extends PadRawDeviceModels	// class@001469
{

    public void PadRawDeviceModels$READBOY(String p0,int p1){
       super(p0, p1, null);
    }
    public Set getDeviceModels(){
       String[] obj = PatchProxy.apply(null, this, PadRawDeviceModels$READBOY.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"READBOY_G100A","READBOY_C12PRO","READBOY_C6","READBOY_C12"};
       return d1.u(obj);
    }
}
