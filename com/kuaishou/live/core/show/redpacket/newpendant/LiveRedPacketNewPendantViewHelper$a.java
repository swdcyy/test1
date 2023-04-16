package com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$a;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$c;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$Mode;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper;
import com.kwai.framework.model.user.UserInfo;

public class LiveRedPacketNewPendantViewHelper$a implements LiveRedPacketNewPendantViewHelper$c	// class@000ee4
{
    public final LiveConditionRedPacketInfo a;

    public void LiveRedPacketNewPendantViewHelper$a(LiveConditionRedPacketInfo p0){
       super();
       this.a = p0;
    }
    public LiveRedPacketNewPendantViewHelper$Mode b(){
       Object obj = PatchProxy.apply(null, this, LiveRedPacketNewPendantViewHelper$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (LiveRedPacketNewPendantViewHelper.c() - this.a.d > 0) {
          return LiveRedPacketNewPendantViewHelper$Mode.Opening;
       }
       return LiveRedPacketNewPendantViewHelper$Mode.CountDown;
    }
    public long c(){
       LiveConditionRedPacketInfo d = this.a.d;
       if (d - 1000 > 0) {
          d = d - 1000;
       }
       return d;
    }
    public UserInfo d(){
       return this.a.e;
    }
}
