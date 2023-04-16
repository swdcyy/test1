package bb5.a;
import java.lang.Object;
import k2b.e0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.util.cdnresource.j;
import com.yxcorp.gifshow.util.cdnresource.CdnResource;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class a	// class@000370
{

    public void a(){
       super();
    }
    public static void a(e0 p0){
       j a;
       String str = null;
       if (PatchProxy.applyVoidOneRefs(p0, str, a.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.a("holiday_effect", Boolean.TRUE);
       uElementPack.params = oi3.e();
       uElementPack.action2 = "REFRESH_INFO";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       a = j.b().a;
       if (a != null) {
          str = a.e();
       }
       uContentPack.ksOrderInfoPackage = l0.a(str);
       u1.D0("", p0, 3, uElementPack, uContentPack, null);
       return;
    }
}
