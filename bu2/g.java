package bu2.g;
import erd.g;
import bu2.l;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import java.lang.Object;
import njd.a;
import pp.d;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import com.kwai.framework.model.user.UserInfo;
import com.google.common.collect.ImmutableMap;
import pp.c;
import java.lang.String;
import java.util.Map;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class g implements g	// class@00045a
{
    public final l b;
    public final VoicePartyOnlineUser c;
    public final g d;
    public final int e;

    public void g(l p0,VoicePartyOnlineUser p1,g p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       g tc = this.c;
       this.b.W8().m(LiveVoicePartyLogTag.ANCHOR, "acceptAudienceApply", ImmutableMap.of("acceptUserId", tc.mApplyUserInfo.mId));
       tc.mStatus = -1;
       this.d.l0(this.e);
    }
}
