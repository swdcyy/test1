package ff2.b$a;
import android.view.View$OnClickListener;
import ff2.b;
import com.kuaishou.live.core.show.profilecard.http.LiveProfileNobleEntranceInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wj2.r;
import cf2.c;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ff2.c;
import com.kwai.framework.model.user.UserInfo;
import java.util.Objects;
import ff2.c$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import android.content.Context;
import vq5.d;
import wj2.l0;

public final class b$a implements View$OnClickListener	// class@00294a
{
    public final b b;
    public final LiveProfileNobleEntranceInfo c;

    public void b$a(b p0,LiveProfileNobleEntranceInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       c$a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       c uoc = this.b.b().c();
       a.o(uoc, "liveProfileCallerContext.logInfoSupplier");
       ClientContent$LiveStreamPackage liveStreamPa = uoc.a();
       if (liveStreamPa != null) {
          a = c.a;
          a.o(liveStreamPa, "it");
          b f = this.b.f;
          UserInfo mId = (f != null)? f.mId: null;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, mId, a, c$a.class, "2")) {
             a.p(liveStreamPa, "liveStreamPackage");
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             uContentPack.userPackage = userPackage;
             userPackage.identity = mId;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PERSONEL_PROFILE_NOBLE_ENTRANCE";
             u1.u(1, uElementPack, uContentPack);
          }
       }
       b e = this.b.e;
       if (e != null) {
          e.r4(this.c.getNobleEntranceUrl(), this.b.d);
       }
       r j = this.b.b().j;
       if (j != null) {
          j.a();
       }
       return;
    }
}
