package k1a.b;
import java.lang.Object;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import lnc.i3;

public final class b	// class@002b96
{

    public void b(){
       super();
    }
    public static void a(e0 p0,ClientEvent$ElementPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "12")) {
          return;
       }
       u1.M("", p0, 1, p1, null, null);
       return;
    }
    public static void b(e0 p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "UNBLOCK_KEYWORDS_DIALLOG";
       i3 oi3 = i3.f();
       oi3.d("button_name", p1);
       uElementPack.params = oi3.e();
       b.a(p0, uElementPack);
       return;
    }
    public static void c(e0 p0,ClientEvent$ElementPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "10")) {
          return;
       }
       u1.D0("", p0, 3, p1, null, null);
       return;
    }
    public static void d(e0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ADD_BLOCK_KEYWORDS_BUTTON";
       b.c(p0, uElementPack);
       return;
    }
}
