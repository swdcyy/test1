package hm2.k;
import java.lang.Object;
import lnc.i3;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Boolean;
import k2b.u1;

public final class k	// class@002dd7
{

    public void k(){
       super();
    }
    public static i3 a(i3 p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ok, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0.c("user_level", Integer.valueOf(p1));
       return p0;
    }
    public static ClientContent$ContentPackage b(ClientContent$LiveStreamPackage p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, null, k.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = p0;
       return obj;
    }
    public static ClientEvent$ElementPackage c(String p0){
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, null, k.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = p0;
       obj.type = 1;
       return obj;
    }
    public static void d(ClientContent$LiveStreamPackage p0,boolean p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ok, "11")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "KWAI_USER_LEVEL_PROTECT_CARD";
       i3 oi3 = i3.f();
       String str = (p1)? "OPEN": "CANCEL";
       oi3.d("button_type", str);
       uElementPack.params = oi3.toString();
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void e(int p0,ClientContent$LiveStreamPackage p1,String p2,int p3){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Integer.valueOf(p3), null, k.class, "16")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = k.c(p2);
       i3 oi3 = i3.f();
       k.a(oi3, p0);
       uElementPack.params = oi3.e();
       u1.u(p3, uElementPack, k.b(p1));
       return;
    }
    public static void f(int p0,ClientContent$LiveStreamPackage p1,String p2,int p3){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Integer.valueOf(p3), null, k.class, "17")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = k.c(p2);
       i3 oi3 = i3.f();
       k.a(oi3, p0);
       uElementPack.params = oi3.e();
       u1.u0(p3, uElementPack, k.b(p1));
       return;
    }
}
