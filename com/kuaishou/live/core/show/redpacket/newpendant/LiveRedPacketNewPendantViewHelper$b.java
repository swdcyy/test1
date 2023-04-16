package com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$b;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$c;
import vg2.a;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveRedPackMessage$AudienceRedPack;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$Mode;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tw1.f;

public class LiveRedPacketNewPendantViewHelper$b implements LiveRedPacketNewPendantViewHelper$c	// class@000ee5
{
    public final a a;
    public final UserInfo b;

    public void LiveRedPacketNewPendantViewHelper$b(a p0){
       super();
       this.a = p0;
       this.b = UserInfo.convertFromProto(p0.a.sendUser);
    }
    public LiveRedPacketNewPendantViewHelper$Mode b(){
       LiveRedPacketNewPendantViewHelper$b obj = PatchProxy.apply(null, this, LiveRedPacketNewPendantViewHelper$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null || !obj.a(f.a())) {
          return LiveRedPacketNewPendantViewHelper$Mode.CountDown;
       }
       if (obj.b != null) {
          return LiveRedPacketNewPendantViewHelper$Mode.Opened;
       }
       return LiveRedPacketNewPendantViewHelper$Mode.Opening;
    }
    public long c(){
       return this.a.a.grabTime;
    }
    public UserInfo d(){
       return this.b;
    }
}
