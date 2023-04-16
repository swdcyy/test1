package com.yxcorp.gifshow.detail.plc.helper.PlcStyleChangeType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PlcStyleChangeType extends Enum	// class@00166e
{
    public static final PlcStyleChangeType[] $VALUES;
    public static final PlcStyleChangeType COUNTDOWN;
    public static final PlcStyleChangeType DURATION;
    public static final PlcStyleChangeType PROGRESS;

    static {
       PlcStyleChangeType plcStyleChan = new PlcStyleChangeType("DURATION", 0);
       PlcStyleChangeType.DURATION = plcStyleChan;
       PlcStyleChangeType plcStyleChan1 = new PlcStyleChangeType("COUNTDOWN", 1);
       PlcStyleChangeType.COUNTDOWN = plcStyleChan1;
       PlcStyleChangeType plcStyleChan2 = new PlcStyleChangeType("PROGRESS", 2);
       PlcStyleChangeType.PROGRESS = plcStyleChan2;
       PlcStyleChangeType[] plcStyleChan3 = new PlcStyleChangeType[]{plcStyleChan,plcStyleChan1,plcStyleChan2};
       PlcStyleChangeType.$VALUES = plcStyleChan3;
    }
    public void PlcStyleChangeType(String p0,int p1){
       super(p0, p1);
    }
    public static PlcStyleChangeType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlcStyleChangeType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PlcStyleChangeType.class, p0);
    }
    public static PlcStyleChangeType[] values(){
       Object obj = PatchProxy.apply(null, null, PlcStyleChangeType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PlcStyleChangeType.$VALUES.clone();
    }
}
