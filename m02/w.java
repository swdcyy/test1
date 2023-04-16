package m02.w;
import d61.k0$a;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;

public final class w implements k0$a	// class@0030ec
{
    public final LivePlayFragment a;

    public void w(LivePlayFragment p0){
       this.a = p0;
    }
    public final Object get(Object p0){
       return this.a.I.getInternalJumpUrl(p0);
    }
}
