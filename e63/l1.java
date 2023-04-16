package e63.l1;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class l1	// class@00265e
{

    public void l1(){
       super();
    }
    public static void a(boolean p0,ClientContent$LiveStreamPackage p1){
       l1 ol1 = l1.class;
       if (PatchProxy.isSupport(ol1) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, ol1, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FANS_GROUP_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("is_join", Integer.valueOf(p0));
       uElementPack.params = oi3.e();
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       urlPackage.page = 13;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.y0(urlPackage, 6, uElementPack, uContentPack);
       return;
    }
}
