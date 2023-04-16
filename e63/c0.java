package e63.c0;
import erd.g;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.model.LiveForbidCommentStatusResponse;
import java.util.Objects;

public final class c0 implements g	// class@002642
{
    public final e b;

    public void c0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c0 tb = this.b;
       Objects.requireNonNull(tb);
       tb.f1 = p0.mIsForbidden;
    }
}
