package bw5.p;
import z1.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.social.message.imshare.model.IMShareRequest;
import zv5.i;
import java.lang.Object;
import bw5.s;
import bw5.u;

public final class p implements a	// class@000621
{
    public final GifshowActivity a;
    public final IMShareRequest b;
    public final i c;

    public void p(GifshowActivity p0,IMShareRequest p1,i p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void accept(Object p0){
       p0.vu(this.a, this.b, this.c);
    }
}
