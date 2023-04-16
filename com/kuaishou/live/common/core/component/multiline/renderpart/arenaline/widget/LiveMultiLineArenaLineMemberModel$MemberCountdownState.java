package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel$MemberCountdownState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiLineArenaLineMemberModel$MemberCountdownState extends Enum	// class@001538
{
    public static final LiveMultiLineArenaLineMemberModel$MemberCountdownState[] $VALUES;
    public static final LiveMultiLineArenaLineMemberModel$MemberCountdownState INVALID;
    public static final LiveMultiLineArenaLineMemberModel$MemberCountdownState RUNNING;
    public static final LiveMultiLineArenaLineMemberModel$MemberCountdownState TIMEOUT;

    static {
       LiveMultiLineArenaLineMemberModel$MemberCountdownState memberCountd1;
       LiveMultiLineArenaLineMemberModel$MemberCountdownState[] memberCountd = new LiveMultiLineArenaLineMemberModel$MemberCountdownState[]{memberCountd1,memberCountd1,memberCountd1};
       memberCountd1 = new LiveMultiLineArenaLineMemberModel$MemberCountdownState("INVALID", 0);
       LiveMultiLineArenaLineMemberModel$MemberCountdownState.INVALID = memberCountd1;
       memberCountd1 = new LiveMultiLineArenaLineMemberModel$MemberCountdownState("RUNNING", 1);
       LiveMultiLineArenaLineMemberModel$MemberCountdownState.RUNNING = memberCountd1;
       memberCountd1 = new LiveMultiLineArenaLineMemberModel$MemberCountdownState("TIMEOUT", 2);
       LiveMultiLineArenaLineMemberModel$MemberCountdownState.TIMEOUT = memberCountd1;
       LiveMultiLineArenaLineMemberModel$MemberCountdownState.$VALUES = memberCountd;
    }
    public void LiveMultiLineArenaLineMemberModel$MemberCountdownState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMultiLineArenaLineMemberModel$MemberCountdownState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiLineArenaLineMemberModel$MemberCountdownState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiLineArenaLineMemberModel$MemberCountdownState.class, p0);
    }
    public static LiveMultiLineArenaLineMemberModel$MemberCountdownState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiLineArenaLineMemberModel$MemberCountdownState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiLineArenaLineMemberModel$MemberCountdownState.$VALUES.clone();
    }
}
