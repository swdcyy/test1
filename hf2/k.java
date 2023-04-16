package hf2.k;
import erd.g;
import hf2.l;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;

public final class k implements g	// class@002d86
{
    public final l b;

    public void k(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, l.class, "20")) {
       }else {
          p0.isFollowing = false;
          p0.isFollowRequesting = false;
       }
       return;
    }
}
