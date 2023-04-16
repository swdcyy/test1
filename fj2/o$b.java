package fj2.o$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import fj2.o;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import fj2.c;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import o07.o;

public class o$b implements PopupInterface$h	// class@002978
{
    public final o b;

    public void o$b(o p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$b.class, "1")) {
          return;
       }
       boolean b = y.d(this.b.getActivity());
       o r = this.b.r;
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), r, null, uoc, "10")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_SCREENCAST_PANEL";
          u1.B0(new ShowMetaData().setType(9).setElementPackage(uElementPack).setContentPackage(c.b(b, r)));
       }
       return;
    }
    public void H(c p0,int p1){
       p0.y = null;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
