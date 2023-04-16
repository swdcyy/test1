package by9.g$b;
import androidx.lifecycle.Observer;
import by9.g;
import java.lang.Object;
import ar7.l$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import psb.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import brd.t;
import crd.b;
import pe5.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;

public final class g$b implements Observer	// class@000518
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
       }else if(p0.b != null){
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          b.a(0x1e7ef171).k(g.n0(this.b).getPhotoId(), qCurrentUser.getId(), p0.a()).subscribe();
          int i = p0.a();
          if (i != 1) {
             i = (i != 2)? "": "REFUSE";
          }else {
             i = "ACCEPT";
          }
          g u = this.b.u;
          if (u == null) {
             a.S("mFragment");
          }
          if (!PatchProxy.applyVoidTwoRefs(i, u, null, c.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CO_CREATION_INVITE_POPUP";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("button_name", i);
             uElementPack.params = jsonObject.toString();
             u1.B(new ClickMetaData().setLogPage(u).setType(1).setElementPackage(uElementPack));
          }
       }
       return;
    }
}
