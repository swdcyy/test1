package com.kwai.live.gzone.emotion.g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.emotion.f$a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.emotion.f;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import a57.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import o07.o;

public class g implements PopupInterface$h	// class@000ce0
{
    public final f$a b;

    public void g(f$a p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       f z = this.b.u.z;
       if (z != null) {
          ClientContent$LiveStreamPackage liveStreamPa = z.a();
          boolean b = y.d(this.b.getActivity());
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Boolean.valueOf(b), null, uoa, "4")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_GZONE_EMO_UNLOCK_DIALOG";
             uElementPack.type = 18;
             uElementPack.params = a.b(b);
             u1.u0(4, uElementPack, a.a(liveStreamPa));
          }
       }
       return;
    }
    public void H(c p0,int p1){
       p0.x = null;
    }
    public void J(c p0){
       p0.x = null;
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
