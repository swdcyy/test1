package b53.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class e	// class@000308
{

    public void e(){
       super();
    }
    public static void a(String p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoe, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p0;
       uElementPack.value = (double)p1;
       u1.u(6, uElementPack, null);
       return;
    }
    public static void b(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uoe, "4")) {
          return;
       }
       p0++;
       e.a("CLICK_LIVE_BARRAGE_SETTING_AREA", p0);
       return;
    }
}
