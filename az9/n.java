package az9.n;
import erd.g;
import az9.i0;
import java.lang.Object;
import java.lang.String;
import az9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class n implements g	// class@000334
{
    public final i0 b;

    public void n(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       i0 u = tb.u;
       i0 x = tb.x;
       if (PatchProxy.applyVoidThreeRefs(p0, u, x, null, a.class, "10")) {
       }else {
          a.p(p0, "params");
          a.p(u, "photo");
          a.p(x, "fragment");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 1;
          uElementPack.action2 = "MASK_AFTER_LONG_PRESS_BUTTON";
          uElementPack.params = p0;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(u.getEntity());
          u1.M("", x, 6, uElementPack, uContentPack, null);
       }
       return;
    }
}
