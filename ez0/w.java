package ez0.w;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.util.Objects;

public final class w implements g	// class@00225c
{
    public final k b;

    public void w(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       tb.R = p0.mShouldAllowGiftToAudience;
    }
}
