package com.kuaishou.live.core.show.robot.core.LiveMmuSoundManager$WorkMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMmuSoundManager$WorkMode extends Enum	// class@000fc4
{
    public static final LiveMmuSoundManager$WorkMode[] $VALUES;
    public static final LiveMmuSoundManager$WorkMode DETECTING;
    public static final LiveMmuSoundManager$WorkMode IDLE;
    public static final LiveMmuSoundManager$WorkMode PROCESSING;

    static {
       LiveMmuSoundManager$WorkMode workMode = new LiveMmuSoundManager$WorkMode("IDLE", 0);
       LiveMmuSoundManager$WorkMode.IDLE = workMode;
       LiveMmuSoundManager$WorkMode workMode1 = new LiveMmuSoundManager$WorkMode("DETECTING", 1);
       LiveMmuSoundManager$WorkMode.DETECTING = workMode1;
       LiveMmuSoundManager$WorkMode workMode2 = new LiveMmuSoundManager$WorkMode("PROCESSING", 2);
       LiveMmuSoundManager$WorkMode.PROCESSING = workMode2;
       LiveMmuSoundManager$WorkMode[] workModeArra = new LiveMmuSoundManager$WorkMode[]{workMode,workMode1,workMode2};
       LiveMmuSoundManager$WorkMode.$VALUES = workModeArra;
    }
    public void LiveMmuSoundManager$WorkMode(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMmuSoundManager$WorkMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMmuSoundManager$WorkMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMmuSoundManager$WorkMode.class, p0);
    }
    public static LiveMmuSoundManager$WorkMode[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMmuSoundManager$WorkMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMmuSoundManager$WorkMode.$VALUES.clone();
    }
}
