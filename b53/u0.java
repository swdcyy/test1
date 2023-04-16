package b53.u0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import java.lang.Number;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class u0	// class@000327
{

    public void u0(){
       super();
    }
    public static String a(int p0){
       i3 obj;
       u0 ou0 = u0.class;
       if (PatchProxy.isSupport(ou0)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, ou0, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.c("fans_group_status", Integer.valueOf(p0));
       return obj.e();
    }
    public static String b(int p0,boolean p1,int p2){
       i3 obj;
       if (PatchProxy.isSupport(u0.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), null, u0.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.c("fans_group_status", Integer.valueOf(p0));
       obj.c("is_unlocked", Integer.valueOf(p1));
       obj.c("color_id", Integer.valueOf(p2));
       return obj.e();
    }
    public static String c(int p0,String p1){
       i3 obj;
       u0 ou0 = u0.class;
       if (PatchProxy.isSupport(ou0)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, ou0, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.c("fans_group_status", Integer.valueOf(p0));
       obj.d("button_name", p1);
       return obj.e();
    }
    public static String d(String p0){
       i3 obj = PatchProxy.applyOneRefs(p0, null, u0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("button_name", p0);
       return obj.e();
    }
    public static void e(String p0,ClientContent$LiveStreamPackage p1,ClientContent$ScreenPackage p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, u0.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FANS_GROUP_REACH_BUTTON";
       uElementPack.params = u0.d(p0);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       uContentPack.screenPackage = p2;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void f(String p0,ClientContent$LiveStreamPackage p1,ClientContent$ScreenPackage p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, u0.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FANS_GROUP_REACH_BUTTON";
       uElementPack.params = u0.d(p0);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       uContentPack.screenPackage = p2;
       u1.u0(6, uElementPack, uContentPack);
       return;
    }
}
