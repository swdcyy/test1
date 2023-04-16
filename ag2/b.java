package ag2.b;
import a71.a;
import ag2.f;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dg2.u;
import com.kuaishou.live.core.show.quiz.notice.b$a;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import bg2.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class b implements a	// class@0000c8
{
    public final f a;

    public void b(f p0){
       this.a = p0;
    }
    public final boolean a(int p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, ta, f.class, "7")) {
       }else {
          ta.N.b(2);
          ta.O.a();
          ClientContent$LiveStreamPackage liveStreamPa = ta.K.Z2.a();
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, a.class, "4")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "TEAM_ANSWER_BUTTON";
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
