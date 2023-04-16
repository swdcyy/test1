package cd1.a;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.common.collect.ImmutableMap;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.util.Map;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class a	// class@000494
{

    public void a(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoa, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FANS_SEND_GIFT_POPUP";
       ImmutableMap immutableMap = ImmutableMap.of("card_name", String.valueOf(p1));
       String str = PatchProxy.applyOneRefs(immutableMap, null, uoa, "3");
       if (str != PatchProxyResult.class) {
       }else if(immutableMap == null){
          str = "";
       }else {
          str = new JSONObject(immutableMap).toString();
       }
       uElementPack.params = str;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.G(null, 1, uElementPack, uContentPack);
       return;
    }
}
