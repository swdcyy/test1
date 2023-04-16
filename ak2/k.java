package ak2.k;
import java.lang.Runnable;
import ak2.l;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ak2.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class k implements Runnable	// class@0000ee
{
    public final l b;

    public void k(l p0){
       this.b = p0;
    }
    public final void run(){
       k tb = this.b;
       l f = tb.F;
       ClientContent$LiveStreamPackage liveStreamPa = tb.G.a();
       if (PatchProxy.applyVoidTwoRefs(f, liveStreamPa, null, m.class, "1")) {
       }else {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u0(3, m.a(f), uContentPack);
       }
       return;
    }
}
