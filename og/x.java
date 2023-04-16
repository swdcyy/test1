package og.x;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qm6.b$a;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$Param;
import og.b1;
import com.feature.post.bridge.util.PostVideoHelper$c;
import java.lang.Object;
import com.feature.post.bridge.util.PostVideoHelper;

public final class x implements g	// class@0027cb
{
    public final GifshowActivity b;
    public final b$a c;
    public final JsCameraCallbackParams$Param d;
    public final b1 e;
    public final boolean f;
    public final PostVideoHelper$c g;

    public void x(GifshowActivity p0,b$a p1,JsCameraCallbackParams$Param p2,b1 p3,boolean p4,PostVideoHelper$c p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void accept(Object p0){
       PostVideoHelper.f(this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
