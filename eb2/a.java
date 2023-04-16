package eb2.a;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import k2b.u1;

public class a	// class@0026d5
{

    public void a(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0,int p1,String p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, a.class, "1")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_MASK_GUIDE";
       i3 oi3 = i3.f();
       oi3.d("type", p2);
       oi3.c("biz_type", Integer.valueOf(p1));
       uElementPack.params = oi3.e();
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
}
