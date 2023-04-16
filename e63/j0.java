package e63.j0;
import erd.g;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oe6.e;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import kp.r1;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import l66.c;
import wca.r;
import m66.a;

public final class j0 implements g	// class@002657
{
    public final e b;

    public void j0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e.class, "59")) {
       }else {
          e.f0(false);
          p0 = tb.r.getBaseFeed();
          if (p0 != null) {
             User user = r1.T1(p0);
             if (user != null) {
                user.notifyChanged();
                user.fireSync();
                c.a().b(new r(user, p0));
             }
          }
       }
       return;
    }
}
