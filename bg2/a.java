package bg2.a;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class a	// class@0003ec
{

    public void a(){
       super();
    }
    public static void a(int p0,int p1,ClientContent$LiveStreamPackage p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, a.class, "10")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "INPUT_NUMBER_POPUP";
       i3 oi3 = i3.f();
       oi3.c("type", Integer.valueOf(p0));
       oi3.c("btn_type", Integer.valueOf(p1));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       if (p2 != null) {
          uContentPack.liveStreamPackage = p2;
       }
       u1.u(1, uElementPack, uContentPack);
       return;
    }
}
