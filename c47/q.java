package c47.q;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.commandlottery.d;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import c47.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import o07.o;

public class q implements PopupInterface$h	// class@0004dc
{
    public final d b;

    public void q(d p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.b.q.a();
       if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, a.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "OP_ACTIVITY_GAME_CNY2022_PASSWORD_DRAW_TAB";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u0(4, uElementPack, uContentPack);
       }
       return;
    }
    public void H(c p0,int p1){
       p0.D = null;
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
