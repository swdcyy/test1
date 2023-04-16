package ft2.h$c;
import erd.g;
import ft2.h;
import com.kuaishou.livestream.message.nano.SCMicSeatsInvitationInfo;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import qs2.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import qu2.a;
import co2.f2;
import brd.t;
import brd.x;
import yx2.i;
import cjd.e;
import erd.o;
import ft2.i;
import com.kuaishou.live.core.voiceparty.micseats.invitation.a;
import crd.b;
import android.app.Activity;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class h$c implements g	// class@0029cc
{
    public final h b;
    public final SCMicSeatsInvitationInfo c;

    public void h$c(h p0,SCMicSeatsInvitationInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       h$c uoc = h$c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoc, "1")) {
          if (b) {
             b = this.b.l;
             if (b != null) {
                b.k(this.c.micSeatId);
             }
             if (TextUtils.isEmpty(this.c.aryaConfig)) {
                b = this.b;
                uoc = this.c;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidOneRefs(uoc, b, h.class, "5")) {
                   LiveVoicePartyApi.b().u0(b.j.getLiveStreamId(), b.k.y(), uoc.token).compose(b.L()).map(new e()).subscribe(new i(b), new a(b));
                }
             }else {
                this.b.Q(this.c.aryaConfig);
             }
          }else {
             String[] stringArray = new String[]{"android.permission.RECORD_AUDIO"};
             PermissionUtils.n(this.b.h, stringArray);
          }
       }
       return;
    }
}
