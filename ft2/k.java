package ft2.k;
import android.content.DialogInterface$OnShowListener;
import ft2.h;
import com.kuaishou.livestream.message.nano.SCMicSeatsInvitationInfo;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qu2.a;
import co2.f2;
import com.kuaishou.live.core.voiceparty.micseats.VoicePartyMicSeatLogger;

public final class k implements DialogInterface$OnShowListener	// class@0029d2
{
    public final h b;
    public final SCMicSeatsInvitationInfo c;

    public void k(h p0,SCMicSeatsInvitationInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, k.class, "1")) {
          return;
       }
       k tb = this.b;
       VoicePartyMicSeatLogger.c(tb.k, tb.j.a(), this.c.friendshipType);
       PatchProxy.onMethodExit(k.class, "1");
       return;
    }
}
