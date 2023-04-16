package b62.x;
import ok.h;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.j;
import java.lang.Object;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser;
import com.kwai.framework.model.user.UserInfo;

public final class x implements h	// class@00035a
{
    public final j b;

    public void x(j p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       x tb = this.b;
       Objects.requireNonNull(tb);
       LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser liveConditio = PatchProxy.applyOneRefs(p0, tb, j.class, "14");
       if (liveConditio != PatchProxyResult.class) {
       }else {
          liveConditio = new LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser();
          liveConditio.mUserInfo = UserInfo.convertFromProto(p0);
       }
       return liveConditio;
    }
}
