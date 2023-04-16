package f22.f;
import u07.u;
import com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import f22.g;
import k2b.e0;
import qu2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import f22.g$a;

public final class f implements u	// class@002848
{
    public final AutoInviteFriendsGuidingPanel b;

    public void f(AutoInviteFriendsGuidingPanel p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       a.p(p1, "view");
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, AutoInviteFriendsGuidingPanel.class, "3")) {
          b.Z(LiveLogTag.GUEST_INVITE_FRIENDS, "AutoInviteFriendsGuidingPanel closeButton clicked");
          g.a.a(tb.c.c(), tb.c.a(), tb.c.y(), "CANCEL");
       }
       return;
    }
}
