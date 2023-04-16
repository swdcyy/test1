package e42.k;
import java.lang.Runnable;
import com.kuaishou.live.core.show.clearscreen.d;
import java.lang.Object;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import e42.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class k implements Runnable	// class@00261d
{
    public final d b;

    public void k(d p0){
       this.b = p0;
    }
    public final void run(){
       ClientContent$LiveStreamPackage liveStreamPa = this.b.u.Z2.a();
       if (PatchProxy.applyVoidOneRefs(liveStreamPa, null, r.class, "2")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLEAR_SCREEN";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u0(6, uElementPack, uContentPack);
       }
       return;
    }
}
