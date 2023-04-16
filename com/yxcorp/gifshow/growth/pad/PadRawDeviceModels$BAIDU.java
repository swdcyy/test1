package com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$BAIDU;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels;
import java.lang.String;
import nsd.u;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import trd.d1;

public final class PadRawDeviceModels$BAIDU extends PadRawDeviceModels	// class@001197
{

    public void PadRawDeviceModels$BAIDU(String p0,int p1){
       super(p0, p1, null);
    }
    public Set getDeviceModels(){
       String[] obj = PatchProxy.apply(null, this, PadRawDeviceModels$BAIDU.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"XDH-25-B3","XDH-25-B3"};
       return d1.u(obj);
    }
}
