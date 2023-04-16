package d5c.m0;
import erd.g;
import d5c.t0;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import com.kwai.framework.model.user.User$FollowStatus;

public final class m0 implements g	// class@002101
{
    public final t0 b;

    public void m0(t0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.getFollowStatus() == User$FollowStatus.UNFOLLOW && tb.C == User$FollowStatus.FOLLOWING) {
          tb.A = true;
          tb.V8();
       }
       tb.C = p0.getFollowStatus();
       return;
    }
}
