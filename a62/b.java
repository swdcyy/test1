package a62.b;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelOwnerInfoView$b;
import com.kwai.framework.model.user.UserInfo;
import a62.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import p91.m;

public final class b implements LiveConditionRedPacketPanelOwnerInfoView$b	// class@00004c
{
    public final UserInfo a;
    public final c$a b;

    public void b(UserInfo p0,c$a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "1")) {
          return;
       }
       this.b.b.C.w0(new UserProfile(this.a), LiveStreamClickType.UNKNOWN, 0, true, 8);
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
