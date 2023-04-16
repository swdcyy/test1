package com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$HONOR;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels;
import java.lang.String;
import nsd.u;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import trd.d1;

public final class PadRawDeviceModels$HONOR extends PadRawDeviceModels	// class@001198
{

    public void PadRawDeviceModels$HONOR(String p0,int p1){
       super(p0, p1, null);
    }
    public Set getDeviceModels(){
       String[] obj = PatchProxy.apply(null, this, PadRawDeviceModels$HONOR.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"AGM3-W09HN","JDN2-W09HN","AGS2-W09HN","AGS2-AL00HN","AGS2-AL00HN","AGS2-AL00","KJR-W09","KOB-L09","JDN-AL00","KRJ2-W09","AGS3-AL09HN","AGS3-W09HN","KRJ-AN00","KRJ-W09","AGR-AL09HN","AGR-W09HN","BRT-W09","AGM3-AL09HN","HEY-W09","BRT-AN09"};
       return d1.u(obj);
    }
}
