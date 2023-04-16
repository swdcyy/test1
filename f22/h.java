package f22.h;
import erd.g;
import f22.m;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.GuestAutoInvitationSettingResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.widget.SingleSwitchPanel;
import java.lang.Boolean;
import com.kwai.library.widget.button.SlipSwitchButton;
import f22.g;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import f22.g$a;

public final class h implements g	// class@00284b
{
    public final m b;

    public void h(m p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          a.o(p0, "it");
          boolean b = p0.isAutoInviteFriendsEnabled();
          b.Z(LiveLogTag.GUEST_INVITE_FRIENDS, this.b.a+" fetchAutoInvitationSetting: "+b);
          p0 = this.b.c;
          a.m(p0);
          Objects.requireNonNull(p0);
          if (!PatchProxy.isSupport(SingleSwitchPanel.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), p0, SingleSwitchPanel.class, "6")) {
             p0 = p0.w;
             if (p0 != null) {
                p0.g(b, false, false);
             }
          }
          p0 = this.b;
          g.a.b(p0.e, p0.f, p0.g, p0.h, b, p0.i, p0.j);
       }
       return;
    }
}
