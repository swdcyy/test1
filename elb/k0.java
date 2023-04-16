package elb.k0;
import erd.g;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostUtils;

public final class k0 implements g	// class@002754
{
    public final VideoQualityObserveHandler b;

    public void k0(VideoQualityObserveHandler p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "1")) {
       }else {
          a.p(p0, "throwable");
          PostUtils.D("VideoQualityObserveHandler", "startTask failed", p0);
          VideoQualityObserveHandler.b(this.b, false, 1, null);
       }
       return;
    }
}
