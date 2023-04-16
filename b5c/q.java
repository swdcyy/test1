package b5c.q;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.e;
import java.lang.Object;
import e06.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import q2b.h$b;

public final class q implements g	// class@0003b4
{
    public final e b;

    public void q(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoe, "3")) {
       }else if(tb.getActivity().b3() && tb.q != null){
          p0 = tb.p.getId();
          if (!PatchProxy.applyVoidOneRefs(p0, null, uoe, "4")) {
             p0 = b0.g(p0);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.name = "FOCUS_ON_SCREEN";
             uElementPack.type = 13;
             uElementPack.action = 419;
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             showEvent.elementPackage = uElementPack;
             showEvent.contentPackage = p0;
             h$b uob = h$b.d(7, 419);
             uob.h(p0);
             b.a(0x4b316083).J(uob);
             b.a(0x4b316083).h(showEvent);
          }
       }
       return;
    }
}
