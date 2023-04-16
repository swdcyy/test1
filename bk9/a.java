package bk9.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class a	// class@0004b8
{

    public void a(){
       super();
    }
    public static String a(String p0,int p1){
       i3 obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.d("tool_name", p0);
       p1++;
       obj.d("tool_index", String.valueOf(p1));
       return obj.e();
    }
    public static void b(String p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p0;
       u1.D0("2632085", p1, 1, uElementPack, null, null);
       return;
    }
}
