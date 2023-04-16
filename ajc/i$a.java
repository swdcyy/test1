package ajc.i$a;
import erd.o;
import ajc.i;
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

public final class i$a implements o	// class@00013b
{
    public final i b;
    public final OperationModel c;
    public final KwaiOperator d;

    public void i$a(i p0,OperationModel p1,KwaiOperator p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, i$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = this.b;
          ot = p0.c0(p0.G(this.c), this.d, "image");
       }
       return ot;
    }
}
