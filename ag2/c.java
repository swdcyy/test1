package ag2.c;
import a71.a;
import ag2.f;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dg2.u;
import com.kuaishou.live.core.show.quiz.notice.b$a;
import dg2.d;
import com.kuaishou.live.core.show.quiz.manager.j;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import bg2.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class c implements a	// class@0000c9
{
    public final f a;

    public void c(f p0){
       this.a = p0;
    }
    public final boolean a(int p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, ta, f.class, "6")) {
       }else {
          ta.N.b(1);
          ta.O.a();
          int i = ta.L.e().a();
          ClientContent$LiveStreamPackage liveStreamPa = ta.K.Z2.a();
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), liveStreamPa, objArray, uoa, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "RIGHT_CARD_BUTTON";
             i3 oi3 = i3.f();
             oi3.c("count", Integer.valueOf(i));
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             if (liveStreamPa != null) {
                uContentPack.liveStreamPackage = liveStreamPa;
             }
             u1.u(1, uElementPack, uContentPack);
          }
       }
       return false;
    }
}
