package m9a.g;
import erd.o;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PostShowInfo;
import java.lang.Object;
import ixc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.util.DetailSpecialCameraHelper;
import java.lang.Boolean;
import brd.t;

public final class g implements o	// class@002f7e
{
    public final BaseFeed b;
    public final PostShowInfo c;

    public void g(BaseFeed p0,PostShowInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          g tc = this.c;
          a.o(tc, "postShowInfo");
          ot = t.just(Boolean.valueOf(DetailSpecialCameraHelper.c.c(this.b, tc, p0)));
       }
       return ot;
    }
}
