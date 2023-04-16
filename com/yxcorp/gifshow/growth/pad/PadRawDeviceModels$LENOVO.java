package com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$LENOVO;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels;
import java.lang.String;
import nsd.u;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import trd.d1;

public final class PadRawDeviceModels$LENOVO extends PadRawDeviceModels	// class@00119a
{

    public void PadRawDeviceModels$LENOVO(String p0,int p1){
       super(p0, p1, null);
    }
    public Set getDeviceModels(){
       String[] obj = PatchProxy.apply(null, this, PadRawDeviceModels$LENOVO.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"LENOVO TB-J606F","LENOVO TB-J706F","TB128XC","TB132FU","TB138FC","LENOVO TB-J607F","LENOVO TB-X606F","TB128FU","LENOVO TB-J716F","LENOVO TB-9707F"};
       return d1.u(obj);
    }
}
