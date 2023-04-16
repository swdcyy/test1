package az9.q;
import erd.g;
import az9.i0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import az9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
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

public final class q implements g	// class@000337
{
    public final i0 b;

    public void q(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       q tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = p0.booleanValue();
       i0 x = tb.x;
       i0 u = tb.u;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), x, u, null, a.class, "4")) {
          a.p(x, "fragment");
          a.p(u, "photo");
          String str = "ADD_VIEW_LATER_BUTTON";
          if (b) {
             b = a.a;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidTwoRefs(x, u, b, a.class, "5")) {
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = str;
                uContentPack = new ClientContent$ContentPackage();
                uContentPack.photoPackage = w1.f(u.getEntity());
                u1.D0("", x, 3, uElementPack, uContentPack, null);
             }
          }else {
             b = a.a;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidTwoRefs(x, u, b, a.class, "6")) {
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = str;
                uContentPack = new ClientContent$ContentPackage();
                uContentPack.photoPackage = w1.f(u.getEntity());
                u1.M("", x, 6, uElementPack, uContentPack, null);
             }
          }
       }
       return;
    }
}
