package arc.b;
import k2b.e0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class b	// class@0002bf
{

    public static final void a(e0 p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uob, "3")) {
          return;
       }
       a.p(p0, "page");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CANAVS_PHOTO_PREVIEW";
       JsonObject jsonObject = new JsonObject();
       String str = (p1)? "play": "pause";
       jsonObject.c0("click_type", str);
       uElementPack.params = jsonObject.toString();
       u1.M("4078197", p0, 6, uElementPack, null, null);
       return;
    }
}
