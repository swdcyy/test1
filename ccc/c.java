package ccc.c;
import erd.g;
import com.yxcorp.gifshow.relation.user.fragment.MissUUserProfileAndNoticeFragment$d$a;
import qm6.b$a;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qm6.b;
import hcc.j0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class c implements g	// class@000570
{
    public final MissUUserProfileAndNoticeFragment$d$a b;
    public final b$a c;

    public void c(MissUUserProfileAndNoticeFragment$d$a p0,b$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p0.Um(this.b.c.getActivity(), this.c.f());
       if (PatchProxy.applyVoid(null, null, j0.class, "41")) {
       }else {
          p0.page2 = "POKE_LIST";
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PUBLISH_PHOTO_BUTTON";
          u1.M("", null, 1, uElementPack, new ClientContent$ContentPackage(), null);
       }
       return;
    }
}
