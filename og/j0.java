package og.j0;
import erd.g;
import com.feature.post.bridge.util.PostVideoHelper$d;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.feature.post.bridge.util.PostVideoHelper$c;
import java.lang.Object;
import java.lang.Throwable;
import android.app.Activity;
import com.feature.post.bridge.util.PostVideoHelper;

public final class j0 implements g	// class@0027ac
{
    public final PostVideoHelper$d b;
    public final ProgressFragment c;
    public final GifshowActivity d;
    public final PostVideoHelper$c e;

    public void j0(PostVideoHelper$d p0,ProgressFragment p1,GifshowActivity p2,PostVideoHelper$c p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       this.b.a();
       PostVideoHelper.g(p0, this.c, this.d, this.e);
    }
}
