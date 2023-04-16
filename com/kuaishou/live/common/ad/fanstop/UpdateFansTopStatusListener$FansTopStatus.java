package com.kuaishou.live.common.ad.fanstop.UpdateFansTopStatusListener$FansTopStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UpdateFansTopStatusListener$FansTopStatus extends Enum	// class@000e61
{
    public static final UpdateFansTopStatusListener$FansTopStatus[] $VALUES;
    public static final UpdateFansTopStatusListener$FansTopStatus CLOSE;
    public static final UpdateFansTopStatusListener$FansTopStatus OPEN_FLAME_SELECTED;
    public static final UpdateFansTopStatusListener$FansTopStatus OPEN_FLAME_UNSELECTED;

    static {
       UpdateFansTopStatusListener$FansTopStatus uFansTopStat = new UpdateFansTopStatusListener$FansTopStatus("CLOSE", 0);
       UpdateFansTopStatusListener$FansTopStatus.CLOSE = uFansTopStat;
       UpdateFansTopStatusListener$FansTopStatus uFansTopStat1 = new UpdateFansTopStatusListener$FansTopStatus("OPEN_FLAME_UNSELECTED", 1);
       UpdateFansTopStatusListener$FansTopStatus.OPEN_FLAME_UNSELECTED = uFansTopStat1;
       UpdateFansTopStatusListener$FansTopStatus uFansTopStat2 = new UpdateFansTopStatusListener$FansTopStatus("OPEN_FLAME_SELECTED", 2);
       UpdateFansTopStatusListener$FansTopStatus.OPEN_FLAME_SELECTED = uFansTopStat2;
       UpdateFansTopStatusListener$FansTopStatus[] uFansTopStat3 = new UpdateFansTopStatusListener$FansTopStatus[]{uFansTopStat,uFansTopStat1,uFansTopStat2};
       UpdateFansTopStatusListener$FansTopStatus.$VALUES = uFansTopStat3;
    }
    public void UpdateFansTopStatusListener$FansTopStatus(String p0,int p1){
       super(p0, p1);
    }
    public static UpdateFansTopStatusListener$FansTopStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UpdateFansTopStatusListener$FansTopStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UpdateFansTopStatusListener$FansTopStatus.class, p0);
    }
    public static UpdateFansTopStatusListener$FansTopStatus[] values(){
       Object obj = PatchProxy.apply(null, null, UpdateFansTopStatusListener$FansTopStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UpdateFansTopStatusListener$FansTopStatus.$VALUES.clone();
    }
}
