package j21.a;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import lnc.i3;
import com.kuaishou.live.common.core.component.comments.util.LiveCommentLogger;

public class a	// class@002a38
{

    public void a(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "2")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       i3 oi3 = i3.f();
       oi3.d("biz_type", p2);
       oi3.d("clk_area", p1);
       LiveCommentLogger.c(uContentPack, oi3.toString());
       return;
    }
    public static void b(ClientContent$LiveStreamPackage p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "1")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       i3 oi3 = i3.f();
       oi3.d("biz_type", p1);
       LiveCommentLogger.d(uContentPack, oi3.toString());
       return;
    }
}
