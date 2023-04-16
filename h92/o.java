package h92.o;
import erd.g;
import h92.s;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.basic.model.LiveGiftOutsideConfigResponse;

public final class o implements g	// class@002d1e
{
    public final s b;

    public void o(s p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       tb.d9(p0.mLiveGiftOutsideConfigResponse);
    }
}
