package ab2.d$b;
import androidx.lifecycle.Observer;
import ab2.d;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import pb2.u;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import nb2.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class d$b implements Observer	// class@00009b
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
       }else if(p0.booleanValue()){
          p0 = u.c(this.b.getActivity()).h();
          if (!PatchProxy.applyVoidOneRefs(p0, null, g.class, "35")) {
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             urlPackage.page2 = "LIVE_MORE_SQUARE";
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "START_LIVE_BUTTON";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = p0;
             u1.y0(urlPackage, 6, uElementPack, uContentPack);
          }
       }
       return;
    }
}
