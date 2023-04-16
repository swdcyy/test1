package com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveTreasureBoxModel$BoxStatus extends Enum	// class@001c5f
{
    public static final LiveTreasureBoxModel$BoxStatus[] $VALUES;
    public static final LiveTreasureBoxModel$BoxStatus COUNTED_DOWN;
    public static final LiveTreasureBoxModel$BoxStatus COUNTING_DOWN;
    public static final LiveTreasureBoxModel$BoxStatus OPENED;
    public static final LiveTreasureBoxModel$BoxStatus OPENING;
    public static final LiveTreasureBoxModel$BoxStatus WAITING;

    static {
       LiveTreasureBoxModel$BoxStatus uBoxStatus = new LiveTreasureBoxModel$BoxStatus("WAITING", 0);
       LiveTreasureBoxModel$BoxStatus.WAITING = uBoxStatus;
       LiveTreasureBoxModel$BoxStatus uBoxStatus1 = new LiveTreasureBoxModel$BoxStatus("COUNTING_DOWN", 1);
       LiveTreasureBoxModel$BoxStatus.COUNTING_DOWN = uBoxStatus1;
       LiveTreasureBoxModel$BoxStatus uBoxStatus2 = new LiveTreasureBoxModel$BoxStatus("COUNTED_DOWN", 2);
       LiveTreasureBoxModel$BoxStatus.COUNTED_DOWN = uBoxStatus2;
       LiveTreasureBoxModel$BoxStatus uBoxStatus3 = new LiveTreasureBoxModel$BoxStatus("OPENING", 3);
       LiveTreasureBoxModel$BoxStatus.OPENING = uBoxStatus3;
       LiveTreasureBoxModel$BoxStatus uBoxStatus4 = new LiveTreasureBoxModel$BoxStatus("OPENED", 4);
       LiveTreasureBoxModel$BoxStatus.OPENED = uBoxStatus4;
       LiveTreasureBoxModel$BoxStatus[] uBoxStatusAr = new LiveTreasureBoxModel$BoxStatus[]{uBoxStatus,uBoxStatus1,uBoxStatus2,uBoxStatus3,uBoxStatus4};
       LiveTreasureBoxModel$BoxStatus.$VALUES = uBoxStatusAr;
    }
    public void LiveTreasureBoxModel$BoxStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LiveTreasureBoxModel$BoxStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveTreasureBoxModel$BoxStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveTreasureBoxModel$BoxStatus.class, p0);
    }
    public static LiveTreasureBoxModel$BoxStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveTreasureBoxModel$BoxStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveTreasureBoxModel$BoxStatus.$VALUES.clone();
    }
}
