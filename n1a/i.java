package n1a.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import n1a.i$a;
import n1a.i$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s2b.d;
import n1a.j;
import s2b.a;
import qvb.i;
import qvb.q;
import qvb.j;
import k1a.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import y8c.g;
import java.util.List;
import g9c.a;
import java.util.Collection;
import ekd.q;
import k1a.a;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import k2b.e0;

public class i extends PresenterV2	// class@0030c1
{
    public final RecyclerFragment p;
    public final q q;
    public final g r;

    public void i(RecyclerFragment p0){
       super();
       this.q = new i$a(this);
       this.p = p0;
       this.r = new i$b(this);
    }
    public void E8(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "2")) {
          this.p.r9().h(new j(this));
       }
       this.p.q().h(this.q);
       return;
    }
    public void H8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "4")) {
          return;
       }
       i tp = this.p;
       if (!PatchProxy.applyVoidOneRefs(tp, objArray, b.class, "5")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "BLOCKED_KEYWORDS_LIST";
          JsonObject jsonObject = new JsonObject();
          List list = tp.g7().Q0();
          if (!q.f(list)) {
             ArrayList uArrayList = Lists.c(y.h(list, a.b));
             if (!q.f(uArrayList)) {
                jsonObject.G("list_text", a.a.x(uArrayList));
             }
          }
          uElementPack.params = jsonObject.toString();
          b.c(tp, uElementPack);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       this.p.q().f(this.q);
       return;
    }
}
