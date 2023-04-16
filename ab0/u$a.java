package ab0.u$a;
import erd.g;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ra0.b;
import q87.c;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import fb0.l;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class u$a implements g	// class@000054
{
    public final boolean b;

    public void u$a(boolean p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, u$a.class, str)) {
       }else {
          Object[] objArray = new Object[0];
          b.D().w("SmartAlbumSettingsPresenter", "update smart album switch success", objArray);
          p0 = QCurrentUser.me();
          a.o(p0, "QCurrentUser.me\(\)");
          p0.setEnableLocalIntelligenceAlbum(this.b);
          p0 = QCurrentUser.me();
          a.o(p0, "QCurrentUser.me\(\)");
          b = p0.isEnableLocalIntelligenceAlbum();
          l ol = l.class;
          if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, ol, "22")) {
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             urlPackage.page = 0x7d10;
             JsonObject jsonObject = new JsonObject();
             String str1 = (b)? "open": "close";
             jsonObject.c0("intelligent_album_status", str1);
             urlPackage.params = jsonObject.toString();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "INTELLIGENT_CLOSE_BUTTON";
             JsonObject jsonObject1 = new JsonObject();
             if (b) {
                str = "0";
             }
             jsonObject1.c0("intelligent_close_status", str);
             uElementPack.params = jsonObject1.toString();
             u1.A(urlPackage, "", 1, uElementPack, null);
          }
       }
       return;
    }
}
