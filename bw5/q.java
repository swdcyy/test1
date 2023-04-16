package bw5.q;
import z1.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.social.message.imshare.model.IMShareRequest;
import java.lang.String;
import java.lang.ref.WeakReference;
import java.lang.Object;
import bw5.s;
import bw5.u;

public final class q implements a	// class@000622
{
    public final GifshowActivity a;
    public final IMShareRequest b;
    public final String c;
    public final WeakReference d;

    public void q(GifshowActivity p0,IMShareRequest p1,String p2,WeakReference p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void accept(Object p0){
       p0.vL(this.a, this.b, this.c, this.d);
    }
}
