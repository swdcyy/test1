package cb2.j;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.u1;

public final class j	// class@00050d
{

    public void j(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, j.class, "1")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_MASK_GUIDE";
       i3 oi3 = i3.f();
       oi3.d("type", p1);
       oi3.d("tips_content", p2);
       uElementPack.params = oi3.e();
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
}
