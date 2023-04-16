package ie1.d;
import java.lang.Object;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class d	// class@0028b5
{
    public static ClientContent$LiveStreamPackage a;

    public void d(){
       super();
    }
    public static void a(e0 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "5")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLICK_ANCHOR_CHAT_RECOMMEND_LIST_SET";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
}
