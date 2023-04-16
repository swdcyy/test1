package dca.j$a;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$b;
import dca.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jn9.b;
import dca.s;
import nn9.a;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$b$a;
import xoc.b;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class j$a implements RecyclerTabWithIndicatorView$b	// class@001ef6
{
    public final j a;
    public final boolean b;

    public void j$a(j p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a.e.z0().k().a() == LoadingStatus.DATA_LOADING)? true: false;
       return b;
    }
    public void b(RecyclerTabWithIndicatorView$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "3")) {
          return;
       }
       a.p(p0, "tabInfo");
       RecyclerTabWithIndicatorView$b$a.a(this, p0);
       return;
    }
    public void c(RecyclerTabWithIndicatorView$d p0){
       b a;
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "2")) {
          return;
       }
       a.p(p0, "tabInfo");
       a = b.a;
       String str = p0.d();
       j$a tb = this.b;
       Objects.requireNonNull(a);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(str, Boolean.valueOf(tb), a, uob, "6")) {
          a.p(str, "name");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "STYLE_SWITCH_TAB";
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("tab_name", str);
          if (tb != null) {
             jsonObject.c0("style_type", "MUSIC_TEMPLATE");
          }
          uElementPack.params = jsonObject.toString();
          u1.u(6, uElementPack, null);
       }
       return;
    }
}
