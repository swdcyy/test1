package lf1.d;
import erd.g;
import com.kuaishou.live.common.core.component.comments.mock.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.mock.LiveDisplayUserStateResponse;
import java.util.Objects;

public final class d implements g	// class@002ee5
{
    public final b b;

    public void d(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       tb.q = p0.mIntervalMs;
    }
}
