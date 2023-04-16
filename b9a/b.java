package b9a.b;
import d9a.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import y8a.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class b extends a	// class@000425
{

    public void b(){
       super();
    }
    public void a(QPhoto p0,BaseFragment p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "4")) {
          return;
       }
       a.p(p0, "originalPhoto");
       a.p(p1, "fragment");
       a.p(p2, "triggerSource");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PHOTO_RECOMMEND_POPUP";
       i3 oi3 = i3.f();
       oi3.d("trigger_method", p2);
       oi3.d("recommend_type", c.a.c(p0));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0.getEntity());
       u1.D0("", p1, 10, uElementPack, uContentPack, null);
       return;
    }
    public void b(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.p(p0, "originalPhoto");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PHOTO_RECOMMEND_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("recommend_type", c.a.c(p0));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0.getEntity());
       u1.M("", null, 1, uElementPack, uContentPack, null);
       return;
    }
    public void c(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PHOTO_RECOMMEND_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("recommend_type", c.a.c(p0));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0.getEntity());
       u1.D0("", null, 6, uElementPack, uContentPack, null);
       return;
    }
}
