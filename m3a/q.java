package m3a.q;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.e0;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.s0;
import com.google.gson.Gson;
import qrd.l1;
import k2b.u1;

public final class q	// class@002f1d
{
    public static final q a;

    static {
       q.a = new q();
    }
    public void q(){
       super();
    }
    public final void a(QPhoto p0,e0 p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, q.class, "1")) {
          return;
       }
       a.p(p1, "logPage");
       a.p(p2, "action");
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       if (p0 != null) {
          uContentPack.photoPackage = w1.f(p0.getEntity());
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SMALL_WINDOW_PLAY_FUNCTION_BUTTON";
       uElementPack.params = a.a.q(s0.k(r0.a("button_name", p2)));
       u1.L("", p1, 1, uElementPack, uContentPack);
       return;
    }
}
