package og.w;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.feature.post.bridge.util.PostVideoHelper$c;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import android.app.Activity;
import com.feature.post.bridge.util.PostVideoHelper;

public final class w implements g	// class@0027c9
{
    public final GifshowActivity b;
    public final PostVideoHelper$c c;

    public void w(GifshowActivity p0,PostVideoHelper$c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       PostVideoHelper.g(p0, null, this.b, this.c);
    }
}
