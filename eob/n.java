package eob.n;
import erd.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.social.moment.model.MomentLocateParam;
import java.lang.Object;
import java.lang.Integer;
import eob.t;
import tkd.b;
import tkd.d;
import ru5.a;

public final class n implements o	// class@002796
{
    public final GifshowActivity b;
    public final MomentLocateParam c;

    public void n(GifshowActivity p0,MomentLocateParam p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       n tb = this.b;
       n tc = this.c;
       if (t.b(p0.intValue())) {
          d.a(-774600034).cS(tb, tc);
       }
       return p0;
    }
}
