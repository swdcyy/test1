package dx9.g;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.gifshow.detail.comment.limitcomment.j;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.util.Objects;
import r1a.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import psb.c;
import psb.a;
import brd.t;
import cjd.e;
import erd.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.detail.comment.limitcomment.k;
import crd.b;

public final class g implements SlipSwitchButton$b	// class@001fed
{
    public final j a;

    public void g(j p0){
       this.a = p0;
    }
    public final void a(SlipSwitchButton p0,boolean p1){
       g ta = this.a;
       Objects.requireNonNull(ta);
       a uoa = a.class;
       Object obj = null;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), obj, uoa, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ONLY_FRIENDS";
          JsonObject jsonObject = new JsonObject();
          String str = (p1)? "CHECKED": "UNCHECKED";
          jsonObject.c0("status", str);
          uElementPack.params = jsonObject.toString();
          u1.u(1, uElementPack, obj);
       }
       a.a().C(p1).map(new e()).subscribe(Functions.d(), new k(ta, p1));
       return;
    }
}
