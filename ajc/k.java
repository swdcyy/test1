package ajc.k;
import erd.o;
import com.yxcorp.gifshow.share.wechat.a;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Object;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.WechatForward;
import java.lang.String;
import brd.t;

public final class k implements o	// class@00013f
{
    public final a b;
    public final OperationModel c;
    public final KwaiOperator d;

    public void k(a p0,OperationModel p1,KwaiOperator p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       k tb = this.b;
       return tb.c0(tb.a0(this.c), this.d, "profile");
    }
}
