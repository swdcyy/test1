package az9.t;
import erd.g;
import az9.i0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import az9.a;
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
import com.kwai.framework.model.user.User;
import kp.r1;
import wkd.b;
import com.yxcorp.gifshow.relation.friend.manage.FriendManager;
import com.yxcorp.gifshow.activity.GifshowActivity;
import z1.a;
import tac.b;

public final class t implements g	// class@00033a
{
    public final i0 b;

    public void t(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, i0.class, "15")) {
       }else {
          p0 = tb.u;
          i0 x = tb.x;
          if (!PatchProxy.applyVoidTwoRefs(p0, x, objArray, a.class, "14")) {
             a.p(p0, "photo");
             a.p(x, "fragment");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.type = 1;
             uElementPack.action2 = "MOVE_OUT_FRIEND_BUTTON";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(p0.getEntity());
             u1.M("", x, 1, uElementPack, uContentPack, null);
          }
          tb.o0();
          User user = r1.T1(tb.u.mEntity);
          if (user != null) {
             Object obj = b.a(-1578665399);
             x = tb.v;
             p0 = tb.u;
             if (p0 != null) {
                objArray = p0.mEntity;
             }
             obj.q(x, user, objArray, true, true, null);
          }
       }
       return;
    }
}
