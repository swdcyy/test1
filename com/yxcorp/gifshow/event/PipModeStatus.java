package com.yxcorp.gifshow.event.PipModeStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PipModeStatus extends Enum	// class@000e81
{
    public static final PipModeStatus[] $VALUES;
    public static final PipModeStatus DISABLE;
    public static final PipModeStatus ENABLE;

    static {
       PipModeStatus pipModeStatu1;
       PipModeStatus[] pipModeStatu = new PipModeStatus[]{pipModeStatu1,pipModeStatu1};
       pipModeStatu1 = new PipModeStatus("ENABLE", 0);
       PipModeStatus.ENABLE = pipModeStatu1;
       pipModeStatu1 = new PipModeStatus("DISABLE", 1);
       PipModeStatus.DISABLE = pipModeStatu1;
       PipModeStatus.$VALUES = pipModeStatu;
    }
    public void PipModeStatus(String p0,int p1){
       super(p0, p1);
    }
    public static PipModeStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PipModeStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PipModeStatus.class, p0);
    }
    public static PipModeStatus[] values(){
       Object obj = PatchProxy.apply(null, null, PipModeStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PipModeStatus.$VALUES.clone();
    }
}
