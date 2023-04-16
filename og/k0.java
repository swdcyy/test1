package og.k0;
import erd.g;
import com.feature.post.bridge.util.PostVideoHelper$d;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qm6.b$a;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$Param;
import og.b1;
import com.feature.post.bridge.util.PostVideoHelper$c;
import java.lang.Object;
import com.feature.post.bridge.util.PostVideoHelper;

public final class k0 implements g	// class@0027ae
{
    public final PostVideoHelper$d b;
    public final ProgressFragment c;
    public final GifshowActivity d;
    public final b$a e;
    public final JsCameraCallbackParams$Param f;
    public final b1 g;
    public final boolean h;
    public final PostVideoHelper$c i;

    public void k0(PostVideoHelper$d p0,ProgressFragment p1,GifshowActivity p2,b$a p3,JsCameraCallbackParams$Param p4,b1 p5,boolean p6,PostVideoHelper$c p7){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public final void accept(Object p0){
       this.b.a();
       PostVideoHelper.d(this.c);
       PostVideoHelper.f(this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
