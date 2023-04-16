package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiLineGiftBattleState extends Enum	// class@001570
{
    public static final LiveMultiLineGiftBattleState[] $VALUES;
    public static final LiveMultiLineGiftBattleState BATTLE;
    public static final LiveMultiLineGiftBattleState COMMUNICATE;
    public static final LiveMultiLineGiftBattleState IDLE;

    static {
       LiveMultiLineGiftBattleState liveMultiLin1;
       LiveMultiLineGiftBattleState[] liveMultiLin = new LiveMultiLineGiftBattleState[]{liveMultiLin1,liveMultiLin1,liveMultiLin1};
       liveMultiLin1 = new LiveMultiLineGiftBattleState("IDLE", 0);
       LiveMultiLineGiftBattleState.IDLE = liveMultiLin1;
       liveMultiLin1 = new LiveMultiLineGiftBattleState("BATTLE", 1);
       LiveMultiLineGiftBattleState.BATTLE = liveMultiLin1;
       liveMultiLin1 = new LiveMultiLineGiftBattleState("COMMUNICATE", 2);
       LiveMultiLineGiftBattleState.COMMUNICATE = liveMultiLin1;
       LiveMultiLineGiftBattleState.$VALUES = liveMultiLin;
    }
    public void LiveMultiLineGiftBattleState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMultiLineGiftBattleState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiLineGiftBattleState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiLineGiftBattleState.class, p0);
    }
    public static LiveMultiLineGiftBattleState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiLineGiftBattleState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiLineGiftBattleState.$VALUES.clone();
    }
}
