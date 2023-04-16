package m9a.h;
import erd.o;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PostShowInfo;
import ixc.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.util.DetailSpecialCameraHelper;

public final class h implements o	// class@002f7f
{
    public final BaseFeed b;
    public final PostShowInfo c;
    public final c d;

    public void h(BaseFeed p0,PostShowInfo p1,c p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          h tc = this.c;
          a.o(tc, "postShowInfo");
          uBoolean = Boolean.valueOf(DetailSpecialCameraHelper.c.c(this.b, tc, this.d));
       }
       return uBoolean;
    }
}
