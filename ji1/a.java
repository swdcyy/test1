package ji1.a;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import q2b.h$b;
import k2b.u1;

public class a	// class@002bb1
{

    public void a(){
       super();
    }
    public static void a(String p0,int p1,ClientContent$LiveStreamPackage p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, a.class, "1")) {
          return;
       }
       new ClientEvent$ElementPackage().action2 = p0;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p2;
       h$b uob = h$b.e(p1, p0);
       uob.h(uContentPack);
       u1.r0(uob);
       return;
    }
}
