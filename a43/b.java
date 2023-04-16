package a43.b;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import a43.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import yp.x;
import k2b.u1;

public class b	// class@00003a
{

    public void b(){
       super();
    }
    public static void a(LiveStreamFeed p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, b.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "NEGATIVE_DIALOG_ITEM";
       i3 oi3 = i3.f();
       oi3.d("negative_type", m.a(p1));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$LiveStreamPackage liveStreamPa = x.e(p0, 1);
       liveStreamPa.sessionId = p2;
       uContentPack.liveStreamPackage = liveStreamPa;
       u1.G("", 1, uElementPack, uContentPack);
       return;
    }
}
