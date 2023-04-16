package b62.r0;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelOwnerInfoView$b;
import p91.m;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;

public final class r0 implements LiveConditionRedPacketPanelOwnerInfoView$b	// class@000353
{
    public final m a;
    public final UserInfo b;

    public void r0(m p0,UserInfo p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(){
       this.a.w0(new UserProfile(this.b), LiveStreamClickType.UNKNOWN, 0, 1, 8);
    }
}
