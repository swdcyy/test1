package hod.b;
import com.yxcorp.gifshow.widget.u;
import hod.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iod.a;
import android.view.View$OnClickListener;
import god.b;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class b extends u	// class@000fa1
{
    public final a c;

    public void b(a p0,long p1){
       this.c = p0;
       super(p1);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a i = this.c.d.i;
       if (i != null) {
          i.onClick(p0);
       }
       b a = b.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(null, a, b.class, "2")) {
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 29;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SWITCH_TEXT_BUTTON";
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("show_guide_bubble", "false");
          uElementPack.params = jsonObject.toString();
          u1.A(urlPackage, "", 1, uElementPack, null);
       }
       return;
    }
}
