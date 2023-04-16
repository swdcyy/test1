package ly1.a;
import java.lang.Object;
import iy1.l;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k2b.u1;

public class a	// class@00307d
{

    public void a(){
       super();
    }
    public static void a(l p0,ClientContent$LiveStreamPackage p1,String p2,String p3,String p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoa, "4")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "STRENGTHEN_NOTICE_BANNER";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("biz_id", p0.b());
       jsonObject.c0("style", p2);
       jsonObject.c0("btn_type", p3);
       jsonObject.c0("extra_info", p4);
       uElementPack.params = jsonObject.toString();
       uContentPack.liveStreamPackage = p1;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
}
