package ez9.b;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.util.HashMap;
import i3a.b;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;

public final class b	// class@002260
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(QPhoto p0,BaseFragment p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "1")) {
          return;
       }
       a.p(p0, "photo");
       a.p(p1, "fragment");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PLAYER_PANEL_ENTRANCE_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("button_type", p2);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0.mEntity);
       u1.M("", p1, 0, uElementPack, uContentPack, null);
       return;
    }
    public final void b(QPhoto p0,BaseFragment p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "2")) {
          return;
       }
       a.p(p0, "photo");
       a.p(p1, "fragment");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PLAYER_PANEL_ENTRANCE_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("button_type", p2);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0.mEntity);
       u1.D0("", p1, 0, uElementPack, uContentPack, null);
       return;
    }
    public final void c(QPhoto p0,BaseFragment p1,HashMap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "3")) {
          return;
       }
       a.p(p0, "photo");
       a.p(p1, "fragment");
       a.p(p2, "hashMap");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PLAYER_PANEL_FUNCTION_BUTTON";
       p2.put("source", b.d.c());
       uElementPack.params = a.a.q(p2);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0.mEntity);
       u1.L("", p1, 1, uElementPack, uContentPack);
       return;
    }
}
