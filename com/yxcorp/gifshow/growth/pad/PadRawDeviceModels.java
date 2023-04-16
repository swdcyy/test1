package com.yxcorp.gifshow.growth.pad.PadRawDeviceModels;
import java.lang.Enum;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$HUAWEI;
import java.lang.String;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$HONOR;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$XIAOMI;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$LENOVO;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$BAIDU;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$OPPO;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$VIVO;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$SAMSUNG;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$READBOY;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$YOUXUEPAI;
import com.yxcorp.gifshow.growth.pad.PadRawDeviceModels$XIAOBAWANG;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;

public abstract class PadRawDeviceModels extends Enum	// class@0011a2
{
    public static final PadRawDeviceModels[] $VALUES;
    public static final PadRawDeviceModels BAIDU;
    public static final PadRawDeviceModels HONOR;
    public static final PadRawDeviceModels HUAWEI;
    public static final PadRawDeviceModels LENOVO;
    public static final PadRawDeviceModels OPPO;
    public static final PadRawDeviceModels READBOY;
    public static final PadRawDeviceModels SAMSUNG;
    public static final PadRawDeviceModels VIVO;
    public static final PadRawDeviceModels XIAOBAWANG;
    public static final PadRawDeviceModels XIAOMI;
    public static final PadRawDeviceModels YOUXUEPAI;

    static {
       PadRawDeviceModels[] padRawDevice = new PadRawDeviceModels[11];
       PadRawDeviceModels$HUAWEI hUAWEI = new PadRawDeviceModels$HUAWEI("HUAWEI", 0);
       PadRawDeviceModels.HUAWEI = hUAWEI;
       padRawDevice[0] = hUAWEI;
       PadRawDeviceModels$HONOR hONOR = new PadRawDeviceModels$HONOR("HONOR", 1);
       PadRawDeviceModels.HONOR = hONOR;
       padRawDevice[1] = hONOR;
       PadRawDeviceModels$XIAOMI xIAOMI = new PadRawDeviceModels$XIAOMI("XIAOMI", 2);
       PadRawDeviceModels.XIAOMI = xIAOMI;
       padRawDevice[2] = xIAOMI;
       PadRawDeviceModels$LENOVO lENOVO = new PadRawDeviceModels$LENOVO("LENOVO", 3);
       PadRawDeviceModels.LENOVO = lENOVO;
       padRawDevice[3] = lENOVO;
       PadRawDeviceModels$BAIDU uBAIDU = new PadRawDeviceModels$BAIDU("BAIDU", 4);
       PadRawDeviceModels.BAIDU = uBAIDU;
       padRawDevice[4] = uBAIDU;
       PadRawDeviceModels$OPPO oPPO = new PadRawDeviceModels$OPPO("OPPO", 5);
       PadRawDeviceModels.OPPO = oPPO;
       padRawDevice[5] = oPPO;
       PadRawDeviceModels$VIVO vIVO = new PadRawDeviceModels$VIVO("VIVO", 6);
       PadRawDeviceModels.VIVO = vIVO;
       padRawDevice[6] = vIVO;
       PadRawDeviceModels$SAMSUNG sAMSUNG = new PadRawDeviceModels$SAMSUNG("SAMSUNG", 7);
       PadRawDeviceModels.SAMSUNG = sAMSUNG;
       padRawDevice[7] = sAMSUNG;
       PadRawDeviceModels$READBOY rEADBOY = new PadRawDeviceModels$READBOY("READBOY", 8);
       PadRawDeviceModels.READBOY = rEADBOY;
       padRawDevice[8] = rEADBOY;
       PadRawDeviceModels$YOUXUEPAI yOUXUEPAI = new PadRawDeviceModels$YOUXUEPAI("YOUXUEPAI", 9);
       PadRawDeviceModels.YOUXUEPAI = yOUXUEPAI;
       padRawDevice[9] = yOUXUEPAI;
       PadRawDeviceModels$XIAOBAWANG xIAOBAWANG = new PadRawDeviceModels$XIAOBAWANG("XIAOBAWANG", 10);
       PadRawDeviceModels.XIAOBAWANG = xIAOBAWANG;
       padRawDevice[10] = xIAOBAWANG;
       PadRawDeviceModels.$VALUES = padRawDevice;
    }
    public void PadRawDeviceModels(String p0,int p1){
       super(p0, p1);
    }
    public void PadRawDeviceModels(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static PadRawDeviceModels valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PadRawDeviceModels.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PadRawDeviceModels.class, p0);
    }
    public static PadRawDeviceModels[] values(){
       Object obj = PatchProxy.apply(null, null, PadRawDeviceModels.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PadRawDeviceModels.$VALUES.clone();
    }
    public abstract Set getDeviceModels();
}
