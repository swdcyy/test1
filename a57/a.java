package a57.a;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;

public class a	// class@00004f
{

    public void a(){
       super();
    }
    public static ClientContent$ContentPackage a(ClientContent$LiveStreamPackage p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, null, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = p0;
       return obj;
    }
    public static String b(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, uoa, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a.c(p0, 0);
    }
    public static String c(boolean p0,int p1){
       JsonObject obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), null, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new JsonObject();
       if (p0) {
          obj.c0("screen_mode", "horizontal");
       }else {
          obj.c0("screen_mode", "vertical");
       }
       if (p1 > 0) {
          obj.a0("status", Integer.valueOf(p1));
       }
       return obj.toString();
    }
    public static void d(ClientContent$LiveStreamPackage p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), null, a.class, "5")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLICK_LIVE_GZONE_EMO_DIALOG_PAY";
       uElementPack.type = 1;
       int i = (p2)? 1: 2;
       uElementPack.params = a.c(p1, i);
       u1.u(1, uElementPack, a.a(p0));
       return;
    }
}
