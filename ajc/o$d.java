package ajc.o$d;
import erd.o;
import ajc.o;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Object;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.OperationModel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.WechatForward;
import brd.t;
import mhc.x;
import brd.x;
import mhc.u1;

public final class o$d implements o	// class@000146
{
    public final o b;
    public final KwaiOperator c;

    public void o$d(o p0,KwaiOperator p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, o$d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          o$d tb = this.b;
          p0 = tb.c0(tb.d0(this.c.i(), p0), this.c, null);
          ot = p0.compose(u1.a(this.c, this.b));
       }
       return ot;
    }
}
