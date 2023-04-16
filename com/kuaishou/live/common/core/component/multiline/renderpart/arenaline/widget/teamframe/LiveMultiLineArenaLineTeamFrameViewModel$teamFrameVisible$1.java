package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.teamframe.LiveMultiLineArenaLineTeamFrameViewModel$teamFrameVisible$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.LiveMultiLineArenaLineMemberModel$MemberCountdownState;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class LiveMultiLineArenaLineTeamFrameViewModel$teamFrameVisible$1 extends Lambda implements p	// class@001543
{
    public static final LiveMultiLineArenaLineTeamFrameViewModel$teamFrameVisible$1 INSTANCE;

    static {
       LiveMultiLineArenaLineTeamFrameViewModel$teamFrameVisible$1.INSTANCE = new LiveMultiLineArenaLineTeamFrameViewModel$teamFrameVisible$1();
    }
    public void LiveMultiLineArenaLineTeamFrameViewModel$teamFrameVisible$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return Boolean.valueOf(this.invoke(p0, p1));
    }
    public final boolean invoke(String p0,LiveMultiLineArenaLineMemberModel$MemberCountdownState p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiLineArenaLineTeamFrameViewModel$teamFrameVisible$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(p0) && p1 == LiveMultiLineArenaLineMemberModel$MemberCountdownState.RUNNING)? true: false;
       return b;
    }
}
