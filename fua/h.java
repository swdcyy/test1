package fua.h;
import java.lang.Object;
import k2b.e0;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import k2b.u1;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public final class h	// class@0029fb
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final void a(e0 p0,BaseFeed p1,int p2,String p3,String p4){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, oh, "2")) {
             return;
          }
       }
       a.p(p1, "feed");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MASK_GUIDE_ENTRANCE";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p1);
       i3 oi3 = i3.f();
       oi3.c("mask_content_id", Integer.valueOf(p2));
       oi3.d("mask_content_name", p3);
       oi3.d("mask_type", "QUESTIONNAIRE");
       oi3.d("mask_btn", p4);
       uElementPack.params = oi3.e();
       u1.B(new ClickMetaData().setLogPage(p0).setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(r1.O0(p1)));
       return;
    }
    public final void b(e0 p0,BaseFeed p1,int p2,String p3){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, h.class, "1")) {
          return;
       }
       a.p(p1, "feed");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MASK_GUIDE_ENTRANCE";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p1);
       i3 oi3 = i3.f();
       oi3.c("mask_content_id", Integer.valueOf(p2));
       oi3.d("mask_content_name", p3);
       oi3.d("mask_type", "QUESTIONNAIRE");
       uElementPack.params = oi3.e();
       u1.B0(new ShowMetaData().setLogPage(p0).setType(10).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(r1.O0(p1)));
       return;
    }
}
