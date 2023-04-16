package oq1.d;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;

public final class d	// class@003556
{

    public static final void a(e0 p0,ClientContent$ContentPackage p1,ClientEvent$ElementPackage p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "3")) {
          return;
       }
       a.p(p0, "logPage");
       a.p(p1, "contentPackage");
       a.p(p2, "elementPackage");
       u1.B(new ClickMetaData().setLogPage(p0).setContentPackage(p1).setElementPackage(p2));
       return;
    }
    public static final void b(String p0,ClientContent$LiveStreamPackage p1,e0 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "1")) {
          return;
       }
       a.p(p0, "params");
       a.p(p1, "liveStreamPackage");
       a.p(p2, "logPage");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PUZZLE_LINE_CHAT_CARD";
       uElementPack.params = p0;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       d.a(p2, uContentPack, uElementPack);
       return;
    }
    public static final void c(String p0,ClientContent$LiveStreamPackage p1,e0 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "2")) {
          return;
       }
       a.p(p0, "params");
       a.p(p1, "liveStreamPackage");
       a.p(p2, "logPage");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PUZZLE_LINE_CHAT_PUBLISH_ITEM";
       uElementPack.params = p0;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       d.a(p2, uContentPack, uElementPack);
       return;
    }
}
