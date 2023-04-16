package i01.d;
import u07.u;
import i01.j;
import java.lang.Object;
import u07.t;
import android.view.View;
import t02.a0;
import jk1.f;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import i01.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import k2b.u1;
import mg1.a;
import kg1.e;

public final class d implements u	// class@0027dc
{
    public final j b;

    public void d(j p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       d tb = this.b;
       tb.p.x1.B1();
       ClientContent$LiveStreamPackage liveStreamPa = tb.p.Z2.a();
       String str = "CHECK_PRIVILEGE";
       if (PatchProxy.applyVoidTwoRefs(liveStreamPa, str, null, a.class, "1")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 1;
          uElementPack.action2 = "JOIN_FANS_GROUP_CONFIRM_DIALOG";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
          moreInfoPack.name = str;
          moreInfoPack.type = "SEND_FANS_GROUP_GIFT";
          uContentPack.moreInfoPackage = moreInfoPack;
          u1.u(6, uElementPack, uContentPack);
       }
       tb.p.r1.Tf("GIFT_PANEL", null);
       return;
    }
}
