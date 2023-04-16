package e8a.l0;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.h;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;

public final class l0 implements g	// class@0020bc
{
    public final h b;

    public void l0(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "9")) {
       }else {
          h s = tb.s;
          if (s != null && TextUtils.n(s.mId, p0.b)) {
             h s1 = tb.s;
             p0 = (p0.d == null && p0.c != null)? User$FollowStatus.FOLLOWING: User$FollowStatus.UNFOLLOW;
             f.m(s1, p0);
          }
       }
       return;
    }
}
