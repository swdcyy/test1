package bu7.n;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;

public final class n	// class@000496
{

    public void n(){
       super();
    }
    public static void a(String p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, n.class, "2")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 18;
       uElementPack.action2 = "FOLLOW_PASSWORD_CARD";
       JsonObject jsonObject = new JsonObject();
       jsonObject.H("is_followed", Boolean.valueOf(p3));
       jsonObject.c0("subbiz", p1);
       jsonObject.c0("click_area", p2);
       uElementPack.params = jsonObject.toString();
       ClientEvent$AreaPackage uAreaPackage = new ClientEvent$AreaPackage();
       uAreaPackage.name = "FOLLOW_LEAD_POPUP";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = TextUtils.I(p0);
       uContentPack.userPackage = userPackage;
       uClickEvent.elementPackage = uElementPack;
       uClickEvent.areaPackage = uAreaPackage;
       uClickEvent.contentPackage = uContentPack;
       u1.z(null, uClickEvent);
       return;
    }
}
