package com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$HUAWEI;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels;
import java.lang.String;
import nsd.u;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import trd.d1;

public final class PadRawDeviceModels$HUAWEI extends PadRawDeviceModels	// class@001199
{

    public void PadRawDeviceModels$HUAWEI(String p0,int p1){
       super(p0, p1, null);
    }
    public Set getDeviceModels(){
       String[] obj = PatchProxy.apply(null, this, PadRawDeviceModels$HUAWEI.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"BAH3-W59","SCM-W09","SCM-AL09","VRD-AL09","SCM-W09","VRD-AL10","VRD-W09","VRD-W10","JDN2-W09","JDN2-AL50","BAH2-W09","CMR-W09","JDN2-AL00","DBY-W09","MRX-W09","MRX-AL09","MRX-W29","AGS3-W00E","AGS3-AL00","BAH3-W09","AGS2-W09","AGS2-W09","SCMR-W09","BAH2-AL10","AGS3-W00D","BAH3-AL00","VRD-W10","SHT-AL09","BAH2-AL10","AGS-W09","BAH-AL00","CPN-W09","BAH4-W29","SCMR-AL09","BAH4-AL10","BAH4-W09","BAH4-W19","BAH3-AN10","MRR-W39","MRX-AL19","MRX-W19","MRX-W39","MRX-AN19","MRR-W29","WGR-AN19","WGR-W09","WGR-W19","AGS3K-AL20","AGS3K-W20","AGS3K-AL00","AGS3K-W00","AGS3K-W10","GOT-AL09","GOT-AL19","GOT-W29","GOT-W39","GOT-W09","DBY-W09","BAH4-W39","BZT-W09","M2-801W","FDR-A03L","MON-AL19B","HDL-W09","BZI-W00","WGRR-W09","WGRR-W19","WGRR-AN19","AGS5-W09K","AGS5-W09S","AGS5-W00","AGS5-AL00","AGS5Z-W00","AGS5Z-AL00"};
       return d1.u(obj);
    }
}
