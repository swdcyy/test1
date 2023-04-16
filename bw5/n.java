package bw5.n;
import z1.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.social.message.imshare.model.IMShareRequest;
import java.lang.Object;
import bw5.s;
import bw5.u;

public final class n implements a	// class@00061f
{
    public final GifshowActivity a;
    public final IMShareRequest b;

    public void n(GifshowActivity p0,IMShareRequest p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       p0.fP(this.a, this.b);
    }
}
