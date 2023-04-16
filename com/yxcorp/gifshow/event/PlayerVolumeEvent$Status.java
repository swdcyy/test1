package com.yxcorp.gifshow.event.PlayerVolumeEvent$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PlayerVolumeEvent$Status extends Enum	// class@000e82
{
    public static final PlayerVolumeEvent$Status[] $VALUES;
    public static final PlayerVolumeEvent$Status MUTE;
    public static final PlayerVolumeEvent$Status UN_MUTE;

    static {
       PlayerVolumeEvent$Status status = new PlayerVolumeEvent$Status("MUTE", 0);
       PlayerVolumeEvent$Status.MUTE = status;
       PlayerVolumeEvent$Status status1 = new PlayerVolumeEvent$Status("UN_MUTE", 1);
       PlayerVolumeEvent$Status.UN_MUTE = status1;
       PlayerVolumeEvent$Status[] statusArray = new PlayerVolumeEvent$Status[]{status,status1};
       PlayerVolumeEvent$Status.$VALUES = statusArray;
    }
    public void PlayerVolumeEvent$Status(String p0,int p1){
       super(p0, p1);
    }
    public static PlayerVolumeEvent$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlayerVolumeEvent$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PlayerVolumeEvent$Status.class, p0);
    }
    public static PlayerVolumeEvent$Status[] values(){
       Object obj = PatchProxy.apply(null, null, PlayerVolumeEvent$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PlayerVolumeEvent$Status.$VALUES.clone();
    }
}
