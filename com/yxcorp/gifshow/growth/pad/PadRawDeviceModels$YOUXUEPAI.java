package com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$YOUXUEPAI;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels;
import java.lang.String;
import nsd.u;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import trd.c1;

public final class PadRawDeviceModels$YOUXUEPAI extends PadRawDeviceModels	// class@00146d
{

    public void PadRawDeviceModels$YOUXUEPAI(String p0,int p1){
       super(p0, p1, null);
    }
    public Set getDeviceModels(){
       Object obj = PatchProxy.apply(null, this, PadRawDeviceModels$YOUXUEPAI.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c1.f("P381");
    }
}
