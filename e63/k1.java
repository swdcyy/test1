package e63.k1;
import java.lang.Object;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public final class k1	// class@00265b
{

    public void k1(){
       super();
    }
    public static void a(e0 p0,boolean p1,int p2,FeedLogCtx p3,ClientContent$LiveStreamPackage p4){
       k1 ok1 = k1.class;
       if (PatchProxy.isSupport(ok1)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, ok1, "3")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FOLLOW_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("is_follow", Integer.valueOf(p1));
       oi3.c("button_state", Integer.valueOf(p2));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p4;
       ClickMetaData uClickMetaDa = new ClickMetaData();
       uClickMetaDa.setLogPage(p0).setElementPackage(uElementPack).setContentPackage(uContentPack).setType(1).setFeedLogCtx(p3);
       u1.B(uClickMetaDa);
       return;
    }
    public static void b(int p0,ClientContent$LiveStreamPackage p1){
       k1 ok1 = k1.class;
       if (PatchProxy.isSupport(ok1) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, ok1, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FOLLOW_BUTTON_STATE";
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       urlPackage.page = 13;
       i3 oi3 = i3.f();
       oi3.c("button_state", Integer.valueOf(p0));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.y0(urlPackage, 6, uElementPack, uContentPack);
       return;
    }
}
