package ajc.d$a;
import erd.o;
import ajc.d;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.WechatForward;
import brd.t;

public final class d$a implements o	// class@000132
{
    public final d b;
    public final OperationModel c;
    public final KwaiOperator d;

    public void d$a(d p0,OperationModel p1,KwaiOperator p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, d$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = this.b;
          ot = p0.c0(p0.X(this.c), this.d, null);
       }
       return ot;
    }
}
