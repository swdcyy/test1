package lo1.e;
import erd.g;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.util.Objects;

public final class e implements g	// class@002fdd
{
    public final LiveHeartParticleServiceImpl b;

    public void e(LiveHeartParticleServiceImpl p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       tb.B = p0.mDisableLike;
    }
}
