package com.kuaishou.krn.apm.wsd.model.WsdReportData$ShotCancelReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class WsdReportData$ShotCancelReason extends Enum	// class@0007fe
{
    public final long reason;
    public static final WsdReportData$ShotCancelReason[] $VALUES;
    public static final WsdReportData$ShotCancelReason LOW_DISK;
    public static final WsdReportData$ShotCancelReason OVER_HEAT;

    static {
       WsdReportData$ShotCancelReason shotCancelRe1;
       WsdReportData$ShotCancelReason[] shotCancelRe = new WsdReportData$ShotCancelReason[]{shotCancelRe1,shotCancelRe1};
       shotCancelRe1 = new WsdReportData$ShotCancelReason("OVER_HEAT", 0, 1);
       WsdReportData$ShotCancelReason.OVER_HEAT = shotCancelRe1;
       shotCancelRe1 = new WsdReportData$ShotCancelReason("LOW_DISK", 1, 2);
       WsdReportData$ShotCancelReason.LOW_DISK = shotCancelRe1;
       WsdReportData$ShotCancelReason.$VALUES = shotCancelRe;
    }
    public void WsdReportData$ShotCancelReason(String p0,int p1,long p2){
       super(p0, p1);
       this.reason = p2;
    }
    public static WsdReportData$ShotCancelReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WsdReportData$ShotCancelReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(WsdReportData$ShotCancelReason.class, p0);
    }
    public static WsdReportData$ShotCancelReason[] values(){
       Object obj = PatchProxy.apply(null, null, WsdReportData$ShotCancelReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WsdReportData$ShotCancelReason.$VALUES.clone();
    }
    public final long getReason(){
       return this.reason;
    }
}
