package h73.p;
import u07.u;
import h73.t;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jm1.a;
import kg1.f;
import h73.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import k2b.u1;

public final class p implements u	// class@002cbd
{
    public final t b;
    public final ClientContent$LiveStreamPackage c;

    public void p(t p0,ClientContent$LiveStreamPackage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       p tb = this.b;
       p tc = this.c;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, t.class, "12")) {
       }else {
          tb.g.f();
       }
       tb.d.A1();
       String str = "CHECK_PRIVILEGE";
       if (!PatchProxy.applyVoidTwoRefs(tc, str, objArray, a.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 1;
          uElementPack.action2 = "JOIN_FANS_GROUP_CONFIRM_DIALOG";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = tc;
          ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
          moreInfoPack.name = str;
          moreInfoPack.type = "SEND_FANS_GROUP_GIFT";
          uContentPack.moreInfoPackage = moreInfoPack;
          u1.u(6, uElementPack, uContentPack);
       }
       return;
    }
}
