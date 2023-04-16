package nm9.f;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.HashMap;
import f55.g;
import java.lang.Object;
import u36.b;
import com.kwai.feature.api.social.common.jsbridge.model.LaunchPageResult;

public final class f implements g	// class@0031df
{
    public final GifshowActivity b;
    public final HashMap c;
    public final g d;

    public void f(GifshowActivity p0,HashMap p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       p0.x8(this.b, this.c, true);
       this.d.onSuccess(new LaunchPageResult(true));
    }
}
