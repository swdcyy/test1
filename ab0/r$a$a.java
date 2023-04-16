package ab0.r$a$a;
import erd.g;
import ab0.r$a;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ra0.b;
import q87.c;
import ab0.r;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ra0.d;
import sa0.c;
import com.kuaishou.gifshow.smartalbum.logic.SmartAlbumManager;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import fb0.l;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class r$a$a implements g	// class@000048
{
    public final r$a b;

    public void r$a$a(r$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, r$a$a.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          b.D().w("SmartAlbumRestartPresenter", "update smart album switch success", objArray);
          this.b.c.P8();
          p0 = QCurrentUser.me();
          String str = "QCurrentUser.me\(\)";
          a.o(p0, str);
          p0.setEnableLocalIntelligenceAlbum(true);
          if (this.b.c.u == null) {
             d.a(0x1bf6ff1d).S1();
          }else {
             SmartAlbumManager.w0().R();
             p0 = this.b.c.v;
             if (p0 == null) {
                a.S("mClickRestartButtonPublisher");
             }
             p0.onNext(Boolean.TRUE);
          }
          p0 = QCurrentUser.me();
          a.o(p0, str);
          b = p0.isEnableLocalIntelligenceAlbum();
          l ol = l.class;
          if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, ol, "26")) {
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             urlPackage.page = 0x7d10;
             JsonObject jsonObject = new JsonObject();
             b = (b)? "open": "close";
             jsonObject.c0("intelligent_album_status", b);
             urlPackage.params = jsonObject.toString();
             b = new ClientEvent$ElementPackage();
             b.action2 = "INTELLIGENT_OPEN_BUTTON";
             u1.A(urlPackage, "", true, b, null);
          }
          PatchProxy.onMethodExit(r$a$a.class, "1");
       }
       return;
    }
}
