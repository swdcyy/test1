package ab2.e;
import com.yxcorp.gifshow.widget.m;
import ab2.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import pb2.u;
import java.util.Objects;
import ab2.i$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import nb2.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class e extends m	// class@00009f
{
    public final d c;

    public void e(d p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       u ou = u.c(this.c.getActivity());
       Objects.requireNonNull(ou);
       String str = "LIVE_MORE_SQUARE";
       if (!PatchProxy.applyVoidOneRefs(str, ou, u.class, "4") && ou.a()) {
          ou.f.b(str);
       }
       ClientContent$LiveStreamPackage liveStreamPa = u.c(this.c.getActivity()).h();
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, g.class, "36")) {
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page2 = str;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "START_LIVE_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.A(urlPackage, "", 1, uElementPack, uContentPack);
       }
       return;
    }
}
