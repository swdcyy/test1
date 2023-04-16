package og.z;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.feature.post.bridge.util.PostVideoHelper$c;
import java.lang.Object;
import java.lang.Throwable;
import android.app.Activity;
import com.feature.post.bridge.util.PostVideoHelper;

public final class z implements g	// class@0027cf
{
    public final ProgressFragment b;
    public final GifshowActivity c;
    public final PostVideoHelper$c d;

    public void z(ProgressFragment p0,GifshowActivity p1,PostVideoHelper$c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       PostVideoHelper.g(p0, this.b, this.c, this.d);
    }
}
