package e63.f1;
import com.kuaishou.live.gzone.widget.LiveGzoneProfileTagsView$c;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import com.kwai.live.gzone.auth.LiveGzoneAuthorAuthenticationTagResponse$Tag;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.auth.LiveGzoneAuthorAuthenticationTagResponse$TradeTag;
import t02.a0;
import y43.a;
import k53.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import dz1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class f1 implements LiveGzoneProfileTagsView$c	// class@00264c
{
    public final e a;

    public void f1(e p0){
       this.a = p0;
       super();
    }
    public void a(LiveGzoneAuthorAuthenticationTagResponse$Tag p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1.class, "1")) {
          return;
       }
       e b = this.a.B;
       if (b != null && p0 instanceof LiveGzoneAuthorAuthenticationTagResponse$TradeTag) {
          b.D.c.a("profileTab");
          ClientContent$LiveStreamPackage liveStreamPa = this.a.B.Z2.a();
          if (!PatchProxy.applyVoidOneRefs(liveStreamPa, null, a.class, "48")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "STREAMER_TAB_WZRY_STORE_ENTRANCE";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(1, uElementPack, uContentPack);
          }
       }
       return;
    }
}
