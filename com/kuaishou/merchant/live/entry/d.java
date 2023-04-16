package com.kuaishou.merchant.live.entry.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o07.o;
import b64.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.framework.model.user.QCurrentUser;
import k2b.u1;

public final class d implements PopupInterface$h	// class@001a19
{

    public void d(){
       super();
    }
    public void B(c p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, str)) {
          return;
       }
       o.e(this, p0);
       a a = a.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(null, a, a.class, str)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MERCHANT_PREVIEW_REMIND_POPUP";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
          liveStreamPa.anchorUserId = QCurrentUser.me().getId();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u0(4, uElementPack, uContentPack);
       }
       p0.X(true);
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
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
