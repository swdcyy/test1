package bb1.f;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class f	// class@000333
{

    public void f(){
       super();
    }
    public static ClientContent$UserPackage a(UserInfo p0){
       ClientContent$UserPackage obj = PatchProxy.applyOneRefs(p0, null, f.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$UserPackage();
       obj.identity = TextUtils.k(p0.mId);
       return obj;
    }
    public static ClientContentWrapper$LiveVoicePartyPackage b(String p0,String p1){
       ClientContentWrapper$LiveVoicePartyPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContentWrapper$LiveVoicePartyPackage();
       obj.voicePartyId = p0;
       obj.theaterId = p1;
       return obj;
    }
    public static void c(UserInfo p0,String p1,int p2,ClientContent$LiveStreamPackage p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, f.class, "12")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PERSONAL_CARD_MANAGE_BUTTON";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("administrator_type", p1);
       jsonObject.a0("btn_type", Integer.valueOf(p2));
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p3;
       uContentPack.userPackage = f.a(p0);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
}
