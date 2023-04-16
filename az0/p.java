package az0.p;
import u07.u;
import az0.s;
import xp5.i;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class p implements u	// class@0002de
{
    public final s b;
    public final i c;

    public void p(s p0,i p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       p tb = this.b;
       Objects.requireNonNull(tb);
       ClientContent$LiveStreamPackage liveStreamPa = this.c.a();
       if (PatchProxy.applyVoidOneRefs(liveStreamPa, tb, s.class, "4")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "POPULAR_GIFT_POPUP";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u(9, uElementPack, uContentPack);
       }
       return;
    }
}
