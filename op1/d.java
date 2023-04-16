package op1.d;
import xp5.i;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import k2b.u1;
import nw1.b;
import op1.b;
import kotlin.jvm.internal.a;
import z1.a;
import op1.c;
import op1.d$a;
import dp1.b;
import nw1.b$a;

public final class d	// class@003552
{

    public static final void a(i p0,Map p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "7")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0.a();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_VOICE_PARTY_BEAUTIFY_PREVIEW_PANEL";
       i3 oi3 = i3.f();
       oi3.d("btn_type", p2);
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          oi3.d(key, uEntry.getValue());
       }
       uElementPack.params = oi3.e();
       u1.B(new ClickMetaData().setLogPage(p0.getPage()).setContentPackage(uContentPack).setElementPackage(uElementPack));
       return;
    }
    public static final void b(b p0,i p1,b p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, d.class, "2")) {
          return;
       }
       a.p(p0, "guestPrettifyService");
       a.p(p1, "logPackageService");
       a.p(p3, "interactBizParam");
       d.c(p0, p1, p2, p3, null, null);
       return;
    }
    public static final void c(b p0,i p1,b p2,Map p3,a p4,String p5){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, uod, "3")) {
             return;
          }
       }
       a.p(p0, "guestPrettifyService");
       a.p(p1, "logPackageService");
       a.p(p3, "interactBizParam");
       p0.Ba(new c(p1, p3), new d$a(p2, p1, p3, p4), p5);
       return;
    }
}
