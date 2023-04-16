package i02.r$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import i02.r;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import cd1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import o07.o;

public class r$a implements PopupInterface$h	// class@0027f9
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a.class, str)) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.b.g.a();
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, a.class, str)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FANS_SEND_GIFT_POPUP";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u0(9, uElementPack, uContentPack);
       }
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
