package az9.k;
import erd.g;
import az9.i0;
import java.lang.Object;
import java.lang.Boolean;
import az9.a;
import java.lang.Class;
import java.lang.String;
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

public final class k implements g	// class@000331
{
    public final i0 b;

    public void k(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       p0 = tb.u;
       i0 x = tb.x;
       if (PatchProxy.applyVoidTwoRefs(p0, x, null, a.class, "1")) {
       }else {
          a.p(p0, "photo");
          a.p(x, "fragment");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 12;
          uElementPack.action2 = "MOVE_OUT_FRIEND_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(p0.getEntity());
          u1.D0("", x, 3, uElementPack, uContentPack, null);
       }
       return;
    }
}
